package util_package;

import java.util.HashSet;
import java.util.Set;

//배열의 단점은 크기가 고정된다는 것이다.
//즉 저장공간이 다 차버렸을 때 새로 배열을 만들고 이동시키지 않는한
//추가 할당이 불가하다.

//-> 자동으로(추가 삭제 검색) 처리해주는 클래스 : 
//Collection 과 Map 이 있다.

//배열기반의 발전형 : Collection - Set   /  List
//Object 배열

//로또추첨통 : 클래스 HashSet 객체를 생성후
//로또 공 : 객체안의 데이터(데이터 순서 존재x  , 중복 데이터 불가)
//뽑힌 공의 나열 : Iterator 인터페이스

public class Util_test {

//Set - 우리가 배울 첫번째 Collection
//중복이 불가하고, 순서가 유지되지 않는 저장소
//HashSet을 통해 특징을 살펴본다.
	
	public static void main(String[] args) {
		//저장소(로또통)만들기
		
		//Set set = new HashSet();		//다향성을 사용하여 호환성을 높히는 방법
		//HashSet set = new HashSet();	//Object 만 보관하는 장소 ex) 물건 저장소
		HashSet<String> set = new HashSet<String>(); //String 계열만 보관하는 장소 ex) 전자제품 저장소 
		//up casting과 down casting이 필요없어진다.
		
		//데이터 추가 - add(값)
		boolean a = set.add("유재석");
		boolean b = set.add(new String("유재석")); //객체명 없이 new만 쓴다는 것은 일회용 객체라는 뜻이다.
		System.out.println("a = " +a);
		System.out.println("b = " +b); // b의 출력은 false다 왜냐하면 값이 같아서 거절되었기 때문이다.
		
		set.add("정형돈");
		set.add("정준하");
		set.add("박명수");
		set.add("하하");
		set.add("광희");
		
		//크기확인
		System.out.println("무한도전 멤버수 : " + set.size()); 
		// 배열은 길이가 정해져있기때문에 
		//데이터 입력여부에 관계없이 확정되어 있다.
		// 하지만 set은 추가될때마다 길이가 들어난다.
		
		//존재 유무 확인
		boolean c = set.contains("광희");
		if(c == true){
			System.out.println("광희는 무도 멤버입니다.");
		}else{
			System.out.println("광희는 무도 멤버가 아닙니다.");
		}
		
		//삭제
		boolean d = set.remove("광희");
		if(d == true){
			System.out.println("광희가 무도에서 탈퇴하였습니다.");
		}else{
			System.out.println("광희는 무도 멤버가 아닙니다.");
			//없어서 지워지지 못한 것.
		}
		
		System.out.println("무한도전 멤버수 : " + set.size()); 

	}
}
