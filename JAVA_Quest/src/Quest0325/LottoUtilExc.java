package Quest0325;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoUtilExc {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	public static void main(String[] args) {
		LottoUtilExc lue = new LottoUtilExc();
		lue.start();

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

			try {// 오류가발생할것같은게 try안에
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j])
						{
						throw new Exception(); //try에서 억지로 만들어준 예외가(if문) 발생하면 throw new로 이 상황일 땐 catch로 보내줘야 한다!! 
						}; 
				}
			} catch (Exception e) { // 그걸 잡아줄 코드
				i--;
			}
		}
	return arr;
	}
}