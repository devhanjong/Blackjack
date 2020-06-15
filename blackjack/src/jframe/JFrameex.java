package jframe;

import java.awt.Font;
import java.util.Enumeration;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class JFrameex {
	public static void main(String[] args) {
		
		 // ★ 모든 글꼴 통일
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("굴림", Font.PLAIN, 14));
        }
		
		//생성
		JFrame frm = new JFrame("슬라임");
		//크기
		frm.setSize(350,300);
		//화면가운데 배치
		frm.setLocationRelativeTo(null);
		//닫았을때 메모리에서 제거
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 설정
//		FlowLayout flay = new FlowLayout();
		frm.getContentPane().setLayout(null);
		
		//버튼 생성
		JButton btn1 = new JButton("슬라위");
		JButton btn2 = new JButton("슬라힘");
		//버튼위치설정
		btn1.setBounds(30, 170, 122, 30);
		btn2.setBounds(182, 170, 122, 30);
		//버튼 추가
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(btn2);
		
		//라벨설정
		JLabel lbl = new JLabel();
		lbl.setBounds(30, 200, 274, 50);
		lbl.setText("게임을 시작합니다");
		lbl.setHorizontalAlignment(JLabel.CENTER);  //수평 가운데정렬 
		frm.getContentPane().add(lbl);
		
		//버튼을 누를때
		btn1.addActionListener(event -> {
			lbl.setText("나는 슬라위");
		});
		btn2.addActionListener(event -> {
			lbl.setText("나는 슬라힘");
		});
		
		//이미지라벨생성
		JLabel imgLbl1 = new JLabel();
		JLabel imgLbl2 = new JLabel();
		//라벨에 넣을 이미지 생성
		ImageIcon icon1 = new ImageIcon(JFrameex.class.getResource("/blackjack/img/slime(blue).png"));
		ImageIcon icon2 = new ImageIcon(JFrameex.class.getResource("/blackjack/img/slime(red).png"));
		imgLbl1.setIcon(icon1);
		imgLbl2.setIcon(icon2);
		//이미지 기타설정
		imgLbl1.setBounds(30, 30, 122, 130);
		imgLbl1.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl1);

		//이미지 기타설정
		imgLbl2.setBounds(182, 30, 122, 130);
		imgLbl2.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl2);
		
		
		
		
		//보이게설정 
		frm.setVisible(true);
		//컨텐츠 영역 사이즈 측정 
		System.out.println(frm.getContentPane().getSize());
		
	}
}
