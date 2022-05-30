package kr.ac.kopo.day02;
import java.util.Random; //외부파일이라서 임포트해야함
/** 별 두개여야 문서
로또와 관련된 여러가지 기능 클래스
@author 홍길동

*
*
*/

public class LottoUtil {
	public void todayProbability() {
		
		//Math.random() //임의의 난수표현 메소드
		//java.util.Random 얘도
		
		/**
		 * 오늘의 로또 확률을 알려주는 메소드
		 */
		
		Random r = new Random();
		int p = r.nextInt(101); //이 안에 범위 지정 가능(임의의 숫자를 101로 나눠라!) - 101이면 얘는 0~100사이의 숫자만 추출됨 -> 그럼얘를 확률값으로 볼 수 있겠지
		
		System.out.println("오늘의 로또 확률은 " + p +" %입니다");
	}


}
