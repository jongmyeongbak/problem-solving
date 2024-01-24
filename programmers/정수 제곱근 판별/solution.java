// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12934

import java.lang.Math;

class Solution {
    public long solution(long n) {
        long x = (long) Math.sqrt(n);
        if (n != x * x) {
            return -1;
        }
        x++;
        return x * x;
    }
}