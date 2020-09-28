//46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting.


class Person{

	void getDetail(){
	
		System.out.println("person details");
	}
	
	void getJob(){

		System.out.println("Person job");
	}
}


class Employee extends Person{

	void getJob(){

		System.out.println("Employee job");
	}

	void getDept(){
		System.out.println("Employee dept");
	}
}


class que46{

	public static void main(String args[]){

        Employee e1=new Employee();
        Employee e2=new Employee();

        Person p1=new Person();
		Person ar[] = {e1,e2,p1}; 
		
		for(Person a : ar){

			if(a instanceof Employee){
			
			  Employee e = (Employee)a;
			  e.getJob();
			
			}
		}
	}
}
