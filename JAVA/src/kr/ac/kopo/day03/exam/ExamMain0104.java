package kr.ac.kopo.day03.exam;

//이중포문(이중로프)사용
public class ExamMain0104 {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=3; i++) { //줄바꿈 3번 반복 --> i를 초기화 중 1로 초기화 -> 이게 트루면
			                       //i가 1로 초기화는 1번 수행됨
		 	
			for(int j=1; j<=5 ; j++) {   // 그 안에서 가로로 * 5개 반복인거 포문 생성. 위에서 이미 i를 썼으니까 이제 못 씀. 다른 변수 생성 ---> 내려가서 포문 시행. 여기서도 j초기화
				                         //이 초기화는 총 3번 일어남
				
				System.out.print("*"); // =이중포문 --> 얘는 15번 수행됨
				  
			}
			System.out.println(); //엔터 - 얘때매 줄바꿈으로 나옴/ j가 5를 넘으면 거짓이니까 포문 밖인 일로 나오게 되는거지 -> j는 6까지감. 조건 만족 안해서 빠져나오는 것. 찍히지 않을 뿐
                                  //이 문장은 총 3번 수행되는 것
			
		}
		}



	}


