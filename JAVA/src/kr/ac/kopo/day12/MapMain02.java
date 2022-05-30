package kr.ac.kopo.day12;
import java.util.HashMap;
import java.util.Map;


/*
알트+시프트+에스 누른 후 c 선택 = 기본생성자 만들어짐
알트+시프트+에스 누른 후 o 선택 = 매개변수를 가진 생성자 
알트+시프트+에스 누른 후 r 선택 = getter/setter 메소드
알트+시프트+에스 누른 후 v 선택 = override / implement 메소드
알트+시프트+에스 누른 후 s 선택 = toString() 메소드
*/



/*
 
class Member {
	private String name;
	private String phone;

	public Member() {
	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}

}




class Car {
	private String name;
	private String carNumber;

	public Car(String name, String carNumber) {
		super();
		this.name = name;
		this.carNumber = carNumber;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", carNumber=" + carNumber + "]";
	}
}

*/


public class MapMain02 {

	public static void main(String[] args) {

		Map<Member, Car> map = new HashMap<>(); //<키에 Member, 밸류에 Car>
		
		map.put(new Member("홍길동", "010-1111-2222"),new Car("소나타","11가1111")); 

		map.put(new Member("윤길동", "010-5555-6666"),new Car("소나타","22가2222"));
		
		
		//홍길동 고객의 차량정보를 변경하고 싶다 -> 근데 맵은 키가 중복이면 사이즈가 3이 아니라 2여야지 -> 근데 3으로 나옴
		//이 설명 맵메인3
		map.put(new Member("홍길동", "010-1111-2222"), new Car("카니발","33가3333")); 
		System.out.println("총 개수 : " + map.size());
		
		System.out.println("총 개수 : " + map.size());
		System.out.println(new Member("홍길동", "010-1111-2222").hashCode());
		System.out.println(new Member("홍길동", "010-1111-2222").hashCode());
//		System.out.println("hello".hashCode());
//		System.out.println(new String("hello").hashCode());
//		System.out.println(new String("hello").hashCode());
		//맵에서 객체-객체 비교 : 이퀄스 메소드 반드시 만들어서 그걸로 비교!
		//객체들을 해쉬로 관리하는 해쉬맵은 이퀄스의 결과가 트루이면서 해시코드값이 같아야함. 그래야 같은 객체로 봄
		//이퀄스만 쓰는거 아니고 해쉬코드도 같게 만들어 주어야 함
		
		String s1 = new String("abs"); 
		String s2 = new String("abs"); 
		
		System.out.println(s2.equals(s1));
		
	/*
	 * 	Set<Entry<Member, Car>> entrys=map.entrySet();
	 
		for(Entry<Member, Car> data : entrys) {
			Member member = data.getKey();//회원정보
			Car car = data.getValue();//엔트리의 겟밸류가 차량정보
			
			System.out.println(member);
			System.out.println(car);
		}
		
		*/
		
	}

}
