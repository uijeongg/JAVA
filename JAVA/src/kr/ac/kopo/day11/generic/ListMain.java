package kr.ac.kopo.day11.generic;
import java.util.ArrayList;
import java.util.List;

/*
 	List : 순서 O, 중복 O
 	 - ArrayList
 	 - LinkedList
 	 
 	 add()
 	 get()
 	 size()
 	 remove()
 	 isEmpty()
 	 contains()
 	 clear()
 */

//

public class ListMain {

	public static void main(String[] args) {

		//기본자료형 형태는 안돼!
		//List<int> list = new ArrayList<int>(); 기본자료형 형태는 안돼! 이거 int라서 에러
//		List<Integer> list = new ArrayList<Integer>(); //정수의 배열을 만들고 싶은데 기본자료형 8가지는 안되니까 그걸 참조자료형으로 만들어 놓은걸 써야함
		//그때 Integer가 int를 참조자료형화 해서 저장하는 애임
		
		List<String> list = new ArrayList<String>();
	//	List<String> list = new ArrayList<>(); //<String> 안해줘도 알아서 앎. 
		
	//	List<String> list = new LinkedList<>(); LinkedList로 해줘도 이 밑에 있는 모든 코드들 문제 없음
	    //LinkedList로 바꿔주고 싶으면 객체만 교체해주면 됨. 명령은 바뀌지 않고 호환 가능. 그냥 오버라이딩 됨
		
		list.add("one"); //리스트의 애들로 문자열로 저장됨
		list.add("two");
		list.add("three");
		list.add("four");
		
		list.add("one");  //리스트는 중복을 허용해서 오류 안 남. 
		
		
		//전체 원소의 개수는 리스트의 사이즈로 확인 가능
		System.out.println("전체 원소의 개수 : " + list.size() + "개");		
		
		System.out.println("< PRINT >");
		//add메소드는 별다른 말 없으면 0번지부터 123~ 순으로 차곡차곡 가면서 add함 (add된 순서대로 출력)
		//0부터 몇번지까지 데이터가 있더라!
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i)); //get메소드를 통해 i번째에 위치한 값을 알려줘!
			
			//리스트는 전체가 다 같은 타입이므로 1.5버전의 for문으로도 전체 데이터 출력 가능		
	    }

		
		//one 삭제해볼게
		//one이라는 문자를 삭제해줘! 삭제했는지 안했는지 불린으로 리턴
		System.out.println("\"one\" 삭제 : "
				+ (list.remove("one") ? "성공" : "실패"));  //있으니까 성공했으니까 삭제 없으면 실패
		System.out.println("\"one\" 삭제 : "
				+ (list.remove("one") ? "성공" : "실패")); 	//하ㄴ번 더 삭제하면 맨 긑에 애가 삭제됨
		System.out.println("\"one\" 삭제 : "
				+ (list.remove("one") ? "성공" : "실패"));//한번 더 ㅅㄱ제하면 실패
	 
		
		
		
		
		System.out.println("<1.5버전>");
		for(String str : list) { //배열과 방식 똑같음
			System.out.println(str);
		}
		
		
		//0번지에 위치한 문자열 삭제
		System.out.println("0번지 문자열 : " + list.get(0));
		System.out.println("0번지 위치한 문자열 삭제 : " + list.remove(0));
		System.out.println("0번지 문자열 : " + list.get(0));
		
		//나중에 플젝하면 데이터를 모아두는 공간이 필요함. 컴을 꺼도 살아있는 공간 말야~~ 
		//담시간에 배울건데 여기 다 고정된 길이가 아닌 가변길이로 저장되어야 좋은데 그게 리스트니까 앵간하면 리스트가 저장하기에 좋음
		
		
		
		
		
	}

}
