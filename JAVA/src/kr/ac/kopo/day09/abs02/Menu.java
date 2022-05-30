package kr.ac.kopo.day09.abs02;
import java.util.Scanner;

public class Menu {

private Scanner sc = new Scanner(System.in);
	
	public String select() {
		System.out.print("프린터를 선택하세요(1.LG  2.SAMSUNG  3.HP) => ");
		String type = sc.nextLine();
		return type;
	}
	
	public void print(String type) {
		Printer p = null;          //상속일땐 부모클래스거 갖다쓸 수 있으므로 
		switch(type) {
		case "1" :
			p = new LGPrinter();
			break;
		case "2" : 
			p = new SamsungPrinter();
			break;
		case "3" : 
			p = new HPPrinter();
			break;
		}
		if(p != null) {
			p.print();
		}
	}
/*	
	public void print(String type) {
		switch(type) {
		case "1" :
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case "2" : 
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		case "3" : 
			HPPrinter hp = new HPPrinter();
			hp.print();
			break;
		}
	}
*/	
	public void process() {

		String type = select();
		print(type);
	}

	
}






//원래코드

/*
private Scanner sc = new Scanner(System.in);

public String select() {
	System.out.print("프린터를 선택하세요(1.LG  2.SAMSUNG 3.HP) => ");
	String type = sc.nextLine();
	return type;
}

public void print(String type) {
	switch(type) {
	case "1" : //1입력하면 엘지 출력
		LGPrinter lg = new LGPrinter(); //출력하려면 인객을 만들어줘야하니까 만들어줌
		lg.print();
		break;
	case "2" : 
		SamsungPrinter sam = new SamsungPrinter();
		sam.print(); //엘지도 삼성도 다 그냥 print()로 통합됨 (부모거를 오버라이딩해줘서)
		break;
	case "3" : 
		HPPrinter hp = new HPPrinter();
		//hp.print(); 얘는 print()로 출력을 안한대. 그럼 hp.print();가 아닌 것.
		//에러는 안뜨지만 출력은 안됨.
		hp.hpPrint(); //로 해줘야만 나온다. 하지만 이거 좋은 방법이 아니잖아. -> 그냥 print() 쓰라고 강제성 부여해줄거야!
		hp.print(); //강제성 부여해주고 난 후에 다시 print()해주면 다시 에러 안남
		break;
	}
}

public void process() {

	String type = select();
	print(type);
}

}
*/