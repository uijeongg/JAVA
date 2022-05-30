import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
	public void menu1() {
		Scanner sc = new Scanner(System.in);

		// 여기에 map 객체(리스트) 싹 다 넣기
		Map<Member, String> checkjoinlist = new HashMap<>();
		Map<Member, String> joinlist = new HashMap<>();
		Map<Member02, String> loginlist = new HashMap<>();
		Map<Member02, String> booklist = new HashMap<>();
		Map<Member02, String> borrowlist = new HashMap<>();
		Map<Member, String> turninlist = new HashMap<>();

		System.out.println("**********");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원 로그인");
		System.out.println("3. 아이디/비밀번호 수정");
		System.out.println("4. 책 대여하기");
		System.out.println("5. 책 반납하기");
		System.out.println("6. 종료");
		System.out.println("0. 관리자 모드");
		System.out.print("**********\n\n");

		a: while (true) { // 데이터 계속 저장하기 위해 무한루프문 (run 동안에 계속 저장되도록)
			System.out.print("원하시는 서비스의 번호를 입력하세요 : ");

			switch (sc.nextInt()) { // 무한루프돌리려면 변수선언 xxxxxxxxx

			// join class : 회원가입
			case 1:
				Join.dojoin(checkjoinlist, joinlist, loginlist, booklist, borrowlist, turninlist);
				// 알아서 저장됨 주소값을 가진 애니까
				sc.nextLine(); // 에러때문에 버퍼비우기 int위에서 해주고 엔터가 남아있어서 밑에서 영향 받지 않게 비워주기
				System.out.print("\n계속: Y , 종료: N을 선택하세요 : ");
				if (sc.nextLine().equals("Y")) { // 변수선언을 하고 입력받으면 계속 그 값을 받는 형태니까 선언 x
					break;
				} else {// if (sc.nextLine().equals("N"))
					// System.out.print("서비스가 종료되었습니다.");
					break a;
				}

//=========================================================================

				// login class : 로그인
			case 2:
				Login.dologin(loginlist); // 종료 Y는 케이스문마다 다 있어야함
				sc.nextLine();

				System.out.print("\n계속: Y , 종료: N을 선택하세요 : ");
				if (sc.nextLine().equals("Y")) {
					break;
				} else {
					break a;
				}

//=========================================================================

				// modify class : 아이디 비번 수정
			case 3:
				Modify.domodify(joinlist, loginlist); // 모디파이클래스 실행 , 회원인지 먼저 알아야하니깐

				sc.nextLine(); // 버퍼비우기

				System.out.print("\n계속: Y , 종료: N을 선택하세요 : ");
				if (sc.nextLine().equals("Y")) {
					break;
				} else {
					break a;
				}

//=========================================================================				

				// borrow class : 책 대여
			case 4:
				Borrow.doborrow(borrowlist, loginlist);
				sc.nextLine();
				System.out.print("\n계속: Y , 종료: N을 선택하세요 : ");
				if (sc.nextLine().equals("Y")) {
					break;
				} else {
					break a;
				}

//=========================================================================

				// turnin class : 책 반납
//			case 5:
//				TurnIn.doturnin(turninlist, loginlist);
//				sc.nextLine();
//				System.out.print("\n계속: Y , 종료: N을 선택하세요 : ");
//				if (sc.nextLine().equals("Y")) {
//					break;
//				} else {
//					break a;
//				}
//				
				
//===============================================================
            
			//종료
			case 6:
				break a;
			
//===============================================================
		    
			//관리자모드		
			case 0:
				System.out.print("관리자 비밀번호 4자리를 입력하세요: ");
				sc.nextLine();
				int adminInput=Integer.parseInt(sc.nextLine());
				
				if(adminInput == 8888) {
					Admin ad = new Admin();
					ad.bookadd();
					
					//admin에서 다 짜고 와서 생각
					//ex) 책 이
				}	
		
			}
		}
		System.out.print("서비스가 종료되었습니다");
	}
}
