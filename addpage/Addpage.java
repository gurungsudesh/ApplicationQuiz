package addpage;

import java.awt.EventQueue;
import java.*;
import javax.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JSeparator;
import java.awt.Font;
import homepage.Homepage;

public class Addpage {

	private JFrame frame;
	private JTextField txtChoice_1;
	private JTextField txtChoice_2;
	private JTextField txtChoice_3;
	private JTextField txtChoice_4;
	private JButton btnReset;
	private JButton btnNewButton;
	private JTextField txtAnswer;
	private JTextField txtCategories;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addpage window = new Addpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Addpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	 
	Connection con = null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/I_questions","root","");  
			System.out.println("Connection Successful");
		}
		catch(Exception E)
		{ 
			System.out.println("Connection UnSuccessful");
		}
		
		frame = new JFrame();
		frame.setBounds(100, 100, 506, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Add Questions");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWelcome.setBounds(164, 11, 124, 27);
		frame.getContentPane().add(lblWelcome);
		
		JTextArea txtQuestion = new JTextArea();
		txtQuestion.setBounds(66, 62, 354, 72);
		frame.getContentPane().add(txtQuestion);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		txtQuestion.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		
		txtChoice_1 = new JTextField();
		txtChoice_1.setBounds(66, 155, 117, 20);
		frame.getContentPane().add(txtChoice_1);
		txtChoice_1.setColumns(10);
		
		
		
		txtChoice_2 = new JTextField();
		txtChoice_2.setBounds(312, 155, 108, 20);
		frame.getContentPane().add(txtChoice_2);
		txtChoice_2.setColumns(10);
		
		
		txtChoice_3 = new JTextField();
		txtChoice_3.setBounds(66, 192, 117, 20);
		frame.getContentPane().add(txtChoice_3);
		txtChoice_3.setColumns(10);
		
		
		txtChoice_4 = new JTextField();
		txtChoice_4.setBounds(312, 192, 108, 20);
		frame.getContentPane().add(txtChoice_4);
		txtChoice_4.setColumns(10);
		
		txtAnswer = new JTextField();
		txtAnswer.setBounds(164, 234, 149, 20);
		frame.getContentPane().add(txtAnswer);
		txtAnswer.setColumns(10);
		
		txtCategories = new JTextField();
		txtCategories.setBounds(164, 265, 149, 20);
		frame.getContentPane().add(txtCategories);
		txtCategories.setColumns(10);
		
		Connection incon=con;
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String question=txtQuestion.getText();
				String choice1=txtChoice_1.getText();
				String choice2=txtChoice_2.getText();
				String choice3=txtChoice_3.getText();
				String choice4=txtChoice_4.getText();
				String answer=txtAnswer.getText();
				String categories=txtCategories.getText();
				
				if (question== "" || choice1==null || choice2 == null || choice3== null || choice4== null  || answer == null)
				{
					JOptionPane.showMessageDialog(null,"Empty textfields","Error",JOptionPane.ERROR_MESSAGE);
					txtQuestion.setText(null);
					txtChoice_1.setText(null);
					txtChoice_2.setText(null);
					txtChoice_3.setText(null);
					txtChoice_4.setText(null);
					txtAnswer.setText(null);
					txtCategories.setText(null);
				}
				else
				{
					
						
				
					JOptionPane.showMessageDialog(null,"Sucessful","Sucess",JOptionPane.INFORMATION_MESSAGE);
					try {
						Statement stmt= null;
					 stmt=incon.createStatement(); 
					stmt.executeUpdate("INSERT INTO I_list VALUES(1,'"+question+"','"+choice1+"','"+choice2+"','"+choice3+"','"+choice4+"','"+answer+"','"+categories+"')");
					
					}
					catch(SQLException E)
					{
						
					}
					txtQuestion.setText(null);
					txtChoice_1.setText(null);
					txtChoice_2.setText(null);
					txtChoice_3.setText(null);
					txtChoice_4.setText(null);
					txtAnswer.setText(null);
					txtCategories.setText(null);
					
				}
			}
		});
		
		
		
		btnAdd.setBounds(110, 302, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(37, 49, 406, 2);
		frame.getContentPane().add(separator);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtQuestion.setText(null);
				txtChoice_1.setText(null);
				txtChoice_2.setText(null);
				txtChoice_3.setText(null);
				txtChoice_4.setText(null);
				txtAnswer.setText(null);
				txtCategories.setText(null);
			}
		});
		btnReset.setBounds(286, 302, 89, 23);
		frame.getContentPane().add(btnReset);
		
		btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(326, 351, 154, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAnswer.setBounds(97, 235, 57, 19);
		frame.getContentPane().add(lblAnswer);
		
		
		JLabel lblCategories = new JLabel("Categories:");
		lblCategories.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCategories.setBounds(78, 265, 75, 20);
		frame.getContentPane().add(lblCategories);
	}
}
