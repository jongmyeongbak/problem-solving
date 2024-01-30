// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/181880

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            for (; num > 1; num /= 2, answer++) {
            }
        }
        return answer;
    }
}