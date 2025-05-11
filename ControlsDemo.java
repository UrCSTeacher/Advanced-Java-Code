import javax.swing.*;
import java.awt.*;
class ControlsDemo extends JFrame
{
	JPanel p1,p2,p3,p4,p5;
	JLabel lname, lpass,lsex,lhobby,lcountry,lcomment,lh;
	JTextField tname; 	
	JPasswordField tpass;
	JRadioButton rmale,rfemale; 
	ButtonGroup bg;
	JCheckBox cplay,cread,cvisit,ctkt;
	JComboBox ccountry; 	
	JTextArea tcomment;
	JScrollPane sp;
	JButton b1,b2;
		
	ControlsDemo()
	{
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Controls Demo");
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();		
		p1.setPreferredSize(new Dimension(700,50));
		p2.setPreferredSize(new Dimension(50,500));

		//Adding three panels in frame
		setLayout(new BorderLayout());
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.WEST);
		add(p3,BorderLayout.CENTER);
		p3.setLayout(new GridLayout(1,2));

		//Adding two panels in Panel p3
		p3.add(p4);
		p3.add(p5);
		
		//Defining border of panels
		p1.setBorder(BorderFactory.createLineBorder(Color.black));
		p2.setBorder(BorderFactory.createLineBorder(Color.black));
		p3.setBorder(BorderFactory.createLineBorder(Color.black));
		
		//No Layout Mnager
		p4.setLayout(new FlowLayout(FlowLayout.LEFT, 150,25));
		p5.setLayout(new FlowLayout(FlowLayout.LEFT, 50,20));

		//Seting background color of panels
		p4.setBackground(Color.ORANGE);
		p5.setBackground(Color.CYAN);
		
		
		//Creating and Adding Label and Text field		
		lname=new JLabel("User Name");
		tname=new JTextField(20);
		p4.add(lname);
		p5.add(tname);

		//Creating and Adding password field
		lpass=new JLabel("Password");
		tpass=new JPasswordField(20);		
		p4.add(lpass);
		p5.add(tpass);
		
		//Creating and Adding Radion Button
		lsex=new JLabel("Sex");
		rmale=new JRadioButton("Male",true);
		rfemale=new JRadioButton("Female");
		bg=new ButtonGroup();
		bg.add(rmale);
		bg.add(rfemale);
		p4.add(lsex);
		p5.add(rmale);
		p5.add(rfemale);

		//Creating and Adding ckeckbox
		lhobby=new JLabel("Hobbies");
		cplay=new JCheckBox("Playing");
		cread=new JCheckBox("Reading");
		cvisit=new JCheckBox("Visiting");
		ctkt=new JCheckBox("Ticketing");
		p4.add(lhobby);
		p5.add(cplay);
		p5.add(cread);
		p5.add(cvisit);
		p5.add(ctkt);
		
		lh=new JLabel("      ");
		p4.add(lh);
		

		//Creating and Adding combo box
		lcountry=new JLabel("Select Country");
		ccountry=new JComboBox();
		ccountry.addItem("Select Country");
		ccountry.addItem("Nepal");
		ccountry.addItem("India");
		ccountry.addItem("China");
		ccountry.setSelectedIndex(0);
		p4.add(lcountry);
		p5.add(ccountry);

		//Creating and adding text area and scroll pane
		lcomment=new JLabel("Comments");
		tcomment=new JTextArea(3,20);
		sp=new JScrollPane(tcomment);		
		p4.add(lcomment);
		p5.add(sp);
		b1=new JButton("Ok");
		b2=new JButton("Cancel");
		p5.add(b1);
		p5.add(b2);
		setVisible(true);
	}
	public static void main(String args[]) 
	{
		ControlsDemo f=new ControlsDemo();		
	}
}
