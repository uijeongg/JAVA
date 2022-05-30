package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = "Hello";
				//String str = new String("Hello"); 같은 방법
				
				char[] chars = {'h', 'e', 'l', 'l', 'o'};
				String str2 = new String(chars);
				byte[] bytes = {65,67,98,120};
				String str3 = new String(bytes);
				
				System.out.println("str : " + str);
				System.out.println("str2 : " + str2);
				System.out.println("str3 : " + str3);
				
				str= new String("Hello World");
				System.out.println("str : " + str + ", 길이 : " + str.length()); // 문자열.length()메소드를 통해 문자열 길이 확인 가능
				
				//hello world에서 world라는 문자열만 추출
				int loc=0;
				char[] words = new char[5]; //words라는 배열 생성
				
				
				//=>6 ~10번지의 문자를 words에 저장하기
				
			    //  str.getChars(6, 10, words, 0); //6번지부터 10번지 전!까지 words라는 배열의 0번지부터 채워넣는다
			    str.getChars(6, 11, words, 0); //이게 6~10번지
			    str.getChars(0,str.length(),words,0); //맨 끝번지는 그냥 포함 안 되는거라고 이해 말고 암기
				
				
				System.out.println("------------------------------");
				
				
				//for문으로 6 ~10번지의 문자를 words에 저장하기
				for(int i = 6; i<=10; i++) {
					System.out.println(str.charAt(i)); //charAt()메소드 사용
					words[loc++] = str.charAt(i); 
				}
				//System.out.println("words : " + words); words는 주소값이기 때문에 x
				System.out.println("words : " + Arrays.toString(words));  //Arrays.toString(words) 사용

	}

}
