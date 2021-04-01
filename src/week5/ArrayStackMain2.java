package week5;

public class ArrayStackMain2 {
	public static void main(String[] args) {
		ArrayStack2<String> stack = new ArrayStack2<String>();

		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
	}
}
