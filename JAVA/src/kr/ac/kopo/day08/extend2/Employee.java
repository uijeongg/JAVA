package kr.ac.kopo.day08.extend2;

public class Employee {

	String name;
	int salary;
	String grade;
	
	public Employee() { //소스 - 제너레이트 슈퍼클래스 누르면 자동으로 기본생성자 만들어짐
		
	}

	public Employee(String name, int salary, String grade) { //소스-제너레이트 유징필드 누르면 자동으로 만들어짐
		super();
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
}
