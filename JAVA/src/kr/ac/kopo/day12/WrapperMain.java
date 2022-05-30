package kr.ac.kopo.day12;

/*
 * 기본자료형을 멤버변수로 가지는 클래스
 * 불린 캐릭터 플로트 .. 기본 자료형을 
 * 
 * 기본자료형			Wrapper Class
 	boolean			Boolean
 	char			Character
 	byte			Byte
 	short			Short
 	int 			Integer
 	long			Long
 	float			Float
 	double			Double
 	

	class Boolean {
		private boolean value;
 *  
 *  
 */

 
public class WrapperMain {

	public static void main(String[] args) {
	
		int i = 100;
		Integer i2 = new Integer(100); //원랜 이렇게 만들어야함 (레퍼런스형이니까 뉴에서 객체를 가리키는 것)
		
		Integer i5 = Integer.valueOf("123"+100); //아래 설명보고 이거 보면 굳이 i2에서 new 해주지 않고 인티저밸류오브 쓰면 되지
		//Integer는 그냥 참조자료형이 기본으로 바뀐다 생각하면 됨
		
		
		
		Integer i3 = 100; //오토박싱
		//1.5버전부터 레퍼런스타입=기본자료형 인걸
		//기본자룧ㅇ인데 참조자료향을 만들어서 요 객체에 넣어줌
		//개를 오토박스라고 함. 레퍼런스 객체형의 상자를 만들어줌
		
		int i4 = new Integer(100); //기본값에 어케 저걸 넣어? 근데 래퍼를래스에선 자동으로 대입해줌
		//이건 오토언박싱

		
		
		
	   System.out.println(Integer.parseInt("123")+100); //하면 223 뜸 -> 얘는 기본자료형의 인티저
	   System.out.println(Integer.valueOf("123")+100); //인티저밸류오브는 래퍼클래스의 인티저
}
}


//오토박싱
//기본자료형을 래퍼의 참조자료형이 갖고싶었어. 근데 기본을 어케 참조에 넣어 ㄱ래서 쓰면 안되는데
//래퍼런스 클래스인 경우에는 내부적으로 저 100을 래퍼런스 인티저 100 공간을 만들어서 그 상자를 넣어줌

//오토언박싱
//인티저객체야 받고싶은애가 인티져지. 여깃는 멤버변수값 가질라면 겟터메소드 어저고 해서 써야하는데 그런데 그런거 안써도
//래퍼에서는 알아서 개체에 들어있는 것중에 개체 중 상수값만 뽑아서 알아서 넣어줌