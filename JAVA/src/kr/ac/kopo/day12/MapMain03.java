package kr.ac.kopo.day12;
//Member class랑 연결


public class MapMain03 {

	public static void main(String[] args) {

		/*
		 * String s01 = new String("hello"); String s02 = new String("hello");
		 * 
		 * if(s01 == s02) { System.out.println("s01 == s02"); } else {
		 * System.out.println("s01 != s02"); }
		 * 
		 * 그냥 == 이거는 주소비교여서 다르다고 나옴 객체와 객체 비교는 이퀄스
		 * 
		 */

		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");

		if (m.equals(m2)) {
			System.out.println("m == m2");
		} else {
			System.out.println("m != m2");       // 근데도 같지 않다고 나옴..
			//이퀄은 오브젝트에 있는 이퀄스 메소드를 실행하고 있는 것임. 
			//원래 오브젝트 배열이 갖고 있는 애는 주소를 비교하고 있음
			//그냥 니가 뭔 값 가진지 모르니까 난 그냥 주소비교할게. 값 비교하고 싶으면 니가 이퀄스 메소드를 오버라이딩 하세요
		    
		}

	}

}

//그냥 == 이거는 주소비교여서 다르다고 나옴
//객체와 객체 비교는 ★ 이퀄스 ★