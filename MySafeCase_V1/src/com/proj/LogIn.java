package com.proj;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;


public class LogIn extends JFrame {

	private JPanel Contentpanel_signin;
	private JTextField textField_signup;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTextField textField_signin;
	private JPasswordField passwordField;
	private Component alert;
	final LogIn that_frame = this ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("..\\MySafeCase_V1\\src\\com\\proj\\images\\safe_40px.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		Contentpanel_signin = new JPanel();
		Contentpanel_signin.setBackground(new Color(135, 206, 250));
		Contentpanel_signin.setBorder(new EmptyBorder(5, 0, 5, 0));
		setContentPane(Contentpanel_signin);
		Contentpanel_signin.setLayout(null);
		setResizable(false); 
		
		JPanel panel1_signin = new JPanel();
		panel1_signin.setLayout(null);
		panel1_signin.setBorder(new LineBorder(new Color(175, 238, 238), 2, true));
		panel1_signin.setBackground(new Color(30, 144, 255));
		panel1_signin.setBounds(0, 0, 447, 461);
		Contentpanel_signin.add(panel1_signin);
		
		JLabel lblNewLabel_5 = new JLabel("");

		lblNewLabel_5.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\button5.png"));
		lblNewLabel_5.setBounds(203, 98, 186, 62);
		panel1_signin.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 255, 240));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setBounds(66, 199, 321, 62);
		panel1_signin.add(lblNewLabel);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(66, 268, 302, 2);
		panel1_signin.add(separator_2);
		
		JLabel lblNewLabel_3 = new JLabel("");

		lblNewLabel_3.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\button4.png"));
		lblNewLabel_3.setBounds(48, 98, 194, 62);
		panel1_signin.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setForeground(new Color(255, 255, 240));
		lblNewLabel_6.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_6.setBackground(new Color(240, 248, 255));
		lblNewLabel_6.setBounds(68, 281, 321, 62);
		panel1_signin.add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setBounds(445, 0, 339, 461);
		Contentpanel_signin.add(panel);
		panel.setLayout(null);
		
		JPanel panel2_signup = new JPanel();
		panel2_signup.setBounds(0, 0, 339, 461);
		panel.add(panel2_signup);
		panel2_signup.setLayout(null);
		panel2_signup.setBackground(new Color(153, 204, 255));
		
		JLabel lblNewLabel_1_1 = new JLabel("Username");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(51, 63, 109, 30);
		panel2_signup.add(lblNewLabel_1_1);
		
		textField_signup = new JTextField();
		textField_signup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_signup.setText("");
			}
		});
		textField_signup.setText("Choose a username");
		textField_signup.setOpaque(false);
		textField_signup.setForeground(Color.WHITE);
		textField_signup.setFont(new Font("Trebuchet MS", Font.ITALIC, 11));
		textField_signup.setDisabledTextColor(Color.WHITE);
		textField_signup.setColumns(10);
		textField_signup.setBorder(null);
		textField_signup.setBounds(51, 93, 209, 30);
		panel2_signup.add(textField_signup);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(51, 121, 209, 13);
		panel2_signup.add(separator_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(51, 156, 109, 30);
		panel2_signup.add(lblNewLabel_2_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField_1.setText("");
			}
		});
		passwordField_1.setText("Enter password");
		passwordField_1.setOpaque(false);
		passwordField_1.setForeground(Color.WHITE);
		passwordField_1.setBorder(null);
		passwordField_1.setBounds(51, 179, 209, 30);
		panel2_signup.add(passwordField_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(51, 209, 209, 13);
		panel2_signup.add(separator_1_1);
		
		Icon icon_disclaimer = new ImageIcon(("..\\MySafeCase_V1\\src\\com\\proj\\images\\disclaimer_40px.png"));
		
		JLabel button_create = new JLabel("");
		button_create.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Connection conn = null;
	            Statement stmt = null;
		        try
		        {	Class.forName("org.sqlite.JDBC");
		        	if (textField_signup.getText().equals("") || passwordField_1.getText().equals("") || passwordField_2.getText().equals("")) {
						JOptionPane.showMessageDialog(alert, "Veuillez remplir tous les champs ! ","Hey !",3,icon_disclaimer);
		        	}
		        	else
		        	{  conn = DriverManager.getConnection("jdbc:sqlite:Mysafecase.db");
		            String nom_utilisateur = textField_signup.getText();
		            String password_account = passwordField_1.getText();
		            stmt = conn.createStatement();
		            ResultSet rs =stmt.executeQuery("select Nom from Accounts");
		            int index = 0;
		            while (rs.next())
		            {
		            	if( nom_utilisateur.equals(rs.getString("Nom"))) {
		            		index=1;
		            	}
		            }
		            if(index!=0) {
		            	JOptionPane.showMessageDialog(alert, "Le nom que vous avez entré est déjà utilisé ,veuillez le changer ! ","Hey",3,icon_disclaimer);
		            }
		            else {
		            	if(! passwordField_1.getText().equals(passwordField_2.getText()) ) {
		            		JOptionPane.showMessageDialog(alert, "Les mots de passes ne sont pas identiques  ! ","Hey",3,icon_disclaimer);
		            	}
		            	else {
			            	stmt.executeUpdate("INSERT INTO Accounts(Nom,Pass)"+"VALUES ('"+ nom_utilisateur +"','"+ password_account +"')");
				            conn.close();
		            	}

		            }
		            
		            }
		        	
		        }
		        catch (Exception ex)
		        {
		        	JOptionPane.showMessageDialog(alert, "Cannot connect to the database right now  ! ","Hey",3,icon_disclaimer);
		        }

		        finally
		        {
		                try
		                {
		                    conn.close ();
		                }
		                catch (Exception ex)
		                {
		                }
		            }
		        }
			}
		);

		button_create.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\button6.png"));
		button_create.setBounds(76, 331, 165, 71);
		panel2_signup.add(button_create);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Verify password");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_2_1_1.setBounds(51, 233, 150, 30);
		panel2_signup.add(lblNewLabel_2_1_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField_2.setText("");
			}
		});
		passwordField_2.setText("Enter password");
		passwordField_2.setOpaque(false);
		passwordField_2.setForeground(Color.WHITE);
		passwordField_2.setBorder(null);
		passwordField_2.setBounds(51, 256, 209, 30);
		panel2_signup.add(passwordField_2);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(51, 286, 209, 13);
		panel2_signup.add(separator_1_1_1);
		
		JPanel panel2_signin = new JPanel();
		panel2_signin.setLayout(null);
		panel2_signin.setBackground(new Color(153, 204, 255));
		panel2_signin.setBounds(0, 0, 339, 461);
		panel.add(panel2_signin);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_1.setBounds(60, 82, 109, 30);
		panel2_signin.add(lblNewLabel_1);
		
		textField_signin = new JTextField();
		textField_signin.setText("Enter your username");
		textField_signin.setOpaque(false);
		textField_signin.setForeground(Color.WHITE);
		textField_signin.setFont(new Font("Trebuchet MS", Font.ITALIC, 11));
		textField_signin.setDisabledTextColor(Color.WHITE);
		textField_signin.setColumns(10);
		textField_signin.setBorder(null);
		textField_signin.setBounds(60, 112, 209, 30);
		textField_signin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_signin.setText("");
			}
		});
		panel2_signin.add(textField_signin);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_2.setBounds(60, 175, 109, 30);
		panel2_signin.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setText("Enter password");
		passwordField.setOpaque(false);
		passwordField.setForeground(Color.WHITE);
		passwordField.setBorder(null);
		passwordField.setBounds(60, 198, 209, 30);
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setText("");
			}
		});
		panel2_signin.add(passwordField);
		
		JLabel button_connection = new JLabel("");
		button_connection.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\button3.png"));
		button_connection.setBounds(66, 269, 192, 71);
		panel2_signin.add(button_connection);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(60, 140, 209, 13);
		panel2_signin.add(separator);
		separator_2.setVisible(false);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(60, 228, 209, 13);
		panel2_signin.add(separator_1);
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel2_signin.setVisible(true);
				panel2_signup.setVisible(false);
				separator_2.setVisible(true);
				lblNewLabel.setText("Sign in to your account smoothly");
				lblNewLabel_6.setText("");
			}
		});
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel2_signin.setVisible(false);
				panel2_signup.setVisible(true);
				separator_2.setVisible(true);
				lblNewLabel.setText(" Creating an account was never");
				lblNewLabel_6.setText("                   that easy !");
			}
		});
		
		Icon icon_validation = new ImageIcon(("..\\MySafeCase_V1\\src\\com\\proj\\images\\approval_40px.png"));
		
		
		button_connection.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Connection conn = null;
			      Statement stmt = null;

		        try
		        {	Class.forName("org.sqlite.JDBC");
		        	if (textField_signin.getText().equals("") || passwordField.getText().equals("")) {
						JOptionPane.showMessageDialog(alert, "Veuillez remplir tous les champs ! ","Hey",3,icon_disclaimer);
		        	}
		        	else
		        	{
			         conn = DriverManager.getConnection("jdbc:sqlite:Mysafecase.db");
		            String nom_utilisateur = textField_signin.getText();
		            String password_account = passwordField.getText();
		            stmt =conn.createStatement();
		            int index = 0 ;
		            ResultSet rs =stmt.executeQuery("select * from Accounts");
		            while (rs.next())
		            {
		            	if( nom_utilisateur.equals(rs.getString("Nom")) && password_account.equals(rs.getString("Pass"))) {
		            		JOptionPane.showMessageDialog(alert, "Bonne connection ! ","Hey",3,icon_validation);
		            		index = 1;
		            		var pr =new Principale();
		            		Principale.UserID=rs.getInt("ID");
		            		Myicon.nIcon=Myicon.nextx=Myicon.nexty=0;
		            		System.out.println("user1="+rs.getInt("ID"));
		            		pr.setVisible(true);
		            		pr.Welcome_label.setText(" Welcome " + nom_utilisateur);
		            		that_frame.setVisible(false);
		            		break;
		            	}
		            }
		            if (index == 0)
		            JOptionPane.showMessageDialog(alert, "Il se peut que vous vous êtes trompé dans le nom ou le mot de passe ! ","Hey",3,icon_disclaimer);
				    conn.close();
		        	}
		            }
		        	
		        catch (Exception ex)
		        {
		        	JOptionPane.showMessageDialog(alert, "BCannt connect to the database for the moment  ! ","Hey",3,icon_disclaimer);
		        }
		        finally {
		        	try {
						conn.close();
					} catch (SQLException e1) {
	
					}
		        }

			}
		});

	}
}
