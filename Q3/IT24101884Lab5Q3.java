import java.util.Scanner;
public class IT24101884Lab5Q3 {

	public static final double Room_Charges_Per_Day = 48000.00;
	public static final int DISCOUNT_3_TO_4_DAYS = 10;
	public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
	
		System.out.print("Enter Start Date (1-31): ");
		int StartDate = input.nextInt();
	
		System.out.print("Enter End Date (1-31): ");
		int EndDate = input.nextInt();
	
		if (StartDate < 1 || StartDate > 31 || EndDate < 1 || EndDate > 31) {
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		
		if(StartDate >= EndDate) {
			System.out.println("Error: Start Date must be less than End Date");
			return;
		}
		int NumberOfDaysReserved = EndDate - StartDate;
		
		int DiscountRate = 0;
		
		if (NumberOfDaysReserved >=3 && NumberOfDaysReserved <= 4) {
			DiscountRate = DISCOUNT_3_TO_4_DAYS;
		}
		if (NumberOfDaysReserved >= 5) {
			DiscountRate = DISCOUNT_5_OR_MORE_DAYS;
		}
		
		double TotalAmout = NumberOfDaysReserved *Room_Charges_Per_Day;
		double DiscountAmount = TotalAmout * DiscountRate / 100;
		double FinalAmount = TotalAmout - DiscountAmount;
		
		System.out.println("Room Charge Per Day: Rs. " + Room_Charges_Per_Day + "/=");
		System.out.println("Number of Days Reserved: " + NumberOfDaysReserved);
		System.out.println("Total Amount to be Paid: " + FinalAmount);
		
	}
}