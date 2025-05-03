import java.util.Scanner;
class rectangl {
 double length;
 double breadth;
	
	void getData(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length and breadth");
	length=sc.nextDouble();
	breadth=sc.nextDouble();
	sc.close();
	}

	void display(){
	System.out.println("The length is:" + length);
	System.out.println("The breadth is:" + breadth);
	}
	
	double area(){
	return length * breadth;
	}
	
	public static void main(String[]args){
	rectangl r=new rectangl();
	r.getData();
	r.display();
	System.out.println("The total area of rectangle is:" + r.area());
	}
	}
	