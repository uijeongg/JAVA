package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.Statement;

//jdbc 5단계중 125단계는 다 똑같아서 그냥 util 패키지로 빼버리기

//여기는 close객체 util 패키지화 
//커넥션객체, 프리페어드스테이트먼트 객체도 클로즈 시켜야함

public class JDBCClose {

	public static void close(Statement pstmt, Connection conn) {
		//명시적 형변환
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
