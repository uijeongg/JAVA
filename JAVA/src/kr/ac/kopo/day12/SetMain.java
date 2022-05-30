package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set : 순서x 중복x
 *HashSet
 *TreeSet
 *메소드는 list에서 인덱스 관련 빼고 다 사용 가능
 *
 *set도 무조건 제네릭 사용하면 된다! list 처럼
 */

public class SetMain {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		System.out.println("\"one\"입력성공여부 : " + set.add("one")); // one을 넣었을 때 성공을 했는지 안했는지 알고 싶은것 (여기서)
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one"); // 중복허용이 안되니 그냥 개수 찍으면 5개가 뜸
		System.out.println("\"one\"입력성공여부 : " + set.add("one")); // one을 넣었을 때 성공을 했는지 안했는지 알고 싶은것(또 여기서는 어떤지)
		// 여기는 실패! 중복 안되니까 실패임

		System.out.println("전체 원소의 개수 : " + set.size() + "개");

		
//-----------------------------------------------------------------------------------------------------		

		
		/*
		 * set에서 전체 데이터 접근 방법 3가지 (인덱스를 이용해서가 안되니까) 
		 * 1. 1.5버전의 for문 이용 
		 * 2. toArray() 메소드
		 * 이용 3. Iterator 객체 이용
		 */

		// 1. 1.5버전의 for문 이용
		System.out.println("< 1.5 for문 이용한 출력");
		System.out.println();
		for (String str : set) { // set에 있는 데이터는 다 string형 (여기서)
			System.out.println(str); // 그런데 찍어보면 원투쓰리포파이브 순으로 안나옴. 그렇게 찍었다고 해서 그렇게 출력되는건 아님. 컴퓨터가 그 순서를 몰라
		}

		
		// 2. toArray() 메소드 이용
		System.out.println("< toArray() 이용한 출력 >");
		/*
		 * set에 있는 원소들을 배열에다가 넣어주는 것 (배열로 변환) //set은 그대로 있고 따로 만들어주는 것 //오브젝트 배열로 만들어짐
		 * (배열은 제네릭이 아니라서 자연스럽게 스트링배열 이렇게 안 바뀌어서 그냥 오브젝트 배열임) 묵시적 형변환을 해야하니까 오브젝트 배열을
		 * 해야지
		 */
		Object[] arr = set.toArray(); // 그래서 오브젝트 배열로 받아와야함

		// 인덱스 이용해서 배열 만드는걸로 만들어볼게 (배열 만드는 세가지 방법으로 다 만들어도 됨)
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString()); // arr[i]의 타입이 오브젝트형

			//몬말임????????????????????????? 질문하기???????????!!!!
			// 문자열의 길이를 출력하고 싶을 때, object형이니까 arr[5].length() 불가
			// 내부적으로 투스트링을 호출해서
			// 원랜 다 스트링형으로 배열을 만든건데, 그럼 이 오브젝트(부모)의 요소들이 다 스트링을 가르키고 있는거면 이건 묵시적형변환이지
			// 부모-> 자식 가르키고 잇는건데 그래도 부모는 부모만 접근가능
			// 스트링이 따로 정의해놓은 메소드지 부모(오브젝트)는 아니라서, 명시적 형변환 해줘야함
			// 명시적 형변환을 해서 각각의 길이를 알아내야 하지

		}

		
	   //3.  Iterator 객체 이용 (데이터 맨첨~끝까지 접근하는게 목적인거 잊지마)
		System.out.println("<  Iterator 객체 이용한 출력 >");
		Iterator<String> ite = set.iterator();
		// Iterator메소드 사용
		//이 메소드는  Iterator set에 있는 string의 원소들에 접근
		//그래서  Iterator에도 제네릭이 들어감?
		
		
		/*
		 * Iterator(순환객체) 주요메소드
		 *    - hasNext() : 데이터 존재여부판단
		 *                => 전체 데이터에 다 접근하는게 목적, 그런데 몇개 있을지 모르지 내가 끝인지 아닌지 모르지
		 *                => 내 뒤에(현재 이터레이터 위치 기준으로) 데이터가 있니 있니 물어봐야함
		 *                => 그걸 무라보는게 헤즈넥스트. 있으면 트루 없으면 폴스 (폴스면 끝이란 뜻)
		 *    - next()	  : 데이터 접근
		 *                => 있으면 그 뒤에 접근해야지. 그 때 쓰는게 넥스트 메소드 -> 얘가 실제로 데이터에 접근하는 메소드
		 */

		
		while(ite.hasNext()) {
			System.out.println(ite.next()); //hasNext()가 뒤에 있다고 true라고 하면 그 객체에서 이동이 아니라
			//ite(차고지)에서 다음걸로 감. 그래서 "next메소드를 통해서 접근하겠다" ite.next() 
			//**넥스트를 한번 해야 접근할 수 있다 (그림 확인)
		
		
	}
}
}