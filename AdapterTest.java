import javax.swing.*;
import java.awt.*;
import java.awt.event.*;       
public class AdapterTest extends JFrame 
{
	JTextField t1, t2, t3;
	JLabel l1,l2,l3;
	JButton b;	
	public AdapterTest() 
	{
		setTitle("Handling Key Event Using keyAdapater");
		setSize(400,300);
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
       		l1 = new JLabel("First Value:");
		l2 = new JLabel("Second Value:");
		l3 = new JLabel("Result:");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		b=new JButton("Calculate");
		Handler h=new Handler();
		b.addKeyListener(h);
		
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        	add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);		
		setVisible(true);
	}
	public static void main(String a [])
	{
		new AdapterTest();
	}
	class Handler extends KeyAdapter
	{	
		public void keyPressed(KeyEvent ke) 
		{
			int x, y, z;
			x = Integer.parseInt(t1.getText());			
			y = Integer.parseInt(t2.getText());		
			if(ke.getKeyChar() == 'a')
				z = x + y;
			else if(ke.getKeyChar() == 's')
				z = x - y;
			else
			{
				t3.setText("Press a or s");
				return;
			}
			t3.setText(String.valueOf(z));
		}		
	}
	
}
