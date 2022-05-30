package Quest0318;
import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringUtil su = new StringUtil();
		
		
		//1번		
		System.out.println("대문자인가요? : " + su.isUpperChar('A'));
		System.out.println("대문자인가요? : " + su.isUpperChar('a'));
		

		//2번
		System.out.println("소문자인가요? : " + su.isLowerChar('a'));
		System.out.println("소문자인가요? : " + su.isLowerChar('A'));
		
		//3번 & 4번
		System.out.print("두 개의 숫자를 입력하세요 : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("더 큰 수는? : " + su.max(i, j));
		System.out.println("더 작은 수는? : " + su.min(i, j));
	
		
		//5번 
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next(); //넥스트는 스페이스랑 엔터 무시
		//String str = sc.nextLine(); 얘는 앞에 넥스트인트에서 남겨준 엔터때문에 안받아지는거
		System.out.println(su.reverseString(str));
		
		
	    //6번
		System.out.print("문자열을 입력하세요 : ");
		String strr = sc.next();
		System.out.println(su.toUpperString(strr));
		
		
		//7번
		System.out.print("문자열을 입력하세요 : ");
		String strrr = sc.next();
		System.out.println(su.toLowerString(strrr));
		
	

	}	
		
}
