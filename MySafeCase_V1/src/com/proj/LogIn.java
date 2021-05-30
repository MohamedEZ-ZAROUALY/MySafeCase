package com.proj;

import java.awt.BorderLayout;
import java.sql.*;
import java.util.Calendar;
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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JComboBox;


public class LogIn extends JFrame {

	JPanel Contentpanel_signin;
	JTextField textField_signup;
	JPasswordField passwordField_1;
	JPasswordField passwordField_2;
	JTextField textField_signin;
	JPasswordField passwordField;
    Component alert;
	JLabel greeting_label1 = new JLabel("");
	JLabel Signup_button = new JLabel("",null,JLabel.CENTER);
	JPanel panel1_signin = new JPanel();
	JLabel Signin_button = new JLabel("",null,JLabel.CENTER);
	JLabel greeting_label2 = new JLabel("");
	String languages [] = {"English","Français","Español"};
	JComboBox languages_box = new JComboBox(languages);
	JPanel panel = new JPanel();
	JPanel panel2_signup = new JPanel();
	JLabel username_label = new JLabel("Username");
	JSeparator separator_3 = new JSeparator();
	JLabel password_label = new JLabel("Password");
	JSeparator separator_1_1 = new JSeparator();
	JLabel button_create = new JLabel("",null,JLabel.CENTER);
	JLabel verpassword_label = new JLabel("Verify password");
	JSeparator separator_1_1_1 = new JSeparator();
	JPanel panel2_signin = new JPanel();
	JLabel lblNewLabel_1 = new JLabel("Username");
	JLabel lblNewLabel_2 = new JLabel("Password");
	JLabel button_connection = new JLabel("",null,JLabel.CENTER);
	JSeparator separator = new JSeparator();
	JSeparator separator_1 = new JSeparator();
	final LogIn that_frame = this ;
	JLabel greeting_label3 = new JLabel("");
	JLabel greeting_label4 = new JLabel("");
	

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

		panel1_signin.setLayout(null);
		panel1_signin.setBorder(new LineBorder(new Color(175, 238, 238), 2, true));
		panel1_signin.setBackground(new Color(30, 144, 255));
		panel1_signin.setBounds(0, 0, 447, 461);
		Contentpanel_signin.add(panel1_signin);


		Signup_button.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\sign_up_en.png"));
		Signup_button.setBounds(203, 98, 234, 62);
		panel1_signin.add(Signup_button);
		

