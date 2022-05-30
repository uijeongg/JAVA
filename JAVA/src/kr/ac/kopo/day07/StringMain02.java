package kr.ac.kopo.day07;

public class StringMain02 {

	public static void main(String[] args) {

 
	//	String str = "Hello"; ""안에 들은 문자를 원래는 상수문자열 이라고 한다
	//	String str2 = "Hello";
		//이 둘의 문자열이 같은지 아닌지를 확인하고 싶다
		
		String str = new String("Hello");
		String str2 = new String("Hello"); //얘가 HELLO라면 주소가 "다르다"로 나옴. 유니코드 비교니까!
     	//위처럼 안쓰고 이렇게 new String()으로 만들어주면 둘은 다르게 나온다. 그 차이의 이유는?
		
		
		if( str == str2) {
			System.out.println("주소비교 : 같다");
		} else {
			System.out.println("주소비교 : 다르다"); //이건 사실 주소비교 였던 것. 주소가 아니라 str이 가진 문자열과 str2가 가진 문자열을 비교하고 싶을땐 equal메소드
		}

		
		if(str.equals(str2)==true) { //equal사용 -> 앞 - 뒤 (앞에서 뒤에거 빼면서 비교)
			System.out.println("문자열비교 : 같다"); 
		} else {
			System.out.println("문자열비교 : 다르다");
		}
		
		
		System.out.println("대소문자 관계 없이 문자열 비교 : " + str.equalsIgnoreCase(str2)); //Hello랑 HELLO랑 같게 나오겠지
		
		
		String[] names = {"홍길동", "홍길순", "홍길동", "박길동", "홍가네"};
		
		System.out.println("<이름이 홍길동인 사람>");
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("<성이 홍씨인 사람>"); //성이 독고 이면 0번지로 못물어보지 그럴 땐 startsWith()
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("<이름이 길동이인 사람>");
			for(String name : names) {
				if(name.endsWith("길동")) {
					System.out.println(name);
				}
			}
			
			//이름에 어디에 있던 홍이 들어간 사람 앞인지 뒤인지 모르는 상태
			System.out.println("<이름에 홍이 포한된 사람>"); //홍이 어디에라도 있으면 출력
			for(String name : names) {
				if(name.contains("홍")) {
					System.out.println(name);
				}
		}
			
			
			
			//length 랑 equals 메소드는 알아야하는데 나머지는 찾아보면 됨
			
			//문자열의 크기비교
			//두개의문자열 중에 뭐가 더 큰지 알고 싶다
			str="apple";
			str2="banana";
			int compare = str.compareTo(str2);
			if(compare==0) {
				System.out.println(str + "==" + str2);
				
			} else if (compare>0) {
				System.out.println(str + ">" + str);
			} else if(compare<0) {
				System.out.println(str +"<" + str);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
