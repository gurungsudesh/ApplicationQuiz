package quiz.homepage;

import java.awt.EventQueue;
import quiz.loginPage;
import quiz.loginPage;
import quiz.adminpage.Adminpage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage extends JFrame{

	//private JFrame frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
//					Homepage window1 = new Homepage();
					Homepage frame = new Homepage();
					

	/**
	 * Create the application.
	 * */
	}
	public Homepage() {
		initialize();
		setVisible(true);


		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel HWelcome = new JLabel("Welcome");
		HWelcome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		HWelcome.setBounds(147, 39, 127, 44);
		getContentPane().add(HWelcome);
		
		JButton H_addbutton = new JButton("Add");
		H_addbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminpage.main(null);
				setVisible(false);
			}
		});
		H_addbutton.setBounds(157, 104, 89, 23);
		getContentPane().add(H_addbutton);
		
		JButton H_Lquestion = new JButton("List of questions");
		H_Lquestion.setBounds(136, 138, 138, 23);
		getContentPane().add(H_Lquestion);
		
		JButton H_Lplayers = new JButton("List of players");
		H_Lplayers.setBounds(147, 172, 117, 23);
		getContentPane().add(H_Lplayers);
		
		JButton H_signout = new JButton("Sign out");
		H_signout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==H_signout) {
					setVisible(false);
					loginPage lp = new loginPage();
					lp.setVisible(true);
				}
			}
		});
		H_signout.setBounds(309, 227, 89, 23);
		getContentPane().add(H_signout);
		
		JSeparator separator1 = new JSeparator();
		separator1.setBounds(35, 86, 363, 2);
		getContentPane().add(separator1);
	}
}
