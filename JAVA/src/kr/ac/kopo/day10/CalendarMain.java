package kr.ac.kopo.day10;
import java.util.Calendar;
import java.util.Date;
//<날짜관련 API>
//2. Calendar 클래스

public class CalendarMain {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance(); // 캘린더가 추상클래스여서 getInstance()로 객체를 받아와서 써야함
		System.out.println(c);

		c.get(1);// 은 걍 year값이 뜸. 자바가 그렇게 만듦
		// int year = c.get(1); //얘랑
		int year = c.get(Calendar.YEAR); // 얘랑 같아. 근데 1로하면 외우지않은 이상 모르니까 이게 더 직관적이지
		// int month = c.get(2)+1; //month도 0~9가 나와서 +1해줘야함

		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK); // 걍 DAY_OF_WEEK 얘가 요일 값 알고 있는 애. 자바가 저장해둠
		// 얜 1(일) ~ 7(토)로 나옴.
		String[] week = { "", "일", "월", "화", "수", "목", "금", "토" }; // 그니까 week[day-1]로 출력하거나 0번지 비워두고 만듦

		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일" + week[day] + "입니다");

		// 2020년 5월 20일이 무슨요일? => set메소드 사용
		c.set(2020, 5 - 1, 20); // 2020년 5월 20일로 수정
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020/5/20" + week[day] + "요일"); // -> 토요일로 뜸. 근데 사실은 수요일임
		// 월을 기억하는 숫자는 0~10일-> 그래서 c.set(2020,5,20);가 아니라 c.set(2020,5-1,20);이어야함

		int lastday = c.getActualMaximum(Calendar.DATE); // getActualMaximum();자기가 가진 수중에 가장 큰 수 -> date니까 31일
		System.out.println(lastday);

		Date d = c.getTime();
		System.out.println(d);

	}

}

//프라이빗한 변수를 외부에다가 보여주거나 수정하는걸 도와주기 위한 메소드
//퍼블릭은 외부에서 내 값을 보고, 수정까지 가능한데 그걸 막기 위해 내 보안을 설정할 수 있다 getYear() setYear()
//get set 뒤에 붙은 저기에 멤버변수가 있다고 생각하면 됨


/*
 * get 뒤에다가 1234를 넣어야하는데 뭐가 오는지 모르잖아. 이게 년인지 월인지 뭔지 그래서 구분해줘야함
 * get(1); get(2); get(3);
 * 
 * get(Calendar,YEAR); 
 * abstract class Calendar { public static final int YEAR = 1; 
 * public static final int MONTH = 2; 
 * }
 */
