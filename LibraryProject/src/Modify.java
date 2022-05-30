import java.util.Map;
import java.util.Scanner;
//modifylist.put(new Member(id, password), phonenumber);	
//로그인때매 꼬인거 손좀보셈


public class Modify {

	public static void domodify(Map<Member, String> joinlist, Map<Member02, String> loginlist) {
		Scanner sc = new Scanner(System.in);
		
		
		if (Login.dologin(loginlist)) { //회원만 가능하므로 회원인지 먼저 확인
		
		System.out.println("\n============ID/비밀번호 수정============");	
		System.out.print("\n현재 id를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("현재 비밀번호를 입력하세요 : ");
		String password = sc.nextLine();


		if (loginlist.containsKey(new Member02(id)) && loginlist.get(new Member02(id)).equals(password)) {
			// 등록된 아이디와 비번이 있다

			System.out.print("id 변경: 1 , 비밀번호 변경: 2를 선택하세요 : ");
			int num = sc.nextInt();

			if (num == 1) {
				sc.nextLine(); // 입력버퍼 안해주면 걍 넘어감
				System.out.println("============id 변경============");
				System.out.print("새로운 id를 입력하세요 : ");
				String newId = sc.nextLine();
				joinlist.put(new Member(password), newId); // 돌려보고 이상하게 뜨는지 확인해보셈

				System.out.println("\nid가 변경되었습니다");

			}
			if (num == 2) {
				sc.nextLine();
				System.out.println("============비밀번호 변경============");
				System.out.print("새로운 비밀번호를 입력하세요 : ");
				String newPassword = sc.nextLine();
				joinlist.put(new Member(id), newPassword); // 모디파이리스트 만들 필요없이 조인리스트 풋하면 거기서 중복 잡아줌

				System.out.println("\n비밀번호가 변경되었습니다");

			}

		} else {
			System.out.println("\n일치하는 회원 정보가 없습니다");
		}
	}

		else {
			System.out.println("\nY -> 1을 눌러 회원가입을 진행해주세요");
		}
		
}
}
	
	

