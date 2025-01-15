package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{
	LabelEx(){
		setTitle("레이블 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("자바 재밌다~~");
		c.add(label1);
		
		ImageIcon image1 = new ImageIcon("image/1.png");
		
		Image image = image1.getImage();
		Image scaledImage = image.getScaledInstance(450, 360, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(scaledImage);
		JLabel label2 = new JLabel(scaledIcon);
		c.add(label2);
		
		ImageIcon phone1 = new ImageIcon("image/3.png");
		JLabel label3 = new JLabel("자바 좋아!", phone1, SwingConstants.CENTER);
		c.add(label3);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new LabelEx();
	}

}
