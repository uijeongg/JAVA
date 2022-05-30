package kr.ac.kopo.day10.inter;

public class UserMain {
	public static void main(String[] args) {
		
		/*
		  사용자가 엘지티비를 구매할 때 (new LGTV();를 통해서) LGTV tv = new LGTV(); //인객 만들어주고
		  tv.powerOn(); tv.channelDown(); //이렇게 7개 해주고 싶은게 원래 방법
		 */

		
		/*
		  저 모든 메소드를 엘지랑 삼성이 다 받게 하고 싶어. (이게 UserMain class를 사용하는 이유) tv가 가지고 있는 인터페이스니까
		  이렇게 두개를 만들어주면 됨 tv가 엘지를 가리키면 엘지메소드를, 삼성이면 삼성메소드를 실행하게 되는 것 => 객체형변환 일어난 것
		 */

		
		TV tv = new LGTV();
		//TV tv = new SamsungTV();

		
		/*
		  부모의 참조변수인 tv는 원래 부모 영역만 가리키는데 그것을 new LGTV() 해줌으로써 tv가 가리키는 곳이 tv(부모) +
		  LGTV(자식) 으로 확장되었으니까 ==> 묵시적 형변환이 일어났다 !!
		 */

		tv.powerOn();
		tv.powerOff();
		tv.channelUp();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeDown();
		tv.mute();
	}

}
