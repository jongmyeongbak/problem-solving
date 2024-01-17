// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/81301

class Solution {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int answer = 0;
        int sLen = s.length();
        for (int i = 0; i < sLen;) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                answer = answer * 10 + Character.getNumericValue(ch);
                i++;
                continue;
            }
            
            for (int j = 0; j < 10; j++) {
                int wordLen = words[j].length();
                if (i + wordLen <= sLen && words[j].equals(s.substring(i, i + wordLen))) {
                    answer = answer * 10 + j;
                    i += wordLen;
                    break;
                }
            }
        }
        
        return answer;
    }
}