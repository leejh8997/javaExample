package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BtnEvent1 extends JFrame {
	public BtnEvent1() {
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		// 이벤트
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Action");
		// 익명클래스로 이벤트처리
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton)e.getSource();;
				if(b.getText().equals("Action")) {
					b.setText("액션");
				} else {
					b.setText("Action");
				}
			}
		});
		c.add(btn1);

			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		BtnEvent1 gui = new BtnEvent1();
		
	}

}