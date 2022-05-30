package Quest0318;
import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();

		System.out.print("정수 : ");
		int i = sc.nextInt();
		System.out.print("정수 : ");
		int j = sc.nextInt();

		System.out.println(i + " + " + j + " = " + cal.add(i, j));
		System.out.println(i + " - " + j + " = " + cal.sub(i, j));
		System.out.println(i + " * " + j + " = " + cal.mul(i, j));
		System.out.println(i + " / " + j + " = " + cal.div(i, j));
		System.out.println(i + " 소수체크 : " + cal.prime(i));
		System.out.println(j + " 소수체크 : " + cal.prime(j));

	}

}
