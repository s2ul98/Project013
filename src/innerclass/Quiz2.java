package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Quiz2 {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		
		TextArea area = new TextArea("텍스트 상자", 10, 50);
		frame.add(area);
		
		frame.setVisible(true);

		// 포커스 이벤트 등록
		// 창을 열면 "포커스가 되었습니다" 출력
		// 창을 닫으면 "포커스가 벗어났습니다" 출력
		
		// 함수의 매개 변수 : FocusListener(인터페이스)
		// 인터페이스는 인스턴스 생성 불가
		// area.addFocusListener(new MyFocusListener());
		
		area.addFocusListener(new FocusListener() { //FocusListener여기서 오버라이드
			
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("텍스트에 포커스가 되었습니다!");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("텍스트에 포커스가 벗어났습니다!");
				
			}
		});
	}

}
//class MyFocusListener implements FocusListener {
//
//	@Override
//	public void focusGained(FocusEvent e) {
//		System.out.println("텍스트에 포커스가 되었습니다!");
//		
//	}
//
//	@Override
//	public void focusLost(FocusEvent e) {
//		System.out.println("텍스트에 포커스가 벗어났습니다!");
//		
//	}
//	
//}