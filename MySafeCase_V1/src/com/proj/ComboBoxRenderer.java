package com.proj;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
 
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
 
/**
 * Customer renderer for JComboBox
 * @author www.codejava.net
 *
 */
class ComboBoxRenderer extends JLabel implements ListCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon iiEnglish = new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\united_kingdom_48px.png");
	private ImageIcon iiFrance = new ImageIcon("C:\\Users\\Mohamed\\Documents\\MySafeCase_V1\\src\\com\\proj\\images\\france_48px.png");
	ImageIcon[] images = {iiEnglish,iiFrance};
	String[] description = {"English", "France"};
	Integer[] imageIndex = new Integer[images.length];
	public ComboBoxRenderer() {
	setOpaque(true);
	setHorizontalAlignment(CENTER);
	setVerticalAlignment(CENTER);
	for (int i = 0; i < imageIndex.length; i++) {
		imageIndex[i] = i;
		}
		 
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