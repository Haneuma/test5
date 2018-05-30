import java.util.Scanner;

class Answer075 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		CoinCase cc = new CoinCase();
		for(int i = 0; i < 10 ; i++) {
			System.out.println((i+1)+"回目");
			System.out.println("硬貨の種類＞");
			int coinType = sc.nextInt();

			System.out.println("枚数＞");
			int sheets = sc.nextInt();

			cc.addCoin(coinType, sheets);
		}
		System.out.println("500円硬貨(枚):" + cc.getCount(500));
		System.out.println("100円硬貨(枚):" + cc.getCount(100));
		System.out.println("50円硬貨(枚):" + cc.getCount(50));
		System.out.println("10円硬貨(枚):" + cc.getCount(10));
		System.out.println("5円硬貨(枚):" + cc.getCount(5));
		System.out.println("1円硬貨(枚):" + cc.getCount(1));
		System.out.println("全部で(円)" + cc.getAmount());
		sc.close();
	}

}
