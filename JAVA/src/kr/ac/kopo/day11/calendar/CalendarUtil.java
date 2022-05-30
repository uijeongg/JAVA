package kr.ac.kopo.day11.calendar;

import java.util.Calendar;


//만년달력만들기
public class CalendarUtil { 
	
	private Calendar c;
	
	public CalendarUtil() {
		c = Calendar.getInstance(); //getInstance를 통해서 객체를 받아옴
	}
	
	public void showByYear(int year) {
		for(int month=1; month<=12; month++) {
			showByMonth(year,month);
		}

	}

	
	//case문에서 2번 선택하면 이걸 받음 그래서 public
	public void showByMonth(int year, int month) {
		System.out.println("< " + year + "년 " + month + "월 >");

		//year와 month의 1일로 가야함. 그래야 그 달의 1일을 알 수 있으니까
		c.set(year, month-1, 1);
		
		//요일 알아내기
		int week = c.get(Calendar.DAY_OF_WEEK); //1(일)~7(토)
		
		//각 월의 마지막날이 몇일인지
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		//실제달력을뽑아내기
		showByDay(week, lastday);
	}
	
	private void showByDay(int week, int lastDay) {
		
		System.out.println("----------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("----------------------------------------");
		
		int cnt = 0; //7일 단위로 엔터 찍는 if문에 사용할 변수
		
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
			++cnt;
		}
		for(int date = 1; date <= lastDay; date++) {
			System.out.print(date + "\t");
			if(date == lastDay || ++cnt % 7 == 0) { //cnt가 7의 배수가 될때마다 엔터 (7일 단위로 줄바꿈 시켜야하니까)
				System.out.println();
			}
		}
		
		
		 
		for(int date = 1; date<=lastDay; date++) {
			System.out.println(date + "\t");
		}
		System.out.println("----------------------------------------");
	}
}
