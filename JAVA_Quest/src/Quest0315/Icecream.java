package Quest0315;
import java.util.Scanner;
/*
아이스크림 몇개 구입할꺼야? => 3 (키보드 입력)

*** 1번째 아이스크림 구매정보 ***
아이스크림명 : 비비빅(키보드)
아이스크림가격 : 700(키보드)

*** 2번째 아이스크림 구매정보 ***
아이스크림명 : 월드콘(키보드)
아이스크림가격 : 1500(키보드)

*** 3번째 아이스크림 구매정보 ***
아이스크림명 : 메로나(키보드)
아이스크림가격 : 1000(키보드)

< 총 3개의 아이스크림 구매정보 출력 >
번호   아이스크림명    가격
1     비비빅         700
2
3

총 판매액 : XXXX원
*/
class Ice { // 여기서 모든 변수 선언 해보기
	// 클래스 배열을 만들고 객체들을 그 안에 넣는 식으로

	String name;
	int price;
}

 
public class Icecream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림 몇개 구입할거야? : ");
		int total = sc.nextInt();
		
		System.out.println("*** 1번째 아이스크림 구매정보 ***");
		Ice ice1 = new Ice();
		System.out.print("아이스크림명 : ");
		ice1.name = sc.next();
		System.out.print("아이스크림가격 : ");
		ice1.price = sc.nextInt();
		
		System.out.println("*** 2번째 아이스크림 구매정보 ***");
		Ice ice2 = new Ice();
		System.out.print("아이스크림명 : ");
		ice2.name = sc.next();
		System.out.print("아이스크림가격 : ");
		ice2.price = sc.nextInt();
	
		System.out.println("*** 3번째 아이스크림 구매정보 ***");
		Ice ice3 = new Ice();
		System.out.print("아이스크림명 : ");
		ice3.name = sc.next();
		System.out.print("아이스크림명 : ");
		ice3.price = sc.nextInt();

		//Ice[] iceArr = { ice1, ice2, ice3 };
		Ice[] iceArr = new Ice[]{ice1, ice2, ice3 }; //ice1, ice2, ice3의 타입은 클래스 자체 Ice
	
			
		
		System.out.println("< 총 3개의 아이스크림 구매정보 출력 >");
		
		for(Ice iceice : iceArr) {
			//System.out.println("아이스크림명\t" + iceice.name + "\t아이스크림가격\t" + iceice.price); //iceArr이라는 배열의 주소를 가진 Ice, 그리고 그 Ice의 각각의 값들인 ic123의 값에 접근하기 위해 (그 이름을 그대로 써줄 수 없으므로) iceice라는 새로운 공간을 만들어 준 것
			System.out.println("아이스크림명\t" + "아이스크림가격");
			System.out.println(iceice.name + iceice.price);
			//그럼 iceice가 세바퀴 돌면서 ice123을 다 출력해주는거지
		}
		
}

}
