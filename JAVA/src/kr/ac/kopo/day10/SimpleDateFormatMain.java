package kr.ac.kopo.day10;
import java.text.SimpleDateFormat;
import java.util.Date;
//<날짜관련 API>
//3. SimpleDateFormat 클래스

public class SimpleDateFormatMain {

	public static void main(String[] args) {


	//	String pattern = "yyyy-mm-dd hh:mm:ss(E)";
		String pattern = "yyyy년도 mm월 dd일 hh시 mm분 ss초 (E요일)"; //hh이런거 하나 쓰면 3시 두개쓰면 03 HH면 13시 yy면 22년도
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); //앞줄에서 만든 저 패턴을 넣어줌
		System.out.println(sdf.format(new Date())); //지금 시간을 집어넣어서 "yyyy-mm-dd hh:mm:ss(E)" 이 정보를 알려달라는 뜻
		//그럼 굳이 get() 매번 쓸 필요 없이 한번에 가능
		
	}

}
