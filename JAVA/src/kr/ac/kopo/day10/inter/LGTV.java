package kr.ac.kopo.day10.inter;
//TV라는 인터페이스를 상속받아서 여러 기능들을 사용할 목적의 클래스 생성

public class LGTV implements TV { // 추상메소드를 상속받았기 때문에 추상메소드를 가진 클래스는 무조건 추상클래스잖아 그래서 원랜 abstract를 붙여줘야함
	// 근데 abstract해주면 변수선언이 안되니까 오버라이드 해줘야함. (TV 클래스에서 했던 그 추상메소드 정의 다 해줘야 한단 말)
	// 소스 - 오버라이드 어쩌고 누르면 오버라이드 할 메소드 다 뜸 -> 그거 눌렁~

	
	
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private static final int MAX_CHANNEL_SIZE = 100; //채널이 100개있다는건 0~99채널이 있다는 것이지
	// (채널업다운 메소드 설명 ㄱㄱ)
	 
	/* protected: 다른 패키지거 못보는데 상속일때만 접근 가능한 접근제한자
	 protected private static final int MAX_CHANNEL_SIZE = 100; 로 해주면
	 lgtv를 상속받은 모든 클래스들은 저 값을 다 받을 수 있다는 의미
	 그럼 외부에선 못보고 오직 lgtv 산하의 시리즈들만 이 값을 볼 수 있다는거지 (물론 상속관계에서만)
    */
	
	
	
//-------------생성자----------------------------------------------

	/* 오버라이드해준 후 생성자 하나 만들어줌
	 * 이 위에서 power / volumeSize / channelNo / MAX_CHANNEL_SIZE 변수를 선언만 해준 상태니까
	 * 그 변수의 값을 초기화(할당)해주려는 목적으로 생성자 생성
	 */
	
	public LGTV() {
		super();
		System.out.println("티비를 구매했습니다");
		power = true;
		volumeSize = 10;
		channelNo = 3;

	}

//----------------------------------------------------------------	

	
	
	
	@Override
	public void powerOn() { // 문서주석 남겨줘서 그 내용도 확인 가능
		power = true;
		System.out.println("전원을 켭니다");

	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원을 끕니다");

	}

	@Override
	public void channelUp() { // 채널번호가 0~99라는 전제하에 그 사이에서 채널 움직이게 만들게
		//channelNo = ++channelNo % 100; 
		// 채널 번호를 증가시키고 싶은데 100이 되면 0으로 가게 해줘야해 ->그럼 먼저 증가시켜주고 100으로 나눠줘야함

		
		 //위에서 private static final int MAX_CHANNEL_SIZE = 100; 이 변수를 설정해줬으면 
		  channelNo = ++channelNo % LGTV.MAX_CHANNEL_SIZE; //이렇게도 가능
		 
		System.out.println("채널을 올립니다");
		
		info(); //아래서 만들어준 info()메소드
	}

	@Override
	public void channelDown() {
		if(channelNo==0) 
			channelNo=LGTV.MAX_CHANNEL_SIZE; //그럼 0번일때만 99로 갈거지
			channelNo--;
		System.out.println("채널을 내립니다");

	}

	@Override
	public void volumeUp() {
		if (volumeSize < TV.MAX_VOLUME_SIZE) // 볼륨은 최대볼륨이 있기 때문에 최대볼륨 전까지만 ++ 해야하지. 
		 	                                 //최대볼륨값은 tv인터페이스가 알고 있지?
											 // TV.MAX_VOLUME_SIZE
			volumeSize++;
		System.out.println("볼륨을 높입니다");
	}

	@Override
	public void volumeDown() {
		if (volumeSize > TV.MIN_VOLUME_SIZE) // 최저사이즈보다 낮아야만 --가능하지
			volumeSize--;
		System.out.println("볼륨을 낮춥니다");
	}

	@Override
	public void mute() {
		volumeSize = TV.MIN_VOLUME_SIZE;
		System.out.println("음소거중입니다");
		
		info();
	}


//---------------------------------------------------------------------------------------------------

	//따로 하나 만들어준 info() 메소드
    public void info() { 
	System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	//그리고 채널 올렸을 때 현재가 채널몇번인지 음소거일때 어떻게 되는지 알 수 있지. 각자의 메소드에 info();를 추가해주면! 가서 확인 ㄱㄱ
    }


//-----------------------------------------------------------------------------------------------

}

