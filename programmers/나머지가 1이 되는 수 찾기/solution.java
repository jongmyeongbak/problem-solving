// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/87389

class Solution {
    public int solution(int n) {
        int x = 1;
        while (n % x != 1) {
            x++;
        }
        return x;
    }
}