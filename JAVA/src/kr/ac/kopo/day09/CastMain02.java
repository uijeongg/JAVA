package kr.ac.kopo.day09;

public class CastMain02 {

	public static void main(String[] args) {
		
		//Child01 c = new Parent(); //컴파일시 오류 -> 자식의 공간이 더 크게 느껴짐 이걸 해결하기 위해 명시적 형변환 해줘야함
		//Child01 c = (Child01) new Parent(); -> 명시적 형변환 -> 근데 오류남
		//실제로 잡혀있는 메모리가 parent공간밖에 안만들어진 것
		//우리는 parent와 child01 둘 다 접근해야 하니까
		//그래서 우리는 
		//new parent 공간을 가리키는게 아니라 부모의 참조변수 값이 들어가야 함
		
		Parent p = new Child01();
		Child01 c2 = (Child01)p; //이때 p가 가리키는 영역은 child01이라 이거지ㅣ
		//묵시적 형변환을 통해서 -> 묵시적형변환이 된 변수만 명시적이 가능함
		//p의 타입이 child01인 것(참조변수)
		
		c2.sleep();
		c2.study();

	}

}
