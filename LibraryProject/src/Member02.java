import java.util.Objects;

public class Member02 {

	private String name;
	private String phonenumber;
	private String identity;
	private String id;
	private String password;
	private String borrowbook;
	private String borrowdate;
	
	
	//내가 1에서 입력한 정의정이라는 사람을 이퀄스를 안해주면 같은 사람으로 인식이 안됨
	//오브젝트 메소드는 이퀄스 안해주면 주소값을 비교. 
	@Override
	public int hashCode() {
		return Objects.hash(bookdate, bookname, borrowbook, borrowdate, id, identity, name, password, phonenumber);
	}

	@Override
	public String toString() {
		return "Member02 [name=" + name + ", phonenumber=" + phonenumber + ", identity=" + identity + ", id=" + id
				+ ", password=" + password + ", borrowbook=" + borrowbook + ", borrowdate=" + borrowdate + ", bookname="
				+ bookname + ", bookdate=" + bookdate + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member02 other = (Member02) obj;
		return Objects.equals(bookdate, other.bookdate) && Objects.equals(bookname, other.bookname)
				&& Objects.equals(borrowbook, other.borrowbook) && Objects.equals(borrowdate, other.borrowdate)
				&& Objects.equals(id, other.id) && Objects.equals(identity, other.identity)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(phonenumber, other.phonenumber);
	}


	private String bookname;
	private String bookdate;
	
	
	Member02(){
		
	}
	
	Member02(String id){ //멤버변수가 string 한개짜리가 한 클래스에 같이 있으면 에러라서 다른 창에 만들어줌
		this.id=id;
	}
	
	Member02(String borrowbook, String borrowdate) {
		this.borrowbook=borrowbook;
		this.borrowdate=borrowdate;
	}


}