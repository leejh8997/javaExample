package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import day07.PackA.MainA;

public class Sample extends JFrame{
	Sample(){
		setTitle("레이블 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
	}

}
