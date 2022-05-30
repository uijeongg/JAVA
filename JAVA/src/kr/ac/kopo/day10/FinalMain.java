package kr.ac.kopo.day10;
//final 내용
import java.util.Random;


/*final*/ class Super { //클래스에 파이널 붙이면 상속 안됨.
	//클래스에 파이널 붙이면 상속 안됨.
    // = super는 부모클래스가 될 수 없다!
	
	private final double PI = 3.14 ; //상수변수는 대문자 선언
	
	/*
	 * Super() {
	
		PI=3.1345;
	}
	//그 안에서 이런 수정이 안된다!
	*/
	

	final void call() { // final을 붙이면 오버라이드 금지
		// call()메소드를 다른 메소드에서 재정의 금지. call()로 부르는 것까지만 가능
		System.out.println("SUPER::Call()...");
	}
}

class Sub extends Super { // 위의 super 클래스를 상속받은 sub 클래스
	                      //위의 클래스에서 final을 붙여주면 이 상속이 불가!

	Sub() { // 생성자
		call(); // 호출은 무조건 생성자나 메소드 안에서 가능. 그냥 call();은 말도 안되는 것
	}

	void print() {
		call(); // 메소드 안에서 그냥 call(); 호출은 가능
	}

/*
void call() { //근데 이건 에러. call()로 새로운 메소드 만드는 중이니까. 이게 재정의. 금지! 
}
}

*/

}




//-------------------------------------------------------------------------------------------------------------





class MyRandom extends Random{

	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1; //원래있던 넥스트인트를 상속받아서 내맘대로 바꿀 수도 있다 +1 내가 해준 것
	}

	public int nextInt(int start , int end) { //1~100사이의 숫자를 출력할거야 메소드
		return super.nextInt(end-start) + start; //이건 오버라이드 메소드가 아니라 내가만든거. 근데 이렇게 하면 end-1까지만 나옴
	}
}


/*
 * class MyString extends String { string클래스는 final이라서 내 입맛대로 내용을 고칠 수 없음. 위처럼 메소드를 조작할 수 없음	
}
*/



public class FinalMain {

	public static void main(String[] args) {
		
		MyRandom  r = new MyRandom();
		int random = r.nextInt(2);  //그럼 원래는 0,1만 나와야하는데 위에서 원래있던 넥스트인트를 상속받아서 내맘대로 바꿀 수도 있다
		System.out.println(random); // 그럼 2나옴
		/*
		Random r = new Random();
		int random = r.nextInt(90) +10;  //10~99까지의 숫자 랜덤 출력
		//int random = r.nextInt(10) +1;
		//매번 +1하기 싫잖아 0부터 시작하는거 말고 1부터 시작하고 싶잖아

*/
	}

}
