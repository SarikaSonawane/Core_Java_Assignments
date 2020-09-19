/*04.	Write a program that initializes 2 byte type of variables. 
Add the values of these variables and store in a byte type of variable. 
[Note: primitive down casting is required in this program ] .*/`



class que4{
	public static void main(String[] args) {
		byte var1 =  100;
		byte var2 = 200;

		byte add(byte)(var1+var2);	
		System.out.println(add);
	}
}