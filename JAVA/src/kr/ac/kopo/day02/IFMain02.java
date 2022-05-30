package kr.ac.kopo.day02;
import java.util.Scanner;
/*
 *  아침에 학교갈 때 운송수단을 선택해야하는 코드 만들어주고 싶을 때
 *  
 *  중첩if문
 *  사이사이에 들어잇는 조건들이 연산자인것
 *  if(조건1) {            
 *      문장1;
 *   } else {             조건 1이 거짓인것들 중에서
 *      if(조건2) {         
 *       문장2;             조건2가 참인 것들
 *   } else {
 *      문장3;             조건2도 거짓
 *   }
 * 
 * }
 * 
 * 
 * 
 * 출발한 시간을 입력하세요(ex- 7:30에 출발했으면 730으로 출력하고 싶을 때)
 * 버스를 탑니다.
 */


public class IFMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("집에서 출발한 시간을 입력하세요(7시30분 : 730) => ");
		int time = sc.nextInt();
		
		if(time < 800) {                                    //집에서 출발한게 8시 이전인 애들 중에서 
			System.out.println("걸어서 학교에 간다");            //참
		} else {                                           //아닌애들중에서
			if(time < 815) {
				System.out.println("버스를 타고 학교에 간다");
			} else {
				System.out.println("택시를 타고 학교에 간다");
			}
		}

	}

}

//run해서 확인해보면 8:22에 출발했으면 택시타고 간다고 뜨는거지





// if (time<800) {
// 	sysout("걸어서 학교에 간다");
// } else {
// 	if(time<815) {
// 		sysout("버스타고 간다");
// 	} else {
// 		sysout("택시타고 간다");
// 	}
// }











