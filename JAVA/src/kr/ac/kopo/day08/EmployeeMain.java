package kr.ac.kopo.day08;

public class EmployeeMain {
	public static void main(String[] args) {
		
		
		System.out.println("총 사원 수 : " + Employee.employeeCnt + "명");
		//여기서 총 사원수를 알고싶다면, 아직 변수할당 안해줬지만 Employee 클래스의 employeeCnt는 이미 만들어짐.
		//그러니까 클래스명.~ 으로 접근 가능
		Employee.employeeCntInfo();
		
		
	//	int totalEmployee = 0 ; //우리회사에 입사한 사원수가 총 몇명인지 알고싶다 그 변수를 만들어줌
		Employee e = new Employee("홍길동", 3300, "사원");
	//	totalEmployee++; //입사때마다 증가시켜줌
		Employee e2 = new Employee("강길동", 3800, "대리"); //사원객체 두개만들고, 그 정보를 넣음
	//	totalEmployee++; 
		// e.name = "" 식의 호출은 좋지 않음. 에러는 아니지만 쓰지마~
		//자신의 멤버변수 호출은 자신의 클래스에서 만들어진 것만 호출하는게 가장 좋음
		
		e.info(); //한번 입사때마다
		//e.employeeCntInfo(); //불러주고
		e2.info(); 
		e.employeeCntInfo(); //논스태틱영역에서 스태틱변수 접근이 가능하니까 가능한 것
		Employee.employeeCntInfo(); // 앞에서 static void로 해줘서 여기서도 이렇게 가능한 것
		
		
		
		//System.out.println("입사한 총 사원 수 : " + totalEmployee + "명");
		
	}

}
