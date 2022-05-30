package Quest0310;
import java.util.Scanner;
/*
 * 7. 화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램을
작성하시오
입력(알파벳) : a
변경된 값 : A
참고> 화면에서 받은 문자열에서 한 문자 가져오기
String inputStr = sc.nextLine( );
char c = inputStr.charAt(0);
 */

public class QuestNum07 {
	
	public static void main(String[] args) {
		
		int upperCnt = 'Z' - 'A' +1; //문자끼리의 계산은 자동적으로 아스키코드를 통해 정수형으로 계산됨
	    int lowerCnt = 'z' - 'a' +1; //알파벳은 아스키코드가 이어져있어서 가능한 코드
		
/*	    char ch= 'B'; //대문자를 소문자로 바꿔주고 싶을 때
	 // if (ch>65 && ch<=91); //아스키코드 사용 
	    if (ch>'A' && ch<='Z'); {
	     ch = (char)(ch+ ('a' - 'A'));
	    	
	    else if (ch>='a' && ch <='z') {
	     ch = (char)(ch - ('a'-'A'));
	    	
	    }
	    }
*/
	}

	
	

}
