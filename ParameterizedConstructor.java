	
		class ParameterizedConstructor{
		String name;
		int age;
		String address;
		
		ParameterizedConstructor(String n, int A, String a){
		name=n;
		age=A;
		address=a;
		
		}
		
		void display(){
		System.out.println("My name is:"+name);
		System.out.println("I am:"+age);
		System.out.println("I am from:"+address);
		}
		
		public static void main(String[]args){
		ParameterizedConstructor pa=new ParameterizedConstructor("Sabita", 20, "Jiri");
		pa.display();
		}
		}
		