import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo extends JFrame 
{
	JButton b1,b2,b3,b4,b5,b6,b7;	
	GridLayoutDemo() 
	{
		setSize(500,200);
		setTitle("GridLayout Demo");
		setLayout(new GridLayout(3,3));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1=new JButton("Button1");
		b2=new JButton("This is Long Button2");
		b3=new JButton("Button3");
		b4=new JButton("B4");
		b5=new JButton("Button5");
		b6=new JButton("Button6");
		b7=new JButton("Button7");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		setVisible(true);		
	}
	public static void main(String args[ ]) 
	{
		GridLayoutDemo frame=new GridLayoutDemo();		
	}	
}
