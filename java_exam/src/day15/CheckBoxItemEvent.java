package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEvent extends JFrame {
	JLabel sumLabel;
	int sum = 0;
	JCheckBox []check = new JCheckBox[3];
	String []name = {"사과","배","체리"};
	CheckBoxItemEvent(){
		setTitle("레이블 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel lable = new JLabel("사과 100원, 배 500원, 체리 20000");
		c.add(lable);
		for(int i=0; i<check.length; i++) {
			check[i] = new JCheckBox(name[i]);
			check[i].setBorderPainted(true);
			check[i].addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
						if(e.getItem() == check[0]) {
							sum += 100;
						} else if(e.getItem() == check[1]) {
							sum += 500;
						} else if(e.getItem() == check[2]) {
							sum += 20000;
						}
					} else {
						if(e.getItem() == check[0]) {
							sum -= 100;
						} else if(e.getItem() == check[1]) {
							sum -= 500;
						} else if(e.getItem() == check[2]) {
							sum -= 20000;
						}
					}
					sumLabel.setText("현재 "+sum+"원 입니다.");					
				}
			});
			c.add(check[i]);
		}
		sumLabel = new JLabel("현재 0원 입니다.");
		c.add(sumLabel);
		
		setSize(250,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new CheckBoxItemEvent();
	}

}
