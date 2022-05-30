package kr.ac.kopo.day02;
import java.util.Scanner;
/*
 * 1~3사이의 정수 입력:
 * 1 입력시 "one" 출력
 * 2 입력시 "two" 출력
 * 3 입력시 "three" 출력
 * 그 외 "error" 출력
 */

public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-3 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) { //케이스 안에선 블럭스코프가 아무런 의미가 없음
		case 1 : 
			System.out.println("one");//num이 1일 때 one 찍고 싶은 것
			break; //1 찍고나면 바로 끝으로 감. 여기서 끝낼 수 잇음 => n개 중 하나의 문장만 찍게 해주는 역할
		case 2 :
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break;
	    default : //아닐 때 error ===============> default는 else의 효과를 낸다
	    	System.out.println("error");
		}
	}
}
	// 만약 3을 찍으면 3 문장부터 아래거까지 다 뜸. 이게 "스위치의 다중문장"
    // 근데 그냥 그것만 치고 빠져나오고 싶으면 break 키워드 사용. 그거 안하면 three랑 error 둘 다 뜸
//포 와일 반복문 스위치에서만 브레이크 씀. 이프문에선 의미 없음





/*
 * 만약 default를 맨 마지막이 아니라 중간에 넣으면
 * 넣었다하더라도 밑에 있는 케이스를 무시하는 형태는 아님
 * 
 * switch(num) { //케이스 안에선 블럭스코프가 아무런 의미가 없음
		case 1 : 
			System.out.println("one");//num이 1일 때 one 찍고 싶은 것
			break; //1 찍고나면 바로 끝으로 감. 여기서 끝낼 수 잇음 => n개 중 하나의 문장만 찍게 해주는 역할
		case 2 :
			System.out.println("two");
			break;
		default : //아닐 때 error
	    	System.out.println("error");
		case 3 :
			System.out.println("three");
			break;
	    
 * 
 * 
 * 
 * 
 */

		
/*	
		if(num==1) {
			System.out.println("one");
		}
		if else(num==2) {
			System.out.println("two");
		}
		if else(num==3) {
			System.out.println("three");
		} else {
			System.out.println("error"); //if문과 ifelse문일 때 error값 비교해보기
		}

	}

}
*/		

		
//if문으로 설정할 땐 이 코드		
//		if(num==1) {
//			System.out.println("one");
//		}
//		if(num==2) {
//			System.out.println("two");
//		}
//		if(num==3) {
//			System.out.println("three");
//		} else {
//			System.out.println("error"); //이렇게 하면 three만 아니면 error로 다 출력됨. 근데 우리가 찾고픈건 1-3이 다 아닌 것을 error로 쓰고 싶은 것
//		}

//	}

//}



