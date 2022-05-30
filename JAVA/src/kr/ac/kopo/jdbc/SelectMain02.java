package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;


public class SelectMain02 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
	
//			 Class.forName("oracle.jdbc.driver.OracleDriver");
//			 System.out.println("드라이버 로딩 성공...");
//			 
//			 String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
//			 String user = "scott";
//			 String password = "tiger"; 
//			 conn = DriverManager.getConnection(url, user, password); //커넥션객체(데이터) 얻어오기
			 
			
			//원래 위의 1,2 단계를 ConnectionFactory 클래스를 통해서 아래 한줄로 유틸화!!
			
			 conn =  new ConnectionFactory().getConnection();
			 
			 
			 String sql = "select * from t_test";
			 pstmt = conn.prepareStatement(sql);
			 
			 ResultSet rs = pstmt.executeQuery(); //몇개의 데이터를(레코드를) 가졌는지 모르는데 rs가 레코드 하나하나를 가리키고 있음
			 //rs는 커서일 뿐. 레코드를 가리키고 있을 뿐이지 몇개인진 몰라
			 //rs에 넥스트를 호출하는 순간 각각의 레코드를 가리킴 -> rs가 가리키고 있는 레코드가 있니 없니? 임. 그래서 넥스트는 불린 타입
			 //rs가 false가 될때까지 
			 while(rs.next()) {
				 String id = rs.getString("id");
				 String name = rs.getString("name");
				 //id라는, name이라는 컬럼을 뽑음
				 
				System.out.println("id : " + id + ", name : " + name);
			 }
			 
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			JDBCClose.close(pstmt, conn);
			}
	}

}
