package kr.ac.kopo.day02;

public class OperationMain01 {
	public static void Main(String[] args) {
		
		int a = 1, b = 0;
		
		boolean bool = (++a > 1) || (++b > 1) ; //a=2 b=1이 나올것 근데 돌려보면 true, a=2 b=0임
		/* 
		 * ++a>1 은 참
		 * 논리or는 둘중하나만 참이어도 참 -> 그럼 뒤에꺼에 따라서 달라지지 않아. 앞에것만 알면 됨. 그러니까 뒤에건 시간낭비로 아예 보지도 않아 
		 * 그러니까 ++b의 관계연산은 시행하지 않음
		 */
		System.out.println("bool : " + bool);
		System.out.println("a : " + a + " , b : " + b );
		
		//boolean bool = --a > 1 && ++b > 1 || ++c > 0; //a=0 b=0or1 c=0 
		/* --a=0 0이 1보다 큰가요? 거짓. 그럼 뒤에거 안보지. 이 전체가 걍 거짓이겠네 하는 것
		 * 거짓은 둘중에 하나가 참이면 참. 그러니까 뒤에건 봐야지 ++b=2로 참이니까 -> 그럼 abc모두 0
		 */
		//System.out.println("bool : " + bool);
		//System.out.println("a : " + a + " , b : " + b + ", c : " + c ); 
		
		
	}

}
