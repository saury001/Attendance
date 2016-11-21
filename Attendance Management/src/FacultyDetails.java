import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class FacultyDetails extends JFrame{
	JPanel panelContainer;
JLabel hello_lbl,date_lbl,schedule_lbl;
JScrollPane sp;	
JList schedule_list;


	FacultyDetails(){
		String time=new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
		setSize(700,500);
		setLayout(null);
		
		
		//initialization
		JPanel panelContainer=new JPanel();
		panelContainer.setLayout(new BoxLayout(panelContainer,BoxLayout.Y_AXIS));
		addScheduleItem(panelContainer,"JAVA","CS-B","9 AM");
		addScheduleItem(panelContainer,"DBMS","CS-A","11 AM");
		addScheduleItem(panelContainer,"TOC","IT","1 PM");
		sp=new JScrollPane(panelContainer);
		schedule_lbl=new JLabel("Today's schedule:");
		date_lbl=new JLabel(getDay(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))+", "+time.substring(6, 8)+"th "+getMonth(time.substring(4,6))+" "+time.substring(0, 4));
		hello_lbl=new JLabel("** Hello, Mahesh Manchanda **");
		
		
		
		//setting styles
		panelContainer.setBorder(new EmptyBorder(5,15,5,15));
		hello_lbl.setFont(hello_lbl.getFont().deriveFont(30.0f));
		date_lbl.setFont(new Font(date_lbl.getName(), Font.ITALIC, 20));
		schedule_lbl.setFont(schedule_lbl.getFont().deriveFont(20.0f));
		sp.setBackground(Color.BLACK);


		//setting positions
		hello_lbl.setBounds(120,0,500,100);
		date_lbl.setBounds(190,80,500,100);
		sp.setBounds(10,250,675,200);
		schedule_lbl.setBounds(240,170,500,100);

		//add to frame
		add(hello_lbl);
		add(date_lbl);
		add(sp);
		add(schedule_lbl);
		
		
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        this.setLocation(x, y);
		
		setVisible(true);
		setResizable(false);
	}
	

	public static void main(String a[]){
		new FacultyDetails();
	}
	String getDay(int num){
		String day="";
		switch (num){
		case 1:day="Sunday";break;
		case 2:day="Monday";break;
		case 3:day="Tuesday";break;
		case 4:day="Wednesday";break;
		case 5:day="Thursday";break;
		case 6:day="Friday";break;
		case 7:day="Saturday";break;
		}
		return day;
	}
	
	
	
	
	String getMonth(String n){
		String month="";
		int num=Integer.parseInt(n);
		switch(num){
		case 1:month= "January"; break;
		case 2:month= "February"; break;
		case 3:month= "March"; break;
		case 4:month= "April"; break;
		case 5:month= "May"; break;
		case 6:month= "June"; break;
		case 7:month= "July"; break;
		case 8:month= "August"; break;
		case 9:month= "September"; break;
		case 10:month= "October"; break;
		case 11:month= "November"; break;
		case 12:month= "December"; break;
		}
		return month;
	}
	
	void addScheduleItem(JPanel contain,String subject,String time,String clas){
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(1,4,0,0));
		panel.add(new JLabel(subject));
		panel.add(new JLabel(clas));
		panel.add(new JLabel(time));
		panel.add(new JButton("Take attendance >>"));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new EmptyBorder(5,5,5,5));
		panel.setPreferredSize(new Dimension(100,70));
		contain.add(panel);
		contain.add(Box.createRigidArea(new Dimension(0,5)));
		
	}
}
