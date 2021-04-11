package week6;

public class PostfixTest {

	public static void main(String[] args) {
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";
		System.out.printf("\n후위표기식: %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\연산결과 = %d\n", result);
	}
}