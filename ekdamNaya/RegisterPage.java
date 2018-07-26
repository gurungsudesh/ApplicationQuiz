package com.quiz.application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Webp.net-compress-image (1).jpg"));
		label.setBounds(678, 11, 96, 65);
		panel.add(label);
		
		JLabel lblRegisterNow = new JLabel("Register ");
		lblRegisterNow.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblRegisterNow.setBounds(29, 11, 170, 29);
		panel.add(lblRegisterNow);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 784, 89);
		panel.add(panel_1);
		
		JLabel lblUsername = new JLabel("Admin name:");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(29, 100, 70, 14);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPassword.setBounds(29, 156, 56, 20);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(29, 187, 548, 20);
		panel.add(passwordField);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblConfirmPassword.setBounds(28, 218, 107, 14);
		panel.add(lblConfirmPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(29, 243, 548, 20);
		panel.add(passwordField_1);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblEmail.setBounds(29, 274, 46, 14);
		panel.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(29, 299, 548, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(29, 125, 548, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblError_1 = new JLabel("error");
		lblError_1.setForeground(new Color(255, 69, 0));
		lblError_1.setBounds(610, 128, 164, 14);
		panel.add(lblError_1);
		
		JLabel lblError = new JLabel("error");
		lblError.setForeground(new Color(255, 69, 0));
		lblError.setBounds(610, 190, 164, 14);
		panel.add(lblError);
		
		JLabel label_1 = new JLabel("error");
		label_1.setForeground(new Color(255, 69, 0));
		label_1.setBounds(610, 246, 164, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("error");
		label_2.setForeground(new Color(255, 69, 0));
		label_2.setBounds(610, 302, 164, 14);
		panel.add(label_2);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnRegister.setBackground(new Color(100, 149, 237));
		btnRegister.setBounds(29, 336, 548, 35);
		panel.add(btnRegister);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 392, 784, 2);
		panel.add(separator);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			LoginPage lp = new  LoginPage();
			lp.setVisible(true);
			setVisible(false);
			dispose();
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnLogin.setBackground(new Color(100, 149, 237));
		btnLogin.setBounds(29, 415, 548, 35);
		panel.add(btnLogin);
	}
}
