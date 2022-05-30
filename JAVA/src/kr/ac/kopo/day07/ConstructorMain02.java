package kr.ac.kopo.day07;
// member class 생성해주고 여기로 옴

public class ConstructorMain02 {

	public static void main(String[] args) {

		Member m = new Member(); // Member클래스에서 멤버변수 3개를 갖고 있는 인스턴스 객체를 만들어준것
		// m.name="홍길동" 이런식으로 값을 부여하는건 은닉성에 의해서 좋은 방법이 아님
		// 생성자를 통해서 값을 업데이트하라고 해주는게 더 올바른 방식

		Member m2 = new Member("홍길동");
		// 이름이 홍길동인 인스턴스 객체를 만들거야 -> 그럼 매개변수 한개가 날라갔으니 다시 member로 가서 만들어주기

		Member m3 = new Member("윤길동", 22); // 얘는 매개변수 두개가 날라갔으니 다시 동일

		Member m4 = new Member("한길동", 30, "0");
		
		//내가 어떤 형태의 값을 불러낼거냐에 따라서 생성자 호출 생긴게 다른거지

		m.info();
		m2.info();
		m3.info();
		m4.info(); 

	}

}
