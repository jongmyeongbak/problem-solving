// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12921

class Solution {
    public int solution(int n) {
        int answer = 1;
        asc: for (int i = 3; i <= n; i += 2){
            for (int j = 2; j * j <= i; j++){
                if (i % j == 0) {
                    continue asc;
                }
            }
            answer++;
        }
        return answer;
    }
}