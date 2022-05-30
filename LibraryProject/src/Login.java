import java.util.Map;
import java.util.Scanner;
//loginlist.put(new Member(id), password);

public class Login {
	public static boolean dologin(Map<Member02, String> loginlist) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\n============로그인============\n");

		// 아이디와 비밀번호 입력받아
		System.out.print("id를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.nextLine();

		// 입력받고 값이 있으면(=회원가입에서 가입했으면 있는 것) 로그인 성공, 없으면 회원가입 하시겠습니까? => back)
		if (loginlist.containsKey(new Member02(id)) && loginlist.get(new Member02(id)).equals(password)) {
			// 뉴멤버로해준 키에 맞는 패스워드를 끌고옴
			// id가 있는지 먼저 확인 && key인 id에 일치하는 password 있는지 확인
			// 멤버의 패스워드를 갖고있냐 물어보는거니까 get
			System.out.println("\n로그인 되었습니다"); // id있고 passwd와 짝도 맞게 입력했으면 로그인 성공
			return true;
			

		} else {
			System.out.println("회원정보가 일치하지 않습니다"); // 아니면 x
			return false;
		}

	}

}
