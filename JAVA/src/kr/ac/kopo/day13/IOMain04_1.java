package kr.ac.kopo.day13;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;
/*
	
 	콘솔모드에서
 	java IOMain04_1 Koala.jpg Koala2.jpg  입력시
 	
 	 Koala.jpg -> Koala2.jpg 복사
*/

public class IOMain04_1 {

	public static void main(String[] args) {

		System.out.println("args : " + Arrays.toString(args));
		//도스모드 루틴을 args가 알아서 해줌
		//arguments가 몬데!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(args[0]); //원본파일명은 args 0이 알게 됨
			bis = new BufferedInputStream(fis); 
			
			fos = new FileOutputStream(args[1]);  //원본파일명은 args 1이 알게 됨
			bos = new BufferedOutputStream(fos); 
			
			

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





