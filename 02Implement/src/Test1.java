import java.util.Scanner;

public class Test1 {
	/*
	 * 왕실의 나이트 
	 * 
	 * 체스판과같은 8*8 좌표 평면 (1~8) * (a~h) 나이트는 L자 형태로만 이동 가능. 
	 * 평면 바깥으로 못 나감 2가지
	 * 경우로만 이동가능
	 * 
	 * 1. 오른쪽으로 두칸 이동 후 아래로 한 칸 이동(c2)
	 * 
	 * 2. 아래로 두 칸 이동 후 오른쪽으로 한 칸 이동하기(h3)
	 * 
	 * 입력조건 : 입력문자는 a1처럼 열과 행으로 이뤄진다.
	 * 
	 * 나이트가 이동할 수 있는 경우의 수
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 현재 나이트의 위치값 입력받기
		String location = sc.nextLine();

		int row = location.charAt(1) - '0';
		int column = location.charAt(0) - 'a' + 1;
		System.out.println(row);
		System.out.println(column);

		// 이동할 수 있는 8 가지 방향 정의
		int[] dx = { -2, -1, 1, 2, 2, 1, -1, -2 };
		int[] dy = { -1, -2, -2, -1, 1, 2, 2, 1 };

		// 8가지 방향에 대해 각 위치로 이동 가능한지 확인
		int result = 0;
		for (int i = 0; i < 8; i++) {
			int nextRow = row + dx[i];
			int nextColumn = column + dy[i];

			// 해당 위치로 이동 가능하면 카운트 증가
			if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
				result += 1;
			}
		}
		System.out.println(result);
		sc.close();
	}

}
