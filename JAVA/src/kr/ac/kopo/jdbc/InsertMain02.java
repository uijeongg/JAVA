package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 아이디 입력:park
 * 이름 입력:박길동
 * 1개 행을 삽입하였습니다
 * 스캐너를 통해서 입력받고 ?? 이렇게 나오려고 만들기 해봐
 *  
 *  다 똑같고 3단계 실행객체 얻어오기만 바뀌면 됨
 */

public class InsertMain02 {

 public static void main(String[] args) {
		
		 
		 
		 Connection conn = null;
		 Statement stmt = null;
		 
		 
	try {
		 //1단계. 드라이버로딩 -> try catch문 사용
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 System.out.println("드라이버 로딩 성공...");
		 
		 
		 
		 //2단계. DB접속 및 Connection 객체 얻기
		 String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
		 String user = "scott";
		 String password = "tiger"; 
		 
		 conn = DriverManager.getConnection(url, user, password);
		 System.out.println("conn : " + conn);
		 
		
		//3단계. sql 실행객체 얻어오기
		//쿼리를 담을 수 있는 객체가 필요함-> statement객체
		 //키보드입력받을라면 스캐너 필요
		 Scanner sc = new Scanner(System.in);
		 System.out.print("아이디 : ");
		 String id = sc.nextLine();
		 System.out.print("이름 : ");
		 String name = sc.nextLine();
		 
//		 String sql = "insert into t_test(id, name) values(" + id + " , " + name + ")";
		 String sql = "insert into t_test(id, name) values(\'" + id + "\' , \'" + name + "\')";
		 //인서트 에러 뜨니까 작은따옴표 해줘야함!! (밑에 4단계 설명)
		 //근데 이거 가독성 넘 떨어지지. 그래서 나온게 프리페어드스테이트먼트 객체임. 그거 배우러 가자
		 
		stmt = conn.createStatement();
			
	
		
		
		
		
		
		
		//4단계. sql을 실행하고(쿼리를 실행) 결과 얻어오기
		int cnt = stmt.executeUpdate(sql);
		System.out.println("총 " + cnt + "개 행이 삽입되었습니다");
		//아무런 문제가 없다면, 우리 행 한개넣었으니까 하나 뜸
		
		//r근데 에러뜸!!!!!!!!!!!!! 인서트할때 에러 떴대
		//= insert into t_test(id, name) values(박길동 , park) 여기 에러래
		//park이랑 박길동이 문자열이라서 에러래
		//문자는 작은따옴표로 구분하니까 작은따옴표 해줘야해!!
		
		
		} catch (Exception e) {
			 e.printStackTrace();
			 
		//5단계. 접속 종료
		 } finally {
			 
			 if(stmt != null) { //클로즈할거면 stmt가 null이 아닐때만 해주야함
				 try {
					 stmt.close();
				  } catch (Exception e) {
					  e.printStackTrace();
				  }
			 }
			 
			
			 
			 if(conn != null) {
				try {
				 conn.close();
				 
			 } catch (Exception e) {
				 e.printStackTrace();
			 } 
		 }
			 
      } //finally 끝
	
	
	}
}