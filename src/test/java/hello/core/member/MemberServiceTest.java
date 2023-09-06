package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);
        AppConfig appConfig = new AppConfig();

        //when
        appConfig.memberService().join(member);
        Member findMember = appConfig.memberService().findById(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
