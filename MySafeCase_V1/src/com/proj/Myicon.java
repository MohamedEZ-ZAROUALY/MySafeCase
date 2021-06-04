package com.proj;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	Myicon(JPanel thispanel){
		
		super("erreur de chargement");
		
		JFileChooser scan = new JFileChooser();
		scan.showOpenDialog(thispanel);
		name=scan.getSelectedFile().getName();
		ref.setText(name);
		this.setBounds(40+nextx*80, 100+nexty*80, 50, 50);
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
			}
		});
	}
	private void getType(String Fullname) {
		String last = Fullname.substring(Fullname.lastIndexOf('.') + 1);
		System.out.println(last);
		if(last.compareTo("jpg")==0){
			System.out.println(0);

			ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/imageicon.png"));
		}
	}
	private void nextPosition() {
		nextx=nIcon%6;
		nexty=nIcon/6;
	}
}
