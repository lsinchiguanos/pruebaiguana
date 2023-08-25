package ec.iguana.leslie.sinchiguano.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageInfo {
    private boolean status;
    private String message;
    private List<MessageInfoDetail> errorInfos;
}
