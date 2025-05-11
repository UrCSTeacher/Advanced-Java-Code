import java.util.*;
class Circle
{
	public static void main(String args[])
	{
		float r;//variable
		final float PI=3.1415f; //constant
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Radius");
		r=s.nextFloat();
		float a=PI*r*r;
		System.out.println("Area="+a);
	}
}
		