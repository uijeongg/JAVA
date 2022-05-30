import java.util.Map;
import java.util.Scanner;
//리스트만 다 추가해주면 여긴 끝!!

public class Join {

	public static void dojoin(Map<Member, String> checkjoinlist, Map<Member, String> joinlist,
			Map<Member02, String> loginlist, Map<Member02, String> booklist, Map<Member02, String> borrowlist,
			Map<Member, String> turninlist) {
		// dojoin이라는 메소드에 파라미터로 map 형태로 받겠다 가능
		// void로 해줘도 파라미터가 주소로 날라가서 어차피 저장됨
		// 이 안에서 저 파라미터로 놀아야 하는 것 인지!

		Scanner sc = new Scanner(System.in);

		System.out.println("\n============회원가입=============");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("주민번호를 - 없이 입력하세요 : ");
		String identity = sc.nextLine();
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("휴대폰번호를 입력하세요 : ");
		String phonenumber = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.nextLine();

		if (!checkjoinlist.containsKey(new Member(name, identity))) {
			// 리스트가 해당 이름과 주민번호를 안가졌다면 회원가입 실행

			System.out.println("\n회원가입이 완료되었습니다");

			// 필요한 리스트, 멤버변수 정의
			// 리스트 추가시마다 위에 두조인에도 추가 -> 선언해주는거
			checkjoinlist.put(new Member(name, identity), phonenumber); // 회원인지 확인하는 checkjoin리스트
			joinlist.put(new Member(name, identity, id, password), phonenumber); // 회원명부 받아놓기 용으로 걍 만들어놓기
			loginlist.put(new Member02(id), password);
//아왜안돼			booklist.put(new Member02(bookname, bookdate), id);  
			// borrowlist.put(new Member02(borrowbook),borrowdate);
			// turninlist.put(new Member(),)

		} else {
			System.out.println("이미 회원입니다");
		}
	}
}
