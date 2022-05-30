package kr.ac.kopo.day10.inter;
//kr.ac.kopo.day10.inter.TV 를 상속받고 싶으면 클래스 만들 때 인터페이스 add !!
//그럼 자동으로 오버라이드 되어서 뜸


public class SamsungTV implements TV { //엘지티비랑 똑같이 삼성티비도 만들어줌
	
//생성자만들어줌-------------------------------------------------------
	public SamsungTV() {
		System.out.println("삼성티비를 구매했습니다");
	}
//-----------------------------------------------------------------
	

	@Override
	public void powerOn() {
		System.out.println("전원을 켰습니다");

	}

	@Override
	public void powerOff() {
		System.out.println("전원을 껐습니다");

	}

	@Override
	public void channelUp() {
		System.out.println("채널을 높였습니다");

	}

	@Override
	public void channelDown() {
		System.out.println("채널을 낮췄습니다");

	}

	@Override
	public void volumeUp() {
		System.out.println("볼륨을 높였습니다");

	}

	@Override
	public void volumeDown() {
		System.out.println("볼륨을 낮췄습니다");


	}

	@Override
	public void mute() {
		System.out.println("음소거중입니다");

	}

}
