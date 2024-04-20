package sec1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로탐색 - 너비우선탐색
public class java_2178 {
    static StringBuilder sb = new StringBuilder(); // 문자열을 합칠 때 사용할 StringBuilder
    static int N, M; // 미로의 크기를 나타내는 변수
    static int[] dirX = {0, 0, 1, -1}; // 상하좌우를 나타내는 배열
    static int[] dirY = {1, -1, 0, 0};
    static boolean[][] check; // 각 지점을 방문했는지 여부를 저장하는 배열
    static int count = 0,ans = Integer.MAX_VALUE; // 이게 왜???
    static int[][] arr; // 미로의 정보를 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(st.nextToken()); // 미로의 세로 크기 입력
        M = Integer.parseInt(st.nextToken()); // 미로의 가로 크기 입력

        arr = new int[N][M]; // 미로 정보를 저장할 배열 초기화
        check = new boolean[N][M]; // 방문 여부를 저장할 배열 초기화

        // 미로 정보 입력
        for(int i=0; i<N; i++) {
            String str = bufferedReader.readLine();
            char[] ch = str.toCharArray();

            for(int j=0; j<ch.length; j++) {
                arr[i][j] = Character.getNumericValue(ch[j]); // 문자를 숫자로 변환하여 배열에 저장
            }
        }
        check[0][0] = true; // 시작점 방문 처리
        bfs(0, 0); // 너비 우선 탐색 시작
        System.out.println(arr[N-1][M-1]); // 마지막 지점에 저장된 값 출력

    }

    // 너비 우선 탐색을 수행하는 메서드
    public static void bfs(int x, int y) {
        Queue<spot> q = new LinkedList<>(); // 너비 우선 탐색에 사용할 큐 생성
        q.add(new spot(x, y)); // 시작점을 큐에 추가

        while (!q.isEmpty()) { // 큐가 빌 때까지 반복
            spot s = q.poll(); // 큐에서 지점을 꺼냄
            for (int i=0; i<4; i++) { // 상하좌우 네 방향에 대해 반복
                int nextX = s.x + dirX[i]; // 다음 지점의 x 좌표 계산
                int nextY = s.y + dirY[i]; // 다음 지점의 y 좌표 계산

                // 다음 지점이 미로의 범위를 벗어나면 무시
                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }
                // 다음 지점을 이미 방문했거나 이동할 수 없는 지점이면 무시
                if(check[nextX][nextY] || arr[nextX][nextY] == 0) {
                    continue;
                }
                q.add(new spot(nextX, nextY)); // 다음 지점을 큐에 추가
                arr[nextX][nextY] = arr[s.x][s.y] + 1; // 다음 지점에 현재 지점까지의 거리를 저장
                check[nextX][nextY] = true; // 다음 지점을 방문했음을 표시
            }
        }
    }

}

// 미로의 지점을 나타내는 클래스
class spot {
    int x; // x 좌표
    int y; // y 좌표
    spot(int x, int y){
        this.x = x;
        this.y = y;
    }
}
