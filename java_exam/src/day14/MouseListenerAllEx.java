package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame{
	
	public MouseListenerAllEx(){
		setTitle("마우스 리스너");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label =  new JLabel("마우스 이벤트 전");
		c.add(label);
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				label.setText("클릭되었음" + e.getX() + "," + e.getY());
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setText("클릭해제" + e.getX() + "," + e.getY());
				c.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				c.setBackground(Color.CYAN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				c.setBackground(Color.LIGHT_GRAY);				
			}
		});
		c.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				label.setText("드래그하는 중" + e.getX() + "," + e.getY());
				c.setBackground(Color.WHITE);								
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				c.setBackground(Color.ORANGE);
			}
		});
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerAllEx();
	}

}
