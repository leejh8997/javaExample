package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx1 extends JFrame{
	CheckBoxEx1(){
		setTitle("레이블 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox check1 = new JCheckBox("사과");
		JCheckBox check2 = new JCheckBox("체리",true);
		ImageIcon image1 = new ImageIcon("image/phone1.png");
		ImageIcon image2 = new ImageIcon("image/phone2.png");
		JCheckBox check3 = new JCheckBox("배",image1);
		check3.setBorderPainted(true);
		check3.setSelectedIcon(image2);
		
		c.add(check1);
		c.add(check2);
		c.add(check3);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new CheckBoxEx1();
	}

}
