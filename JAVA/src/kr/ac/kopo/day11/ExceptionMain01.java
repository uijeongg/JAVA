package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		Random r = new Random();
		int num = r.nextInt(3); // 0 1 2
		System.out.println("num : " + num);
		System.out.println(10/num); //10을 num으로 나누고 싶었다
		//-> 그럼 나오다가 exception이 발생했다고 나옴
		//jvm자체에 예외처리기가 있어서 sw를 실행하다가 예외발생하면 걔가 알아서 처리해줌 -> 얘가 처리하는 방식은 강제종료
		//devided 제로라고 뜸
		System.out.println("main end.."); //이 위의 코드에서 예외가 발생하면 이 문장 수행 안되고 예외가 생기면 이거 수행 안됨
		
		//문제가 발생했을 때 걔 빼고 다른 애들은 다 돌아가게 하고 싶은거야 !! (최소한의 안전장치 개념) 그런 것들을 try문으로 묶는 것!!

	}

}
