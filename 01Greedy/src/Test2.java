import java.util.Scanner;

public class Test2 {
	/*
	 * 숫자 카드 게임 여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한 장을 뽑는다. 1. 숫자가 쓰인 카드들이 N * M 형태로
	 * 놓여있다. N은 행의 수, M은 열의수 2. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택 3. 그다음 선택된 행에 포함된 카드들 중
	 * 가장 숫자가 낮은 카드를 뽑아야 한다. 4. 따라서 처음에 카드를 골라낼 행을 선택할 때, 이후에 해당 행에서 가장 숫자가 낮은 카드를
	 * 뽑을 것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야 함.
	 * 
	 * 입력 조건 : N,M 은 1~100 자연수
	 * 각 숫자는 1 ~ 10,000 자연수
	 * 
	 * 출력조건 : 룰에 맞게 선택한 카드에 적힌 숫자를 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 3
		int m = sc.nextInt();// 3

		int result = 0;

		/*
		 * 3 1 2
		 * 4 1 4
		 * 2 2 2 
		 */
		for (int i = 0; i < n; i++) {
			
			//현재 줄에서 가장 작은 수 찾기
			int min = 10001;
			
			for (int j = 0; j < m; j++) {
				int x = sc.nextInt();
				min = Math.min(min, x);

			}
			//가장 작은 수들 중에서 가장 큰 수 찾가
			result = Math.max(result, min);
		}
		
		System.out.println(result);//2
		sc.close();
	}
}
