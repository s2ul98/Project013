package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		
		// asList : 리스트를 생성하고 목록을 초기화하는 함수
		List<Integer> list = Arrays.asList(5,1,2,4,3,3);
		System.out.println(list);
		
		// list -> stream
		Stream<Integer> stream = list.stream();
		
		// 중간연산 : 0~n번
		// 최종연산 : 1번
		// forEach : 최종연산자 / 스트림의 요소를 하나씩 꺼내서 반복적인 작업을 수행
//		stream.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
				
				
		// 함수형 인터페이스를 람다식으로 수정
				stream.forEach(t -> System.out.println(t));
				// count : 최종연산자. 요소의 개수를 반환하는 함수
			//	long count = stream.count();
				// 이 공식은 출력하면 아래 에러코드가 나오는데 스트림은 최종연산을 실행하면 닫힌다 
				// 1. 한번 사용한 스크림을 재사용 할 수 없다 stream.forEach(t -> System.out.println(t));여기서 끝남
			}
//		});

	}

//}
