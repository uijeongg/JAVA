package kr.ac.kopo.day12;

public class Member {
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

	
//	public boolean equals(Object obj = new Member("홍길동","010-1111-222")) 
	@Override
	public boolean equals(Object obj) { //obj==m2 __ MapMAin03  ->이게 묵시적일어난거
		if(obj == null) { //넘겨주는 오브젝트 값이 비어있으면 당연히 f
			return false;
		}
		
		Member m = (Member)obj; //obj를 member로 명시적형변환
		//멤버에 정의된 걸 비교하고싶은데 묵시적 되어있는 obj를 다시 명시적으로 바꿔주는거지
		if(this.name != null && !this.name.equals(m.name)) { //this.name == 이 클래스에서 선언한 name // m.name == m2_홍길동
			return false;
		}
		if(this.phone != null && !this.phone.equals(m.phone)) {
			return false;
		}
		return true; //여기까지 내려온건 이름과 전화번호가 같다는 것
	} 
}
//}
//맵에서 객체-객체 비교
//객체들을 해쉬로 관리하는 해쉬맵은 이퀄스의 결과가 트루이면서 해시코드값이 같아야함. 그래야 같은 객체로 봄
//이퀄스만 쓰는거 아니고 해쉬코드도 같게 만들어 주어야 함