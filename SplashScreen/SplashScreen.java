package com.quiz.application;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;



public class SplashScreen extends javax.swing.JFrame {
	private JPanel panel;
	private JLabel lblNewLabel;
	public JProgressBar progressBar;
	public JLabel percBar;
	public JLabel loadingLabel;

   
    public SplashScreen() {
        initComponents();
    }

                           
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        panel = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 568, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(63, Short.MAX_VALUE))
        );
        panel.setLayout(null);
        
        percBar = new JLabel("0%");
        percBar.setForeground(new Color(0, 0, 0));
        percBar.setFont(new Font("Times New Roman", Font.BOLD, 12));
        percBar.setHorizontalAlignment(SwingConstants.CENTER);
        percBar.setBounds(277, 201, 46, 14);
        panel.add(percBar);
        
        loadingLabel = new JLabel("Loading...");
        loadingLabel.setBackground(new Color(255, 255, 255));
        loadingLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        loadingLabel.setForeground(new Color(255, 255, 255));
        loadingLabel.setBounds(266, 235, 69, 22);
        panel.add(loadingLabel);
        
        progressBar = new JProgressBar();
        progressBar.setBackground(new Color(255, 255, 255));
        progressBar.setForeground(new Color(102, 204, 255));
        progressBar.setBounds(137, 201, 317, 14);
        panel.add(progressBar);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\1b0b6a59f5edf4d8eb33e218553b208e.jpg"));
        lblNewLabel.setBounds(0, 0, 558, 306);
        panel.add(lblNewLabel);
        getContentPane().setLayout(layout);

        setSize(new Dimension(576, 341));
        setLocationRelativeTo(null);
    }
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }
    // End of variables declaration                   
}
