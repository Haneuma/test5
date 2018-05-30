
class CoinCase {
int count500;
int count100;
int count50;
int count10;
int count5;
int count1;

//コンストラクタ
CoinCase(){
	count500 = 0;
	count100 = 0;
	count50 = 0;
	count10 = 0;
	count5 = 0;
	count1 = 0;
}

void addCoin(int coinType,int sheets) {
	switch(coinType) {
	case 500:
		count500 = count500 + sheets;
		break;

	case 100:
		count100 = count100 + sheets;
		break;

	case 50:
		count50 = count50 + sheets;
		break;

	case 10:
		count10 = count10 + sheets;
		break;

	case 5:
		count5 = count5 + sheets;
		break;

	case 1:
		count1 = count1 + sheets;
		break;
	default:
	}
}

int getCount(int coinType) {
	int sheets = 0;

	switch(coinType) {
	case 500 :
		sheets = count500;
		break;
	case 100 :
		sheets = count100;
		break;
	case 50 :
		sheets = count50;
		break;
	case 10 :
		sheets = count10;
		break;
	case 5 :
		sheets = count5;
		break;
	case 1 :
		sheets = count1;
		break;
	default:
	}
	return sheets;
	}

int getAmount() {
	int total;

	total = 500 * count500
		  + 100 * count100
		  + 50 * count50
		  + 10 * count10
		  + 5 * count5
		  + 1 * count1;
	return total;

}
}
