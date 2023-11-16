package basic;

public class SelectSort {
	public static void main(String[] args) {

		// 가장 작은 수를 선택하는 선택 정렬
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = 0; i < arr.length; i++) {
			int min_index = i; // 가장 작은 원소의 인덱스
			
			for (int j = i + 1; j < arr.length; j++) {
				//이것만 반대부호면 내림차순 
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}

			// 스왑
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
