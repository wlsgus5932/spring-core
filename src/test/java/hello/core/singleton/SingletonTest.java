package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SingletonTest {
    @Test
    @DisplayName("스프링 없는 순수한 DI컨테이너")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();

        //1. 조회: 호출할 때 마다 객체 생성
        MemberService memberService1 = appConfig.memberService();

        //2. 조회: 호출할 때 마다 객체 생성
        MemberService memberService2 = appConfig.memberService();

        // memberService1 != memberService2 (참조값 다름)
        // repository 객체도 생성되기때문에 service객체생성 코드 하나에 객체가 총 2개씩 생성됨 좋지않은방법이고 싱글톤 패턴이 필요함.
        assertThat(memberService1).isNotSameAs(memberService2);
    }
}
