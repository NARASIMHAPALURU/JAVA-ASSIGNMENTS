class MethodOverloading{
	void display(int a)
	{
		System.out.println("argument = "+a);
	}
	void display(int a,int b)
	{
		System.out.println(a+","+b);
	}
	public static void main(String [] args){
		MethodOverloading obj = new MethodOverloading();
		obj.display(5);
		obj.display(10,15);
	}
	
}