package addpage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import homepage.Homepage;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Editingpage {

	private JFrame frame_edit;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editingpage window = new Editingpage();
					window.frame_edit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
public Editingpage() {
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
			catch(Exception e)
			{ 
				System.out.println("Connection UnSuccessful");
			}	 
		
		frame_edit = new JFrame();
		frame_edit.setBounds(100, 100, 677, 510);
		frame_edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_edit.getContentPane().setLayout(null);
		
		
		
		JLabel Listofquestions = new JLabel("List of questions");
		Listofquestions.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		Listofquestions.setBounds(226, 11, 181, 21);
		frame_edit.getContentPane().add(Listofquestions);
		
		
		 ArrayList<I_values>users = new ArrayList<I_values>();
	         
	        Statement st;
	        
	        ResultSet rs;
	        
	        I_values i;
	        
	        try {
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT * FROM I_list");
	            
	            while(rs.next()){
	                
	                i = new I_values(rs.getInt("SNo"), rs.getString("Question"),rs.getString("Choice_1"),rs.getString("Choice_2"),rs.getString("Choice_3"),rs.getString("Choice_4"),rs.getString("Answer"),rs.getString("Category"));
	                users.add(i);
	            }         
	        } catch (SQLException ex) {  
	        }
	        
	        
	        
	        String[] columnsName = new String[3];
	        
	        columnsName[0] = "Questions";
	        columnsName[1] = "Answer";
	        columnsName[2] = "Categories";

	        Object[][] rowData = new Object[users.size()][3];
	        for(int p = 0; p < users.size(); p++){
	            
	            rowData[p][0] = users.get(p).que;
	             rowData[p][1] = users.get(p).ans;
	              rowData[p][2] = users.get(p).cate;
	               
	        }
	        
	        JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(28, 43, 598, 356);
			frame_edit.getContentPane().add(scrollPane);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(rowData,columnsName) {
			
				boolean[] columnEditables = new boolean[] {
					false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table.getColumnModel().getColumn(0).setResizable(false);
			table.getColumnModel().getColumn(1).setResizable(false);
			table.getColumnModel().getColumn(2).setResizable(false);
			table.getColumnModel().getColumn(0).setPreferredWidth(200);
			table.getColumnModel().getColumn(1).setPreferredWidth(50);
			table.getColumnModel().getColumn(2).setPreferredWidth(50);
			scrollPane.setViewportView(table);
		

	        
	        JButton btnReturn = new JButton("Return");
	        btnReturn.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        		Homepage.main(null);
	        		frame_edit.setVisible(false);
	        	}
	        });
	        btnReturn.setBounds(537, 423, 89, 23);
	        frame_edit.getContentPane().add(btnReturn);
	        
	        
		
		}
}

