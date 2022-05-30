package Quest0311;

/*
3. 다음의 설명을 보고 코드를 작성하세요.
달팽이가 100M 깊이의 우물을 빠졌습니다
달팽이는 1시간에 5M속도로 움직입니다
올라온 높이가 50M미만일땐 1시간에 1M씩 미끌어지고
50M이상일때 1시간에 2M씩 미끌어집니다
달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요.

< 출력결과 >
[1시간후] 달팽이가 올라간 총 높이 : 4M
[2시간후] 달팽이가 올라간 총 높이 : 8M
...
[XX시간후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M
*/

public class QuestNum03 {
	public static void main(String[] args) {
		
	/*방법1
	  	int snail = 0;
		int hour = 0;

		while(snail < 100) { //탈출할때까지 반복하고 싶음
			
			snail +=5 ;//달팽이가 한시간에 5미터씩 올라가는데
			snail += snail < 50 ? -1 : -2 ; //50미터 미만일댄 -1씩 / -2씩 미끄러진다
			System.out.println("[" + ++hour + "시간 후] 달팽이ㅏ 올라간 총 높이 :" + snail + "M"); //이때 "달팽이가 올라간 총 높이는"
			*/
		
	
	    //근데 위에건 해석이 좀 잘못됨. 올라갔을 때 탈출을 먼저 했느냐를 물어봐야지 
		//방법2
		int snail = 0;
		int hour = 0;

		while((snail+= 5) < 100) { //탈출할때까지 반복하고 싶음
			
			snail += snail < 50 ? -1 : -2 ; //50미터 미만일댄 -1씩 / -2씩 미끄러진다
			System.out.println("[" + ++hour + "시간 후] 달팽이 올라간 총 높이 :" + snail + "M"); //이때 "달팽이가 올라간 총 높이는"
			
		} System.out.println("[" + ++hour + "시간 후] 달팽이 올라간 총 높이 :" + snail + "M");
	
	}
		
	}



/* 방법3
  while(snail < 100) { //탈출할때까지 반복하고 싶음
			
			snail += (snail < 50 ? 5-1 : 5-2) ;//달팽이가 한시간에 5미터씩 올라가는데
			System.out.println("[" + ++hour + "시간 후] 달팽이ㅏ 올라간 총 높이 :" + snail + "M");
  
  
 */












