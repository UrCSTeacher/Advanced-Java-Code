import javax.swing.*;
class HelloFrame extends JFrame 
{
	JLabel l;
	JTextField t;
	HelloFrame() 
	{	
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI Test");
		setLayout(null);
		l=new JLabel("Name ");
		t=new JTextField(15);
		l.setBounds(100,50,70,25);
		add(l);
		t.setBounds(200,50,150,25);
		add(t);		
		setVisible(true);	
	}
	public static void main(String args[]) 
	{
		HelloFrame hf=new HelloFrame();		
	}
}
