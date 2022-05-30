package kr.ac.kopo.day06;

public class MethodMain0102 {

	static int printStar(char ch, int cnt) { // 메소드 선언부 정의부
		
		
		System.out.println("**********");

		
		
		//return; 
		//나를 호출했던 호출자/피호출자?메소드로 돌아가자! -> 뒤에 아무것도 안 붙는건 넘길 값이 없는 것
		//그럼 return 기준으로 밑에 있는 코드들은 실행되지 x
		/*
		   sysout("A")
		   return;
		   sysout("B")
		   그럼 A만 출력
		 */
		
		//return 전달값; //피호출자가 호출자에게 전달하려는 값을 가지고 돌아가는 것
		//'A', 10 이걸 전달하고 싶은거니까
       return ch + cnt; //변수가 아니라 값의 자료형(타입)으로 넘김. 그래서 리턴타입임.
		//문자 + 인트라서 처음에 static int printStar
        //=프린트스타는 메인메소드에서 문자하나 인트 하나 받아온다
       
       
       
       //리턴으로 전달할 수 있는 값은 오직 하나. return ch+cnt, 10, 20 이런게 안된다고
       //밑에서 기억값은 int code = 형식으로 가기 때문에, 대입연산자 = 는 1대1 대입이라서 그런 것.
       
       
       
       
       //******정리*******
       //파라미터(매개변수): 호출-> 피호출자에게 값을 전달하는 것, 전달값은 무한대 개까지 가능
       //리턴타입: 피호->호출자에게 값을 전달하는것       , 이 때 전달할 수 있는 값은 최소 0개에서 1개까지
       //-> 리턴타입에서 여러개를 전달하고 싶다면, 여러개의 값을 집합으로 가진 것을 전달하는 방법을 사용해야함. 이를테면 배열
       //근데 배열은 같은 타입의 애들만 갖고있음
       //다른 타입일 땐 콜렉션 사용
       //리턴타입은 늘 묵시적형변환을 지원함 -> 리턴형이 더블이라면 꼭 리턴뒤에 실수만 들어가지 않아도 더블이 감쌀 수 있는 범위의 값들이 들어갈 수 있다
	}


	
	
	
	public static void main(String[] args) {
		
		int code = printStar('A', 10);  //날라갔다 돌아온 값은 프린트스타에서 만들어진거라서 메인은 모르지? 
		//그걸(프린트스타가 메인에게 준 값을) 기억하기 위한 변수 code 선언. 안해주면 기억 안하겠단 뜻 
		System.out.println("Hello");
		printStar('B', 20); 
		System.out.println("Hi");
		printStar('C', 20);
		System.out.println("Bye");
		printStar('D', 10); 

	}

}
