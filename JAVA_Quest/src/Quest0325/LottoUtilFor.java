package Quest0325;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoUtilFor {

	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	public static void main(String[] args) {
		LottoUtilFor luf = new LottoUtilFor();
		luf.start();
	}

	public void start() {
		System.out.print("게임 수를 입력하세요 : ");

		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			System.out.println("게임" + (i + 1) + " : " + Arrays.toString(getNumbers()));

		}
	}

	private int[] getNumbers() {

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45) + 1;

		}
		return arr;

	}
		
		
		
		
}


