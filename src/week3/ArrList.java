package week3;
import java.util.NoSuchElementException;

public class ArrList <E>{

	private E a[]; // 리스트의 항목들을 저장할 배열
	private int size;  // 리스트의 항목 수

	public ArrList() { // 생성자
		a = (E[]) new Object[1]; // 최초로 1개의 원소를 가진 배열 생성
		size = 0; // 항목 수를 0으로 초기화
	}

	public boolean isEmpty() {
		return size == 0; // 리스트가 empty이면 true 리턴
	}

	public void resize(int newSize) { // 배열 크기 조절
		Object[] t = new Object[newSize]; // newSize 크기의 새로운 배열 t 생성
		for(int i = 0; i < size; i++) { 
			t[i] = a[i]; //a에 있는걸 t에 다 갖다부어         // 배열 s를 배열 t로 복사 
		}
		a = (E[]) t; // 배열 t를 배열 s로 
	}

	public void insertLast(E newItem) { 
		if(size == a.length) {  // 배열에 빈 공간이 없으면
			resize(2*a.length); // 배열 크기 2배로 확장
		}
		a[size++] = newItem; //새로운거에 증가시킨걸 넣기
	}
}