package kr.ac.kopo.day11;
import java.util.Random;

//multi catch 한번에 묶어주기 ( | 키워드 사용)
public class ExceptionMain04 {

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
			
		} catch(ArithmeticException | StringIndexOutOfBoundsException ae) {      
			System.out.println("예외발생 : " + ae.getMessage()); 
			ae.printStackTrace();
			
		} 	/*catch(StringIndexOutOfBoundsException se) {
				System.out.println("StringIndexOutOfBoundsException : " + se.getMessage());
		}*/
		System.out.println("main end..."); 
		
	}

}


//멀티캐치 다 써주기 귀찮으니까 한번에 다 써주ㄴ기 가능
//예외 두가지를 한번에 or 키워드를 통해서 묶어주고 걔 아니면 얘 발생할 때 둘 다를 ae에 저장한다
//그럼 밑의 se는 아예 필요가 없게 되는 것