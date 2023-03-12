package com.ayoh.coreshop.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

/**
 * 단위 테스트를 위한 클래스명은 XxxTest 국룰.
 */
class MemberTest {

    /**
     * 반면에, 메서드 네이밍(naming)은 testXxx(..) 가 국룰
     */
    @DisplayName("회원 클래스 필드 중 아이디 필드를 정상적으로 가져올 수 있는지 테스트")
    @Test
    void testGetId() {
        // 1. given (== "~가 주어질 때" > 어떤 단위 테스트를 하기 위한 세팅
        Member member = new Member();
        member.setId(5L);

        // 2. when (== "~일 때" > 테스트를 하기 위한 가정)
        Long expected = member.getId();

        // 3. then (== "그래서 뭐?" > 검증의 단계)
        // Assertions 라는 유틸리티 클래스를 이용해서 단위 테스트 검증
        // expected: 기대값, actual: 실제값
        Assertions.assertEquals(expected, 5L);
    }

    @DisplayName("아이디 값 정상적으로 세팅할 수 있는지 테스트")
    @Test
    void testSetId() {
        // given
        Member member = new Member();
        Assertions.assertNull(member.getId());

        // when
        member.setId(65L);

        // then
        Assertions.assertEquals(65L, member.getId());
    }
}
