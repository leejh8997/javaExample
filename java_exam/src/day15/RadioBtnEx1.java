package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioBtnEx1 extends JFrame{
	RadioBtnEx1(){
		setTitle("레이블 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup gender = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("남");
		JRadioButton radio2 = new JRadioButton("여");
		
		gender.add(radio1);
		gender.add(radio2);
		
		c.add(radio1);
		c.add(radio2);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new RadioBtnEx1();

	}

}
