package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
			Random r = new Random();
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num); //여기서 예외가 발생해
			
			String str = "hello";
			System.out.println("str : " + str);
			System.out.println(str.charAt(10));
			
		} catch(ArithmeticException ae) {      
			System.out.println("예외발생 : " + ae.getMessage()); 
			ae.printStackTrace();
			
		} 	catch(StringIndexOutOfBoundsException se) { //hello 저기에 대한 예외 잡는 catch
				System.out.println("StringIndexOutOfBoundsException : " + se.getMessage());
		}
		System.out.println("main end..."); //14줄에서 예외 발생하면 catch를 수행하고, 그럼 그 밑의 str hello 이건 수행하지 않고 일로 오는거지
		//14줄에서 예외바랫ㅇ 안하면 19줄에서 에러가 나겟지. 우리느ㄴ 아리스매틱 저거에 관한것만 예외처리했으니까
		//이 예외처리느 ㄴ제이브이엠이 잡아서 알아서 처리해줘. 그건 강제종료가 되는거지
		//그럼 그 캐치까지 잡고싶으면 multi catch 를 만들어 주면 돼 (이 위의 se)
		
		//"예외가 여러개 있으면 멀티 캐치를 통해 제어할 수 있다는게 결론"
		
	}

}
