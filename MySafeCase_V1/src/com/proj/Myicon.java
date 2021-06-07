package com.proj;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Myicon extends JLabel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int nIcon=0;
	public static int nextx=0,nexty=0;
	private String name;
	private String appPath;
	private JLabel ref = this;
	Myicon(JPanel thispanel,File source){
		
		super("erreur de chargement");
		name= new String(source.getName());
		ref.setText(name);
		appPath=new String(source.getAbsolutePath());
		this.setBounds(40+nextx*80, 100+nexty*80,50, 80);
		this.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/file-text-icon.png"));
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		thispanel.add(this);

		getType(name);
        revalidate();
        repaint();
        nIcon++;
        nextPosition();
        this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("this is "+name);
		        try {
			        File destination =new File("../MySafeCase_V1/src/com/proj/files/"+name);
					Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		        System.out.println(source.toPath().toString());
			}
		});
	} 
	private void getType(String Fullname) {
		String last = Fullname.substring(Fullname.lastIndexOf('.') + 1);
		System.out.println(last);
		switch(last) {
		case "docx" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/docicon.png"));break;
		case "pdf" :ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/pdficon.png"));break;
		case "png" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/imageicon.png"));break;
		case "jpg" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/imageicon.png"));break;
		case "gif" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/imageicon.png"));break;
		case "ico" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/imageicon.png"));break;
		case "mp3" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/musicicon.png"));break;
		case "txt" : break;
		
		}
	}
	private void nextPosition() {
		nextx=nIcon%6;
		nexty=nIcon/6;
	}
}
