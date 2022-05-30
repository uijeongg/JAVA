package kr.ac.kopo.day07;

import java.util.Arrays;

public class SpringMain03 {

	public static void main(String[] args) {
		String str = "hello world!";
		//r이라는 문자가 몇번째에 위치했는지 알고싶다
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == 'r') 
				System.out.println("r 위치 : " + i); //이건 귀찮지
			}
			
		
		char search = 'r'; // 찾는게 r이라면
		String search2 = "llo";
		String search3 = "l";
		String search4 = "p";
		
		//str.indexOf(search); 인덱스오브로 물어봐~
		System.out.println(search + "위치 : " + str.indexOf(search));
		//인덱스오브는 인트 스트링 
		System.out.println(search2 + "위치 : " + str.indexOf(search2));
		System.out.println(search3+ "위치 : " + str.indexOf(search3)); //인덱스오브는 중복된걸 알려주지 않음. 0번지부터 돌면서 맨 처음 나오는 위치만 알려줌
		System.out.println(search3+ "위치 : " + str.indexOf(search3,5));		//5번지서부터 오른쪽으로 가면서 돌면서 l을 검색
		
		
		System.out.println("<" + search3 + "위치 index 출력>"); //search4
		int index = str.indexOf(search4);
		//만약 그 문자가 없으면 -1을 리턴한다
		
		
		//만약 인덱스가 -1이 아니면 찾았다는 뜻이겠지
		while(index !=-1) {
			System.out.println("시작인덱스 : " + index); //그럼 인덱스값을 찍어주면 되겠지
			str.indexOf(search3,index+1); //찾은거 이후로 또 찾고 싶으면 그 인덱스값 다음 번지수부터 다시 찾으면 되겠지
		//lastindexOf라면		9 3 으로 나올것 그땐 index-1이어야지
		}
		
		
		str = "Hello world";
		String subStr = str.substring(3,8); // [3]~[8-1] 문자열 추출
		System.out.println("substring(3,8) : " + subStr); //원본은 계속 헬로월드!!!! 원본은 안바뀐다!!!!!!
		
		System.out.println("substring(6) : " + str.substring(6));
		//6부터 맨 마지막까지 추출해라
		
	String 	str2	= "hello" + "!!!!";
		str2= "hello".concat("!!!!"); //위에랑 같은데 그냥 더하기 쓰셈
	    System.out.println("concat() : " + str2);
	    
	    
	    
	    String result = str.replace("l", "rr");
	    System.out.println("replace(\"l\", \"rr\") : " + result);
	    
	    str = "  hello ";
	    System.out.printf("[%s]길이 : %d\n", str, str.length());
	    result = str.trim();
	    
	    System.out.printf("[%s] 길이 : %d\n", result, result.length());
	    
	    
	    
	    str="Hello world!!";
	    System.out.println("str : " + str);
	    System.out.println("대문자 : " +str.toUpperCase());
	    System.out.println("소문자 : " +str.toLowerCase());
	    
	    		
	    
	    
	    String data = "홍길동전: 허균: 조선시대"; //콜론을 기준으로 문자열을 쪼개겟다
	    String[] bookInfo = data.split(":");
	    System.out.println("split() : " + Arrays.toString(bookInfo)); //그럼 세개로 쪼개지지
	    
	    
	    
	    int num = 123;
	//  String.valueOf(num); //num에 들은 정수를 문자열로 바꿔주기 num = "" 원래는 문자열로 바꿔줄때 이렇게 썼잖아
	    String strNum = String.valueOf(num);
	    System.out.println("strNum + 100");
	    
	    
	    		
	    		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

	}


