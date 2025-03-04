package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {
	
		String[] arr = {"aaa","aaa","b","b","ccccc"};
		
		
		// 1.
		Stream<String> stream1 = Arrays.stream(arr);
		long count = stream1.filter(s -> s.length() > 2).count();
		System.out.println(count);
		
		// 2.
		Stream<String> stream2 = Arrays.stream(arr);
		// mapToInt : 문자열(String) -> 문자열의 길이(int)
		// 기본형 스트림 -> 정수형 스트림
		IntStream intStream = stream2.mapToInt(s -> s.length());
		int sum = intStream.sum();
		System.out.println(sum); 
		
		// 3.
		Stream<String> stream3 = Arrays.stream(arr);
		IntStream intStream2 = stream3.mapToInt(s->s.length());
		// "aaa", "aaa", "b", "b", "ccccc" -> 3 3 1 1 5
		
		// Optional~ : 값을 담고 있는 객체
		// 값이 있는지 확인하는 함수, 값을 꺼내는 함수를 가지고 있음
		OptionalInt min = intStream2.min(); // min은 정수형 스트림만 가지고 있음
		System.out.println(min.getAsInt());
		
		// 4.
		Stream<String> stream4 = Arrays.stream(arr);
		List<String> list = stream4
									.distinct() // 중복 제거
									.collect(Collectors.toList()); // 다른 자료~
		System.out.println(list);
	}

}
