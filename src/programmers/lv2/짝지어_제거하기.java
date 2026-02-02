package programmers.lv2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제 이름: 짝지어 제거하기
 * 난이도: Lv. 2
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12973
 * * [풀이 접근]
 * 1. 문자열을 반복해서 자르면 시간 초과(O(N^2))가 발생함.
 * 2. 스택(Stack) 구조를 활용하여 O(N)으로 해결.
 * 3. Java의 Stack 클래스 대신 성능이 좋은 ArrayDeque 사용.
 */

public class 짝지어_제거하기 {
    public int solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    // 테스트용 main (선택 사항)
    public static void main(String[] args) {
        짝지어_제거하기 sol = new 짝지어_제거하기();
        System.out.println(sol.solution("baabaa"));
    }
}
