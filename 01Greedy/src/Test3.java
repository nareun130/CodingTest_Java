import java.util.Scanner;

public class Test3 {
	/*
	 * 1이 될 때까지 어떤수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려한다. 단, 두 번째 연산은 N이 K로
	 * 나누어 떨어질 때만 선택 가능 1. N에서 1을 뺀다. 2. N을 K로 나눈다.
	 * 
	 * 입력 조건 : N(2~100,000), K(2~100,000)자연수, N>=K
	 * 
	 * 출력 조건 : N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 횟수의 최솟값을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();//25
		int k = sc.nextInt();//3
		int result = 0;

		while (true) {
			// n이 k로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
			int target = (n / k) * k;
			result += (n - target);

			n = target;

			// N이 K보다 작을 때(더 이상 나눌 수 없을 때) 반복문 탈출
			if (n < k)
				break;

			result += 1;
			n /= k;

		}
		// 마지막으로 남은 수에 대하여 1씩 빼기
		result += (n - 1);
		System.out.println(result);//6
		
		sc.close();
	}
}
