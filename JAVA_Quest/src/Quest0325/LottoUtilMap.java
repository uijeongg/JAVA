package Quest0325;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
 로또 게임
게임수를 입력하세요 : 3
게임 1 : [2, 6, 13, 25, 20, 7]
게임 2 : [2, 9, 3, 7, 38, 13]
게임 3 : [40, 10, 38, 39, 42, 18]
 */

public class LottoUtilMap {

	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	public static void main(String[] args) {
		LottoUtilMap lum = new LottoUtilMap();
		lum.start();
	}
	
	public void start() {
		System.out.print("게임 수를 입력하세요 : ");
		
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
		System.out.println("게임" + (i + 1) +  " : " + Arrays.toString(getNumbers()));
		//Arrays.toString 배열의 주소 말고 내용 출력
		}
		}

	
	private Object[] getNumbers() {
		
		Map<Integer, Integer> map = new HashMap<>(); 
	
		map.put(r.nextInt(45)+1, null);  //새로운 데이터 추가할 때 풋메소드
		map.put(r.nextInt(45)+1, null);
		map.put(r.nextInt(45) + 1, null);
		map.put(r.nextInt(45) + 1, null);
		map.put(r.nextInt(45) + 1, null);
		map.put(r.nextInt(45) + 1, null);

		Set<Integer> keys = map.keySet(); // map의 key만 모아서 set만듦

		Object[] arr = keys.toArray();
		return arr;

	}

}

