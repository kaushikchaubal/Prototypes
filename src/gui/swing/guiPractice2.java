package gui.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class guiPractice2 implements ActionListener {

	JButton fastLeft, slowLeft, fastUp, slowUp, slowDown, fastDown, slowRight, fastRight, slowZoomIn, fastZoomIn, slowZoomOut, fastZoomOut, recordStop, name, logout;
	JTextField field;
	
	public guiPractice2(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Monitoring Website");
		frame.setSize(150,600);
		
		JPanel pane = new JPanel();
		
		fastLeft = new JButton("fastLeft");
		fastLeft.addActionListener(this);
		pane.add(fastLeft);
		
		slowLeft = new JButton("slowLeft");
		slowLeft.addActionListener(this);
		pane.add(slowLeft);
		
		fastUp = new JButton("fastUp");
		fastUp.addActionListener(this);
		pane.add(fastUp);
		
		slowUp = new JButton("slowUp");
		slowUp.addActionListener(this);
		pane.add(slowUp);
		
		slowDown = new JButton("slowDown");
		slowDown.addActionListener(this);
		pane.add(slowDown);
		
		fastDown = new JButton("fastDown");
		fastDown.addActionListener(this);
		pane.add(fastDown);
		
		slowRight = new JButton("slowRight");
		slowRight.addActionListener(this);
		pane.add(slowRight);
		
		fastRight = new JButton("fastRight");
		fastRight.addActionListener(this);
		pane.add(fastRight);
		
		slowZoomIn = new JButton("slowZoomIn");
		slowZoomIn.addActionListener(this);
		pane.add(slowZoomIn);
		
		fastZoomIn = new JButton("fastZoomIn");
		fastZoomIn.addActionListener(this);
		pane.add(fastZoomIn);
		
		slowZoomOut = new JButton("slowZoomOut");
		slowZoomOut.addActionListener(this);
		pane.add(slowZoomOut);
		
		fastZoomOut = new JButton("fastZoomOut");
		fastZoomOut.addActionListener(this);
		pane.add(fastZoomOut);
		
		recordStop = new JButton("recordStop");
		recordStop.addActionListener(this);
		pane.add(recordStop);
		
		name = new JButton("name");
		name.addActionListener(this);
		pane.add(name);
		
		logout = new JButton("logout");
		logout.addActionListener(this);
		pane.add(logout);
		
		field = new JTextField(10);
		field.setEditable(false);
		pane.add(field);
		
		frame.setContentPane(pane);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new guiPractice2();
	}

	public void actionPerformed(ActionEvent e) {
		Object s = e.getSource();
		if (s == fastLeft){
			field.setText("fastLeft");			
		}
		else if(s == slowLeft){
			field.setText("slowLeft");
		}
		else if(s == fastUp){
			field.setText("fastUp");
		}
		else if(s == slowUp){
			field.setText("slowUp");
		}
		else if(s == slowDown){
			field.setText("slowDown");
		}
		else if(s == fastDown){
			field.setText("fastDown");
		}
		else if(s == slowRight){
			field.setText("slowRight");
		}
		else if(s == fastRight){
			field.setText("fastRight");
		}
		else if(s == slowZoomIn){
			field.setText("slowZoomIn");
		}
		else if(s == fastZoomIn){
			field.setText("fastZoomIn");
		}
		else if(s == slowZoomOut){
			field.setText("slowZoomOut");
		}
		else if(s == fastZoomOut){
			field.setText("fastZoomOut");
		}
		else if(s == recordStop){
			field.setText("recordStop");
		}
		else if(s == name){
			field.setText("name");
		}
		else if(s == logout){
			field.setText("logout");
		}
		
	}

}
