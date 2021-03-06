import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginForm extends JFrame implements ActionListener{
	JLabel title_lbl,student_lbl,faculty_lbl;
	JTextField fac_username_tf,fac_password_tf,stud_username_tf,stud_password_tf;
	JButton login_student,login_faculty;
	JButton btn,btn2;
     LoginForm(){
    	 
    	 //adjusting window display
    	 setTitle("ATTENDANCE MANAGER");
    	 setLayout(null);
    	 setSize(600,400);
         setResizable(false);
    	 setBackground(Color.GREEN);
    	 //initialize labels
    	 title_lbl=new JLabel("WELCOME TO ATTENDANCE MANAGER");
    	 title_lbl.setFont(title_lbl.getFont().deriveFont(20.0f));
    	 student_lbl=new JLabel("     Login as Student ");
    	 student_lbl.setFont(new Font(student_lbl.getName(), Font.ITALIC, 18));
    	 faculty_lbl=new JLabel("     Login as Faculty ");
    	 faculty_lbl.setFont(new Font(faculty_lbl.getName(), Font.ITALIC, 18));
    	 fac_username_tf=new JTextField("  Enter username",10);
    	 fac_password_tf=new JTextField("  Enter Password",10);
    	 stud_username_tf=new JTextField("  Enter enrollment",10);
    	 stud_password_tf=new JTextField("  Enter password",10);
    	
    	 //image
    	 JLabel img =new JLabel(new ImageIcon("line2.png"));
    	 
    	 //create panels
    	 JPanel title_pnl=new JPanel();
    	 title_pnl.setBackground(new Color(213, 134, 145, 123));
    	 JPanel student_pnl=new JPanel(new GridLayout(4,1,0,20));
    	 JPanel faculty_pnl=new JPanel(new GridLayout(4,1,0,20));
    	 
         //create menu bar
    	 JMenuBar mb = new JMenuBar();
    	 JMenu m1 = new JMenu("FILE");
    	 JMenu m2 = new JMenu("Help");
    	 mb.add(m1);
    	 mb.add(m2);
    	 JMenuItem m11 = new JMenuItem("Open");
    	 JMenuItem m22 =new JMenuItem("Save as");
    	 m1.add(m11);
    	 m1.add(m22);
    	 
    	 //create buttons
    	  btn=new JButton(new ImageIcon("login_btn.png"));
    	btn.setOpaque(false);
    	btn.setContentAreaFilled(false);
    	btn.setBorderPainted(false);
    	  btn2=new JButton(new ImageIcon("login_btn.png"));
     	btn2.setOpaque(false);
     	btn2.setContentAreaFilled(false);
     	btn2.setBorderPainted(false);
     	btn2.setEnabled(true);
    	 
    	 //add items to panel 1
    	 title_pnl.add(title_lbl);
    	 
    	 //add items to panel 2
    	 student_pnl.add(student_lbl);
    	 student_pnl.add(stud_username_tf);
    	 student_pnl.add(stud_password_tf);
    	 student_pnl.add(btn);
    	 


    	 //add items to panel 3
    	 faculty_pnl.add(faculty_lbl);
    	 faculty_pnl.add(fac_username_tf);
    	 faculty_pnl.add(fac_password_tf);
    	 faculty_pnl.add(btn2);
    	 
    	 
    	 //sizing and positioning panels
    	 mb.setBounds(0,0,this.getWidth(),25);
    	 title_pnl.setBounds(0,50,this.getWidth(),35);
    	 student_pnl.setBounds(0,100,290,250);
         student_pnl.setBorder(BorderFactory.createEmptyBorder(40, 50, 30, 50));
         faculty_pnl.setBounds(310,100,290,250);         
         faculty_pnl.setBorder(BorderFactory.createEmptyBorder(40, 50, 30, 50));
         img.setBounds(299, 100, 2, 250);
         
         
         //add listeners
         btn.addActionListener(this);
         btn2.addActionListener(this);
         
         //add components to frame
         add(mb);
         add(title_pnl);
         add(img);
         add(student_pnl);
         add(faculty_pnl);
        
         
         //set windows visible
         setVisible(true);
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

         // Determine the new location of the window
         int w = this.getSize().width;
         int h = this.getSize().height;
         int x = (dim.width-w)/2;
         int y = (dim.height-h)/2;

         // Move the window
         this.setLocation(x, y);	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==btn)
		{	
			//new Information(fac_username_tf.getText().toString());
			new StudentDetails();
			
		}
		if(arg0.getSource()==btn2)
		{	
			//new Information(fac_username_tf.getText().toString());
			new FacultyDetails();
			
		}
		
		dispose();
	}
	
	public static void main(String a[]){
		new LoginForm();
	}

}
