package kr.ac.kopo.day11;
import java.io.FileNotFoundException;
import java.io.FileReader;
//간접예외처리 - throws 키워드
//throw 목적 1: 예외처리 한번에 해주는 목적

public class ExceptionMain08 {

public static void main(String[] args) {
	
	
	
	try {
	b();
	} catch(FileNotFoundException | ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	a();
	}
	

public static void b() throws FileNotFoundException, ArrayIndexOutOfBoundsException {
	int[] arr = new int[3];
	System.out.println(arr[4]);
	FileReader fr = new FileReader("a.txt"); //얜 무조건 예외처리 해야하지. 외부파일이라서 컴파일시 에러니까!
	//이 안에서 a처럼 예외처리 try만들어주고 해야하는데 예외처리 귀찮아. -> throw해주ㅓ야징~ 
	//b가 있던 위의 메인메소드로 throw~~ b에다가 try catch잡아주기
}

//FileNotFoundException만 예외처리를 넘겨준거라서 다른 예외는 처리가 안됨. 
//arr에 대한 예외처리도 같이 잡아주고싶다면 ,로 함께 써주고 try
	



	public static void a() {
		
		try{
			String str = null;
			System.out.println(str.length()); //try로 안묶어주면 이거 에러지
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

