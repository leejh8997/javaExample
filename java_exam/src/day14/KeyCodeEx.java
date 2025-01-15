package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class KeyCodeEx extends JFrame{
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, %키: 노란색");
		Container c = getContentPane();
		c.setFocusable(true);
		c.requestFocus();
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyChar() == '%') {
					c.setBackground(Color.YELLOW);
				} else if(e.getKeyCode() == KeyEvent.VK_F1) {
					c.setBackground(Color.GREEN);
				}
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
	}

}
