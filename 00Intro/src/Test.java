
public class Test {
	public static void main(String[] args) {
		int[] arr = new int[4];

		// 1~100사이의 임의의 숫자로 배열 채우기
		for (int i = 0; i < arr.length; i++) {
			int temp = (int) (Math.random() * 100) + 1;
			arr[i] = temp;
		}

		callArr(arr);
		sortArr(arr);
		callArr(arr);

	}

	//배열의 값들을 확인하는 함수
	private static void callArr(int[] arr) {

		for (int c : arr) {
			System.out.print(c + ",");
		}
		System.out.println();
	}

	private static void sortArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			//최솟값의 인덱스
			int min_index = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}

			swap(arr, min_index, i);

		}
	}

	//배열의 두개 요소를 바꿔주는 함수
	private static void swap(int[] arr, int a, int b) {
		//최솟값을 임시로 저장
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
