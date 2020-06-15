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
		
		 // �� ��� �۲� ����
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("����", Font.PLAIN, 14));
        }
		
		//����
		JFrame frm = new JFrame("������");
		//ũ��
		frm.setSize(350,300);
		//ȭ�鰡� ��ġ
		frm.setLocationRelativeTo(null);
		//�ݾ����� �޸𸮿��� ����
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���̾ƿ� ����
//		FlowLayout flay = new FlowLayout();
		frm.getContentPane().setLayout(null);
		
		//��ư ����
		JButton btn1 = new JButton("������");
		JButton btn2 = new JButton("������");
		//��ư��ġ����
		btn1.setBounds(30, 170, 122, 30);
		btn2.setBounds(182, 170, 122, 30);
		//��ư �߰�
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(btn2);
		
		//�󺧼���
		JLabel lbl = new JLabel();
		lbl.setBounds(30, 200, 274, 50);
		lbl.setText("������ �����մϴ�");
		lbl.setHorizontalAlignment(JLabel.CENTER);  //���� ������� 
		frm.getContentPane().add(lbl);
		
		//��ư�� ������
		btn1.addActionListener(event -> {
			lbl.setText("���� ������");
		});
		btn2.addActionListener(event -> {
			lbl.setText("���� ������");
		});
		
		//�̹����󺧻���
		JLabel imgLbl1 = new JLabel();
		JLabel imgLbl2 = new JLabel();
		//�󺧿� ���� �̹��� ����
		ImageIcon icon1 = new ImageIcon(JFrameex.class.getResource("/blackjack/img/slime(blue).png"));
		ImageIcon icon2 = new ImageIcon(JFrameex.class.getResource("/blackjack/img/slime(red).png"));
		imgLbl1.setIcon(icon1);
		imgLbl2.setIcon(icon2);
		//�̹��� ��Ÿ����
		imgLbl1.setBounds(30, 30, 122, 130);
		imgLbl1.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl1);

		//�̹��� ��Ÿ����
		imgLbl2.setBounds(182, 30, 122, 130);
		imgLbl2.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl2);
		
		
		
		
		//���̰Լ��� 
		frm.setVisible(true);
		//������ ���� ������ ���� 
		System.out.println(frm.getContentPane().getSize());
		
	}
}
