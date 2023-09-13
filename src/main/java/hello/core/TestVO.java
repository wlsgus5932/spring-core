package hello.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class TestVO {
    private String name;
    private String age;
    private String comment;
    List<TestInVO> testInVOList;
}
