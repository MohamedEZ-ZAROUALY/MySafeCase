package com.proj;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Myicon extends JLabel {
	/**
	 * 
	 */
	private static ArrayList<Integer> emptyPosition=new ArrayList<Integer>();
	private static final long serialVersionUID = 1L;
	public static int nIcon=0;
	public static int nextx=0,nexty=0;
	public static Myicon selectedIcon=null;
	File meFile;
	public String name;
	public String extention;
	private String appPath;
	private Myicon ref = this;
	private Integer refnumber;
	private JPanel PanelHolder;
	Myicon(Principale app,JPanel thispanel,File source, int mode) throws SQLException{
		super("erreur de chargement");
		PanelHolder=thispanel;
		name= new String(source.getName());
		extention = name.substring(name.lastIndexOf('.'));
		name=name.substring(0,name.lastIndexOf('.'));
		appPath = new String(source.getPath());
		ref.setText(name);
		appPath=new String(source.getAbsolutePath());
		setPlace();
		this.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/file-text-icon.png"));
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		thispanel.add(this);
		meFile = new File("../MySafeCase_V1/src/com/proj/files/"+name+extention);
		if(mode==1) {
			try {
				Files.copy(source.toPath(), meFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		getType(name);
        revalidate();
        repaint();
        
        this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedIcon=ref;
				app.IconsMenu.show(e.getComponent(),e.getX(),e.getY());
				/*System.out.println("this is "+name);
		        System.out.println(appPath);*/
		        
			}
		});
	} 
	private void getType(String Fullname) {
		switch(extention) {
		case ".docx" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/docicon.png"));break;
		case ".pdf" :ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/pdficon.png"));break;
		case ".png" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/imageicon.png"));break;
		case ".jpg" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/imageicon.png"));break;
		case ".gif" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/imageicon.png"));break;
		case ".ico" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/imageicon.png"));break;
		case ".mp3" : ref.setIcon(new ImageIcon("../MySafeCase_V1/src/com/proj/images/fileIcons/musicicon.png"));break;
		case ".txt" : break;
		
		}
	}
	private void setPlace() {
		this.setBounds(40+nextx*80, 100+nexty*80,50, 80);
		if(!emptyPosition.isEmpty()) emptyPosition.remove(0);
		nIcon++;
		if (emptyPosition.size()==0) {
			refnumber=nIcon-1;
			nextx=nIcon%6;
			nexty=nIcon/6;
		}else {
				nextx=emptyPosition.get(0)%6;
				nexty=emptyPosition.get(0)/6;
		}
		System.out.println(emptyPosition.toString());
	}
	public void setName(String NewName) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:Mysafecase.db");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("Update Files set Name='"+NewName+this.extention+"' where Name='"+this.name+this.extention+"' and Owner="+Principale.UserID+";");
			conn.close();
			System.out.println(this.name+this.extention);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		name=new String(NewName);
		ref.setText(name);
		PanelHolder.revalidate();
		PanelHolder.repaint();
		meFile.renameTo(new File("../MySafeCase_V1/src/com/proj/files/"+name+extention));
		meFile=new File("../MySafeCase_V1/src/com/proj/files/"+name+extention);
	}
	public void Cypher() {
		CypherBot bot = new CypherBot(meFile.getPath(),meFile.getPath());
        try {
			bot.cypher();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public void addToUser() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:sqlite:Mysafecase.db");
		Statement stmt = conn.createStatement();
		ResultSet rss=stmt.executeQuery("Select count(*) from Files where Name='" + this.name+this.extention + "' and Owner=" + Principale.UserID +";");
		rss.next();
		int isnew=rss.getInt(1);
		if(isnew!=0) {
			System.out.println("existing file");
			destroy();
			conn.close();
			return;
		}
		stmt.executeUpdate("insert into Files(Name,Owner) Values('" + this.name+this.extention + "'," + Principale.UserID +");");
		conn.close();
	}
	public void destroy() {
		nIcon--;
		emptyPosition.add(refnumber.intValue());
		nextx=(emptyPosition.get(0))%6;
		nexty=(emptyPosition.get(0))/6;
		try {
			RandomAccessFile raf=new RandomAccessFile(meFile,"rw");
			raf.close();
			Files.delete(meFile.toPath());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		PanelHolder.remove(this);
		PanelHolder.revalidate();
		PanelHolder.repaint();
		selectedIcon=null;
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:sqlite:Mysafecase.db");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("delete from Files where Name='" + this.name+this.extention + "' and Owner=" + Principale.UserID +";");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(emptyPosition.toString());
	}
}
