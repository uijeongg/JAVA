package kr.ac.kopo.day13;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain05 {

public static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iotest/data.dat");
			dos = new DataOutputStream(fos);
			char c = 'A';
			int num = 99;
			double f = 12.34;
			
			dos.write(c); //얘만 실행하면 파일이 1바이트
			dos.writeChar(c); //이거만 실행하면 2바이트, 위에랑 이거 같이 실행하면 3바이트
			dos.writeInt(num); //4바이트, 다 같이 실행하면 7바이트
			dos.writeDouble(f);
			
			dos.flush();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
		System.out.println("파일저장 완료...");
	}
	


public static void read() {
	
	FileInputStream fis = null;
	DataInputStream dis = null;
	
	try {
		fis = new FileInputStream("iotest/data.dat");
		dis = new DataInputStream(fis);
		
		int i = dis.read();
		char c =dis.readChar();
		int i2 = dis.readInt();
		double d = dis.readDouble();
		

		
		System.out.println("첫번째 문자 : " + (char)i);//캐릭터형 형변환 i
		System.out.println("두번째 문자 : " + c);//c
		System.out.println("정수 : " + i2);//정수값은 i2
		System.out.println("실수 : " + d);//실수는 d 찍기
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		FileClose.close(dis, fis);
	}
	
}
	

	public static void main(String[] args) {
		

        read();
		//write(); //write로 먼저 파일을 쓴다고 선언! 주석처리 한 후 read로 읽어줘야함
		
	}
}



//iotest~ 밑에 ~ c가 들어있는 a를 저장하라
//캐릭터로 저장하고 싶어서 데이터아웃풋스트림 사용