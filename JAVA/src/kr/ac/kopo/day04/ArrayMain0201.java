package kr.ac.kopo.day04;

public class ArrayMain0201 {

	public static void main(String[] args) {

		String[]strArr = new String[5]; //이거 찍으면 null -> 참조변수는 초기화값이 null
		
		int loc=0; //로케이션 변수 생성
		
		strArr[loc++]="폴리텍";
		strArr[loc++]="데이터분석";
		strArr[loc++]="자바";
		strArr[loc++]="교육"; //하나하나 다 쳐주는게 아니라 로케이션을 통해서 ++해주면 됨
		//현재 로케이션 번지가 가르치는 곳을 찍어야겠다 의 의미
		
		System.out.println("문자열의 총 개수 : " + strArr.length + "개");
	
		System.out.println("첫번째 문자열 : " + strArr[0]);
		System.out.println("두번째 문자열 : " + strArr[1]);
		System.out.println("세번째 문자열 : " + strArr[2]);
		

	}

}
