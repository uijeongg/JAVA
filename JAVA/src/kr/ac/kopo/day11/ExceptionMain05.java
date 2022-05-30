package kr.ac.kopo.day11;
import java.util.Random;

//multi catch도 안쓰고 catch(Exception e)를 통해 묵시적 형변환해서 한번에 다 받아버리기
public class ExceptionMain05 {

public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
			Random r = new Random();
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num);
			
			String str = "hello";
			System.out.println("str : " + str);
			System.out.println(str.charAt(10));
			
		} catch(Exception e) {
			//위에서 넘어오는 애들( 저 둘 중에 뭐가 넘어오든)은 자식클래스라서 저 둘을 한번에 받아주기 위해 Exception e 부모클래스로 받아줌
			//둘중에 뭐가 넘어와도 더 큰 부모로 받았으니까 묵시적형변환
			
			System.out.println("예외처리 : " + e.getMessage());
//			e.printStackTrace();
		} 
		System.out.println("main end...");
	}

}


//어떤 예외가 발생하던간에 묵시적 형변환의 익셉션이 받아줄것
//그냥 하나하나 다 쓰지 말고 하나로 다 묶어버리면 됨