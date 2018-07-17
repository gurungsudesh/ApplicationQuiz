package quiz;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class adminPage extends JFrame implements ActionListener{
	Button save;
	adminPage(){
		setVisible(true);
		setSize(800,500);
		setTitle("IQuiz?");
		setLayout(new GridLayout(10,10));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel p1 = new Panel();
		Label heading = new Label("Manage Question");
		heading.setFont(new Font("Calibrii",Font.BOLD,35));
		p1.add(heading);
		
		Panel p = new Panel();
		Panel p2 = new Panel();
		Label q_no = new Label("Question Number: ");
		TextField num = new TextField(10);
		p2.add(q_no);
		p2.add(num);
		
	
		Panel p3 = new Panel();
		Label question = new Label("Question: ");
		p3.add(question);
		//TextField qstn = new TextField(25);
		Panel p4 = new Panel();
		TextArea qstn= new TextArea();
		p4.add(qstn);
		
		Panel p5 = new Panel();
		Label opt = new Label("Options: ");
		Label l1 = new Label("1) ");
		TextField opt1 = new TextField(20);
		Label l2 = new Label("2) ");
		TextField opt2 = new TextField(20);
		p5.add(opt);
		p5.add(l1);
		p5.add(opt1);
		p5.add(l2);
		p5.add(opt2);
	
		Panel p6 = new Panel();
		Label l3 = new Label("3) ");
		TextField opt3 = new TextField(20);
		Label l4 = new Label("4) ");
		TextField opt4 = new TextField(20);
		p6.add(l3);
		p6.add(opt3);
		p6.add(l4);
		p6.add(opt4);
		
		
		Panel p7 = new Panel();
		Label c_ans = new Label("Answer: ");
		TextField ans = new TextField(20);
		p7.add(c_ans);
		p7.add(ans);
		
		Panel p8 = new Panel();
		save = new Button("Save");
		save.addActionListener(this);
		p8.add(save);
		
		
		add(p1);
		add(p);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		
	}
	public static void main(String[] args) {
		adminPage frame = new adminPage();
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== save) {
			try {
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
