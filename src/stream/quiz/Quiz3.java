package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz3 {

	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));
		
		// 1.
		Stream<Order> stream1 = list.stream();
		stream1.forEach(o-> System.out.print(o.number + " "));
		
		System.out.println(); // 엔터칠라고 걍 내멋대로 추가
		
		// 2.
		int sum = list.stream().filter(o -> o.year == 2022).mapToInt(o -> o.price).sum();
		System.out.println(sum);
		
		// filter: 조건을 만족하는 요소만 추출 (년도가 2022년도인)
		// count: 스트림 요소의 개수 구하기 (거래건수)
		// 3.
		long count = list.stream().filter(o -> o.year == 2022).count();
		System.out.println(count);
		
		// 4. 
		int sum2 = list.stream().filter(o -> o.year == 2023).mapToInt(o -> o.price).sum();
		System.out.println(sum2);
		
		long count2 = list.stream().filter(o -> o.year == 2023).count();
		System.out.println(count2);
		
	}

}
class Order {
	int number;
	int year;
	int price;
	
	public Order(int number, int year, int price) {
		super();
		this.number = number;
		this.year = year;
		this.price = price;
		
		
		
		
	}

	@Override
	public String toString() {
		 return "Order{number=" + number + ", year=" + year + ", price=" + price + "}";
	}
}