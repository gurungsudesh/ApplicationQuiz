package quiz;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class question extends JFrame implements ActionListener{
	Button b;
	question(){
		setVisible(true);
		setSize(800,500);
		setLayout(new GridLayout(10,10));
		setTitle("IQuiz?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Panel p1 = new Panel();
		Label heading = new Label("Quiz",Label.CENTER);
		heading .setFont(new Font("Calibrii",Font.BOLD,35));
		p1.add(heading);
		
		Panel p2 = new Panel();
		Label lgn_ind = new Label("Logged in as: ",Label.RIGHT);
		Label  uname = new Label("username");
		p2.add(lgn_ind);
		p2.add(uname);
		
		Panel p3 = new Panel();
		p3.setBackground(Color.white);
		Label qstn = new Label("Here comes the question....");
		p3.add(qstn);
		
		Panel p4 = new Panel();
		Label l1 = new Label("1) ",Label.RIGHT);
		TextField ans1 = new TextField(20);
		Label l2 = new Label("2) ",Label.LEFT);
		TextField ans2 = new TextField(20);
		p4.add(l1);
		p4.add(ans1);
		p4.add(l2);
		p4.add(ans2);
		
		Panel p5 = new Panel();
		Label l3 =new Label("3) ",Label.RIGHT);
		TextField ans3 = new TextField(20);
		Label l4 = new Label("4) ",Label.LEFT);
		TextField ans4 = new TextField(20);
		p5.add(l3);
		p5.add(ans3);
		p5.add(l4);
		p5.add(ans4);
		
		
		Panel p6 = new Panel();
		Label ans = new Label("Answer: ");
		TextField c_ans = new TextField(20);
		p6.add(ans);
		p6.add(c_ans);
		
		
		Panel p7 = new Panel();
		b = new Button("Next");
		b.addActionListener(this);
		p7.add(b);
		
		
		
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
	}
	public static void main(String[] args) {
		question frame = new question();
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b) {
			try {
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
