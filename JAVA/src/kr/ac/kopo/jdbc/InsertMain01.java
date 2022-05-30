package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//id가 hong name이 홍길동인 레코드를 삽입해보려고 한다

/*
 * 작업순서 그냥 암기하쇼
 * 1. 드라이버로딩
 * 2. DB접속 및 connection 얻어오기
 * 3. sql 실행객체 얻어오기
 * 4. 쿼리실행 및 결과 얻어오기
 * 5. 접속 종료 
 */
	
public class InsertMain01 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		// 원래 try안에서 만들어줬었는데 close할 때 finally 에서 사용해야 해서 밖에다 다시 만듦
		// 그리고 try 안에서는 변수선언 아니고 불러와주기만!
		// 여기선 null로 선언

		try {
			// 1단계. 드라이버로딩 -> try catch문 사용
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");

			// 2단계. DB접속 및 Connection 객체 얻기
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";

			// Connection conn = DriverManager.getConnection(url, user, password);
			conn = DriverManager.getConnection(url, user, password);

			// 그냥 여기 파라미터가 너무 길어지니까 변수화 시켜준 것!!
			System.out.println("conn : " + conn);

			// 3단계. sql 실행객체 얻어오기
			// 쿼리를 담을 수 있는 객체가 필요함-> statement객체
			// 원래 객체 사용하려면 new 써야하는데 DB에서는 new없이도 가능
			// connection 객체에서 statement 객체를 얻어올 것임
			// 이 때, statement 객체를 얻어올 때 사용하는 메소드가 create statement
			// 리턴형이 스테이트먼트인거 확인가능
			// Statement stmt = conn.createStatement();
			stmt = conn.createStatement();

			// 쿼리를 넣을 수 있는 stmt 객체를 만들어줌!!

			String sql = "insert into t_test(id, name) values('hong', '홍길동')";
			// id가 hong name이 홍길동인 레코드를 삽입해보려는게 목적이니까 쿼리문을 통해 넣어줘야지

			// 4단계. sql을 실행하고 결과 얻어오기
			// 실제 쿼리를 가지고 있는게 stmt 객체니까 걜 실행시켜줘야함 -> 실행시켜주는 메소드는 executeUpdate()
			// stmt.executeUpdate(sql);
			// sql쿼리에 있는 문장을 실행해라
			// executeUpdate(); 리턴값이 인트임 -> 수정한 레코드의 개수가 반환됨!! 그니까 int 변수에 넣어줌
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행이 삽입되었습니다");
			// 우리 행 한개넣었으니까 하나 뜸
			// 여기까지 접속! 할일 다 했으면 이제 끊어보장
			// 종료는 finally지

		} catch (Exception e) {
			e.printStackTrace();

			// 5단계. 접속 종료
		} finally {
			// 할일 다 했으면 이제 끊어보장
			// 종료는 finally 여기여기!!
			// 접속한 다음에 해제는 무조건 다 close 라이브러리임!!
			// 무조건 외부장치를 종료할 땐 close~~

			// 디비접속 위해 커낵션 객체 가져옴
			// 스테이트먼트 객체 가져욤
			// 스테이트객체먼저 클로즈하고 그다음 커낵션을 클로즈해야함. 순서가

			// stmt.close(); //close인데 이거 해주면 에러뜸. 오ㅔ냐면 stmt는 try에서 만들어서 rty안에서만 사용가능
			// 여기는 finally라서 안됨.

			if (stmt != null) { // 클로즈할거면 stmt가 null이 아닐때만 해주야함
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			// conn 도 클로즈해줘야함 똑같이
			// 두개를 같이 close해주면 안 됨!!!!!!

			if (conn != null) {
				try {
					conn.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} // finally 끝

	}
}

//한번더 실행하면 에러뜸
//ORA-00001: 무결성 제약 조건(SCOTT.SYS_C007756)에 위배됩니다
//pk 위배됨 -> insert into 할 때 에러뜬다고 함~~



//statement 객체는 커밋이 자동으로 일어난다 ????????
//그래서 트랜잭션 처리를 할 때는 자동으로 커밋하는 애들을 못하게 만들어야함