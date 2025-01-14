package day13;

import java.awt.*;

import javax.swing.*;

public class MyFrame2 extends JFrame{
	public MyFrame2() {
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		// BorderLayout
		c.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("1번 버튼");
		JButton btn2 = new JButton("2번 버튼");
		JButton btn3 = new JButton("3번 버튼");
		JButton btn4 = new JButton("4번 버튼");
		JButton btn5 = new JButton("5번 버튼");
		
		c.add(btn1, BorderLayout.EAST);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn3, BorderLayout.NORTH);
		c.add(btn3, BorderLayout.SOUTH);
		c.add(btn3, BorderLayout.CENTER);
		for(int i=0; i<10; i++) {
			c.add(new JButton("test" + i));
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MyFrame2 gui = new MyFrame2();
		
	}

}