package practice;

import java.util.Scanner;

public class Direction {
	/*
	 * 상하좌우 N*N 크기의 정사각형 공간위. 1*1 크기의 정사각형으로 나뉘어짐 가장 왼쪽위 좌표는 (1,1), 가장 오른쪽 아래는 (N,N)
	 * 여행가 A는 상하좌우로 이동가능, 시작 좌표는 항상 (1,1) 하나의 줄에 띄어쓰기 기준으로 L, R, U, D 반복적으로 이동 단 N*N
	 * 공간을 빠ㅈ나가는 움직임은 무시된.
	 * 
	 * 입력조건 : N(1~100), 이동횟수(1~100)
	 * 
	 * 출력 조건 A가 최종적으로 도착할 지점의 좌표 (X,Y) 출력
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();// 버퍼 지우기

		String[] plans = sc.nextLine().split(" ");

		char[] moveTypes = { 'L', 'R', 'U', 'D' };
		int[] dy = { -1, 1, 0, 0 };
		int[] dx = { 0, 0, -1, 1 };

		int x = 1, y = 1;// 시작점

		for (int i = 0; i < plans.length; i++) {
			char plan = plans[i].charAt(0);

			// 이동 후 좌표
			int nx = -1, ny = -1;
			for (int j = 0; j < moveTypes.length; j++) {
				if (plan == moveTypes[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			// 가장 자리 벗어 낫을 때
			if (nx < 1 || ny < 1 || nx > n || ny > n) {
				continue;
			}
			x = nx;
			y = ny;

		}
		System.out.println(x + "," + y);
		sc.close();

	}
}
