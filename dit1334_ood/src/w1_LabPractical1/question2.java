 package w1_LabPractical1;
import java.util.Scanner; //import java scanner to read user input

public class question2 { //file name must match with public class name

	public static void main(String[] args) { //this line is compulsory
		Scanner input = new Scanner(System.in); //create scanner class to read user input
		
		System.out.println("Enter a number."); //input a number
		int number = input.nextInt();
		
		if (number % 2 == 0) { //check if number is divisible by 2 without having any remainder
			System.out.println(number + " is Even."); //check if the number is even
		} else {
			System.out.println(number + " is Odd."); //check if the number is odd
		}

	}

}
