package com.proj;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

public class combotester extends JFrame {

	private JPanel contentPane;
	private ImageIcon iiEnglish = new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\united_kingdom_48px.png");
	private ImageIcon iiFrance = new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\france_48px.png");
	ImageIcon[] images = {iiEnglish,iiFrance};
	String[] description = {"English", "France"};
	Integer[] imageIndex = new Integer[images.length];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					combotester frame = new combotester();
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
	public combotester() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<?> comboBox = new JComboBox(imageIndex);
		comboBox.setBounds(130, 106, 150, 22);
		contentPane.add(comboBox);
			for (int i = 0; i < imageIndex.length; i++) {
				imageIndex[i] = i;
				}
		ComboBoxRenderer renderer= new ComboBoxRenderer();
		renderer.setPreferredSize(new Dimension(200, 30));
		comboBox.setRenderer(renderer);
		comboBox.setMaximumRowCount(images.length);

	
	class ComboBoxRenderer extends JLabel implements ListCellRenderer {
		public ComboBoxRenderer() {
		setOpaque(true);
		setHorizontalAlignment(CENTER);
		setVerticalAlignment(CENTER);
		}
		 
		public Component getListCellRendererComponent(JList list,Object value,int index,boolean isSelected,boolean cellHasFocus) {
		//Get the selected index. (The index param isn't
		//always valid, so just use the value.)
		int selectedIndex = ((Integer)value).intValue();
		 
		if (isSelected) {
		setBackground(list.getSelectionBackground());
		setForeground(list.getSelectionForeground());
		} else {
		setBackground(list.getBackground());
		setForeground(list.getForeground());
		}
		 
		//Set the icon and text.
		ImageIcon icon = images[selectedIndex];
		String language = description[selectedIndex];
		setIcon(icon);
		if (icon != null) {
		setText(language);
		setFont(list.getFont());
		}
		 
		return this;
		}

	}
		
}
}