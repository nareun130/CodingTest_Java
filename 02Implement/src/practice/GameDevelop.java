package practice;

import java.util.Scanner;

public class GameDevelop {
	/*
	 * 게임 개발
	 * 
	 * 캐릭터는 1*1 정사각형으로 이뤄진 N*M크기의 직사각형으로, 각각의 칸은 육지 또는 바다 캐릭터는 동서남북 중 한 곳을 바라본다. 맵의
	 * 각 칸은 (A,B)로 나타내고, A는 북쪽으로부터 떨어진 칸의 개수, B는 서쪽으로부터 떨어진 칸의 개수 캐릭터는 상하좌우로 이동가능,
	 * 바다로 된 공간은 갈수 없다.
	 * 
	 * 1. 현재 위치에서 현재 방향을 기준으로 왼쪽방향(반시계 90도 회전)부터 차례대로 갈 곳을 정함. 2. 캐릭터의 바로 왼쪽 방향에 가보지
	 * 않은 칸이 존재하면, 왼쪽으로 회전하고 왼쪽으로 한 칸을 전진, 왼쪽에 가보지 않은 칸이 없으면, 왼쪽으로 방향만 회전하고 1단계로
	 * 돌아감.
	 * 
	 * 3. 만약 네 방향 모두 이미 가본 칸이거나 바다로 되어 있는 칸인 경우, 바라보는 방향을 유지한 채로 한 칸 뒤로 가고 1단계로 돌아감.
	 * 단, 이때 뒤쪽 방향이 바다인 칸이라 뒤쪽으로 갈 수 없는 경우는 멈춘다.
	 * 
	 * 입력조건 : 세로 N,가로 M(3~50)
	 * 
	 * 칸의 좌표(A,B)와 방향 d 가 공백으로 구분 d의 값 0 : 북쪽, 1 : 동쪽, 2 : 남쪽, 3 : 서쪽 셋째 줄 부터 맵이
	 * 육지인지 바다인지에 대한 정보가 주어짐. N개의 줄에 맵의 상태가 북쪽부터 남쪽 순서대로, 각 줄의 데이터는 서쪽부터 동쪽 순서대로
	 * 주어짐. 맵의 외곽은 항상 바다 0 : 육지 1 : 바다
	 * 
	 * 출력조건 : 첫째 줄에 이동을 마친 후 캐릭터가 방문한 칸의 수를 확인
	 * 
	 */
	public static int n, m, x, y, direction;
	// 방문한 위치를 저장하기 위한 맵 생성하여 0으로 초기화
	public static int[][] d = new int[50][50];
	// 전체 맵 정보
	public static int[][] arr = new int[50][50];
	// 북, 동, 남, 서 정의
	public static int dy[] = { 0, 1, 0, -1 };
	public static int dx[] = { -1, 0, 1, 0 };

	// 왼쪽으로 회전
	public static void turnLeft() {
		direction -= 1;
		if (direction == -1) // 북-> 서
			direction = 3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		// 현재 캐릭터의 x,y 좌표, 방향
		x = sc.nextInt();
		y = sc.nextInt();
		direction = sc.nextInt();
		d[x][y] = 1; // 현재 좌표 문 : 1, 방문x : 0

		// 전체 맵 정보 입력 받기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// 시뮬레이션 시작
		int count = 1;
		int turnTime = 0;
		while (true) {
			// 왼쪽 회전
			turnLeft();
			int nx = x + dx[direction];
			int ny = y + dy[direction];

			// 회전한 후 정면에 가보지 않은 칸이 존재하면 이동
			if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
				d[nx][ny] = 1;
				x = nx;
				y = ny;
				count += 1;
				turnTime = 0;
				continue;
			} // 회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
			else {
				turnTime += 1;
			}
			// 네 방향 모두 갈 수 없는 경우
			if (turnTime == 4) {
				nx = x - dx[direction];
				ny = y - dy[direction];

				// 뒤로 갈 수 있으면 이동
				if (arr[nx][ny] == 0) {
					x = nx;
					y = ny;
				}
				// 뒤가 바다로 막혀있는 경
				else
					break;
				turnTime = 0;
			}

		}
		System.out.println(count);
		sc.close();
	}
}
