// 39. Create class Product with three data members (pid, price, quantity) and 
// parameterized constructor that takes values for all three data members.  
// 	Create a main method in different class (say ProductDemo) and perform following task:
// 	a. Accept information for five Product objects from user and store objects in an array
// 	b. Find pid of product with highest price. 
// 	c. Create a static method (with array of product’s object as argument) in Product class 
//     to calculate and return total amount spent on all products.
 //    ( amount spent on single product  =  price of product * quantity of product )

import java.util.Scanner;

class Product
{
	int pid, quantity;
	float price;
	
	Product(int pid, int quantity, float price)
	{
		this.pid = pid;
		this.quantity = quantity;
		this.price = price;
	}
	
	static float total(Product []obj)
	{
		Product temp_Obj;
		float sum = 0;
		for(int i = 0; i < obj.length; i++)
		{
			temp_Obj = obj[i];
			sum = sum + (temp_Obj.quantity * temp_Obj.price);
		}
		return sum;
	}
}

class que39
{
	public static void main(String[] args)
	{	
		Product obj1 = new Product(1,10,200);
		Product obj2 = new Product(2,20,400);
		Product obj3 = new Product(3,30,600);
		Product obj4 = new Product(4,40,800);
		Product obj5 = new Product(5,50,1000);

		Product obj[] = new Product[]{obj1,obj2,obj3,obj4,obj5};
		Product temp_Obj;
		float price[] = new float[obj.length];
		
		
		for(int i = 0; i < obj.length; i++)
		{
			temp_Obj = obj[i];
			price[i] = temp_Obj.price;
		}
		
		float max = 0;
		for(int i = 0; i < price.length; i++)
		{
			if(max < price[i])
			{
				max = max + price[i];
				price[i] = max - price[i];
				max = max - price[i];
			}
		}
		System.out.println("highest price: " +max);

		for(int i = 0; i<obj.length; i++)
		{
			temp_Obj = obj[i];
			if(max == temp_Obj.price)
			{
				System.out.println("pid of Product with highest price: " +temp_Obj.pid);
			}
		}
		
		float Total_Amount = Product.total(obj);
		System.out.println("Total amount spent on the Product: " +Total_Amount);
		
	}
}	
