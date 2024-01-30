// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12921

class Solution {
    public int solution(final int N) {
        boolean[] notPrime = new boolean[N + 1];
        
        notPrime[0] = true;
        notPrime[1] = true;
        
        int answer = 0;
        
        for (int i = 2; i <= N; i++) {
            if (notPrime[i]) continue;
            
            answer++;
            
            for (int idx = i + i; idx <= N; idx += i) {
                notPrime[idx] = true;
            }
        }
        
        return answer;
    }
}