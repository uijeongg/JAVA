package kr.ac.kopo.day06;
import java.util.Scanner;

//입력버퍼

public class ScannerMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		
		System.out.println("num : " + num + "num2 : " + num2 + "num3 : " + num3);
		//첫번째 정수에서 10 20 30 다 찍어도 10 찍고 난 후 엔터에서 문자니까 무시하고 그 다음번 정수부터 두번째 정수로 인식함. 
		//이게 입력버퍼여서 가능한 것!!
		
		
		
		
		
		 System.out.print("정수 : ");
		 //int num4 = sc.nextInt();
		 //sc.nextLine();
		 int num4 = Integer.parseInt(sc.nextLine());
		 //정수 입력받고 싶을 때 위 두줄처럼 넥스트인트하고 넥스트인트 하면 되지만
		 //그냥 한번에 int num = Integer.parseInt(sc.nextLine()); 로 받아도 되는 것!!
		 //이 메소드는 그냥 암기하기!!!!!!!
		 
		 //한번 정수를 받고난다음에 그 다음 정수 받기 전에 최소 엔터(문자)가 남아있으니까 이게 다음 문자 입력시에 영향을 주지 않기 위해 nextLine()을 써줘야함
		 //line()메소드를 사용해서 엔터를 소비해서 버퍼를 비워주기 위한 것
		 //그러니 실수건 정수건 문자열이건 논리값이건 문자열 입력으로 받는 것. 넥스트라인으로 받으면 무조건 버퍼가 비워질테니까
		 //문자열 456을 정수형 456으로 바꿔주면 되지.
		 
		 //nextInt()로 받으면 엔터가 남아있는게 번거로우니까 그냥 정수여도 nextLine()을 통해 문자열로 받고
		 //문자열로 받은 것을 정수형으로 형변환해주면 됨 -> 이 메소드는 Integer.parseInt()
		 //Integer.parseInt("123") ;  123(문자열)을 정수형 123으로 바꿔줌
		 
		 //int num = Integer.parseInt(sc.nextLine());
		
		 // == 정수입력받을때 인트로 하면 문제가 생길 수 있으니 그냥 Integer.parseInt(sc.nextLine());로 써주겠다가 결론
		 //다만 저거 쓸 때 정수면 정수만 써야함. .이나 !뭐 이런 다른형 들어가면 에러
		 
		 System.out.print("실수 : ");
		//double f = sc.nextDouble();
	    //sc.nextLine();
	     double f = Double.parseDouble(sc.nextLine());
		
		 //실수일땐 Double.parseDouble(sc.nextLine());
		
		
	}

}
