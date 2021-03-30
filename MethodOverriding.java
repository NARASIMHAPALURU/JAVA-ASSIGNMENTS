class parent{
	void show(){
		System.out.println("Parent class");
	}
}
class child extends parent{
	void show(){
		System.out.println("Child class");
	}
}
class MethodOverriding{
	public static void main (String [] args){
		parent obj1 = new parent();
		obj1.show();
		parent obj2 = new child();
		obj2.show();
	}
}
		
		