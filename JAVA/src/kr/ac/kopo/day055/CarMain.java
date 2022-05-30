package kr.ac.kopo.day055;

//여기는 메인메소드를 만들어줬지. 여기서 실행하니까 여기는 '실행클래스'
//하나의 프로그램을 만들기 위해서 하나의 실행클래스 여러개의 참조클래스가 필요한 것

public class CarMain {
	
	public static void main(String[] args) {
	
	new Car();
	//new를 통해서 새로운 인스턴스객체를 만들어줌 (클래스명은 대문자)
	//힙 영역에 자동차 한대가 만들어짐
	//근데 그 자동차는 이름이 존재하지 않아.
	//그럼 그 이름을 기억하는 참조변수가 필요해
	
	Car c = new Car(); //그 참조변수의 이름을 c로 저장! (기억하게 만들어줌) -> 힙에 만들어진 이름 없는 공간의 위치를 기억해주기 위해 이름을 c로 해서 stack에 만들어준것
	Car c2 = new Car(); 
	
	// c가 가르키는 자동차의 name을 알고싶다면 (=name이라는 멤버변수를 알고싶다면)
	//c.name    //c의 이름에 접근
	//c2.name
	//c,c2는 같은 car라는 같은 클래스를 가지고 인스턴스객체를 만들어줬으니까, 그 둘은 동일한 멤버변수와 메소드를 가지고 있음.
	//둘이 같이 메인을 가지고 있고
	//어
	
	
	//둘 다  name을 가지고 있는건 동일해. 그런데 그게 뭘 가르키는건지가 중요
	c.name = "소나타"; //c가 가진 name은 소나타를 가르키고 있는애야.
	c2.name = "k9";//c1의 name이 가르키는건 k9이야
			
	c.company = "현대";
	c2.company = "기아";
	
			System.out.println("첫번째 자동차명 : " + c.name); //c가 가리키는 name을 출력해서 확인!
			System.out.println("두번째 자동차명 : " + c2.name); 

			
			
		//저 위에들을 다 하나로 만들면
//			String[] names = new String[2];
	//		String[] company = new String[2];
			
			
}
}
