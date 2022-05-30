package kr.ac.kopo.day08.extend2;

public class Manager extends Employee {
	
	Employee[] empList; //배열만들었고

	public Manager() { //또 빈 생성자 만들어야하니까 소스-제너레이트
		super();
		// TODO Auto-generated constructor stub
	}



	public Manager(String name, int salary, String grade, Employee[] empList) {
		super(name, salary, grade);
		this.empList = empList;
	}

	
	

}
