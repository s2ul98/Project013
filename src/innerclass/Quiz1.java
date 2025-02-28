package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz1 {

	public static void main(String[] args) {

		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);
		
		// 키 이벤트
		// 키보드에서 아무키나 누르면 " 키가 눌렸습니다!" 출력
		
		// 함수 사용법 : 매개변수와 리턴값 체크
		// KeyListener의 자식클래스로 인스턴스를 생성하여 대입
		// 인터페이스는 인스턴스 생성x
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키를 눌렀습니다!");
				
			}
		});
		
	}
}
// frame.addKeyListener(null);여기서 타고타고 들어가서 체크
// KeyListener의 구현체
// 부모가 물려준 추상메소드를 모두 구현해야 한다
//class MyKeyListener implements KeyListener {
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼을 클릭했습니다!");
//}
//}