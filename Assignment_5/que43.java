// 43.	Create a class OneBHK with instance variables roomArea,  hallArea and price.
// 	Then create default constructor that initializes instance variables with some values and 
//     a parameterized constructor that takes values for all instance variables and 
//     stores them in instance variables. 
// 	Now create a method named show()  to print OneBHK’s instance variable values.
// 	Create another class TwoBHK which has (inherites) all the properties and 
//     behaviors of OneBHK and a new instance variable room2Area. 
// 	Then create default constructor to initialize all 4 instance variables and 
//     a parameterized constructor to take the values for initialization of all instance variables. 
//     Override show() method to print all data member information.
// 	Write main method in another class (Say Demo) and store three TwoBHK flat’s information and 
//     print information using show method. Also print total amount of all flats. 


  
import java.util.Scanner;

class OneBHK
{
	float roomArea, hallArea, price;
	
	static int totalPrice = 0;
	OneBHK()
	{
		roomArea = 700;
		hallArea = 1000;
		price = 200000;
	}
	OneBHK(float roomArea, float hallArea, float price)
	{
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;

		totalPrice+=price;
	}
	void show()
	{
		System.out.println("Room Area : "+roomArea);
		System.out.println("Hall Area : "+hallArea);
		System.out.println("Price : "+price);
	}	
}


class TwoBHK extends OneBHK
{
	float room2Area;
	static float sum = 0;
	TwoBHK()
	{
		room2Area = 2000;
	}

	TwoBHK(float roomArea, float hallArea, float price, float room2Area)
	{
		super(roomArea, hallArea,price);
		this.room2Area = room2Area;
	}
	void show()
	{
		System.out.println("Room Area : "+roomArea);
		System.out.println("Room two Area : "+room2Area);
		System.out.println("Hall Area : "+hallArea);
		System.out.println("Price : "+price);
	}	
}


class que43
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);


         for(int i=0;i < 3; i++)
         {
            System.out.println("Enter the Area of Room 1"); 
            int room1=sc.nextInt();

            System.out.println("Enter the Area of Room2"); 
            int room2=sc.nextInt();

            System.out.println("Enter the Area of Hall"); 
            int hall=sc.nextInt();

            System.out.println("Enter the Price of flat"); 
            int price=sc.nextInt();
            
            TwoBHK b = new TwoBHK(room1,hall,price,room2);
            b.show();

            System.out.println("All flats Total Price "+OneBHK.totalPrice);
         }

	}
}
