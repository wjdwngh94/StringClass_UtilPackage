package string_test;

//문자열 클래스
//문자열 - 글꼴
//케릭터가 모이면 스티링(문장)

public class StringClass {
	public static void main(String[] args) {
		//객체 생성
		//String str1= "Hello Java!"; //문자열 상수
		String str1= new String("Hello Java!");//힙저장
		byte[] by = new byte[]{'H','e','L','L','o',' ','J','a','v','a','!'};
		//[]안에 숫자 x
		
		String str2= new String(by);
		
		//비교
		System.out.println(str1==str2); //같은 객체인지를 물어보는 것
		System.out.println(str1.equals(str2));//값이 같은지를 물어보는 것
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.compareTo(str2));
		//문장에 작성된 아스키코드 값들의 합
		//str2-str1
		//즉 마이너스 값이 나오면 앞에것이 큰것
		//문장정렬 때 사용한다
		
		System.out.println(str1.compareToIgnoreCase(str2));
		

		//검사
		//시작, 종료, 포함
		//안녕 친구들?
		//    /w 귓속말 기호
		
		String str3="/w 아이디 할말";
		String str4="email@naver.com@@";
		//0번째 캐릭터, 1번째 캐릭터 ..... n-1번째 캐릭터 -> 문자열string
		System.out.println(str3.startsWith("/w"));//처음단어가 () 안의 것으로 시작하는 가
		System.out.println(str4.endsWith(".com"));//끝단어
		
		System.out.println(str4.indexOf("@"));//포함하는지 - 출력값 : 몇번 째에 있는지
		System.out.println(str4.indexOf("@@"));
		System.out.println(str4.lastIndexOf("@@")); //뒤에서부터 검사
		
		//대소문자 변환
		String str5 = "java programming...!";
		System.out.println(str5.toUpperCase()); //대문자로 만드는 것
		System.out.println(str5.toLowerCase());//소문자로 만드는 것
		
		//문장 편집
		
		//불필요한 공백들을 없애주는 - trim() 가위질 하다
		String str6 = "                      www.naver.com          "; //앞뒤 불필요한 공백 존재
		
		System.out.println(str6.length());//길이검사
		System.out.println(str6.trim());//공백제거
		System.out.println(str6.trim().length());//공백제거의 길이
		System.out.println(str6);
		
		//잘라내기 - 자리수 기준으로 잘라내기 수행
		System.out.println(str1.substring(6)); // 6~
		System.out.println(str1.substring(6,10)); // 6~9까지   10:나오면 안되는 종료자리
	
		//분해 - 내가 지정한 기호(구별자)를 기준으로 문장분해
		String str7 = "이름//나이//성별//주소//취미//특기"; //요구: // 기준으로 문장분해하겠다.
		String[] arr = str7.split("//"); //배열에는 길이가 자동으로 들어간다.
		System.out.println(arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\n===================================");
		//확장 for문   for(자료형 변수명 : 저장소){  반복 내용 }
		
		for(String tmp : arr){ // String 의 배열을 가져오기 때문에 string tmp
			//int형이라면 int tmp
			//위의 방법보다 이게 더 빠르다
			System.out.print(tmp+"  ");
		}
		
		System.out.println("\n");
		//숫자 -> 문장
		// int -> String
		String imsi1 = ""+100; //문장으로 바뀐다
		String imsi2 = String.valueOf(100);
		
		System.out.println(imsi1+1);
		System.out.println(imsi2+2);
		
		//문장 -> 숫자
		int su = Integer.parseInt(imsi1);
		System.out.println(su+1);
		
		//프로그램 종료
		System.exit(0); //정상종료
		System.exit(-1); //비정상종료( 0 이아닌 )
								//비정상 프로그램 종료후 다음에 다시 실행할 때
								//값이 보내진다.
		
		//추천 되지 않는 메소드 사용
		System.runFinalizersOnExit(true);
	}
}
