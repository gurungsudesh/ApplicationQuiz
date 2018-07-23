package homepage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;

import addpage.Addpage;
import addpage.Editingpage;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage {

	private JFrame frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window1 = new Homepage();
					window1.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 450, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel HWelcome = new JLabel("Welcome");
		HWelcome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		HWelcome.setBounds(147, 39, 127, 44);
		frame1.getContentPane().add(HWelcome);
		
		JButton H_addbutton = new JButton("Add");
		H_addbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addpage.main(null);
				frame1.setVisible(false);
			}
		});
		H_addbutton.setBounds(157, 104, 89, 23);
		frame1.getContentPane().add(H_addbutton);
		
		JButton H_Lquestion = new JButton("List of questions");
		H_Lquestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editingpage.main(null);
				frame1.setVisible(false);
			}
		});
		H_Lquestion.setBounds(136, 138, 138, 23);
		frame1.getContentPane().add(H_Lquestion);
		
		JButton H_Lplayers = new JButton("List of players");
		H_Lplayers.setBounds(147, 172, 117, 23);
		frame1.getContentPane().add(H_Lplayers);
		
		JButton H_signout = new JButton("Sign out");
		H_signout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		H_signout.setBounds(309, 227, 89, 23);
		frame1.getContentPane().add(H_signout);
		
		JSeparator separator1 = new JSeparator();
		separator1.setBounds(35, 86, 363, 2);
		frame1.getContentPane().add(separator1);
	}
}
