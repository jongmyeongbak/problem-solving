// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int length = (int) Math.log10(n) + 1;
        long[] numbers = new long[length];
        for (int i = 0; n > 0; i++, n /= 10) {
            numbers[i] = n % 10;
        }
        Arrays.sort(numbers);
        for (int i = length - 1; i >= 0; i--) {
            answer = answer * 10 + numbers[i];
        }
        return answer;
    }
}