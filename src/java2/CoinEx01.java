package java2;

public class CoinEx01 {

	int money = 2680;
	int restMoney = money;
	
	void restMoneyPrint(int coin) {
		System.out.println(coin+"�� ���� : "+restMoney/coin);
		restMoney = money % coin;
		System.out.println("���� �ݾ� : "+restMoney);
	}
	
	public static void main(String[] args) {
		int coinType[] = {500, 100, 50, 10};
		CoinEx01 coinEx01 = new CoinEx01();
		for (int i = 0; i < 4; i++) {
			coinEx01.restMoneyPrint(coinType[i]);
		}

		// 500 * 5, 100 * 1, 50 * 1, 10 * 3
//		System.out.println("500�� ���� : "+restMoney/500);
//		restMoney = money % 500;
//		System.out.println("���� �ݾ� : "+restMoney);
//		
//		System.out.println("100�� ���� : "+restMoney/100);
//		restMoney = restMoney % 100;
//		System.out.println("���� �ݾ� : "+restMoney);
//		
//		System.out.println("50�� ���� : "+restMoney/50);
//		restMoney = restMoney % 50;
//		System.out.println("���� �ݾ� : "+restMoney);
//		
//		System.out.println("10�� ���� : "+restMoney/10);
//		restMoney = restMoney % 10;
//		System.out.println("���� �ݾ� : "+restMoney);
	}

}
