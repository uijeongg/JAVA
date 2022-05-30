package kr.ac.kopo.day055;

public class ArrayMain0601 {

	public static void main(String[] args) {

		//★page 필기한 코드 돌려보기
		
		int[][] arr= new int[3][4]; //1차원배열이 3개있고 각각은 int가 4개씩 들어있는 형태
		
/*		for(int i=0; i<arr[0].length; i++) {//1차원배열 3개 중 첫번째 배열에 접근
			arr[0][i]=(i+1)*10; //int 4개 각각에 10 20 30 40 대입
			System.out.print(arr[0][i]);
		} System.out.println();

	*/	
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"/t");
			}System.out.println();
		} 
	}

}
