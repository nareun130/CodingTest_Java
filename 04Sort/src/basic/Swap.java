package basic;

public class Swap {
	public static void main(String[] args) {
		int[] arr = { 3, 5 };

		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println(arr[0] + " " + arr[1]);
	}
}
