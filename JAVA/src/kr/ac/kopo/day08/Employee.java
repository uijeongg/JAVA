package kr.ac.kopo.day08;

public class Employee {

	String name;
	int salary;
	String grade; //클래스에 변수 할당
	
	//int employeeCnt; //1. 총 사원수를 세고싶으면 저쪽보다 여기 클래스에서 만들어주는게 좋음
	static int employeeCnt; //총 사원수 한명만 나오는거에 대한 해결책
	
	
	Employee() {  //이 밑에 매개변수가 많은 생성자를 만들어줄 땐, 매개변수가 아예없는 기본 생성자를 만들어주는게 좋다(에러 방지)
		//메소드는 타입(반환형)이 있고 생성자는 타입이 x
		//생성자는 클래스명과 이름이 동일
		
		employeeCnt++; //2. ++ 시켜주고
	}
	
	Employee(String name, int salary, String grade) {
		this.name =name;
		this.salary = salary;
		this.grade = grade;
		
		employeeCnt++; //2. ++시켜주고
		
	}
	
	void info() { //info메소드 선언. 직원에 대한 정보를 알아보기 위한
		System.out.println("사원명 : " + name + "연봉 : " + salary + "직급 : " + grade);
	}
	
	
	static void employeeCntInfo() { //3. 총사원수를 알기위한 메소드 선언
		System.out.println("총 사원 수 : " + Employee.employeeCnt + "명"); //앵간하면 클래스변수는 employeeCnt말고 
		//Employee.employeeCnt로 접근하는거 버릇들이기. 나중에 헷갈리지 않게! 가독성 높이게!
		
		//static붙여주기 - 그래야지만 메인에서 Employee.employeeCntInfo();로 호출가능
	}
}

//가만보면 스태틱 붙은 애들은 다 변수,메소드명이 약간 기울어져있음
