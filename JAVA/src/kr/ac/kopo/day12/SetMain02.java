package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Set;

public class SetMain02 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		// Set<String> set = new TreeSet<>(); tree는 기준부터 해서 4<5<9 이런식이기 때문에 문자는 오름차순으로
		// 반환되는 것 확인할 수 있음

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
	}
}