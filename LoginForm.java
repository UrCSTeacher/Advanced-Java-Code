import javax.swing.*;


	class LoginForm extends JFrame{
	
	JLabel luid; 
	JLabel lpass;
	JTextField tuid;
	JPasswordField tpass;
	JButton b1;
	JButton b2;
	
	LoginForm() //construction
	{ 		
	setSize(500,300);
	setTitle("Simple Login Form");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	luid=new JLabel("User Name");
	lpass=new JLabel("Password");
	tuid=new JTextField(15);
	tpass=new JPasswordField(20);
	b1=new JButton("Ok");
	b2=new JButton("Cancel");
	
	setLayout(null);
	luid.setBounds(20,25,200,20);
	tuid.setBounds(100,25,200,25);
	lpass.setBounds(20,70,100,20);
	tpass.setBounds(100,70,200,25);
	b1.setBounds(100,110,50,25);
	b2.setBounds(220,110,80,25);
	
	add(luid);
	add(lpass);
	add(tuid);
	add(tpass);
	add(b1);
	add(b2);
	
	setVisible(true);
	}
	public static void main(String[]agrs){
	LoginForm l=new LoginForm();
	}
	}
	
	
	