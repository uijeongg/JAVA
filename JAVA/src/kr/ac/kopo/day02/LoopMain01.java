package kr.ac.kopo.day02;

/*
 * 반복문을 위한 기본요소 4가지
 * 1. 반복할 문장(statement)
 * 2. 시작값(init)
 * 3. 증가/감소(incre/decre)
 * 4. 종료조건(expr)
 * 
 * 
    한바퀴 뛸 차례다;
    while(조건: !열바퀴 다 뛰었냐?) {            => not붙이는 이유? 다 안뛰었으면 나가게?
         운동장 한바퀴 뛴다;
         바퀴수 증가;
     }
     
     
   1.init;
    2.while(expr) {
     3.statement;
      4.incre/decre;
     
     
     1 -> 조건이 참일 때 -> 3번 수행하고 -> 그 다음 4번 수행하지 -> 다시 2번으로 와야하는거 -> 다시 참이라면 3번 수행 -> 4번 수행 -----
        ----> 2 조건 거짓 -> 5로 가겠지
        
      1 -> 2 조건 참 -> 3 -> 4
        ->
        -> 
        -> 2 조건 거짓 -> 5  
        
        
열바퀴만 뛰고 나가고 싶을 때


-------------------------------

<포문> 조건식이 거짓이 될 때까지 반복을 해야함

       for(1. init ; 2. expr ; 3. incre/decre) {
         4. statement;
       }
       5. 
       
       1 초기화 -> 2 조건이 참 -> 4 스테이트먼트 수행 -> 블러스커먼트로 가서 아까 못했던 3 증감 수행 -> 다시 2 조건 참 -> 다시 4 문장 수행하고 -> 3 증감으로 가지
       1 -> 2 조건 참 -> 4 -> 3
       1 -> 2 조건 참 -> 4 -> 3
       1 -> 2 조건 거짓 -> 5
       
 */



public class LoopMain01 {

	public static void main(String[] args) {
		
		
	 boolean bool = false ; //거짓이 될때까지 도는 것
	 // boolean bool = true ; -> true로 하면 계속 헬로가 미친듯이 나오겠지 -> 이걸 "무한루프"
	 System.out.println("--반복문 시작--");
//	 while() {   //while은 괄호 안 조건문이 거짓일 때까지 수행하는 것        -> 에러라서 주석처리함. 다시 알아놓기!!!!
		System.out.println("Hello");
	 }
//	     System.out.println("--반복문 종료--");
	}

//}



/*

System.out.println("--반복문 시작--");

int cnt  = 1; //초기화 -> cnt라는 변수가 1이라는 값을 가지고 생성됨
while(cnt<=5) {   //cnt 1이 5보다 작냐
	System.out.println("Hello");
	++cnt;
}
    System.out.println("--반복문 종료--")
    }
    }

*/




/*
public class LoopMain01 {

	public static void main(String[] args) {
		
		
	 boolean bool = false ; //거짓이 될때까지 도는 것
	 // boolean bool = true ; -> true로 하면 계속 헬로가 미친듯이 나오겠지 -> 이걸 "무한루프"
	 System.out.println("--반복문 시작--");
	 while() {   //while은 괄호 안 조건문이 거짓일 때까지 수행하는 것
		System.out.println("Hello");
	 }
	     System.out.println("--반복문 종료--")
	}

}

*/

//포문코드 치기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!



















