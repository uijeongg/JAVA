package Quest0325;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoUtilSet {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	public static void main(String[] args) {
		LottoUtilSet lus = new LottoUtilSet();
		lus.start();

	}

	public void start() {
		System.out.print("게임 수를 입력하세요 : ");

		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			System.out.println("게임" + (i + 1) + " : " + Arrays.toString(getNumbers()));

		}
	}

	private int[] getNumbers() {

		Set<Integer> set = new HashSet<>();
		set.add(r.nextInt(45) + 1);
		set.add(r.nextInt(45) + 1);
		set.add(r.nextInt(45) + 1);
		set.add(r.nextInt(45) + 1);
		set.add(r.nextInt(45) + 1);
		set.add(r.nextInt(45) + 1);

		Object[] arr = set.toArray(); //set을 array로 받음. toArray는 object형으로 받음.
		int[] arr1 = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = (int) arr[i];

		}
		return arr1;
	}
}
