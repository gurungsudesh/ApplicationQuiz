
package com.quiz.application;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JProgressBar;


public class SplashScreen extends javax.swing.JFrame {
	public JProgressBar progressBar;
   
    public SplashScreen() {
    	setResizable(false);
        initComponents();
    }
    
    
                        
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setSize(new java.awt.Dimension(800, 500));
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 784, 461);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblLoading = new JLabel("Loading...");
        lblLoading.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
        lblLoading.setBounds(370, 345, 96, 27);
        panel.add(lblLoading);
        
        JLabel lblNewLabel = new JLabel("Iquiz");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 40));
        lblNewLabel.setBounds(335, 76, 120, 38);
        panel.add(lblNewLabel);
        
       
        progressBar = new JProgressBar();
        progressBar.setForeground(Color.GREEN);
        progressBar.setBounds(106, 286, 580, 27);
        panel.add(progressBar);
        
        JLabel label = new JLabel("");
        label.setBounds(0, 0, 784, 461);
        panel.add(label);
        label.setIcon(new ImageIcon("C:\\Users\\DELL\\Documents\\Minor Project-I\\java-concept-blue-background-blue-text-44767620.jpg"));
        
    }                        

    
    public static void main(String args[]) {
    	
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }
}
