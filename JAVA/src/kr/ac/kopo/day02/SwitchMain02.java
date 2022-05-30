package kr.ac.kopo.day02;

public class SwitchMain02 {

	public static void main(String[] args) {
		
		String a = new String("Hello");
				
	    System.out.println(a == "Hello");
	  //System.out.println(a.equals("Hello")); //문자 문자열은 동등비교 사용 불가. == 이걸 쓸 수 없다고. a가 가진 문자열이 hello와 같니? 로 물어야한다고

	    
	    
	    
	 // 문자는 동등비교가 안먹힌다! 
	 // 스위치는 문자열비교가 이프문보다 쉽다 -> 이 아래 코드처럼    
	    String str = new String("Hello");
	    
	    switch(str) {
	    case "Hello" :
	    	System.out.println("True");
	    	break;
	    default :
	    	System.out.println("False");
	    }
	}

}
