package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{
	public JComponentEx(){
		setTitle("버튼 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("색상 버튼");
		JButton btn2 = new JButton("비활성 버튼");
		JButton btn3 = new JButton("버튼 활성화");
		
		btn1.setBackground(Color.cyan);
		btn1.setForeground(Color.orange);
		btn1.setFont(new Font("", Font.BOLD, 30));
		
		btn2.setEnabled(false);
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn2.setEnabled(!btn2.isEnabled());
				c.remove(btn1);
				revalidate(); // 재검증
				repaint(); // 갱신
			}
		});
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JComponentEx();
	}

}
