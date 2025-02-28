package lambda;

public class Quiz1 {

	public static void main(String[] args) {
		
		MyNumber number1 = new MyNumberImpl();
		System.out.println(number1.max(10, 20));
		
		MyNumber number2 = new MyNumber() {
			
			@Override
			public int max(int x, int y) {
				return x > y ? x : y;
			}
		};
		System.out.println(number2.max(10, 20));
		
		MyNumber number3 = (x, y) -> x > y ? x : y;
		System.out.println(number3.max(10, 20));
		
		// 람다식
	//	MyNumber number2 = (x, y) -> {
			
	//	}
		
	}

}
@FunctionalInterface
interface MyNumber {
	int max(int x, int y);
}
class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		return x > y ? x : y;
	}
}