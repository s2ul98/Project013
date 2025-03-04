package stream.quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Quiz4 {

	public static void main(String[] args) {
		Customer customer1 = new Customer("둘리", 40, 100);
		Customer customer2 = new Customer("또치", 13, 50);
		Customer customer3 = new Customer("도우", 25, 70);
		
		List<Customer> list = new ArrayList<Customer>();
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		
		// 1.
		list.stream().forEach(l -> System.out.println(l.name));
		
		// 2.
		int total = list.stream().mapToInt(p-> p.pay).sum();
		System.out.println("총 여행 비용 : " + total);
		
		// 3.
		list.stream().filter(c -> c.age >= 20).sorted((c1, c2) -> {
			if(c1.age > c2.age) {
				return 1; 
			} else {
				return -1; 
			}
		})
		.forEach(c -> System.out.println(c.name + ", " +c.age));


		// sorted: 정렬
		// 스트림 안에 있는 요소는 인스턴스로 값을 정렬 할 수 없다
		// 4.
		list.stream().sorted(new Comparator<Customer>() {

			// 두 수를 비교하여 순서를 결정
			// 반환값 : 양수 또는 음수
			@Override
			public int compare(Customer o1, Customer o2) {
				if(o1.age > o2.age) {
					return -1;
				} else {
					return 1;
				}
				
			}})
	.forEach(c->System.out.println(c.name+ " " + c.age));
	
	}
	
	

}

class Customer {
	String name;
	int age;
	int pay;
	
	public Customer(String name, int age, int pay) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
	}
	
	
}