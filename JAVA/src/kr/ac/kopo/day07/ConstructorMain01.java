package kr.ac.kopo.day07;

/*
 * 생성자 특징
 * 1. 클래스명과 동일
 * 2. 반환명이 없음
 * 그러니까 클래스명과 동일한 이름으로 만들어주면 되겠지
 * 3. 디폴트 생성자 지원 : 클래스 내에 생성자가 존재하지 않는 경우 jvm이 자동으로 만들어줌
 * 4. 생성자 오버로드 지원
 * 5. 멤버변수 초기화하기 위해 생성자 사용 -> 이제 어떻게 초기화하는지 알아보면 되겠지
 */
class Car {
	
	Car() { //클래스명과 동일하게 생성자 만들어줌. 다른 이름으로 만들면 메소드로 인식됨
		System.out.println("Car() 생성자 호출...");
		
	//void Car() { 앞에다가 void를 붙이면 생성자가 아니라 일반메소드로 인식
		
		
	}
	
	Car(int i) {
		System.out.println("Car(int) 생성자 호출");
	}
	
	Car(int i, String s) {
		System.out.println("Car(int, String) 생성자 호출");
	}
}




public class ConstructorMain01 {

	public static void main(String[] args) {
		
		Car c = new Car(); //인스턴스객체를 만드는 순간 알아서 생성자 만들어짐. jvm이 알아서 디폴트생성자 만들어줌
		//클래스 내에 생성자가 하나도 정의되어있지 않은 경우에 알아서 만들어주는 것. 위에서 하나라도 정의돼있으면 에러
		
		//Car c = new Car();
		Car c2 = new Car(10);
		Car c3 = new Car();
	}

}
