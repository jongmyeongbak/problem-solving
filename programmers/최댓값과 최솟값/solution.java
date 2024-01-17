// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12939

class Solution {
    public String solution(String s) {
        String[] words = s.split(" ");
        int min = Integer.parseInt(words[0]);
        int max = min;
        int len = words.length;
        for (int i = 1; i < len; i++) {
            int num = Integer.parseInt(words[i]);
            if (num < min) {
                min = num;
                continue;
            }
            if (num > max) {
                max = num;
            }
        }
        return min + " " + max;
    }
}