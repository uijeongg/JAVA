package kr.ac.kopo.day06.homework;

import java.util.Scanner;

class Icecream {
	String name;
	int price;
}

public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림 몇개 구입할겁니까? => ");
		int count = sc.nextInt();
		sc.nextLine();

		Icecream[] iceArr = new Icecream[count];
		// 아이스크림으로 카운트 개수만큼 있으면 되겠지 아이스크림의 참조변수를 여러개 저장해줄 수 있는 배열을 만들어 준 것. 
		//이건 참조변수지 눈에 보이는 배열인건 x

		// iceArr[0] = new Icecream(); //어레이의 0번지가 새로운 값을 가져야 하고 각각의 인덱스가 다 그래야함 -> 밑에
		// 코드로
		// iceArr[i] = new Icecream(); // 배열 뒤에 괄호가 붙으면 실제 내 눈 앞에 아이스크림 배열 하나가 만들어 지는 것.
		// 위에서 만든건 그냥 참조변수이고 진짜 배열은 이거라고

		for (int i = 0; i < count; i++) {
			iceArr[i] = new Icecream();
			System.out.println("***" + (i + 1) + "번째 아이스크림 구매 정보 입력 ***");
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine(); // name이 null값이라서 에러뜸

			System.out.print("아이스크림 가격 :");
			// iceArr[i].price=sc.nextInt(); 앞에서 넥스트라인으로 버퍼 비워줘서 여기서 넥스트인트하면 영향받으니까 그냥 인티저파스
			// 쓰면 에러 x
			iceArr[i].price = Integer.parseInt(sc.nextLine());

		}

		System.out.println("=======for문=======");

		System.out.println("< " + iceArr.length + "개 아이스크림 구매정보 출력");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		int no = 1;
		for (Icecream ice : iceArr) {
			System.out.println(no++ + "\t" + ice.name + "\t" + ice.price);
		}

	}

}

//<입력버퍼>
//입력 전에 아이스크림 배열이 먼저 만들어지고 그 후에 값 입력받고 이런 식

//매번 키보드입력 키보드입력 키보드입력을 받으면 너무 비효율적임. 
//한번 입력 받을 때 필요한거 다 우루루루루 한꺼번에 받아놓고 지금 쓸 것만 쓰고 나중에 쓸건 저장소(램)에 저장해놓고 쓰는 것 -> "입력버퍼"
//입력버퍼를 사용하는 이유: 성능향상
//키보드 한번 입력 받을 때, 엔터가 나올때까지 입력받겠다 그래서 입력받은 모든 값들을 저장해 둘거야

//물통에서 쌀을 매번 뜨는게 아니라 바가지를 준비해서, 바가지에 몇번씩 떠놓고 한꺼번에 쌀을 옮김. 이 바가지가 입력버퍼

//입력버퍼에서 정수를 입력하면 사실은 45\n 인거라서 정수-45 문자-\n인 것. 그래서 그 다음에 문자를 입력하면 \n이게 쳐지는거지만
//그 다음에 또 정수를 입력할라면 \n인 문자는 무시하고 그 다음 나오는 정수부터 인식을 함.
//그러니까 포인트는 또 다시 정수를 입력할 때 버퍼가 비어있는게 아니라 최소 \n인 문자가 남아있다는 것!!

