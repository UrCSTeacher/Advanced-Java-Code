import javax.swing.*;
import java.awt.*;
class ColorDialog extends JFrame
{	
	JColorChooser cc;
	JPanel p;
	JDialog d;
		
	ColorDialog()
	{
		setSize(700,500);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Paraent Frame");
		p=new JPanel();
		add(p);
		setVisible(true);
		
		cc = new JColorChooser();
		Color c=cc.showDialog(this,"Select new color....", Color.white);
		p.setBackground(c);		
	}	
	public static void main(String args[]) 
	{
		ColorDialog frame=new ColorDialog();		
	}
}
