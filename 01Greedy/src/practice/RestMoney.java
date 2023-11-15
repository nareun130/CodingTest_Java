package practice;

public class RestMoney {
	/*
	 * 투입된 금액이 1260원일 때, 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정 손님에게 거슬러 줘야 할 돈이
	 * N원일 때 거슬러 줘야 할 동전의 최소 개수 단, 거슬러 줘야 할 돈 N은 항상 10의 배수
	 */
	public static void main(String[] args) {
		int total = 1260;

		int count = 0;

		int[] coinTypes = { 500, 100, 50, 10 };

		for (int i = 0; i < coinTypes.length; i++) {

			int coin = coinTypes[i];
			count += total / coin;
			total %= coin;

		}
		System.out.println(count);
	}
}
