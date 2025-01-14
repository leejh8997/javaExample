package day13;

import java.awt.*;

import javax.swing.*;

public class MyFrame3 extends JFrame{
	public MyFrame3() {
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		// GridLayout
		GridLayout grid = new GridLayout(4,3);
		grid.setVgap(5);
		grid.setHgap(5);
		c.setLayout(grid);
//		c.setLayout(new GridLayout(4,3,5,5));
		
		
		for(int i=1; i<=9; i++) {
			c.add(new JButton(i+"")); // 매개변수로 str 받음
		}
		c.add(new JButton("+"));
		c.add(new JButton("0"));
		c.add(new JButton("="));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MyFrame3 gui = new MyFrame3();
		
	}

}
