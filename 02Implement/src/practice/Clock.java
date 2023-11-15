package practice;

import java.util.Scanner;

public class Clock {
	/*
	 * 시각 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구한다. ex) 00시
	 * 00분 03초 00시 13분 03초
	 * 
	 * 입력초전 N(0~23)정수
	 * 
	 * 출력조건 3이 하나라도 포함되는 모든 경우의 수 출력
	 * 
	 * N = 5 -> 11475
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < 60; j++) {
				for (int k = 0; k < 60; k++) {
					if (check(i, j, k))
						count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

	private static boolean check(int hour, int min, int sec) {
		if (hour % 10 == 3 || min / 10 == 3 || min % 10 == 3 || sec / 10 == 3 || sec % 10 == 3)
			return true;
		return false;
	}
}
