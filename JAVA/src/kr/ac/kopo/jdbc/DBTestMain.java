package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

//jdbc 연결 - 루틴은 1~5단계 
//여기서는 연결까지만

/*
 	작업순서
 	1. 드라이버 로딩
 	2. DB접속 및 연결객체 얻어오기
 */
public class DBTestMain {

	public static void main(String[] args) {
		try {
			//1단계 : 드라이버 로딩 (jdbc를 이용해서 db를 쓰겠다고 연결해주려고)
			//여기는 로딩만
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료...");  //로딩확인
			
			//2단계 : 연결은 여기서
			//연결 메소드를 통해서 디비에 접속하려면 파라미터 세개 필요  
			Connection conn = DriverManager.getConnection(
									"jdbc:oracle:thin:@192.168.119.119:1521:dink",
									"scott",
									"tiger"
			);
			System.out.println("DB접속 성공 : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
