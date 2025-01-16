package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ListChangeEx extends JFrame{
	JTextField input = new JTextField(10);
	Vector<String> v = new Vector<String>();
	JList<String> list = new JList<String>(v);
	ListChangeEx(){
		setTitle("레이블 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField name = (JTextField) e.getSource();
				v.add(name.getText());
				list.setListData(v);
				input.setText("");
			}
		});
		list.setVisibleRowCount(5);
		list.setFixedCellWidth(100);
		c.add(new JLabel("이름 입력후 <Enter>키"));
		c.add(input);
		c.add(new JScrollPane(list));
		
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ListChangeEx();
	}

}
