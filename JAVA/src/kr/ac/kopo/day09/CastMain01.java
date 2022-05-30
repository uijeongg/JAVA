package kr.ac.kopo.day09;
//묵시적형변환

public class CastMain01 {

	/*
	public static void print(Child01 c) {
		c.print();
	}
	
	public static void print(Child02 c) {
		c.print();
	}
*/	

	
	
	public static void print(Parent p) { //Parent c 이 자체가 묵시적 형변환 (파라미터를 통해)
		p.print();
		
		if(p instanceof Child01) {     //자식부터 물어봐야함. 너 child01형이니?
            //맞으면 명시적 형변환 -> 그제서야 sleep study 접근가능
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		} 
	
	//	System.out.println("child01 :  " + (p instanceof Child01)); //현재 p가 가르키느 ㄴ변수가 child01형이니?
	//	System.out.println("child01 :  " + (p instanceof Child02));
	//	System.out.println("child01 :  " + (p instanceof Parent));

		//true false로 나옴
	
	
	}
	
	
	//묵시적형변환일 때 어떤 타입을 넘기든간에 object로 넘기면 다 넘길 수 있음
	//public static void Object 어쩌고;
	//리턴타입이 object로 돼있으면 모든 변수형태를 다 받을 수 있구나~ 하면 됨
	
	public static void main(String[] args) {
		
		print(new Child01());
	//	print(new Parent());
	//	print(new Child02()); //fal t t?
		
		
		Child01 c01 = new Child01();
		print(c01); //c01변수를 받아야하니까 위에 메소드랑 c.print()만들어줌
		
//		Child01 c01 = new Child01();
//		c01.print();
		
		Child02 c02 = new Child02();
		print(c02); //c02변수를 받아야하니까 위에 메소드랑 c.print()만들어줌
//		c02.print();
		
		Parent p = new Parent();
		print(p); //parent변수를 받아야하니까 위에 메소드랑 c.print()만들어줌
		p.print();
		
		Parent p2 = new Child01();
		
		//근데 이 세개를 다 print하고 있음. 이거 다 오버라이딩아닝교
		
	}
}
