import java.util.Scanner;
public class IT24101884Lab5Q2 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter the number of new members introduced: ");
	int NewMembers = input.nextInt();
	
	if (NewMembers < 0) {
		System.out.println("Input must be a number 0 or greater");
		return;
	}
	
	String Prize;
	switch (NewMembers) {
		case 0:
			Prize = "No Prize";
			break;
		case 1:
			Prize = "Pen";
			break;
		case 2:
			Prize = "Umbrella";
			break;
		case 3:
			Prize = "Bag";
			break;
		case 4:
			Prize = "Travelling Chair";
			break;
		default:
			Prize = "Headphone";
	}
	
	System.out.println("Prize is a : " + Prize);
	}
}