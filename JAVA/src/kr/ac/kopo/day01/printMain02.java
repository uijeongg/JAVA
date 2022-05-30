package kr.ac.kopo.day01;

public class printMain02 {
	
	public static void main(String[] args) {
		
		System.out.println('A');
		System.out.println('A'+"BCD");
		System.out.println('A'+'B'); //왜 숫자나오지? -> 컴퓨터는 2진수니까 그 코드로 넘어감 (아스키코드)
		System.out.println('A'+10); //문자+정수 하면 문자가 아니라 정수값이 나옴 -> 컴퓨터는 2진수니까 그 코드로 넘어감 (아스키코드)
		
		System.out.println('A'+'B'); //65+66 = 131
		
		System.out.println(0x41 + 0x42);
		
		/*
		   ASCII CODE (0~256) : 1byte
		    : 대문자 소문자 숫자문자 특수문자 공백문자를 숫자로 일대일 매칭시킨 숫자표
		      아스키코드로 표현할 수 있는 최대 숫자값은 0~256까지임
		      
		   UNI CODE (0~65500) : 2byte
		    : 다국어 지원 숫자표 (ASCII 코드 + 한글 한자 등등등 다 쓸 수 있게 하는 코드) 
		      아시아권 단어들이 256개가 넘음. 그래서 거기에 + 해서 쓰는 것
		      더 큰 숫자표현을 하기 위해서 사용
		      자바의 문자 인식 -> 코드는 유니코드 방식을 사용함 (아스키x)
		      그래서 문자형 상수에 공백문자 말고 한글도 가능한 것 ex) 한글('가', '나')
		      
		      'A'대문자 A에 대한 숫자코드 : 65
		      'B' : 66 (A부터 차례로 커짐)
		      'a' 소문자 a : 97
		      소문자 b : 98
		      숫자문자0 '0' : 48
		      System.out.println('A'+'B'); 65+66
		      
		   cf) bit: 0,1
		       1 byte = 8 bit
		       
		   0x : 16진수
		   ex) 
		   'A' : 65 -> 0x41
		   'a' : 97 -> 0x61
		   '0' : 48 -> 0x30
		   
		   cf) 16진수는 15까지만 표현되고 그 이후부터는 알파벳으로 나옴???????????????? 확인
		   -> 계산기 앱 켜서 메뉴창에서 프로그래머 누르면 자동변환 되는거 확인가능
		 */
	}
	

}
