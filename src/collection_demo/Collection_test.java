package collection_demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * 1~45사이의 숫자를 7개 뽑ㅇ라 HashSet에 저장하세요
 * 만약 똑같은 숫자가 2번 뽑혔다면 다시 뽑도록 처리하세요
 * 저장을 마치신 뒤에 모든 숫자를 화면에 출력하시면 됩니다.
 * */
public class Collection_test {
	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>();

		for (int i = 0; i < 7; i++) { // 7번 반복
			int su = (int) (Math.random() * 45) + 1;
			boolean result = hashSet.add(su);
			if (!result) {
				// result == false
				System.out.println("중복");
				i--;
			}
		}
		/*
		 * while(hashSet.size()!=7){ int su = (int)(Math.random()*45)+1; boolean
		 * result = hashSet.add(su); if(!result){ System.out.println("중복 !"); }
		 * }
		 */
		/*
		 * while(hashSet.size()!=7){
		 * 
		 * boolean result = hashSet.add(( (int) Math.random()*45)+1);
		 * if(!result){ System.out.println("중복 !"); }
		 * 
		 * }
		 */
		
		Iterator<Integer> its = hashSet.iterator();
		while (its.hasNext()) {
			int name = its.next();
			System.out.print(name + "\t");
		}

		// set 중에 정렬이 가능한 저장소가 있는데
		// 이름하여 TreeSet이다.
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();

		tSet.addAll(hashSet);

		// 정렬이 2가지로 나뉜다.
		Iterator<Integer> iter;

		System.out.println();
		System.out.println("=====================================");
		
		iter = tSet.iterator();
		while (iter.hasNext()) {
			int su = iter.next();
			iter = tSet.descendingIterator();

		}
		System.out.println();
		System.out.println();

		iter = tSet.descendingIterator();
		while (iter.hasNext()) {
			int su = iter.next();
			System.out.println(su+"\t");
		}
	}
}
