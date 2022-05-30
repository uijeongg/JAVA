package kr.ac.kopo.day13;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//flush(): 통로에 남아있는 데이터들을 쭉 빼서 출력해주는 메소드 
//flush()로 쫙 밀어서 내보내줌 (얼른 통로 비워~)
//출력에서는 속도가 느릴 수 있기 때문에 flush()를 써야함 (입력에선 필요x)
//try에 있어야함!
//출력할땐 다 한 다음 종료 전에 flush()로 마지막까지 다 내보내줘야 함. 습관적으로!


//close() 


//읽어오고 싶을 때 파일아웃풋스트림
//파일인풋스트림
//직접 파일객체가 들어가도, 파일패스(파일 위치)가 들어가도 됨
//파일아웃풋: 램에서 정보를 가져왔어. 메소드를 통해 바이트바이바이트바이로 저장?

/*
 * Koala.jpg -> Koala2.jpg로 복사
 * Koala를 읽어서 Koala2에 저장하는 것
 * Koala.jpg는 입력장치용 (읽는거니까)
 * Koala2.jpg는 출력장치용 (읽혀서 출력하니까)
 */

public class IOMain03 {

	public static void main(String[] args) {

		/*
		 * try { FileInputStream fis = new FileInputStream("iotest/Koala.jpg"); //그냥
		 * 이렇게만 만들면 FileOutputStream fos = new FileOutputStream("iotest/Koala.jpg");
		 * //에러나서 try catch 해줘야함 } catch(FileNotFoundException fnfe) {
		 * fnfe.printStackTrace();
		 * 
		 * //이렇게 하면 0바이트로 만들어짐. 파일만 만들어지고 안에가 비어있는 상태로 만들어진 것 }
		 */

		
//---------------------------------------------------------------------------
		
/*
 		
		try {
			FileInputStream fis = new FileInputStream("iotest/Koala.jpg");
			FileOutputStream fos = new FileOutputStream("iotest/Koala2.jpg"); 
			//외부인은 권한이 없기 때문에 0바이트로 뜸. 나만 접근 가능
			//lock걸린걸 풀어줘야(연결통로를 끊어서) 다른 사람도 쓸 수 있음 
			//=> close()메소드로 연결통로를 없애서(연결을 해제해줘야) 이 코알라를 다른 사람들도 쓸 수 있도록 하는 것
			//내가 굳이 close하지 않아도 소프트웨어가 종료되면 자동으로 연결이 해제됨
			//근데 계속해서 안꺼지는 프로그램이면 close해줘야 함
			//close(): 외부장치와 연결된 클래스에서 연결을 해제하는 메소드 전부
			//finally에 있어야함
			//하드디스크가 꽉찼어 ㅇ외발생하며 ㄴ캐치로감
			//올바르게 읽어도 연결은 해제해줘야하니까 질문!!!!!!!!!!!!!!!!!!!!!!!!!

			
			while (true) { // 계속 복사해야하니까 whlie문 돌려줌
				// 외부장치에 있는 파일이 외부장치에 저장될 수 없음 무조건 램을 거쳐서 가야함
				// 그냥 특징임 그래서 파일의 내용을 읽어서 램에 저장해놓고 다시 그 램을 파일에 저장해놓고 다시 파일 내용을 램에 저장하고 이런 식으로
				int c = fis.read(); // fis에서 한글자씩 읽고 싶어. 걔를 c에 저장
				if(c==-1) break; //c가 -1이면 끝나 (파일이 끝일때가 -1값이므로)
				fos.write(c);
			}
			fos.flush();
			
		} catch (Exception c) { // 묵시적 형변환을 통해서 c만 받아줌
			c.printStackTrace();

		}
		System.out.println("파일 복사가 완료되었습니다");

		
*/	
		
		
		
//-----------------------------------------------------------
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		//try문 안에서 만들어진 fis fos이므로 finally는 쟤네를 모름. 그래서 try밖에서 만들어줘야함
		
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			fos.flush();
			
			//while(true);
		} catch(Exception e) {
			e.printStackTrace();
		} finally { //finally 안에서 fis fos 같이 묶으면 안 됨. 각각 해주어야 함
			try { //위의 catch에서 예외 잡아줬는데 밑에서 close해주면 또 에러 먹으니까 밑에서도 catch 잡아줘야함
				fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				fos.close(); 
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일복사가 완료되었습니다");
	}
}





