package kr.ac.kopo.day06;

class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을 잡니다");
	}
	
	void 냐옹거린다() {
		System.out.println("고양이가 야옹거린다");
	}
}
public class MethodMain02 {

	public static void main(String[] args) {
		
		고양이 나비 = new 고양이(); 
		//눈에 보이는 고양이를 만들어야지 근데이제 고양이 타입의 '나비'
		//위에선 눈에보이는 고양이를 만든건 아님. 여기서 만들어줘야지. 
		
		나비.냐옹거린다();
		//고양이 한마리를 인스턴스객체로 만들어주고 걔의 행동을 만들어줘야지. 그래서 나비 + 냐옹거린다를 호출할 수 있게 된 것

	}

}