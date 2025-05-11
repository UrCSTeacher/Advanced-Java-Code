import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;  
class EventDemo extends JFrame implements ActionListener
{  
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	JMenuBar mb;
	JMenu fm;
	JMenuItem mifind; 
	EventDemo()
	{ 
		setSize(400,300);
		setTitle("Action Command Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
		l1=new JLabel("Number");
		t1=new JTextField(15);
		l2=new JLabel("Factorial");
		t2=new JTextField(15);
		b1=new JButton("Find");
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 150,10));		
  		add(l1);  
		add(t1);
		add(l2);  
		add(t2);
		add(b1);
		
		mb=new JMenuBar();
		fm=new JMenu("File");
		mifind=new JMenuItem("Find Factorial");
		mb.add(fm);
		fm.add(mifind);
		setJMenuBar(mb);

		b1.addActionListener(this);  
		mifind.addActionListener(this);
  
		b1.setActionCommand("Factorial");
		mifind.setActionCommand("Factorial");  
				
		setVisible(true);    
	} 	
	public void actionPerformed(ActionEvent e)
	{  
		if(e.getActionCommand()=="Factorial")
		{
			int n=Integer.parseInt(t1.getText());
			int f=1;
			for(int i=1;i<=n;i++)
			  f=f*i;
			t2.setText(String.valueOf(f));				
		}  
	}  
	public static void main(String args[])
	{  
		new EventDemo();  
	}   
}
