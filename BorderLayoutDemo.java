import java.awt.*;
import javax.swing.*;
public class BorderLayoutDemo extends JFrame 
{	
	JButton b1,b2,b3,b4,b5;
	BorderLayoutDemo() 
	{
		setSize(500,250);
		setTitle("BorderLayout Demo");
		setLayout(new BorderLayout());
		
		b1=new JButton("Button1");
		b2=new JButton("Button2");
		b3=new JButton("Button3");
		b4=new JButton("Button4");
		b5=new JButton("Button5");
			
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);

		setVisible(true);		
	}
	public static void main(String args[ ]) 
	{
		BorderLayoutDemo f=new BorderLayoutDemo();		
	}	
}
