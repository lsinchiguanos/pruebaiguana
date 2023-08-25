package ec.iguana.leslie.sinchiguano.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageInfoDetail {

    private String message;
    private String field;
}
