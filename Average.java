package mypackage;

public class Average{
	public static void main (String [] args){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		int sum = x + y + z;
		int average = sum / 3;
		System.out.println("The average of " + x + ", " + y + ", and " + z + " is " + average);

	}
}