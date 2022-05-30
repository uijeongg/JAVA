package kr.ac.kopo.day055;

public class ArrayMain08 {

	public static void main(String[] args) {


		String[] strArr=new String[3];
		
		strArr[0] = "hello";
		strArr[1] = new String("good"); //같은방법
		strArr[2] = "bye";
		
		for(String str: strArr) {
			System.out.println(str); // //////////////////////그림으로 이해
		}

	}

}
