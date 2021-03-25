package week4;

public class linkedListTest {
	public static void main(String args[]) {
		LinkedList L = new LinkedList();
		System.out.println("1. 공백 리스트에 노드 3개 삽입하기");
		L.insertLastNode("포도");
		L.insertLastNode("당근");
		L.insertLastNode("토마토");
		L.printList();
		System.out.println("2. 당근 노드 뒤에 핫도그 노드 삽입하기");
		ListNode pre = L.searchNode("당근");
		if(pre == null) {
			System.out.println("검색실패 >> 찾는 데이터가 없습니다.");
		}
		else {
			L.insertMiddleNode(pre, "핫도그");
			L.printList();
		}
		System.out.println("3. 리스트의 노드를 역순으로 바꾸기");
		L.reverseList();
		L.printList();
		System.out.println("4. 리스트의 마지막 노드 삭제하기");
		L.deleteLastNode();
		L.printList();
	}
}