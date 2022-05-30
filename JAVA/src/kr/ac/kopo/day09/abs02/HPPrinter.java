package kr.ac.kopo.day09.abs02;

public class HPPrinter extends Printer {

	public void hpPrint() {
		System.out.println("HP프린터에서 출력중.."); //다 똑같은 print()로 출력이 아니라 hp는 난 싫어~ 한ㄱ
	}
	
	
	
	//너네 hpPrint 써. 근데 이것도 무조건 만들어 이게 표준이야 -> 강제성부여
	@Override
	public void print() {
		System.out.println("HP프린터에서 출력합니다...");
	
}
}
