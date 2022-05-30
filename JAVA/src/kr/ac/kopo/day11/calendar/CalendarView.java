package kr.ac.kopo.day11.calendar;
import java.util.Scanner;

public class CalendarView {
	
	private Scanner sc = new Scanner(System.in);//근데 왜 private이징?
	
	private int getInt(String msg) {
		System.out.println(msg);
		return Integer.parseInt(sc.nextLine());          //문자열을 아예 정수로 바꿔주는 메소드
	}
	
	public void process() {
	
		CalendarUtil util = new CalendarUtil();
		/*loop:*/ while(true) {
		
		int type = getInt("항목을 선택하세요 (1.년도 2.월 3.종료) : ");
		
		//선택한 애가 3일때까지 반복하는 것, dowhile도 가능, while을 이용한 무한루프도 가능
		switch(type) {
		case 1:
//			System.out.println("특정년도 선택");
			int year = getInt("년도를 입력하세요 : ");
			util.showByYear(year);
			break;
		case 2:
			//System.out.println("특정월 선택");
			year = getInt("년도를 입력하세요 : ");
			int month = getInt("월을 입력하세요 : ");
			util.showByMonth(year, month);
			break;
		case 3:
			//System.out.println("종료 선택");
			System.out.println("프로그램을 종료합니다");
			System.exit(0); //~~이유때문에 종료한다 -> exit메소드의 public 활용제한자는 static 매개변수는 한개 int
			//이걸보고 메소드를 선언해보라고 하면 할 줄 알아야 함!!
			//얘랑 사용 중인 패키지가 다르고 상속이 아니니까 public
			//클래스명으로 접근하고 있으니까 (static 인객에 만들어지냐 클래스에 만들어지냐에 따라 접근제한자가 달라지는 것이잖아)
			break ;/*loop; //loop로 선언해주고 3일 때 빠져나온다는 의미 */
		
		}
	}
		
	}
}
