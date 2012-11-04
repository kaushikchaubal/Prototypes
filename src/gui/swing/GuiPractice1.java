package gui.swing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GuiPractice1 implements ActionListener{
	
	JTextField field1, field2, field3;
	JButton button1, button2, button3, button4;
	
	public GuiPractice1(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Addition of two numbers");
		frame.setSize(150,300);
		
		JPanel pane = new JPanel();
		
		Font bigFont = new Font("TimesRoman",Font.ITALIC,20);
		
		JLabel label1 = new JLabel("First Number:");
		label1.setFont(bigFont);
		pane.add(label1);
		
		field1 = new JTextField(10);
		pane.add(field1);
		
		JLabel label2 = new JLabel("Second Number:");
		label2.setFont(bigFont);
		pane.add(label2);
		
		field2 = new JTextField(10);
		pane.add(field2);
				
		button1 = new JButton("+");
		button1.addActionListener(this);
		pane.add(button1);
		
		button2 = new JButton("-");
		button2.addActionListener(this);
		pane.add(button2);
		
		JLabel space1 = new JLabel("   ");
		pane.add(space1);
		
		button3 = new JButton("x");
		button3.addActionListener(this);
		pane.add(button3);
		
		button4 = new JButton("%");
		button4.addActionListener(this);
		pane.add(button4);
		
		JLabel space = new JLabel("   ");
		pane.add(space);
		
		JLabel label3 = new JLabel("Result:");
		label3.setFont(bigFont);
		pane.add(label3);
				
		field3 = new JTextField(10);
		field3.setEditable(false);
		pane.add(field3);
		
		frame.setContentPane(pane);
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		new GuiPractice1();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		double firstNo = Double.parseDouble(field1.getText());
		double secondNo = Double.parseDouble(field2.getText());
		double value = 0;
		
		if(src == button1){
			value = firstNo + secondNo;
		}
		else if(src == button2){
			value = firstNo - secondNo;
		}
		else if(src == button3){
			value = firstNo * secondNo;
		}
		else if(src == button4){
			value = firstNo / secondNo;
		}
		
		field3.setText(Double.toString(value));
		
	}

}
