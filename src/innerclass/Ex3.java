package innerclass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3 {

	public static void main(String[] args) {
		
		// 화면 생성
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300); // xy좌표 넓이 높이
		frame.setVisible(true); // false면 화면 안나옴
		
		// 버튼 추가
		Button button = new Button("Click");
		frame.add(button);
		
		// 버튼 이벤트 등록
		// addActionListener 함수의 매개변수는 interface로 바로 생성할 수 없다 
		// interface의 구현 클래스를 만들고 인스턴스를 생성하여 넣어야 한다
//		button.addActionListener(new EventHandler());
		
		// 익명클래스를 사용하여 이벤트 등록
		// 익명 클래스 만드는 방법:
		// new 인터페이스 이름() {}
		// 부모가 물려준추상 메소드 재정의
		// 익명 클래그 구현 -> 인스턴스 생성
		
		// 익명클래스를 사용하는 이유 : 클래스를 일회성으로 사용하기 위해서
		button.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다~~");
				
			}
			
		} );
		
				
	
}
}



// 액션리스너의 구현체
// 자식 클래스는 부모가 물려준 추상메소드를 모두 구현해야한다
//class EventHandler implements ActionListener {
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼을 클릭했습니다!");
//	}
//}
