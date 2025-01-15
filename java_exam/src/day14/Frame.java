package day14;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class Frame extends JFrame{
	public Frame() {
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		// 배치관리자 => null
		c.setLayout(null);
		Random ran = new Random();
		for(int i=1; i<=10; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼생성
			int x = ran.nextInt(1,249);
			int y = ran.nextInt(1,249);
			b.setLocation(x, y);
			b.setSize(50, 20);
			c.add(b); // 버튼을컨텐트팬에부착
			}
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Frame gui = new Frame();
		
	}

}