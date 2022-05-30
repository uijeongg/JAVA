package kr.ac.kopo.day12;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapMain01 {

	public static void main(String[] args) {
		//아이디 패스워드 만들고 패스워드 변경서비스 
		
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>(); 
		map.put("aaa", "1111");  //새로운 데이터 추가할 때 풋메소드
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");

		
		
		System.out.println("< 패스워드 변경 시스템 >");
		System.out.println("아이디 입력 : ");
		String id = sc.nextLine();
		//현재 아이디가 키값이니까 아이디를 찾으려면 컨테인즈 키 메소드
		if(map.containsKey(id)==false) { //아이디 없냐? == if(!map.containsKey(id))
		
			System.out.println("입력하신 ["+id+"]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다"); //종료할땐 exit 또는 메인이니까 return
			return; //abc입력하면 없다뜨고 aaa뜨면 뭐 뜸
		
		}
	
		
//-------------------------------------------------------------------------------------
		
		
	//id가 있으면 (위의 if문을 불만족하면) 이 곳(if를 나왔는데)인데 else 안써도 됨. 자동으로 걍 여기로 인식됨
		System.out.println("기존의 패스워드 입력 : ");
		String password = sc.nextLine();
		if(!map.get(id).equals(password)) { //키의 밸류값 뽑아주는게 겟 (키를 주면 밸류로 알려주는)
			//문자열 - 문자열 비교니까 동등비교 안됨. 같으면 트루 다르면(not붙이면) 폴스
			System.out.println("패스워드가 일치하지 않습니다");
			System.out.println("서비스를 종료합니다");
			return;
		}
	
		
//--------------------------------------------------------------------------------------
		
		
	//if를 만족하지않고 여기로 내려왔다는건 그 다음 루틴 하면 되지. 변경할 패스워드를 입력하라고 말해주면 되지
		System.out.println("변경할 패스워드 입력 : ");
		String newPassword = sc.nextLine();
		//중복된거 있으면 나중에 들어온걸로 덮어진다 했잖아
		map.put(id, newPassword);
		System.out.println("패스워드 변경이 완료되었습니다");
		
		
		
		System.out.println("< 회원정보 출력 >");
		System.out.println("----------------------");
		System.out.println("아이디\t패스워드 ");
		System.out.println("----------------------");
		//1.5버전 포문 이런거 안먹힘
		//그래서 루프랑 겟도 못 씀
		//그럼 map에선 어떻게 전체 데이터를 출력할 수 있을까?
		
		
//접근법 1
		
		//맴에 잇는ㄷ ㅔ이ㅓ를 셋형으로 바꿔서 저장하는 방법사용
	//	Set<> set = map.entrySet(); //맵의 정보를 셋형 객체로 바꿔주는 메소드. 얘의 리턴타입은 셋이겟지 근데 아님. 엔트리임
		//이유는?
		
		//지금 우리는 키랑 배류 의 싸잉라서 타입을 두개 써야하는데 제네릭은 한개니까 애매하잖아
		//키값도 알고 밸류값도 알아야하는데
		
		
		
		
		//키랑 밸류를 다 가진건 내부클래스인 엔트리야
		//엔트리를 셋형으로 만듥ㅅ다고
		//전체가 아니라 엔트리가 가진 키랑 벨류만 세트로 뽑아달라는 메소드야 
	  	//키의 제네릭 밸류의제네릭


/*      Set<Entry<String, String>> set = map.entrySet(); // 그래서 얘가 앤트리형임!
		for (Entry<String, String> e : set) { //set에 있는 원소가 엔트리형이니까
			System.out.println(e.getKey() + "\t" + e.getValue()); //키 밸류를 가진 애가 엔트리니까 겟 키 겟 밸류
		}	
*/
		



//접근법 2
		//맵에 있는 키만 모아서 셋으로 만드는 키워들 map.keySet();
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "\t" + map.get(key)); 
		
		}

		
		System.out.println("----------------------");
	}	
}

