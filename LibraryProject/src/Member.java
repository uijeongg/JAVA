import java.util.Objects;

public class Member {
	private String name;
	private String phonenumber;
	private String identity;
	private String id;
	private String password;
	private String borrowbook;
	private String borrowdate;
	
	Member(){
		
	}
	
	
	Member(String name,String identity,String id,String phonenumber){
		this.name=name;
		this.identity=identity;
		this.id=id;
		this.phonenumber=phonenumber;
		
	}

	Member(String name,String identity){
		this.name=name;
		this.identity=identity;
	}
	
	Member(String name){
		this.name=name;
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(borrowbook, borrowdate, id, identity, name, password, phonenumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(borrowbook, other.borrowbook) && Objects.equals(borrowdate, other.borrowdate)
				&& Objects.equals(id, other.id) && Objects.equals(identity, other.identity)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(phonenumber, other.phonenumber);
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", phonenumber=" + phonenumber + ", identity=" + identity + ", id=" + id
				+ ", password=" + password + ", borrowbook=" + borrowbook + ", borrowdate=" + borrowdate + "]";
	}

	//풋 하면 
	//이퀄은 오브젝트에 잇는 메소드야. 얘는 주소값을 비교해
	//그래서 아무리 정의저 ㅇ주민분허를 쳐도 다 다른 사람으로 인식해
	//그걸 방지하고자 오버라이드를 한것
//정의정 내주민번호를 침ㄴ 같은 사람으로 인식하기 위해
	

	
}
