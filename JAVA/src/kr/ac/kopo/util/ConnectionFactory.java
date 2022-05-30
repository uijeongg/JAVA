package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

//SelectMain02의 커넥션 객체 유틸화
//디비 접속 후에 접속 개체 넘겨주기
//그냥 걔가 어떤 디비든 팩토리객체에서 오는걸 쓰겠다

public class ConnectionFactory {

	public Connection getConnection() { 
		//getConnection()은 static이 아님
	
		Connection conn = null;
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//나중에 여기 ()만 바꿔줘서 계속 사용하겠다
		 
		 String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
		 String user = "scott";
		 String password = "tiger"; 
		 
		 conn = DriverManager.getConnection(url, user, password); //커넥션객체(데이터) 얻어오기
			
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
