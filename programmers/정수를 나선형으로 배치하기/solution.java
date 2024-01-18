// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/181832

class Solution {
    public int[][] solution(int n) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int[][] answer = new int[n][n];
        int nSquare = n * n;
        for (int di = 0, x = 0, y = 0, num = 1; num <= nSquare; num++) {
            answer[x][y] = num;
            int x2 = x + dx[di];
            int y2 = y + dy[di];
            if (x2 < 0 || y2 < 0 || x2 >= n || y2 >= n || answer[x2][y2] != 0) {
                di = (di + 1) % 4;
                x += dx[di];
                y += dy[di];
            } else {
                x = x2;
                y = y2;
            }
        }
        return answer;
    }
}