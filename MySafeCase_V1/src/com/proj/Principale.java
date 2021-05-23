package com.proj;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Principale extends JFrame {

    JPanel contentPane;
	JPanel panel_left = new JPanel();
	JPanel button_home = new JPanel();
	String languages [] = {"English","Français","Español"};
	JComboBox languages_box = new JComboBox(languages);
	JLabel lblNewLabel = new JLabel("");
	JLabel label_home = new JLabel("Home");
	JPanel panel_4 = new JPanel();
	JLabel icon_home = new JLabel("");
	JPanel button_editor = new JPanel();
	JLabel label_editor = new JLabel("MyEditor");
	JLabel icon_editor = new JLabel("");
	JPanel panel_4_1 = new JPanel();
	JPanel button_secure = new JPanel();
	JLabel label_secure = new JLabel("GoSecure");
	JPanel panel_4_2 = new JPanel();
	JLabel icon_secure = new JLabel("");
	JPanel button_about = new JPanel();
	JLabel label_about = new JLabel("About");
	JLabel icon_about = new JLabel("");
	JPanel panel_4_3 = new JPanel();
	JTextPane txtpnMySafecaseIs = new JTextPane();
	String dayNames_eng[] = new DateFormatSymbols().getWeekdays();
	String dayNames_fr[] = {"Samedi","Dimanche","Lundi","Mardi" ,"Mercredi", "Jeudi" ,"Vendredi"};
	String dayNames_es[] = { "Sábado","Domingo","Lunes", "Martes", "Miércoles","Jueves", "Viernes"};
	Calendar date = Calendar.getInstance();
	JPanel About_panel = new JPanel();
	JLabel title_editor = new JLabel("MyEditor");
	JLabel butt_open = new JLabel("");
	JPanel editor_buttons = new JPanel();
	JEditorPane editorPane = new JEditorPane();
	JPanel Editor_panel = new JPanel();
    JPanel Home_panel = new JPanel();
	JPanel panel_right = new JPanel();
	JLabel sys_day = new JLabel("");
	JLabel sys_heure = new JLabel("");
	JLabel sys_date = new JLabel("");
	JLabel icon_signout = new JLabel("");
	JPanel panel_4_4 = new JPanel();
	JLabel label_signout = new JLabel("Sign out");
	JPanel button_signout = new JPanel();
    JLabel Welcome_label = new JLabel("New label");
	JLabel waving_label = new JLabel("");
	final Principale that_frame = this ;
	private Component alert;
	String[] modes ={"Dark","Light"};
	JComboBox mode_box = new JComboBox( modes);
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principale frame = new Principale();
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
	public Principale() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("..\\MySafeCase_V1\\src\\com\\proj\\images\\safe_40px.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false); 
		
		
		panel_left.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		panel_left.setBackground(new Color(153, 204, 255));
		panel_left.setBounds(0, 0, 231, 461);
		contentPane.add(panel_left);
		panel_left.setLayout(null);



		languages_box.setBounds(111, 11, 92, 22);
		panel_left.add(languages_box);


		lblNewLabel.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\administrator_male_40px.png"));
		lblNewLabel.setBounds(21, 11, 64, 65);
		panel_left.add(lblNewLabel);

		
		button_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_home.setBackground(new Color(176,196,222));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_home.setBackground(new Color(135,206,250));
			}
		});
		
		button_home.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		button_home.setBackground(new Color(135, 206, 250));
		button_home.setBounds(0, 136, 231, 45);
		panel_left.add(button_home);
		button_home.setLayout(null);

		
		label_home.setFont(new Font("Georgia", Font.BOLD, 14));
		label_home.setBounds(83, 0, 148, 45);
		button_home.add(label_home);
		
		
		panel_4.setBackground(SystemColor.textHighlight);
		panel_4.setBounds(0, 0, 23, 45);
		button_home.add(panel_4);
		

		icon_home.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\home_30px.png"));
		icon_home.setBounds(28, 0, 45, 45);
		button_home.add(icon_home);
		

		button_editor.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		button_editor.setBackground(new Color(135, 206, 250));
		button_editor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_editor.setBackground(new Color(176,196,222));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_editor.setBackground(new Color(135,206,250));
			}
		});
		button_editor.setBounds(0, 192, 231, 45);
		panel_left.add(button_editor);
		button_editor.setLayout(null);
		

		label_editor.setFont(new Font("Georgia", Font.BOLD, 14));
		label_editor.setBounds(79, 0, 152, 45);
		button_editor.add(label_editor);
		

		panel_4_1.setBackground(SystemColor.textHighlight);
		panel_4_1.setBounds(0, 0, 23, 45);
		button_editor.add(panel_4_1);
		

		icon_editor.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\paste_as_text_40px.png"));
		icon_editor.setBounds(23, 0, 46, 45);
		button_editor.add(icon_editor);
		
		

		
		button_secure.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		button_secure.setBackground(new Color(135, 206, 250));
		button_secure.setBounds(0, 248, 231, 45);
		panel_left.add(button_secure);
		button_secure.setLayout(null);
		button_secure.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_secure.setBackground(new Color(176,196,222));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_secure.setBackground(new Color(135,206,250));
			}
		});
		
	
		label_secure.setFont(new Font("Georgia", Font.BOLD, 14));
		label_secure.setBounds(78, 0, 153, 45);
		button_secure.add(label_secure);
		
	
		panel_4_2.setBackground(SystemColor.textHighlight);
		panel_4_2.setBounds(0, 0, 23, 45);
		button_secure.add(panel_4_2);
		
		
		icon_secure.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\safe_in_40px.png"));
		icon_secure.setBounds(26, 0, 53, 45);
		button_secure.add(icon_secure);
		
		
		button_about.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		button_about.setBackground(new Color(135, 206, 250));

		button_about.setBounds(0, 304, 231, 45);
		panel_left.add(button_about);
		button_about.setLayout(null);
		button_about.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_about.setBackground(new Color(176,196,222));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_about.setBackground(new Color(135,206,250));
			}
		});
		
		
		label_about.setFont(new Font("Georgia", Font.BOLD, 14));
		label_about.setBounds(78, 0, 153, 45);
		button_about.add(label_about);
		
		
		panel_4_3.setBackground(SystemColor.textHighlight);
		panel_4_3.setBounds(0, 0, 23, 45);
		button_about.add(panel_4_3);
		

		icon_about.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\help_40px.png"));
		icon_about.setBounds(28, 0, 50, 45);
		button_about.add(icon_about);

		button_signout.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		button_signout.setBackground(new Color(135, 206, 250));
		button_signout.setBounds(0, 360, 231, 45);
		panel_left.add(button_signout);
		button_signout.setLayout(null);
		button_signout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_signout.setBackground(new Color(176,196,222));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_signout.setBackground(new Color(135,206,250));
			}
		});
		label_signout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				   int result = JOptionPane.showConfirmDialog(null, "Do you really want to sign out  ", "Terminate session ?", JOptionPane.YES_NO_OPTION);

				    if (JOptionPane.YES_OPTION == result) {
		        		var log =new LogIn();
		        		log.setVisible(true);
						that_frame.setVisible(false);	  
			}
			}});

		label_signout.setFont(new Font("Georgia", Font.BOLD, 14));
		label_signout.setBounds(80, 0, 151, 45);
		button_signout.add(label_signout);

		panel_4_4.setBackground(SystemColor.textHighlight);
		panel_4_4.setBounds(0, 0, 23, 45);
		button_signout.add(panel_4_4);

		icon_signout.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\shutdown_40px.png"));
		icon_signout.setBounds(28, 0, 52, 45);
		button_signout.add(icon_signout);

		sys_date.setFont(new Font("Tahoma", Font.BOLD, 14));
		sys_date.setForeground(new Color(255, 255, 255));
		sys_date.setBounds(10, 99, 119, 26);
		panel_left.add(sys_date);

		sys_heure.setFont(new Font("Tahoma", Font.BOLD, 14));
		sys_heure.setForeground(new Color(255, 255, 255));
		sys_heure.setBounds(129, 99, 92, 26);
		panel_left.add(sys_heure);

		sys_day.setHorizontalTextPosition(SwingConstants.CENTER);
		sys_day.setForeground(new Color(255, 255, 255));
		sys_day.setFont(new Font("Tahoma", Font.BOLD, 14));
		sys_day.setBounds(57, 74, 119, 26);
		panel_left.add(sys_day);
		

		panel_right.setBackground(new Color(30, 144, 255));
		panel_right.setBounds(229, 0, 555, 461);
		contentPane.add(panel_right);
		panel_right.setLayout(null);

		Home_panel.setLayout(null);
		Home_panel.setBounds(10, 11, 535, 439);
		panel_right.add(Home_panel);
		Welcome_label.setFont(new Font("Tahoma", Font.BOLD, 25));
		Welcome_label.setForeground(new Color(0, 102, 255));
		Welcome_label.setBounds(133, 57, 392, 52);
		
		Home_panel.add(Welcome_label);
		waving_label.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\waving_48px.png"));
		waving_label.setBounds(30, 57, 75, 52);
		
		Home_panel.add(waving_label);
		

		Editor_panel.setBounds(10, 11, 535, 439);
		panel_right.add(Editor_panel);
		Editor_panel.setLayout(null);

		editorPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		editorPane.setBounds(27, 44, 478, 328);
		Editor_panel.add(editorPane);

		editor_buttons.setBorder(new LineBorder(new Color(169, 169, 169), 1, true));
		editor_buttons.setBounds(27, 372, 478, 56);
		Editor_panel.add(editor_buttons);
		editor_buttons.setLayout(null);
		

		butt_open.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  var chooser = new java.awt.FileDialog(new Frame(),"Open a file", FileDialog.LOAD	);
					 chooser.setVisible(true);
					 	
					 	String f = chooser.getDirectory()+chooser.getFile();
						String stringbuffer= "";
						try {
							FileReader fr = new FileReader(f);
					          int i;    
					          while((i=fr.read())!=-1) {
					        	  stringbuffer += ((char)i); 
					          }
					        editorPane.setText(stringbuffer);

							fr.close();
						}
						catch(Exception e1 ){
							JOptionPane.showMessageDialog(null,e1.getMessage());
						}
			}
		});
		butt_open.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\button_open.png"));
		butt_open.setBounds(61, 0, 134, 56);
		editor_buttons.add(butt_open);
		
		JLabel butt_save = new JLabel("");
		butt_save.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\button_save.png"));
		butt_save.setBounds(295, 0, 128, 56);
		editor_buttons.add(butt_save);
		butt_save.addMouseListener(new MouseAdapter() {
			public void mouseClicked(ActionEvent e) {
				   
				  var chooser = new java.awt.FileDialog(new Frame(),"Save the file", FileDialog.SAVE);
						 chooser.setVisible(true);
						 
					
				  // chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  
				  // int result = chooser.showSaveDialog(null);
				   // chooser.setDialogTitle("Save this File ");
						 String content = editorPane.getText();
						
							    String f = chooser.getDirectory()+chooser.getFile();
								FileWriter fw;
								try {
									fw = new FileWriter(f);
									fw.write(content);
									fw.flush();
									fw.close();
								} catch (Exception e2) {
									JOptionPane.showMessageDialog(null,e2.getMessage());
								}

		}
		});
		

				title_editor.setFont(new Font("Bahnschrift", Font.BOLD, 14));
				title_editor.setBounds(220, 11, 89, 24);
				Editor_panel.add(title_editor);
				
	
		About_panel.setLayout(null);
		About_panel.setBounds(10, 11, 535, 439);
		panel_right.add(About_panel);

		txtpnMySafecaseIs.setText("MySafeCase is a scholar project of two computer engineering students who wanted to take their Java programming skills into action.The project is a Desktop Application designed to be your friend , its main purpose is to enable you to secure your desired files or folders.The software contains other features as well, you can have some fun playing our games, create your text files with our simple text editor and so on.The software is mainly coded in Java ,and other programming languages like C, Python using their helping GUI libraries. So for that dear user we wish you a good time using our application.");
		txtpnMySafecaseIs.setBounds(42, 144, 450, 230);
		About_panel.add(txtpnMySafecaseIs);

		button_editor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Editor_panel.setVisible(true);
				About_panel.setVisible(false);
				Home_panel.setVisible(false);
			}
		});
		button_about.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Editor_panel.setVisible(false);
				Home_panel.setVisible(false);
				About_panel.setVisible(true);
			}
		});
		button_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Editor_panel.setVisible(false);
				Home_panel.setVisible(true);
				About_panel.setVisible(false);
			}
		});


        
        sys_day.setText("   "+dayNames_eng[date.get(Calendar.DAY_OF_WEEK)]);
        mode_box.setBounds(111, 44, 92, 22);
        
        panel_left.add(mode_box);
		Thread clock = new Thread (){
		    public void run () {
		        for(;;){
		            Calendar Cal = new GregorianCalendar();
		            int sconde= Cal.get(Calendar.SECOND);
		            int minute= Cal.get(Calendar.MINUTE);
		            int heure= Cal.get(Calendar.HOUR_OF_DAY);
		            sys_heure.setText(String.format("%02d", heure)+" : "+ String.format("%02d",minute)+" : "+String.format("%02d",sconde));
		            int mois= Cal.get(Calendar.MONTH);
		            int jour= Cal.get(Calendar.DAY_OF_MONTH);
		            int annee= Cal.get(Calendar.YEAR);
		            sys_date.setText(String.format("%02d", jour)+" / "+String.format("%02d",mois+1)+" / "+String.format("%02d", annee));
		            try{
		                sleep(1000);}
		            catch (InterruptedException ex){}
		        }
		        
		    }
		};
		clock.start();
				
		languages_box.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (languages_box.getSelectedIndex()==1) {
					
					label_home.setText("Acceuil");
					label_editor.setText("Mon éditeur");
					label_secure.setText("Sécurise-toi");
					label_about.setText("Informations");
					label_signout.setText("Déconnexion");
					title_editor.setText("Mon éditeur");
					sys_day.setText("   "+dayNames_fr[date.get(Calendar.DAY_OF_WEEK)]);
				/*	Thread clock = new Thread (){
					    public void run () {
					        for(;;){
								sys_day.setText("   "+dayNames_fr[date.get(Calendar.DAY_OF_WEEK)]);
					        }		        
					    }
					};
					clock.start();*/
				}
				
				if (languages_box.getSelectedIndex()==2) {
					
					label_home.setText("Recepción ");
					label_editor.setText("MiEditor");
					label_secure.setText("Securidad");
					label_about.setText("Informaciónes");
					label_signout.setText("Desconexión");
					title_editor.setText("MiEditor");
					sys_day.setText("   "+dayNames_es[date.get(Calendar.DAY_OF_WEEK)]);
				/*	Thread clock = new Thread (){
					    public void run () {
					        for(;;){
								sys_day.setText("   "+dayNames_es[date.get(Calendar.DAY_OF_WEEK)]);
					        }
					    }
					};
					clock.start();*/
				}
			}
		});
		
		mode_box.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (mode_box.getSelectedIndex()==0) {
					panel_left.setBackground(new Color(21, 51, 61));
					panel_right.setBackground(new Color(54, 51, 61));
				}
				
				if (mode_box.getSelectedIndex()==1) {
					panel_left.setBackground(new Color(153, 204, 255));
					panel_right.setBackground(new Color(30, 144, 255));
				}
			}
		});
	}
	}	
