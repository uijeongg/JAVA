package kr.ac.kopo.day055;

//메인클래스 위에 내가 핸드폰 클래스를 직접 정의해줄수도 있음
class Handphone { //앞에 public 생략한 형태. 근데 내가 선정해준건 public을 붙여주면 에러남 
	
	String phoneNumber; //핸드폰이라는 클래스는 핸드폰번호가 있을 수 있지
	String name; //실사용자명
	String company; //핸드폰회사

}




public class HandphoneMain {

	public static void main(String[] args) {
		
		//핸드폰이라는 인스턴스객체들을 만드는게 지금 내 목적
		//"추상화시켜서 클래스로 설계시킨다"
		Handphone hp = new Handphone();
		hp.name="홍길동";
		hp.phoneNumber ="010-1111-2222";
		hp.company="삼성";
		
		Handphone hp2 = new Handphone();
		hp2.name="강길동";
		hp2.phoneNumber ="010-2111-2222";
		hp2.company="애플";
		
		Handphone hp3 = new Handphone();
		hp3.name="김길동";
		hp3.phoneNumber ="010-3111-2222";
		hp3.company="엘지";
		//각 변수에 접근
		//hp1~3은 모두다 핸드폰 인스턴스객체를 가리키고 있는 것
		//그러니까
		
		Handphone[] hpArr = {hp, hp2, hp3};  //핸드폰배열 hpArr를 만들 수있겠지
		
		
		//이 그림 노트에 정리된거 보고 공부                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		for(Handphone phone: hpArr)   { //어레이가 갖고 있는 변수를 찍고 싶은 것. 저 어레이가 가진건 핸드폰형의 자료
			System.out.println("사용자 : " + phone.name + ", 전화번호 : " + phone.phoneNumber + ", 제조사 : " + phone.company);
		}

	}

}
