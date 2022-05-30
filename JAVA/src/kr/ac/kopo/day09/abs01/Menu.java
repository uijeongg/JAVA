package kr.ac.kopo.day09.abs01;
import java.util.Scanner;

public class Menu {
	
private Scanner sc = new Scanner(System.in);
	
	public String select() {
		System.out.print("프린터를 선택하세요(1.LG  2.SAMSUNG) => ");
		String type = sc.nextLine();
		return type;
	}
	
	public void print(String type) {
		switch(type) {
		case "1" : //1입력하면 엘지 출력
			LGPrinter lg = new LGPrinter(); //출력하려면 인객을 만들어줘야하니까 만들어줌
			lg.lgPrinter();
			break;
		case "2" : 
			SamsungPrinter sam = new SamsungPrinter();
			sam.samsungPrinter();
			break;
		}
	}
	
	public void process() {

		String type = select();
		print(type);
	}

}
