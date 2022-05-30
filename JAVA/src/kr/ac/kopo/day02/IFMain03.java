package kr.ac.kopo.day02;
import java.util.Scanner;

/*
 *  다중if
 *  if(조건1) {
 *       문장1;
 *  } else if(조건2) {
 *       문장2
 *  } else if(조건3) {
 *       문장3
 *  } else {
 *       문장4
 *  }
 *  
 *  else는 앞 조건에 대해 거짓일때를 뜻하는거니까 else 뒤엔 ()없음
 *  if문에 ; 안돼!!
 *  단 크기순, 시간순일때만 이렇게 바로바로 나오는건데 중간부터 뽑아내는건 더 어려운코드
 */


public class IFMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("집에서 출발한 시간을 입력하세요(7시30분 : 730) => ");
		int time = sc.nextInt();
		
		if(time < 800) {                                    //집에서 출발한게 8시 이전인 애들 중에서 
			System.out.println("걸어서 학교에 간다");            //참
		} else if(time<815) {                                           //아닌애들중에서
				System.out.println("버스를 타고 학교에 간다");
			} else {
				System.out.println("택시를 타고 학교에 간다");
			}
		}
		

	}


/*
 *  if(조건) {
 *   문장1;
 *  } else {
 *    if(조건2) {
 *     문장2;
 *     } else {
 *      if(조건3);
 *      } else {
 *       if(조건4) {
 *       } else {
 *        if(조건5) {
 *         문장5;
 *          else {
 *           문장6;
 *           }
 *  }
 * 
 */



/* 여기 코드랑 같은건데 저 위에는 else와 그 다음 if가 합쳐진 것
 * 	System.out.print("집에서 출발한 시간을 입력하세요(7시30분 : 730) => ");
		int time = sc.nextInt();
		
		if(time < 800) {                                    //집에서 출발한게 8시 이전인 애들 중에서 
			System.out.println("걸어서 학교에 간다");            //참
		} else {                                           //아닌애들중에서
			if(time < 815) {
				System.out.println("버스를 타고 학교에 간다");
			} else {
				System.out.println("택시를 타고 학교에 간다");
 * 
*/
