	import java.util.Scanner;
	public class Rectangle{
	int l,b,h;

	void getInput(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length");
	l=sc.nextInt();
	System.out.println("Enter the bredthe");
	b=sc.nextInt();
	System.out.println("Enter the height");
	h=sc.nextInt();
	}
	void area(){
	double a=l*b;
	system.out.println("The area of the rectangle is:"+a);
	}
	void volumn(){
	double v=l*b*h;
	System.out.println("The volumn of rectangle is:"+v);
	}
	
	public static void main(String[]args){
	Rectangle rec=new Rectangle();
	rec.getInput();
	rec.area();
	rec.volumn();
	}
	}