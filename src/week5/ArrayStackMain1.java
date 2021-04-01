package week5;

public class ArrayStackMain1 {
	public static void main(String args[]){
		int stackSize = 5;
		char deletedItem;
		ArrayStack1 S = new ArrayStack1(stackSize);

		S.push('A');
		S.printStack( );

		S.push('B');
		S.printStack();

		S.push('C');
		S.printStack( ); 

		deletedItem = S.pop();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		S.printStack();
	}
}

