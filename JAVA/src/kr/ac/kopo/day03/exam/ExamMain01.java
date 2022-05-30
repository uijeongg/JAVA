package kr.ac.kopo.day03.exam;

//for문 실습
//지정된 횟수만큼 반복할때
//시작부터 끝까지 규칙적인 증가나 감소를 보일 때 사용


public class ExamMain01 {

	public static void main(String[] args) {
		
		//for( ; ; ) { for문은 ;가 2개 들어갈 수 있음. 이 때 그 자리를 다 비워두면 for문의 '무한루프'
		
		for(int i =1;i <=10 ; i++) { //int i가 1에서부터 10까지 1씩 증가
	   //for(int i =10; i >=1 i--); 	이것도 동일하겠지
	   //for(int i = 0 ; i<=9 ; i++);   열번만 돌리면 되는거니까 시작숫자, +-방향은 내가 어떤 수르 정해주든 상관 x
	   //for(int i=5; i<=14; i++);
       //for(int i=5; i>=-4; i--);	
			System.out.println("Hello");
		}

	}

}
