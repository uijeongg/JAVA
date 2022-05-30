package Quest0310;
import java.util.Scanner;
/*
 * 5. 1달러는 현재 1,092.50원 입니다. 화면에서 달러를 입력 받아 원화로 보여주는 프로그램을
작성하세요
달러를 입력하세요 ? 10
원화 : 10925.00원
 */

public class QuestNum05 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달러를 입력하세요 :");
		double dollar = sc.nextInt();
		
		final double onedollar = 1092.50;
		double result = dollar*onedollar;
		System.out.printf("원화는 %.2f 입니다.", result); //printf는 (,)연결
		
		
		
		

	}

}
