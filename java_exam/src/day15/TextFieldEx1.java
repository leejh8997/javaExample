package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class TextFieldEx1 extends JFrame{
	TextFieldEx1(){
		setTitle("레이블 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("  아이디   : "));
		c.add(new TextField(20));
		c.add(new JLabel("비밀번호 : "));
		c.add(new JPasswordField(14));
		
		
		setSize(250,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TextFieldEx1();

	}

}
