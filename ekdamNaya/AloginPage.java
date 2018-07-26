package com.quiz.application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AloginPage extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AloginPage frame = new AloginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AloginPage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 450);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 787, 411);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 245));
		panel_1.setBounds(251, 56, 289, 314);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(new Color(0, 0, 0));
		lblLogin.setBounds(105, -5, 81, 46);
		panel_1.add(lblLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 39, 289, 1);
		panel_1.add(separator);
		separator.setForeground(new Color(192, 192, 192));
		separator.setBackground(new Color(192, 192, 192));
		
		JLabel lblUsername = new JLabel("Admin name:");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblUsername.setBounds(24, 78, 81, 14);
		panel_1.add(lblUsername);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(24, 103, 241, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPassword.setBounds(24, 137, 68, 14);
		panel_1.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(24, 162, 241, 20);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(24, 203, 196, 14);
		panel_1.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(105, 217, 89, 23);
		panel_1.add(btnLogin);
		
		JLabel lblRegister = new JLabel("New Admin ??");
		lblRegister.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblRegister.setForeground(new Color(30, 144, 255));
		lblRegister.setBounds(24, 270, 68, 14);
		panel_1.add(lblRegister);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				RegisterPage rg =  new RegisterPage();
				rg.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(105, 266, 89, 23);
		panel_1.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBackground(Color.LIGHT_GRAY);
		separator_1.setBounds(0, 253, 289, 1);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\quiz (1).jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 787, 411);
		panel.add(lblNewLabel);
	}
}
