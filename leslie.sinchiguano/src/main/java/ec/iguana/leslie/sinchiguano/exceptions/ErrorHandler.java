package ec.iguana.leslie.sinchiguano.exceptions;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MessageInfo> methodArgumentNotValidException(HttpRequest request, MethodArgumentNotValidException e) {
        List<MessageInfoDetail> messageInfoDetails = new ArrayList<>();
        e.getBindingResult().getFieldErrors().forEach( error -> {
            messageInfoDetails.add(new MessageInfoDetail(error.getDefaultMessage(), error.getField()));
        });
        MessageInfo messageInfo = new MessageInfo(false, "", messageInfoDetails);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messageInfo);
    }
}
