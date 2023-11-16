package basic;

public class FactorialEx {

	// 반복구현한 n!
	public static int factorialIterative(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;

		}
		return result;
	}

	// 재귀구현한 n!
	public static int factorialRecursive(int n) {
		// n이 1이하면 1반환
		if (n <= 1)
			return 1;
		return n * factorialRecursive(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("반복 구현 :" + factorialIterative(5));
		System.out.println("재귀 구현 :" + factorialRecursive(5));
	}
}
