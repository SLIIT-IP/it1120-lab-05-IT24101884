import java.util.Scanner;
public class IT24101884Lab5Q1 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);

	System.out.print("Enter the first integer: ");
	int FirstInteger = input.nextInt();
	
	System.out.print("Enter the second integer: ");
	int SecondInteger = input.nextInt();
	
	System.out.print("Enter the third integer: ");
	int ThirdInteger = input.nextInt();
	
	int Smallest = FirstInteger;
	if (SecondInteger < Smallest) {
		Smallest = SecondInteger;
	}
	if (ThirdInteger < Smallest) {
		Smallest = ThirdInteger;
	}
	
	int Largest = FirstInteger;
	if (SecondInteger > Largest) {
		Largest = SecondInteger;
	}
	if (ThirdInteger > Largest) {
		Largest = ThirdInteger;
	}

	System.out.println("User entered numbers are : " + FirstInteger +" "+ SecondInteger +" "+ ThirdInteger);
	
	System.out.println("The Smallest number is: " + Smallest);
	
	System.out.println("The Largest number is: " + Largest);
		
	}
}