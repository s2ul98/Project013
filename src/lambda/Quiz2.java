package lambda;

import javax.swing.table.TableStringConverter;

public class Quiz2 {

	public static void main(String[] args) {
		Hello hello1 = new HelloImpl();
		hello1.helloPrint();
		
		Hello hello2 = new Hello() {
			
			@Override
			public void helloPrint() {
				System.out.println("안녕하세요");
			}
		};
		hello2.helloPrint();
		
		Hello hello3 = () -> System.out.println("안녕하세요");
		hello3.helloPrint();
		
		StringConverter Converter = new StringConverter() {
			public String convert(String str) {
				return str.toLowerCase();
			}



	}
	}
}

}
@FunctionalInterface
interface Hello {
	// 안녕하세요를 출력하는 함수
	void helloPrint();
}
class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요");
		
	}
	
}