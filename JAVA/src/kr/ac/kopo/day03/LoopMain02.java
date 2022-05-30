package kr.ac.kopo.day03;
//dowhile문
//같은 


/*
 * while(expr) {
 *   statement; 
 * }
 * 
 * for(init; expr; incre) {
 *  statement;
 * }
 * do 위에 init 초기화코드
 * do {
 *  statement;
 *  incre/decre 
 * }while(expr); 조건이 참이면 다시 while문을 돌리겠다 그럼 어디서 부터? 저 위의 do 부터!
 *               while 뒤에 원래 ;붙이는거 아닌데 dowhile에서는 붙여야함
 */

//헬로 다섯번 출력을 두와일로 짜보기 -> 헬로출력이 반복되길 원한다
public class LoopMain02 {

	public static void main(String[] args) {
		
		int cnt = 1;
		do {
			System.out.println("Hello");
			cnt++; //자기 숫자에서 +1이
		} while(cnt <=5); //5가 될 때까지 반복한다

	}

}

//while 문은 매번 조건 만족하니? 어 그럼 찍어 이 모든 루틴을 5번
//초기화 했어 -> 만족했으니까 다시 올라가서 찍고 증가하고 다시 물어봄 5번 루틴 -> 그럼 횟수가 한번 줄겠지

//sysout("==")



/* while 무한루프 사용해서 이렇게도 가능
cnt=1;
while(true) { //while(true): 무한루프
sysout("Hello");
cnt++

if(cnt>5) { //5보다 커지면 더이상 할 필요 없으니까 break
	break;
}
	
}
*/


























