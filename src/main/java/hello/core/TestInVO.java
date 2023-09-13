package hello.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TestInVO {
    private String inName;
    private int inAge;
    private String inComment;

    public TestInVO() {
    }

    public TestInVO(String inName, int inAge, String inComment) {
        this.inName = inName;
        this.inAge = inAge;
        this.inComment = inComment;
    }
}
