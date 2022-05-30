package kr.ac.kopo.day01;

/* 
주석문 : 컴파일 시에 바뀌지 않는 구역
 */

// 주석문

// 주석문 안에 주석문은 (중첩처리) 안됨

/* 
 상수종류
 1. 정수형 상수
 2. 실수형 상수
 3. 문자형 상수 ('a')    -> 대문자('A') 소문자('a') 숫자문자('4') 특수문자('!') 공백문자(' ') 도 얘기할 수 있음 -> 엔터 탭 스페이스 얘네 표현 가능하단 말
                      -> 엔터:('\n') 탭:('\t')  
 4. 문자열 상수 ("abc")
 5. 논리형 상수 (true.
 */


/* 출력메소드
 1. println()  : 개행문자 포함 (자동줄바꿈) 
 2. print() : 개행문자 포함x (자동줄바꿈 x)
 3. printf() : jdk1.5에서 새로 추가된 기능으로, 그래서 처음에 1.8로 설정했던 것/ 개행문자 포함x 
    -> 출력문자형태 %d정수 %f실수 %c캐릭터(문자) %s문자열 %b논리값
    -> f의 목적은 쌍따옴표 안에 있는 내용을 출력하는것 -> 문자열을 출력한다는 뜻
*/ 

public class PrintMain {
	
	public static void main(String [ ] args) {
		
		System.out.println(10);    //ln (line)은 출력결과 이후엔 자동 줄바꿈 코드 
		System.out.println(12.34); //sysout 치고 컨트롤+스페이스 치면 이거 뜸
		System.out.println('A');
		System.out.println("Hello");
		
		System.out.println("23살");
		
		System.out.println(23);
		System.out.println("살"); //23살을 이렇게 써주면 줄바꿈 때문에 23살로 안뜸 그럴 때 ln을 빼고 print()
		
		System.out.print(23);    //이렇게
		System.out.println("살"); 
		
		System.out.println(23 + "살"); //한 출력 메소드 안에 다양한 형태의 출력을 하고 싶을 땐 + 연산자 사용. 앞에거보다 이게 편하겠지
		
		
		
		
		// 여서부터 오후
		System.out.println(10+ "+" + 20 + "=" + 10 + 20);
		// 이 결과값은 이항연산을 통해서 "1020" 
		//그러니까 값이 30이 나오려면 괄호를 쳐줘야 함 (마지막에 (10+20) 로)
		System.out.println(10+ "+" + 20 + "=" + (10 + 20));
		
		System.out.printf("23살");
		//System.out.printf("%d살"); //지금은 아직 d에 들어갈 매칭되는 출력문자가 없으니까 에러임
		
		System.out.printf("%d살", 23);
		System.out.printf("%d + %d = %d", 10, 20, 10+20); //이렇게 두줄 치면 한줄에 나옴. f는 개행문자 포함 아니니까.
		
		System.out.printf("%d살", 23);
		System.out.println(); //이렇게 껴주면 됨 -> 이건 그냥 엔터만 넣어준 것
		System.out.printf("%d + %d = %d", 10, 20, 10+20);
		
		System.out.printf("%d살\n", 23); // \n해주면 엔터기능 되는거
		
		
		System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
		
		System.out.printf("%7d\n",1200);   //정수 7 자리 출력하고 싶어 /  기본적으로 오른쪽맞춤
		System.out.printf("%-7d\n",1200);  // 왼쪽맞춤 하고 싶으면 -붙여주면 됨
		System.out.printf("%7d\n",15800);
		System.out.printf("%04d\n",35);    // 
		System.out.printf("%f\n",12.3456); //소숫점은 별다른말 업으면 6째까지 찍힘
		System.out.printf("%.4f\n",12.3456);  //소숫점 4째자리까지 (이 때 반올림해서 올라감)
		System.out.printf("%.2f\n",12.3456);  //소숫점 둘째까지
		
		System.out.printf("%b\n",true);
		}

}


























