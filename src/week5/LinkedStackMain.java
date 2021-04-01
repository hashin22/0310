package week5;
public class LinkedStackMain {
	public static void main(String args[]) {
		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		LS.printStack(); //empty
		LS.push('a');
		
		LS.push('b');
		LS.printStack();
		
		deletedItem = LS.pop();
		LS.printStack();
	}
}