package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;


//setString 사용 예제


public class UpdateMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = new ConnectionFactory().getConnection();
			
			conn.setAutoCommit(false);
			//자동으로 커밋을 할까 말까 물어보는 것
			//근데 오토커밋이 트루임 기본적으로 (커밋이 오토로 일어나는 것)
			//오토커밋 안쓸 땐 false로 만들어주기
			//여기서 1행 추가시키고 sql가서 확인해보면 추가 안 되어있음
			//이거 했으면 밑에 다 일 처리하고 객체.commit(); 해줘야 commit 됨!
			
			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 id를 입력 : ");
			String id = sc.nextLine();
			System.out.print("수정할 이름을 입력 : ");
			String name = sc.nextLine();
			
			
//			String sql = "update t_test ";
//					sql += " set name = ? ";
//					sql += " where id = ? ";
			//여기를 스트링 빌더로 바꿔볼게!
			//변화가 자주 일어나는 애들은 스트링 클래스 말고 스트링빌더로 사용함!! --> 속도가 생명이라서!!
			StringBuilder sql = new StringBuilder();
			sql.append("update t_test ");
			sql.append(" set name = ? ");
			sql.append(" where id = ? ");		
			pstmt = conn.prepareStatement(sql.toString()); //질문하기 투스트링
					
			
//			pstmt = conn.prepareStatement(sql); //preparedStatement객체 얻어옴
			pstmt.setString(1, name); //첫번째 물음표에는 name 넣기
			pstmt.setString(2, id);
			
			int cnt = pstmt.executeUpdate();
			
			conn.commit();
			//위에서 오토커밋 false했으니까 여기서 다 입력해주고 commit 해줘야함
			//위에서 오토커밋 false 안해줬으면 디폴트가 true여서 굳이 이걸 해줄 필요가 없던 것
			
			System.out.println(cnt + "행 수정 완료 ...");
			//이렇게 해주고 sql가서 확인해보면 행 추가 되어있음!!
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

	}

}
