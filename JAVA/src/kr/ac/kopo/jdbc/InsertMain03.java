package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//작은따옴표같은거 써주기 귀찮아서  PreparedStatement 객체 사용하는 예제
//물음표로 미리 쿼리 하나를(객체를) 준비해주고 만들어주고
//거기에 값 할당할 때 데이터형태 맞춰서 들어가게 해주는 것


//매번 3,4 단계만 달라짐. 1,2,5단계는 절대 안바뀜
//그럼 매번 같은건 유틸 클래스로 따로 빼도 되겠지?? 그건 내일~!

public class InsertMain03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 System.out.println("드라이버 로딩 성공...");
			 
			 String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			 String user = "scott";
			 String password = "tiger"; 
			 
			 conn = DriverManager.getConnection(url, user, password);
//			 System.out.println("conn : " + conn);


			 String id = "kim";
			 String name = "김길동";
			 
			 
			 //쿼리를 가지고 있는 애를 전처리해주고 싶음
			 String sql = "insert into t_test(id, name) values(?,?)";
			 //변수자리에(values값에) 문자열이면 작은따옴표 써야하는데 그냥 그 자리에 변수를 넣고 싶음. 
			 //타입 신경 쓰지 않고 일단 여기 값이 들어가긴 할거야
			 //이 쿼리를 사용하는게 목적인거잖아.?
			 
//			 PreparedStatement pstmt = conn.prepareStatement(sql);
			 pstmt = conn.prepareStatement(sql);
			 //이런 쿼리를 가지고 있는 스테이트먼트 객페 하나 만들어
			 //미리 준비되어있는 쿼리를 써라!
			 //리턴형 보면 prepareStatement 객체.
			 //작은따옴표 쓰기 싫어서 프리페어드쓰는거잖아 
			 //알아서 이 쿼리 자체가 문자열이면 작은따옴표를 붙이도록 만들고 싶은거라고
			 
			 //물음표 채울때 쓰는게 set
			 //문자형의 데이터를 넣을지 날자형일지를 모르니가 그걸 정해준다
			 pstmt.setString(1,id);
			 //set다음에 기본 데이터형 8개가 다 올 수 있음
			 //문자열이니까 setString
			 //근데 물음표 두개지 첫번째 물음표 자리에 문자열을 넣을거야 setString(1,)-> db는 인덱스 0 없음. 걍 1부터잖아
			 //setString(1,id); 1번째 자리에 id가 들어갈건데 걔는 string일거야!!
			 pstmt.setString(2, name);
			 
			 int cnt = pstmt.executeUpdate();
			 //pstmt.executeUpdate();를 int cnt 변수에 넣어줌
			 System.out.println(cnt + "개 행이 삽입되었습니다");
			 
		} catch(Exception e) {
			 e.printStackTrace();
			 
				//5단계. 접속 종료
				 } finally {
					 if(pstmt != null) {
							try {
								pstmt.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
						if(conn != null) {
							try {
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}