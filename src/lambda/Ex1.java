package lambda;

public class Ex1 {

	public static void main(String[] args) {

		StringConcat concat2 = (s1, s2) -> System.out.println(s1 + ", " + s2);
		concat2.makeString("Hello", "World");
		
		// 함수형 인터페이스와 람다식 함수를 이용하면, 객체없이 함수를 사용할 수 있다
	}

}


// 함수형 인터페이스 + 람다식 함수

// 1. 함수형 인터페이스
// 함수형 인터페이스는 추상메소드를 하나만 가질 수 있다
interface StringConcat {
	void makeString(String s1, String s2);
}

// StringConcat의 구현체
//class StringConcatImpl implements StringConcat {
//
//	@Override
//	public void makeString(String s1, String s2) {
//		System.out.println(s1 + ", " + s2);
//		
//	} // Impl가 구현체
//	
//}