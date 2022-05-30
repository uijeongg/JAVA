package kr.ac.kopo.day07;
//생성자의 기본 목적은 멤버변수 초기화

public class Member {

	String name;
	int age;
	String bloodType; 
	//멤버변수 정의시 자동초기화값 아니고 직접 원하는 값을 넣고 싶다면 그냥 이렇게 말고 int age = 5; 이렇게 바로 해줘도 됨
	//근데 이건 바뀌지 않는 값일 때만 가능하겠지
	
	
//-------------------------------------------------------------------------------------------------------
	
	
	Member() {
		/*this.*/name= "알 수 없음"; //이렇게 구분할게 필요 없을 때는 그냥 this가 생략된 형태라고 보면 됨
		age= -1;
		bloodType = "알 수 없음"; //멤버변수값 초기화
		
	}
	
	
//------------------------------------------------------------------------------------------------------
	
	
	Member(String n) {
		name=n;
		age = -1; //나이 모르니까
		bloodType = "알 수 없음";
		System.out.println(name+"?????");
		// Member(String name) { this.name = name;
		//      this(name, -1, "알 수 없음"); this()를 사용해서 오버로딩된 생성자를 또 호출하는 방법
	}
	
	
//--------------------------------------------------------------------------------------------------------
	
	
	
	/*Member(String n, int a) {
		name=n;
		age=-1;
		bloodType="알 수 없음";
	}
	*/
	
	
	
//--------------------------------------------------------------------------------------------------------	
	
	
	/* Member(String n, int a, String bt) {
	
		//name=n;
		//age=-1;
		//bloodType=bt;
		*/
	
		Member(String name, int age, String bloodType) { //위에거말고 이렇게도 가능
	    //그럼 name=name; age=age; bloodType=bloodType; 으로 써주면 되는데
		//Member라는 생성자 안에 name이라는 지역변수도 있고 class에 name이라는 멤버변수도 있음 -> 지역변수name에 멤버변수 name을 넣어줘라 라는 뜻이 되어버림
		//그럴 땐 지역변수(생명주기가 메소드나 생성자에 한정되어있는 애들. 블럭에 들어가있는 애들)의 우선순위가 높음
		//그럼 저 네임은 지역변수의 name이 됨
		//멤버변수는 파란색. 지역변수는 갈색 (확인 ㄱㄱ)
		//그걸 구분이 안되니까 그럴 때 this.name를 써주는 것
		
		this.name=name;  //this가 지가 알아서 m1 m2 m3 m4에 맞게 구분해 주는 애
		this.age=age;
		this.bloodType=bloodType;
		
		//클래스 메소드 생성자 순으로 생성하는게 올바른 설계도
		//메소드 내에서 지역변수와 메소드를 구분할 때 쓰는게 this.메소드	
		
		
	}
		
		
//------------------------------------------------------------------------------------------------------
		
		
		 Member(String name, int age) {
			 //Member(name, age, "알 수 없음"); //저 세개의 멤버변수를 가지고 있는 메소드를 호출하고 싶을 때 그냥 이렇게 호출해도 됨
			 //생성자가 아니라 일반 메소드 호출로 인식해서 에러뜸
			 //무조건 new를 써야만 생성자 호출 가능
			 this(name, age, "알 수 없음"); //this하고 생성자 호출
			 //이 안에서 오버로딩 된 다른 생성자를 호출해줘
			 //생성자를 통해 다 초기화 한 후에 사용해야하기 때문에
			 //맨 첫번째 줄에 써야 함!!
		 }

			 
		
//------------------------------------------------------------------------------------------------------
		 
		 
	
	void info() { //멤버라는 클래스를 만들면서 이 회원의 정보를 출력하는 클래스를 만들어준것
		System.out.println("이름 : " + name + "나이 : " + age + "bloodType : " + bloodType);
		
		//멤버 클래스의 인포메소드에서 만들어진 애는 자신에게 정해진 멤버변수를 그냥 쓸 수 있다
		//자신의 인스턴스객체가 힙에서 사라질때까지 사용 가능
		
		
	}

	}


// constructor02랑 연결