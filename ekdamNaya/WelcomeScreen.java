package com.quiz.application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen frame = new WelcomeScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WelcomeScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcomeToIquiz = new JLabel("Welcome to IQuiz??");
		lblWelcomeToIquiz.setFont(new Font("Baskerville Old Face", Font.PLAIN, 40));
		lblWelcomeToIquiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToIquiz.setBounds(198, 36, 392, 65);
		panel.add(lblWelcomeToIquiz);
		
		JLabel lblLoginAs = new JLabel("Login as");
		lblLoginAs.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
		lblLoginAs.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginAs.setBounds(331, 147, 122, 36);
		panel.add(lblLoginAs);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\download (3).jpg"));
		label_1.setBounds(123, 231, 136, 121);
		panel.add(label_1);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				AloginPage alg = new AloginPage();
				alg.setVisible(true);
				setVisible(false);
			}
		});
		btnAdmin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAdmin.setBounds(148, 374, 89, 23);
		panel.add(btnAdmin);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Webp.net-compress-image.jpg"));
		label_2.setBounds(507, 231, 136, 121);
		panel.add(label_2);
		
		JButton btnUser = new JButton("User");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginPage lg = new LoginPage();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		btnUser.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnUser.setBounds(529, 374, 89, 23);
		panel.add(btnUser);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\DELL\\Documents\\Minor Project-I\\KWntz5.jpg"));
		label.setBounds(0, 0, 784, 461);
		panel.add(label);
	}

}
