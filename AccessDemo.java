class Access
{
	private int a;
	int b;
	protected int c;
	public int d;
}
class AccessDemo
{
	public static void main(String a[])
	{
		Access x=new Access();
		x.a=10;//Generates compiler error because a is private 
		x.b=20;
		x.c=30; //Error
		x.d=40;
	}
}
