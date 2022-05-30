package kr.ac.kopo.day10;
import java.util.Date;
//<날짜관련 API>
//1. Date 클래스

public class DateMain {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d); // 인객이니까 d는 주소가 찍혀야 하는데 주소가 아님
		System.out.println(d.toString()); // 이거랑 같음 (d를 찍으라고 했지만 사실은 toString을 찍은 것)
		// -> 모든 클래스는 오브젝트라는 메소드를 상속받았기 때문에 사용가능

		String a = "안녕";
		System.out.println(a.toString()); // 이거랑 같은 것

		// toString()을 상속받아와서 자기입맛에 맞추어서 오버라이딩(재정의)했기 때문에 가능

		// 오늘은 2022년 3월 23일(수)입니다

		// get() : 현재 날짜정보에서 연월일시분초를 뽑아내는 애

		int year = d.getYear() + 1900; // 올바르게 나오게 하려면 +1900
		int month = d.getMonth() + 1; // 올바르게 나오게 하려면 +1
		int date = d.getDate();
		int day = d.getDay(); // 그냥 이렇게만 찍으면 0부터 시작해서 수요일은 3이 뜸. 귀찮지?
		String[] week = { "일", "월", "화", "수", "목", "금", "토" }; // week라는 String 배열 하나를 만들어줘서 그 인덱스에 맞는 요일을 할당

		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일" + week[day] + "입니다");
	}

}

//갑자기 선 그어짐 -> deprecated되었단 의미
//새로운 버전이 나왔으니까 이 버전은 안 쓰는 것을 지향한다 => deprecated