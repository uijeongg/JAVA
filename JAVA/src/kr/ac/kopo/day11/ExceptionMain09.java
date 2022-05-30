package kr.ac.kopo.day11;
import java.io.FileNotFoundException;
import java.io.FileReader;
//간접예외처리 - throw 키워드
//throw 목적 1: 예외처리 한번에 해주는 목적

//인터페이스 추상메소드 만들때 반드시 예외처리 해주려고 만들때부터 예외 만들어줌
//그리고 오버라이드할때도 똑같이 예외까지 만들어줘야함
//상속받은 애도 예외처리를 가지고 있어야 한다는 말
//노트에 코드 정리

public class ExceptionMain09 {
public static void main(String[] args) {
		
		try {
			c();
			d();                                 //저 밑의 예외처리를 throw해줘서 여기서 다 한꺼번에 처리 중
			e();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			b();
		} catch(FileNotFoundException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		a();
		
	}
	
	public static void f() throws Exception {
		
	}
	
	public static void c() throws Exception {
		f();
	}
	
	public static void d() throws Exception {
		
	}
	
	public static void e() throws Exception {
		
	}
	
	public static void b() throws FileNotFoundException, ArrayIndexOutOfBoundsException {
		int[] arr = new int[3];
		System.out.println(arr[4]);
		FileReader fr = new FileReader("a.txt");
	}
	
	public static void a() {
		
		try{
			String str = null;
			System.out.println(str.length());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}