		greeting_label1.setForeground(new Color(255, 255, 240));
		greeting_label1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		greeting_label1.setBackground(new Color(240, 248, 255));
		greeting_label1.setBounds(68, 195, 321, 62);
		panel1_signin.add(greeting_label1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(66, 268, 302, 2);
		panel1_signin.add(separator_2);
		
		Signin_button.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\sign_in_en.png"));
		Signin_button.setBounds(10, 98, 232, 62);
		panel1_signin.add(Signin_button);
		

		greeting_label2.setForeground(new Color(255, 255, 240));
		greeting_label2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		greeting_label2.setBackground(new Color(240, 248, 255));
		greeting_label2.setBounds(68, 284, 321, 62);
		panel1_signin.add(greeting_label2);
		

		languages_box.setBounds(165, 38, 92, 22);
		languages_box.setSelectedItem(0);
		panel1_signin.add(languages_box);
		

		panel.setBounds(445, 0, 339, 461);
		Contentpanel_signin.add(panel);
		panel.setLayout(null);
		

		panel2_signup.setBounds(0, 0, 339, 461);
		panel.add(panel2_signup);
		panel2_signup.setLayout(null);
		panel2_signup.setBackground(new Color(153, 204, 255));
		

		username_label.setForeground(Color.WHITE);
		username_label.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		username_label.setBounds(51, 63, 209, 30);
		panel2_signup.add(username_label);
		
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
		

		separator_3.setBounds(51, 121, 209, 13);
		panel2_signup.add(separator_3);
		

		password_label.setForeground(Color.WHITE);
		password_label.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		password_label.setBounds(51, 156, 209, 30);
		panel2_signup.add(password_label);
		
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
		

		separator_1_1.setBounds(51, 209, 209, 13);
		panel2_signup.add(separator_1_1);
		
		Icon icon_disclaimer = new ImageIcon(("..\\MySafeCase_V1\\src\\com\\proj\\images\\disclaimer_40px.png"));

		
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
			            	stmt.executeUpdate("INSERT INTO Accounts  "
				                    +"VALUES ('"+ nom_utilisateur +"','"+ password_account +"')");
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

		button_create.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\create_en.png"));
		button_create.setBounds(51, 331, 209, 71);
		panel2_signup.add(button_create);
		
		

		verpassword_label.setForeground(Color.WHITE);
		verpassword_label.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		verpassword_label.setBounds(51, 233, 209, 30);
		panel2_signup.add(verpassword_label);
		
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
		

		separator_1_1_1.setBounds(51, 286, 209, 13);
		panel2_signup.add(separator_1_1_1);
		

		panel2_signin.setLayout(null);
		panel2_signin.setBackground(new Color(153, 204, 255));
		panel2_signin.setBounds(0, 0, 339, 461);
		panel.add(panel2_signin);
		

		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_1.setBounds(49, 82, 209, 30);
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
		

		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_2.setBounds(55, 175, 203, 30);
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
		

		button_connection.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\connection_en.png"));
		button_connection.setBounds(38, 269, 242, 71);
		panel2_signin.add(button_connection);
		

		separator.setBounds(60, 140, 209, 13);
		panel2_signin.add(separator);
		separator_2.setVisible(false);
		

		separator_1.setBounds(60, 228, 209, 13);
		panel2_signin.add(separator_1);
		
		greeting_label1.setText("Sign in to your account smoothly");
		greeting_label2.setText("");
		greeting_label1.setVisible(false);
		greeting_label2.setVisible(false);
		greeting_label3.setText(" Creating an account was never");
		greeting_label4.setText("                   that easy !");
		greeting_label3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		greeting_label3.setForeground(new Color(255, 255, 255));
		greeting_label3.setBounds(66, 199, 315, 55);
		
		panel1_signin.add(greeting_label3);
		greeting_label4.setForeground(Color.WHITE);
		greeting_label4.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		greeting_label4.setBounds(66, 288, 315, 55);
		
		panel1_signin.add(greeting_label4);
		greeting_label3.setVisible(false);
		greeting_label4.setVisible(false);
		
		panel2_signin.setVisible(false);
		panel2_signup.setVisible(false);
		
		Signin_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				greeting_label3.setVisible(false);
				greeting_label4.setVisible(false);
				panel2_signin.setVisible(true);
				panel2_signup.setVisible(false);
				separator_2.setVisible(true);
				greeting_label1.setVisible(true);
				greeting_label2.setVisible(true);
				textField_signin.setVisible(true);
				textField_signup.setVisible(false);
			}
		});
		Signup_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				greeting_label1.setVisible(false);
				greeting_label2.setVisible(false);
				panel2_signin.setVisible(false);
				panel2_signup.setVisible(true);
				separator_2.setVisible(true);
				greeting_label3.setVisible(true);
				greeting_label4.setVisible(true);
				textField_signin.setVisible(false);
				textField_signup.setVisible(true);

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
		            		pr.setVisible(true);
		            		pr.languages_box.setSelectedIndex(languages_box.getSelectedIndex());
		            		if (languages_box.getSelectedIndex() == 0) {
		            			pr.Welcome_label.setText(" Welcome " + nom_utilisateur);
		            		}
		            		if (languages_box.getSelectedIndex() == 1) {
		            			pr.Welcome_label.setText(" Bienvenue " + nom_utilisateur);
		            		}
		            		if (languages_box.getSelectedIndex() == 2) {
		            			pr.Welcome_label.setText(" Bienvenidos " + nom_utilisateur);
		            		}
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
		        	JOptionPane.showMessageDialog(alert, "Cannt connect to the database for the moment  ! ","Hey",3,icon_disclaimer);
		        }
		        finally {
		        	try {
						conn.close();
					} catch (SQLException e1) {
	
					}
		        }

			}
		});
		
		languages_box.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (languages_box.getSelectedIndex()== 0) {
					button_create.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\create_en.png"));
					button_connection.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\connection_en.png"));
					Signup_button.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\sign_up_en.png"));
					Signin_button.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\sign_in_en.png"));
					greeting_label1.setText("Sign in to your account smoothly");
					greeting_label2.setText("");
					greeting_label3.setText(" Creating an account was never");
					greeting_label4.setText("                   that easy !");
					username_label.setText("Username");
					password_label.setText("Password");
					verpassword_label.setText("Verify password");
					lblNewLabel_1.setText("Username");
					lblNewLabel_2.setText("Password");
					textField_signin.setText("Enter your username");
					textField_signup.setText("Choose a username");
				}
				
				if (languages_box.getSelectedIndex()==1) {
					button_create.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\create_fr.png"));
					button_connection.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\connection_fr.png"));
					Signup_button.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\sign_up_fr.png"));
					Signin_button.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\sign_in_fr.png"));
					greeting_label1.setText("Connecte-toi avec un seul clic !");
					greeting_label2.setText("");
					greeting_label3.setText(" Créer un compte n'était jamais");
					greeting_label4.setText("                   aussi facil !");
					username_label.setText("Nom d'utilisateur");
					password_label.setText("Mot de passe");
					verpassword_label.setText("Vérifier le mot de passe");
					lblNewLabel_1.setText("Nom d'utilisateur");
					lblNewLabel_2.setText("Mot de passe");
					textField_signin.setText("Entrer votre nom d'utilisateur");
					textField_signup.setText("Choisir votre nom d'utilisateur");
				}

				
				if (languages_box.getSelectedIndex()==2) {
					button_create.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\create_es.png"));
					button_connection.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\connection_es.png"));
					Signup_button.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\sign_up_es.png"));
					Signin_button.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\sign_in_es.png"));
					greeting_label1.setText("Inicie sesión  sin problemas !");
					greeting_label2.setText("");
					greeting_label3.setText(" Crear una cuenta nunca fue ");
					greeting_label4.setText("                   tan fácil !");
					username_label.setText("Nombre de usuario");
					password_label.setText("Contraseña");
					verpassword_label.setText("Verificar contraseña");
					lblNewLabel_1.setText("Nombre de usuario");
					lblNewLabel_2.setText("Contraseña");
					textField_signin.setText("Entrar su nombre de usuario");
					textField_signup.setText("Escoger su nombre de usuario");
				}
			}
		});

	}
}
