package quiz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class playGame extends JFrame implements ActionListener{

	Button start;
	playGame(){
		setVisible(true);
		setTitle("IQuiz?");
		setLayout(new GridLayout(10,10));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,500);
		
		Panel pa1 = new Panel();
		Label play = new Label("Welcome: ");
		Label uname = new Label("Username comes here....");
		pa1.add(play);
		pa1.add(uname);
		add(pa1);
		
		Panel pa2 = new Panel();
		start = new Button("Play Game");
		start.addActionListener(this);
		
	
		pa2.add(start);
		add(pa2);
		
		
	}
	public static void main(String[] args) {
		playGame obj = new playGame();
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== start) {
			setVisible(false);
			question frame = new question();
			frame.setVisible(true);
			
		}
	}
}
