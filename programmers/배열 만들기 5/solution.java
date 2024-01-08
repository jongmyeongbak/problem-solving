// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/181912?language=java

import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> numbers = new ArrayList<>();
        for (String text : intStrs) {
            int n = Integer.parseInt(text.substring(s, s + l));
            if (n > k) {
                numbers.add(n);
            }
        }
        
        return numbers.stream().mapToInt(i -> i).toArray();
        // int size = numbers.size();
        // int[] answer = new int[size];
        // for (int i = 0; i < size; i++) {
        //     answer[i] = numbers.get(i);
        // }
        // return answer;
    }
}