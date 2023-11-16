package basic;

public class RecursiveFunction {

	public static void recursiveFunction(int i) {
		if (i == 100)
			return;
		System.out.println(i + "번째 재귀함수에서 " + (i + 1) + "번째 재귀함수 호출 ");
		recursiveFunction(i + 1);
		System.out.println(i+"번째 재귀 함수를 종료.");
	}
	public static void main(String[] args) {
		recursiveFunction(1);
	}
}
