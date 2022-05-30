package kr.ac.kopo.day06;

//같은 패키지 내에서 같은 클래스 이름으로 클래스 만들면 에러
//day06에 02에 메소드 클래스 만들어서 여기서 x -> 한 패키지 안에 동명의 클래스x




/*

class ExamMethod {

	//호출자가 피호출자에게 숫자 두개를 ㅓㄴㅁ겨주면 그 두개 숫자를 알려주는 겟섬메소드 만들게
	int getSum(int a, int b) { //겟썸 메소드 만들었다 그리고 숫자 두개를 넘겨줘야지
		 return a+b; //그럼 리턴타입은 a+b가 되겟지
		 
		 //겟섬메소드를 통해서 10과 20의 합을 알고 싶어! 그럼 제일먼저 인스턴스객체 만들러가야지 내려가!
		 
			 }
		 
	
	
	
	 int getTotal(int a, int b) {
		 int s = a;
		 while(a<=b) {
			 s += a++;


	 }
}
public class MethodMain03 { //일단 오류나서 주석처리 함

	public static void main(String[] args) {
		
		ExamMethod exam = new ExamMethod(); 
		int sum = exam.getSum(10,20);
		System.out.println("10 + 20 = " + sum);
		
		
		int total = exam.getTotal(1,10);
		System.out.println(exam.getTotal(1,10)); //얘가 sum 값을 가지고 있으니까 그냥 위처럼 토탈변수 안써주고 프린트 시켜줘도 되지

		System.out.println("1~10 총합 : " + exam.getTotal(1,10));
	}

}

	
	

*/