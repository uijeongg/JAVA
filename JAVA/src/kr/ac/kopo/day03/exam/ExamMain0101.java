package kr.ac.kopo.day03.exam;

/*
 * for문으로 화면에 ***** 를 찍고 싶을 때
 * ==> * 하나 찍는 코드를 5번 반복해야함
 * sysout은 글자 찍을 때 빼고 사용 x
 */


public class ExamMain0101 {

	public static void main(String[] args) {
		
		//System.out.println("*****"); 이것도 당연 가능하지
       
		for(int i =1 ; i<=5 ; i++) {
			System.out.println("+");

		}
	}

}


//복사하고싶으면 거기에 커서 두고 컨트롤 알트 누른 상태에서 아랫방향키 누르면 복사됨
//여러줄복사시에는 블록 설정하고 똑같이 됨
//지울때는 커서 두고 컨트롤 d 누르면 하나씩 삭제됨

//문장을 다른 곳으로 옮기고 싶으면(ex-포문을 포문 밖으로 위치시키고 싶으면) 알트 누르고 옮기고 싶은 방향으로 방향키 누르면 옮겨짐. 그리고 그때 알아서 정렬됨