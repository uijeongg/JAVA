package kr.ac.kopo.day13;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

//파일인풋 파일아웃풋보다
//버퍼가 훨씬 빠름
// BufferedInputStream
// BufferedOutputStream

public class IOMain04 {

	public static void main(String[] args) {

		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null; //input
		BufferedOutputStream bos = null; //output무조건 해줘야함
		
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			bis = new BufferedInputStream(fis); //fis에서 들어오는 애들에다가 버퍼를 껴주겠다
			
			fos = new FileOutputStream("iotest/Koala3.jpg");
			bos = new BufferedOutputStream(fos); //얘도 얘 속도를 빠르게하기 위해서 FileOutputStream에다가 버퍼 껴주겠다
			
			//4개를 열어줬으므로 close()도 4개 해줘야함
			//맨 마지막에 입력된 애들부터 삭제해주는게 좋음

			long start = System.currentTimeMillis();
			
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			fos.flush();
			
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			
//			FileClose.close(bis);
//			FileClose.close(bos);
//			
//			FileClose.close(fis);
//			FileClose.close(fos);
		}
		
/*		} finally { 
			
			//bis가 왜 null?
			
			//bis bos먼저?
			
			if(bis != null) {
				try {
					bis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			try {
				if(fis != null)
					fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(fos != null)
					fos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
*/	
		System.out.println("파일복사가 완료되었습니다");
	}
}





