// 42.	Create a class Tile to store the edge length of a square tile, and 
//        create another class Floor to store length and width of a rectangular floor. 
// 	   Add method totalTiles(Tile t) in Floor class with Tile as argument 
//        to calculate the whole number of tiles needed to cover the floor completely.

import java.util.Scanner;

class Tile
{
	int tile_length,tile_width;
	
	Tile(int tile_length)
	{
		this.tile_length  =  tile_length;

		System.out.println("Length of a Tile is: " +tile_length);
	}
	
	int tile_needed(int floor_length, int floor_width)
	{
		int tile_area = tile_length * tile_length;
		int floor_area = floor_length * floor_width;
		int tile_needed = (floor_area / tile_area);
		return tile_needed;
	}
}

class que42
{
	int length,total,width;
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		que42 obj = new que42();
		
		System.out.print("\nEnter length of the tile: ");
		obj.length = scan.nextInt();

		Tile t = new Tile(obj.length);
		
		System.out.print("\nEnter length of the floor: ");
		obj.length = scan.nextInt();

		System.out.print("\nEnter width of the floor: ");
		obj.width = scan.nextInt();
		
		obj.total = t.tile_needed(obj.length, obj.width);
		System.out.print("\nTotal tiles needed: " +obj.total);
		
	}
}
