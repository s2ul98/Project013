package stream.quiz;

import java.util.Arrays;
import java.util.stream.Stream;

public class Quiz2 {

	public static void main(String[] args) {
		String[] arr = {"file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt","file6.img"};

		// 1. 파일 목록 중에서 txt 파일 출력
		Stream<String> stream = Arrays.stream(arr);
		stream.filter(s -> s.endsWith(".txt"))
			  .forEach(s -> System.out.println(s + " "));
		
		// 2. 확장자별로 파일의 개수 출력
		Stream<String> stream2 = Arrays.stream(arr);
		long txtCount = stream2.filter(s -> s.endsWith(".txt")).count();
		System.out.println(txtCount);
	
		Stream<String> stream3 = Arrays.stream(arr);
		long pdfCount = stream3.filter(s -> s.endsWith(".pdf")).count();
		System.out.println(pdfCount);
	
		Stream<String> stream4 = Arrays.stream(arr);
		long imgCount = stream4.filter(s -> s.endsWith(".img")).count();
		System.out.println(imgCount);
		
		// 3. 파일의 확장자만 추출
		Stream<String> stream5 = Arrays.stream(arr);
		stream5.map(s -> {String[] strArr = s.split("\\.");
				return strArr[1];
		})
				.distinct()
				.forEach(s->System.out.print(s + " "));
	}

}
