package kr.ac.kopo.day04;

public class ArrayMain02 {

	public static void main(String[] args) {
		//배열은 기본자료형 외에 참조자료형도 가능하다
		//문자를 저장하기 위한 자료형은 string이니까 스트링 어레이를 만들 수 있겟지
		
//		String[] strArr = {"데이터분석", "자바", "교육"}; //데이터 초기화 중 (그림 그린거로 이해)
	
		String[]strArr = new String[3]; //이거 찍으면 null -> string형의 참조변수는 초기화값이 null
		strArr[0]="데이터분석";
		strArr[1]="자바";
		strArr[2]="교육"; //저 위에 한줄이랑 이 네줄이 같은 의미 선언부로 나눈 것
		
		System.out.println("문자열의 총 개수 : " + strArr.length + "개");
	
		System.out.println("첫번째 문자열 : " + strArr[0]);
		System.out.println("두번째 문자열 : " + strArr[1]);
		System.out.println("세번째 문자열 : " + strArr[2]);
		
	}

}
