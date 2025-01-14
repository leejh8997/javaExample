package day13;

import java.awt.*;

import javax.swing.*;

public class MyFrame4 extends JFrame{
	public MyFrame4() {
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		// 배치관리자 => null
		c.setLayout(null);
		JButton btn1 = new JButton("test");
		btn1.setSize(75,75);
		btn1.setSize(100, 200);
		c.add(btn1);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼생성
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b); // 버튼을컨텐트팬에부착
			}
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MyFrame4 gui = new MyFrame4();
		
	}

}