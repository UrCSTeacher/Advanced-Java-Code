import java.util.*;
	
class UserInput
{
	public static void main(String [] args)
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any two numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=a+b;
	System.out.println("The total of a and b is "+c);
}
} 