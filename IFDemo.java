import javax.swing.*;
import java.awt.*;
class IFDemo extends JFrame
{
	JDesktopPane dp;
	JInternalFrame iframe;
	JTextField tb;
	JLabel lb;
	IFDemo()
	{
		setSize(400,300);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		dp=new JDesktopPane();
		iframe=new JInternalFrame("Internal Frame",true,true,true,true);
		iframe.setSize(200,200);
		iframe.setLocation(50,50);
		
		dp.add(iframe);
		add(dp);
		
		lb=new JLabel("Email");
		tb=new JTextField(15);
		iframe.setLayout(new FlowLayout(FlowLayout.CENTER));
		iframe.add(lb);
		iframe.add(tb);
		iframe.setVisible(true);		
	}	
	public static void main(String args[]) 
	{
		IFDemo frame=new IFDemo();		
	}
}
