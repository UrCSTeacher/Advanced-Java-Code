import javax.swing.*;
import java.awt.*;
class DialogDemo extends JFrame
{
	JLabel l;
	JTextField f;
	JDialog d;		
	DialogDemo()
	{
		setSize(400,300);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Paraent Frame");
		
		l=new JLabel("Email");
		f=new JTextField(15);
		d=new JDialog(this,"Dialog Example",true);
		d.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		d.setSize(300,200);
		d.setLocation(50,50);
		
		d.add(l);
		d.add(f);
		setVisible(true);
		d.setVisible(true);		
	}	
	public static void main(String args[]) 
	{
		DialogDemo frame=new DialogDemo();		
	}
}
