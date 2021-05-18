package com.proj;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Principale extends JFrame {

	private JPanel contentPane;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\safe_40px.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false); 
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(0, 0, 231, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("..\\MySafeCase_V1\\src\\com\\proj\\images\\administrator_male_40px.png"));
		lblNewLabel.setBounds(80, 36, 64, 65);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2.setBackground(new Color(176,196,222));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(new Color(135,206,250));
			}
		});
		panel_2.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(0, 136, 231, 45);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(83, 11, 62, 34);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.textHighlight);
		panel_4.setBounds(0, 0, 23, 45);
		panel_2.add(panel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\home_30px.png"));
		lblNewLabel_5.setBounds(28, 0, 45, 45);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		panel_2_1.setBackground(new Color(135, 206, 250));
		panel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_1.setBackground(new Color(176,196,222));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2_1.setBackground(new Color(135,206,250));
			}
		});
		panel_2_1.setBounds(0, 192, 231, 45);
		panel.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("MyEditor");
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(79, 11, 76, 23);
		panel_2_1.add(lblNewLabel_2);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(SystemColor.textHighlight);
		panel_4_1.setBounds(0, 0, 23, 45);
		panel_2_1.add(panel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\paste_as_text_40px.png"));
		lblNewLabel_5_1.setBounds(23, 0, 46, 45);
		panel_2_1.add(lblNewLabel_5_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		panel_2_1_1.setBackground(new Color(135, 206, 250));
		panel_2_1_1.setBounds(0, 248, 231, 45);
		panel.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_1_1.setBackground(new Color(176,196,222));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2_1_1.setBackground(new Color(135,206,250));
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("GoSecure");
		lblNewLabel_3.setFont(new Font("Georgia", Font.BOLD, 14));
		lblNewLabel_3.setBounds(78, 11, 75, 23);
		panel_2_1_1.add(lblNewLabel_3);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBackground(SystemColor.textHighlight);
		panel_4_2.setBounds(0, 0, 23, 45);
		panel_2_1_1.add(panel_4_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setIcon(new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\safe_in_40px.png"));
		lblNewLabel_5_2.setBounds(26, 0, 53, 45);
		panel_2_1_1.add(lblNewLabel_5_2);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		panel_2_1_2.setBackground(new Color(135, 206, 250));

		panel_2_1_2.setBounds(0, 304, 231, 45);
		panel.add(panel_2_1_2);
		panel_2_1_2.setLayout(null);
		panel_2_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_1_2.setBackground(new Color(176,196,222));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2_1_2.setBackground(new Color(135,206,250));
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("About");
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 14));
		lblNewLabel_4.setBounds(78, 0, 68, 45);
		panel_2_1_2.add(lblNewLabel_4);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setBackground(SystemColor.textHighlight);
		panel_4_3.setBounds(0, 0, 23, 45);
		panel_2_1_2.add(panel_4_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("");
		lblNewLabel_5_3.setIcon(new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\help_40px.png"));
		lblNewLabel_5_3.setBounds(28, 0, 50, 45);
		panel_2_1_2.add(lblNewLabel_5_3);
		
		JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setBorder(new LineBorder(new Color(0, 153, 255), 2));
		panel_2_1_2_1.setBackground(new Color(135, 206, 250));
		panel_2_1_2_1.setBounds(0, 360, 231, 45);
		panel.add(panel_2_1_2_1);
		panel_2_1_2_1.setLayout(null);
		panel_2_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_1_2_1.setBackground(new Color(176,196,222));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2_1_2_1.setBackground(new Color(135,206,250));
			}
		});
		
		JLabel lblNewLabel_4_1 = new JLabel("Sign out");
		lblNewLabel_4_1.setFont(new Font("Georgia", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(80, 11, 81, 23);
		panel_2_1_2_1.add(lblNewLabel_4_1);
		
		JPanel panel_4_4 = new JPanel();
		panel_4_4.setBackground(SystemColor.textHighlight);
		panel_4_4.setBounds(0, 0, 23, 45);
		panel_2_1_2_1.add(panel_4_4);
		
		JLabel lblNewLabel_5_4 = new JLabel("");
		lblNewLabel_5_4.setIcon(new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\shutdown_40px.png"));
		lblNewLabel_5_4.setBounds(28, 0, 52, 45);
		panel_2_1_2_1.add(lblNewLabel_5_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(229, 0, 555, 461);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel Home_panel = new JPanel();
		Home_panel.setLayout(null);
		Home_panel.setBounds(10, 11, 535, 439);
		panel_1.add(Home_panel);
		
		final JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileChooser.setDialogTitle("Browse naar de  locatie waar je de gesorteerde bestanden wil zetten en klik op \"OPEN\"");
		Home_panel.add(fileChooser, BorderLayout.NORTH);
		fileChooser.setVisible(true);
		
		JPanel Editor_panel = new JPanel();
		Editor_panel.setBounds(10, 11, 535, 439);
		panel_1.add(Editor_panel);
		Editor_panel.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		editorPane.setBounds(27, 44, 478, 328);
		Editor_panel.add(editorPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(169, 169, 169), 1, true));
		panel_3.setBounds(27, 372, 478, 56);
		Editor_panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel butt_open = new JLabel("");
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
		butt_open.setIcon(new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\button_open.png"));
		butt_open.setBounds(61, 0, 134, 56);
		panel_3.add(butt_open);
		
		JLabel butt_save = new JLabel("");
		butt_save.setIcon(new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\button_save.png"));
		butt_save.setBounds(295, 0, 128, 56);
		panel_3.add(butt_save);
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

		
		JLabel lblNewLabel_6 = new JLabel("MyEditor");
		lblNewLabel_6.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		lblNewLabel_6.setBounds(220, 11, 89, 24);
		Editor_panel.add(lblNewLabel_6);
		
		JPanel About_panel = new JPanel();
		About_panel.setLayout(null);
		About_panel.setBounds(10, 11, 535, 439);
		panel_1.add(About_panel);
		  
		JTextPane txtpnMySafecaseIs = new JTextPane();
		txtpnMySafecaseIs.setText("MySafeCase is a school project developped by Java programming language ");
		txtpnMySafecaseIs.setBounds(42, 144, 450, 230);
		About_panel.add(txtpnMySafecaseIs);

		panel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Editor_panel.setVisible(true);
				About_panel.setVisible(false);
				Home_panel.setVisible(false);
			}
		});
		panel_2_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Editor_panel.setVisible(false);
				Home_panel.setVisible(false);
				About_panel.setVisible(true);
			}
		});
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Editor_panel.setVisible(false);
				Home_panel.setVisible(true);
				About_panel.setVisible(false);
			}
		});
	}
}
