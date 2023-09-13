package hello.core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//예시
@Getter @Setter
public class ItemDTO {
    private String 공통1;
    private String 공통2;
    private String 공통3;
    private String 공통4;
    private String 요청파라미터1;
    private String 요청파라미터2;
    private String 요청파라미터3;

    private List<응답데이터DTO> 응답데이터;
}
