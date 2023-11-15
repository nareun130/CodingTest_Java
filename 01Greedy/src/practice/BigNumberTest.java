package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumberTest {
	/*
	 * 큰 수의 법칙 다양한 수(길이 N)으로 이뤄진 배열이 있을 대 주어진 수들을 M번 더하여 가장 큰수를 만드는 법칙 단, 배열의 특정한
	 * 인텍스(번호)에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없다.
	 * 
	 * 입력조건 : n(2~1000), m(1~10,000), k(1~10,000) 자연수 둘 째줄에 n 개의 자연수 주어짐. 각 자연수는
	 * 1~10,000 자연수 K<=M 출력 조건 : 큰 수 의 법칙에 따라 더해진 답을 출력
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// 받은 배열을 정렬
		Arrays.sort(arr);

		int first = arr[n - 1];
		int second = arr[n - 2];

		// 가장 큰 수가 더해지는 횟수
		int count = (m / (k + 1)) * k + m % (k + 1);

		int result = 0;
		result += count * first;
		result += (m - count) * second;

		System.out.println(result);
		sc.close();
	}
}
