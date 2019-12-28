class Base 
{ 

	void Print() 
	{ 
		System.out.println("Base class"); 
	} 
} 

class Derived1 extends Base 
{ 

	void Print() 
	{ 
		System.out.println("Derived Class 1"); 
	} 
} 

class Derived2 extends Base 
{ 

	void Print() 
	{ 
		System.out.println("Derived Class2"); 
	} 
} 

class RunPolymorphismExample 
{ 
	public static void main(String[] args) 
	{ 

		Base b; 

		b = new Derived1(); 
		b.Print(); 

		b = new Derived2(); 
		b.Print(); 
	} 
} 
