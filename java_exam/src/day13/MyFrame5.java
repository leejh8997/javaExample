package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame5 extends JFrame {
	public MyFrame5() {
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		// 이벤트
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Action");
		btn1.addActionListener(new MyEvent());
		c.add(btn1);
		JButton btn2 = new JButton("Action");
		btn2.addActionListener(new MyEvent());
		c.add(btn2);
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MyFrame5 gui = new MyFrame5();
		
	}

}

class MyEvent implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();;
		if(b.getText().equals("Action")) {
			b.setText("액션");
		} else {
			b.setText("Action");
		}
	}
}