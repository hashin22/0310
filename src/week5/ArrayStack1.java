package week5;

interface ArrayStack{
	boolean isEmpty( );
	void push(char item);
	char pop( );
	void delete( );
	char peek( );
}
public class ArrayStack1 implements ArrayStack{

	private int top;
	private int stackSize;
	private char itemArray[];

	public ArrayStack1(int stackSize){
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	public boolean isFull(){
		return (top == this.stackSize-1); //-1인지만 보면 됨.
	}
	public void push(char item){
		if(isFull()){
			System.out.println("Inserting fail! Array Stack is full!!");
		}
		else{
			itemArray[++top] = item; //증가시켜서 넣는다고 top에~~~~~~
			System.out.println("Inserted Item : " + item);
		}
	}
	public char pop(){ //끄집어낼땐 비어있는지안비어있는지부터 봐야됨 확인할 수 있는 pop 인듯?
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
			return 0;
		}
		else{
			return itemArray[top--]; //먼저리턴시키고 top을 감소시킨다구
		}
	}
	public void delete(){ //isEmpty void붙어있으니까 그냥 확인도 못하고 그냥 삭제만 시킨다구~~~~~~~~~~~~top포인트만감소시키면 됨
		if(isEmpty()){
			System.out.println("Deleting fail! Array Stack is empty!!");
		}
		else {
			top--;
		}
	}
	public char peek(){ //peek은 리턴만 시키는거
		if(isEmpty()){
			System.out.println("Peeking fail! Array Stack is empty!!");
			return 0;
		}
		else
			return itemArray[top];
	}
	public void printStack(){ //1차원배열만 출력시키는거~~~~~~~~~~~~~~~~~~~~
		if(isEmpty())
			System.out.printf("Array Stack is empty!! %n %n");
		else{
			System.out.printf("Array Stack>> ");
			for(int i=0; i<=top; i++)
				System.out.printf("%c ", itemArray[i]);
			System.out.println(); System.out.println();
		} 
	}
}


