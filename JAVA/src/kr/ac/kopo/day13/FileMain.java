package kr.ac.kopo.day13;

import java.io.File;


public class FileMain {

	public static void main(String[] args) {


/*
		//File(String pathname) ~파일에 있는 ~정보를 갖고 싶어
		File fileObj = new File("iotest/a.txt");  //io파일 밑에 a (별다른 말 없으면 java가 저장된 파일)

		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		System.out.println("파일명 : " + fileName);
		System.out.println("부모 : " +  parent); //파일명을 분리시킴
		
		//근데 파일이 있는지 없는지는 모름
		System.out.println("파일 존재여부 : " + fileObj.exists());//그걸 알 수 있는게 이 메소드. 파일이 있으면 t 없으면 f
		

		long fileSize = fileObj.length();//파일 크기 알고 싶을 때
		System.out.println("파일 크기 : " + fileSize + "byte(s)");
		
		System.out.println(fileObj.canRead() ? "읽기 가능" : "읽기 불가능"); //읽을 수 있니?
		System.out.println(fileObj.canWrite() ? "쓰기 가능" : "쓰기불가능");
		//a.txt 속성 가서 read-only (읽기전용) 설정하면 쓰기 false 로 씀
		
		
	//	long lastTime = fileObj.lastModified();
	//	String pattern = "yyyy-MM-dd HH:mm:ss";
	//	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		
		long lastTime = fileObj.lastModified(); 	//마지막으로 수정한 날짜가 언제인지 알 수 있는 메소드. 리턴타입은 long (밀리세컨으로)
		String pattern = "yyyy-MM-dd HH:mm:ss"; //몇년몇월몇일로 뽑는게 좋겠지 -> 그러니까 simpledateformat사용으로 뽑아냄 (년 월 일 시 분 초) 
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); //simpledateformat에 저 포맷만 넣어주면 되겠지
		System.out.println("마지막 수정시간 : " 
					+ sdf.format(new Date(lastTime))); //롱횽 넣어주면 ㅡ 롱형에 맟줘서 나오니까
	
*/	
		
		
//----------------------------------------------------------------------------------------
		
/*		
		File dirObj = new File("iotest/오리/청둥오리"); //새로고침(f5)하면 오리 밑에 청둥오리가 만들어져있음.
		
	//	File dirObj = new File("iotest/강아지/리트리버");
		//강아지 밑에 리트리버 만들고 싶으면, 리트리버라는 폴더를 만드는게 목적 (맨 마지막에 있는 폴더를 만드는게 목적)
		//그러려면 iotest 밑에 강아지 폴더가 있어야 함. (그 상위 폴더는 다 있어야 만들어진다는 말)
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("디렉토리여부 : " + dirObj.isDirectory());
		System.out.println("파일여부 : " + dirObj.isFile());
		//파일여부를 알기 위해서 이즈파일(파일)/ 이즈디렉토리(존재하는데 파일은 아니고 디렉토리)
		//디렉토리인지 파일인지 알 수 있느 ㄴ것 (디렉ㅌ리는 파일을 의미)
		
		//f면(디렉토리 오브젝트에 존재하지 않으면) 디렉토리만들겠다고
		if(!dirObj.exists()) {
			dirObj.mkdir();
			//dirObj.mkdirs(); //mkdirs(): s 붙이면 위에서 상위폴더 없어서 안만들어질 때 그 상위폴더까지 다 만들어주는 메소드
		}
		
		
	*/	
		
		
//--------------------------------------------------------------------------------
		
		//그 디렉토리가 가지고 있는 파일 목록이 궁금
		
		
/*	방법1	
		
		File dirObj = new File("iotest");
		if(dirObj.exists()) {
			String[] list = dirObj.list();
			for(String data : list) {
				System.out.println(data);
				File fileObj = new File(dirObj.getName() + "/" + data);
				System.out.println(fileObj.isDirectory() 
						? "디렉토리" : "파일"); //넌 디렉토리니 파일이니
*/			
				
				

	//방법2 (위에거 귀찮으니까 메소드 사용)
				//listFiles() 메소드 : list()는 이름만 갖고오는건데 listFiles()는 파일객체 형태로 가져오는 것
				File dirObj = new File("iotest");
				if(dirObj.exists()) {
					
					File[] list = dirObj.listFiles();
					for(File f : list) {  //getName() 찍어주고 f의 isDirectory()가 t면 디렉토리 f면 파일이겠지
						System.out.println(f.getName());
						System.out.println(f.isDirectory() ? "디렉토리" : "파일");
					}
				
				
				
			}
		}
		
		
		
		
		
	}


