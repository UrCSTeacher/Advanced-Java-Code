import javax.swing.*;
class LoginForm extends JFrame
{
	JLabel luid,lpass;
	JTextField tuid;
	JPasswordField tpass;
	JButton b1,b2;
	LoginForm()
	{
		setSize(500,300);
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		luid=new JLabel("User ID");
		lpass=new JLabel("Password");
		tuid=new JTextField(15);
		tpass=new JPasswordField(15);
		b1=new JButton("Ok");
		b2=new JButton("Cancel");
		
		setLayout(null);
		luid.setBounds(50,50,100,25);
		tuid.setBounds(170,50,200,25);
		lpass.setBounds(50,95,100,25);
		tpass.setBounds(170,95,200,25);
		b1.setBounds(170,140,60,30);
		b2.setBounds(280,140,80,30);
		add(luid);
		add(tuid);
		add(lpass);
		add(tpass);
		add(b1);
		add(b2);
		
		setVisible(true);
	}
	public static void main(String a[])
	{
		LoginForm l=new LoginForm();
	}
}
		
		

