//47.	Create a program to demonstrate constructor chaining.


class Base{
	
	int id;
	Base(){
	
		System.out.println("Base parameterless constructor called");
	}
	
	Base(int i){
	
		this.id=i;
		System.out.println("Base parametrised constructor called");

	}
	
}

class Second_Base extends Base{

	Second_Base(){

		System.out.println("Second_Base parameterless Constructor called");
	}

	Second_Base(int i,int j){

		super(i);
		System.out.println("Second_Base parameterised Constructor called");
	}
}

class Derived extends Second_Base{

	Derived(){

		System.out.println("Derived parameterless constructor");
	}

	Derived(int i,int j,int k){

		super(i,j);
		System.out.println("Derived parameterised constructor");
	}
}

class ConstructorDemo{

	public static void main(String args[]){

        Derived m = new Derived(1,2,3);
	}
}
