package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame{
	ButtonEx(){
		setTitle("레이블 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon phone1 = new ImageIcon("image/phone1.png");
		ImageIcon phone2 = new ImageIcon("image/phone2.png");
		ImageIcon phone3 = new ImageIcon("image/phone3.png");
		JButton btn = new JButton(phone1);
		btn.setRolloverIcon(phone2);
		btn.setPressedIcon(phone3);
		
		c.add(btn);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ButtonEx();
	}

}
