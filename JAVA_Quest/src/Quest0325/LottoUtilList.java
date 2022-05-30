package Quest0325;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoUtilList {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	public static void main(String[] args) {
		LottoUtilList lul = new LottoUtilList();
		lul.start();
	}

	public void start() {
		System.out.print("게임 수를 입력하세요 : ");

		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			System.out.println("게임" + (i + 1) + " : " + Arrays.toString(getNumbers()));

		}
	}

	private Object[] getNumbers() {

		List<Integer> lotto = new ArrayList<Integer>();

		for (int i = 0; lotto.size()<6; i++) { // ArrayList는 size()로 길이확인
			int num = r.nextInt(45) + 1;

			if (!lotto.contains(num)) { // 중복 제거, lotto에 num이 없으면(같은 수가 없으면) add num
				lotto.add(num);
			} else { //같은게 있으니까 else
				i--; //그 반대로 가버려라
			}
		}

		Object[] num2 = lotto.toArray(); //Object[] java.util.List.toArray() 이라서. 원래 짝궁
		return num2;

	}

}
