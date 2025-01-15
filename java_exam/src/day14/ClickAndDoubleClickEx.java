package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame {
	public ClickAndDoubleClickEx(){
		setTitle("더블클릭");
		Container c = getContentPane();
		Random ran = new Random();
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					int r = ran.nextInt(0,255);
					int g = ran.nextInt(0,255);
					int b = ran.nextInt(0,255);
					c.setBackground(new Color(r,g,b));
				}
			}
		});
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickAndDoubleClickEx();
	}

}
