package kr.ac.kopo.day11.generic;
import java.util.Random;

class A {
	private Object data; 
	
	A(Object data) {
		this.data = data;
	}
	
	Object getData() {
		return data;
	}
	
	void setData(Object data) {
		this.data = data;
	}
} 



public class GenericMain {

	public static void main(String[] args) {


		A a = new A(new String("Hello"));
        String data = (String)a.getData();		//실제 가지고 있는게 스트링이니까 날라오는 애를 스트링으로 형변환해줘야함
        System.out.println("길이 : " + data.length());

        
        A a2 = new A(new Random()); //a2에 랜덤객체 저장 (저 데이터를 통해 1-10의 랜덤 숫자를 뽑고싶엉)
        int random = ((Random)a2.getData()).nextInt(10) + 1; 
		System.out.println("추출된 정수 : " +  random); //추출하면 타입이 안맞아서 예외발생
	}

}


//T가 타입을 의미
//private T형의 데이터를 만들어주고 싶다

//생성자 만들어줌
//
//리턴값은 T형의 getData() 
//return data;
//
//맨위가 T니까 밑에도 다 티
//
//

//main에 가서 매개변수가 string타입의 B를 만들어주고 싶다
//길이 알고 싶은거지 똑같지? -> getdata불러와야지? -> b.getData() 해줘도 형벼환피요없음 

//b3이 왜 컴파일시 에러야?
//<스트링> 제네릭이 스트링이라서 ( 여기에 ) 스트링이 아니면 컴파일시 에러 발생! 왜 스트링이라면서 스트링이 아니야 이거
//마름모에 어떤 자료형을 쓰냐에따라서 내가 가진 데이터의 타입을 맞춰서 저장해준다
//묵시 명시적 변환이 아니라 그냥 타입 대 타입으로 보는것