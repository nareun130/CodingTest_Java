
public class Test {
	public static void main(String[] args) {
		int[] arr = new int[10000];

		// 1~100사이의 임의의 숫자로 배열 채우기
		for (int i = 0; i < arr.length; i++) {
			int temp = (int) (Math.random() * 100) + 1;
			arr[i] = temp;
		}

		callArr(arr);
		sortArr(arr);
		callArr(arr);

		System.out.println();
		System.out.println("끝");
	}

	private static void callArr(int[] arr) {

		for (int c : arr) {
			System.out.print(c + ",");
		}
		System.out.println();
	}

	private static void sortArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min_index = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}

			swap(arr, min_index, i);

		}
	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
