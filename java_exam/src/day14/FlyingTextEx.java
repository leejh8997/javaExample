package day14;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame{
	final int FLYING = 10;
	public FlyingTextEx() {
		setTitle("텍스트 이동");
		Container c = getContentPane();
		c.setLayout(null);
		JLabel label = new JLabel("Hello");
		label.setSize(50,30);
		label.setLocation(50,50);
		c.add(label);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_UP:
					label.setLocation(label.getX(), label.getY()-FLYING);
					break;
				case KeyEvent.VK_DOWN:
					label.setLocation(label.getX(), label.getY()+FLYING);
					break;
				case KeyEvent.VK_LEFT:
					label.setLocation(label.getX()-FLYING, label.getY());
					break;
				case KeyEvent.VK_RIGHT:
					label.setLocation(label.getX()+FLYING, label.getY());
					break;
				
				}
				
			}
		});
		
		c.setFocusable(true);
		c.requestFocus();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
