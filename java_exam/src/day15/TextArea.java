package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextArea extends JFrame{
	JTextField input = new JTextField(20);
	JTextArea save = new JTextArea(7,20);
	
	TextArea(){
		setTitle("레이블 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		input.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField name = (JTextField) e.getSource();
				save.append(name.getText() + "\n");
				input.setText("");
			}
		});
		c.add(input);
		c.add(save);
		c.add(new JScrollPane(save));
		
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TextArea();
	}

}
