package quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class AdminRegisterPage extends JFrame implements ActionListener {
	
	

		Panel pl6;
		Label response;
		Button register,lgn;
		TextField usr_name,p_word,email;
		//JDBC connection
		Statement stmt;
		Connection conn;

		
		AdminRegisterPage(){
			setVisible(true);
			setSize(800,500);
			setTitle("IQuiz?");
			setLayout(new GridLayout(10,10));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			
			Panel pl1 = new Panel();
			Label reg_heading = new Label("Register",Label.CENTER);
			reg_heading.setFont(new Font("Calibrii",Font.BOLD,20));
			pl1.add(reg_heading);
			add(pl1);
			
			Panel pl6 = new Panel();
			Label ureg = new Label("Admin registration:");
			pl6.add(ureg);
			add(pl6);
			
			
			Panel pl2 = new Panel();
			Label uname = new Label("Username: ");
			usr_name = new TextField(20);
			pl2.add(uname);
			pl2.add(usr_name);
			add(pl2);
			
			Panel pl3 = new Panel();
			Label pword = new Label("Password: ");
			p_word = new TextField(20);
			pl3.add(pword);
			pl3.add(p_word);
			add(pl3);
			
			Panel pl4 = new Panel();
			Label e_mail = new Label("Email: ");
			email = new TextField(20);
			pl4.add(e_mail);
			pl4.add(email);
			add(pl4);
			
			Panel pl5= new Panel();
			register = new Button("Register");
			register.addActionListener(this);
			lgn = new Button("Login");
			lgn.addActionListener(this);
			pl5.add(register);
			pl5.add(lgn);
			add(pl5);
		}
		public static void main(String[] args) {
			registerPage reg = new registerPage();

		}
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==register) {
				try {
					String uname,password,e_mail;
					uname = usr_name.getText();
					password = p_word.getText();
					e_mail = email.getText();
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3307/Quiz";
					Connection conn = DriverManager.getConnection(url, "root", "");
					System.out.println("Connected");
					stmt = conn.createStatement();
					stmt.executeUpdate("INSERT INTO Admin ( Username,Password,Email) VALUES ('"+uname+"','"+password+"','"+e_mail+"')");
					conn.close();
					System.out.println(uname);
					System.out.println(password);
					System.out.println(e_mail);
					
					
					response = new Label("You're registered click on the Login button to go back to the loginpage. ");
					add(response);
				
					
				}
				catch(Exception e) {
					System.out.println(e);
				}
				
				
				
			}
			if(ae.getSource() == lgn) {
				try {
					setVisible(false);
					loginPage lp = new loginPage();
					lp.setVisible(true);
				}
				catch(Exception e) {
					System.out.println(e);
				}
				
			}
		}
	}


