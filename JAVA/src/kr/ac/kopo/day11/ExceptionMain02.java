package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
			Random r = new Random();
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num); //여기서 예외가 발생해
			
		} catch(ArithmeticException ae) {      //그럼 여기 catch에서 그걸 잡아 (예외가 발생했을 때 그걸 캐치한 것을 가지고 있는게 ae)
			System.out.println("예외발생 : " + ae.getMessage()); //01에서는 그냥 예외 발생하면 아래것들 실행 안되고 팍 꺼지는데 여기는 안그런거
			//get메시지 : 어떤 예외가 발생한건지를 알려주는 메소드
			ae.printStackTrace(); //printStackTrace() : 예외가 발생한 곳을 찍어주세요~! (예외가 발생한 줄을 알려줌)
			
		}
		System.out.println("main end..."); //예외가 발생하면 그것만 빼고 '나머지 일들을 다 수행하고' 끝남
		
		

	}

}
