package w1_LabPractical1;
import java.util.Scanner;//import java scanner to read user input

public class question1 { //file name must match with public class name

	public static void main(String[] args) { //this line is compulsory
		Scanner input = new Scanner(System.in); //create scanner class to get user input
		
		System.out.print("Enter First Number"); //input first number
		int num1 = input.nextInt(); //read the input and store in variable num1
		
		System.out.print("Enter second number: "); //input second number
		int num2 = input.nextInt(); //read the input and store in variable num2
		
		int sum = num1 + num2; 
		System.out.println("The sum is: " + sum); //calculate the total sum

	}
}
