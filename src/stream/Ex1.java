package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {
		
		// 리스트 -> 스트림
		
		// asList: 리스트를 생성하고 목록을 바로 초기화 하는 함수
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream = list.stream(); //<>안에 위에 Integer와 동일하게 입력
		
		// 객체 배열 생성
		String[] strArr = {"a","b","c"};
		// 객체 배욜 -> 스트림
		Stream<String> stream2 = Stream.of(strArr);
		Stream<String> stream3 = Arrays.stream(strArr);
		
		// 기초타입 배열 생성
		int[] inArr = {1,2,3};
		IntStream stream4 = Arrays.stream(inArr);
		
		// Stream<Integer> 대신 IntStreamd을 사용
		// IntStream : 기본형 스트림
		// Stream<>보다 다양한 기능을 가지고 있음
		// 합계를 구하는 sum 같은 기능을 포함하고 있음
	}

}
