package day14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.*;

public class Remove extends JFrame{
	private int checkNum = 1;
	// 시간 체크
	private double startTime;
	private double endTime;
	private JLabel label;
	public Remove() {
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		// 배치관리자 => null
		c.setLayout(null);
		Random ran = new Random();
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(Integer.toString(i)); // 버튼생성
			int x = ran.nextInt(1,249);
			int y = ran.nextInt(1,249);
			btn.setLocation(x, y);
			btn.setSize(50, 50);
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton)e.getSource();
					int btnNum = Integer.parseInt(btn.getText());
					if(btnNum == checkNum) {
						btn.setVisible(false);
						checkNum++;
						if(checkNum == 2) {
							startTime = System.currentTimeMillis();
						}
						if(checkNum > 10) {
							endTime = System.currentTimeMillis();
							double time = (endTime - startTime) / 1000; //밀리세컨드 단위라 1000으로 나눠줌
							label = new JLabel(time + "초");
						}
					}
				}
			});
			
			c.add(btn); // 버튼을컨텐트팬에부착
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Remove gui = new Remove();
		
	}

}