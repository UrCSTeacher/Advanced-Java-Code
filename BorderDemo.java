import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
class BorderDemo extends JFrame
{
	JPanel p1,p2,p3,sp1,sp2;
	JLabel l;
	
	BorderDemo()
	{
		setSize(500,400);		
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Border Demo");
		setLayout(new BorderLayout());
		
		//Creating Jpanel Objects
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		sp1=new JPanel();
		sp2=new JPanel();

		//Setting size of Jpanels
		p1.setPreferredSize(new Dimension(500,50));
		p2.setPreferredSize(new Dimension(50,400));

		//Setting Borders
		p1.setBorder(BorderFactory.createRaisedBevelBorder());
		p2.setBorder(BorderFactory.createRaisedBevelBorder());
		p3.setBorder(BorderFactory.createTitledBorder("Registration Form"));

		//Adding Panels in frame
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.WEST);
		add(p3,BorderLayout.CENTER);

		p3.setLayout(new GridLayout()); //setting grid layout in p3
		
		//setting border for sub panels
		sp1.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		sp2.setBorder(BorderFactory. createLoweredBevelBorder());
		//sp2.setBorder(BorderFactory.createCompoundBorder(BorderFactory. createLoweredBevelBorder(),BorderFactory.createLineBorder(Color.red,2)));

		//adding panels to p3
		p3.add(sp1);
		p3.add(sp2);

		//adding Labels in Panels
		p1.add(new JLabel("Tool Bar Here",JLabel.CENTER));
		p2.add(new JLabel("Buttons Here",JLabel.CENTER));
		sp1.add(new JLabel("Labels Here",JLabel.CENTER));
		sp2.add(new JLabel("Input Contols Here",JLabel.CENTER));

		setVisible(true);
	}	
	public static void main(String args[]) 
	{
		BorderDemo frame=new BorderDemo();		
	}
}
