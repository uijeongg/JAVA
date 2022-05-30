package kr.ac.kopo.day02;

/*
 *  조건문 - 조건을 만족하면 블록 안의 내용을 수행하고 false이면 블록을 빠져나옴
 *  
 *  if(조건) {
 *  (제어를 가하려는)문장;  
 * }
 * 
 * 보유하고 있는 책 권수 입력 : 1
 * 1 book
 * 
 * 보유하고 있는 책 권수 입력 : 4
 * 4 books (어떤건 s붙고 안붙고 하니까 이 조건문을 해줘야지)
 * 
 */

 
/* if-else문 
 * 
 * if(조건) {
 *     문장1;
 *} else {
 *     문장2;
 *}
 * 
 * if-else는 딱 달라붙어 있어야 하는 애들이라서 그 사이에 뭐가 들어갈 수 없음!!
 *    두개 중 하나를 선택해서 조건 수행
 *    조건 ? 문장1 : 문장2
 *    
 *    n개의 문장은 하나하나 분리하려면 n-1개의 연산자가 필요하듯이 이프엘스문도 n-1개가 필요함
 */

public class IFMain01 {

	public static void main(String[] args) {
		
		int book = 1;
		
		System.out.println(book + "book");
		if(book >= 2) {
			System.out.println("s"); //s가 붙는건 복수개일테니 book>=2 로 조건 걸어줌 
		}
	}
}
		
// if-else문
//		if(book==1) {		
//		System.out.println(book + "book");  //어떨땐 단수로 나왔음 좋겠고
//  } else {
//		System.out.println(book + "books"); //어떨땐 복수로 나왔음 좋겠는 상황
//		}
//
//	}






















