import java.awt.*;
import javax.swing.*;
public class FlowLayoutDemo extends JFrame 
{
	JButton b1,b2,b3,b4,b5,b6;
	FlowLayoutDemo() 
	{
		setSize(400,150);
		setTitle("FlowLayout Demo");
		setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
		b1=new JButton("Button 1");
		b2=new JButton("Button 2");
		b3=new JButton("Button 3");
		b4=new JButton("This is Button 4");
		b5=new JButton("B5");
		b6=new JButton("Button 6");
				
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);

		setVisible(true);		
	}
	public static void main(String args[ ]) 
	{
		new FlowLayoutDemo();		
	}	
}
