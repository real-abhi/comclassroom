import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Question 1: Write a program to print whether a number is even or odd, also take input from the user.
//        System.out.print("Please enter an integer number: ");
//        int num = input.nextInt();
//        if (num % 2 == 0){
//            System.out.println("Given number is  even");
//        }
//        else{
//            System.out.println("Given number is odd");
//        }

        //Question 2: Take name as input and print a greeting message for that particular name.
//        System.out.print("Please enter your good name: ");
//        String name = input.next();
//        System.out.println("Hey" + " " +  name + " " + "IntelliJ welcomes you in its environment :)");

        //Ques 3: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        int Principal = input.nextInt();
//        float Time = input.nextFloat();
//        float rate = input.nextFloat();
//        float simpleInterest = (Principal * Time * rate) / 100;
//        System.out.println("Simple Interest:" + simpleInterest);

        //Ques 4: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        System.out.print("Enter your first number: ");
//        int num_1 = input.nextInt();
//
//        System.out.print("Enter your second number: ");
//        int num_2 = input.nextInt();
//
//        System.out.print("Choose your operator to calculate the value (+, -, *, /): ");
//        char ch = input.next().charAt(0);
//
//        if (ch == '+') {
//            System.out.println("Result: " + (num_1 + num_2));
//        }
//        else if (ch == '-') {
//            System.out.println("Result: " + (num_1 - num_2));
//        }
//        else if (ch == '*') {
//            System.out.println("Result: " + (num_1 * num_2));
//        }
//        else if (ch == '/') {
//            System.out.println("Result: " + (num_1 / num_2));
//        }
//        else {
//            System.out.println("Invalid operator");
//        }

        //Ques 5: Take 2 numbers as input and print the largest number.
//        System.out.print("Enter first number: ");
//        int num1 = input.nextInt();
//
//        System.out.print("Enter second number: ");
//        int num2 = input.nextInt();
//
//        if (num1 > num2) {
//            System.out.println("Largest number is: " + num1);
//        }
//        else {
//            System.out.println("Largest number is: " + num2);
//        }

        //Ques 6: Input currency in rupees and output in USD.
//        System.out.print("Enter amount in Rupees: ");
//        double rupees = input.nextDouble();
//
//        double usd = rupees / 83;   // conversion rate
//
//        System.out.println("Amount in USD: " + usd);

        //Ques 7: To calculate Fibonacci Series up to n numbers.
        System.out.print("Enter number of terms: ");
        int n = input.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        //Ques 8: To find out whether the given String is Palindrome or not.
//        System.out.print("Enter a string: ");
//        String str = input.nextLine();
//
//        String rev = ""; //blank reverse string initialized
//
//        for (int i = str.length() - 1; i >= 0; i--) {     //backtracking the strings
//            rev = rev + str.charAt(i);     //storing reverse values into reverse string variable
//        }
//
//        if (str.equals(rev)) {       //We use .equals() because strings in Java are objects, not primitive values
//            System.out.println("The string is Palindrome");     //example "madam-madam"
//        } else {
//            System.out.println("The string is not Palindrome");   //example "hello - olleh"
//        }

        //Ques 9: To find Armstrong Number between two given number.
        //An Armstrong number is a number where the sum of the cubes of its digits equals the number itself.

//        System.out.print("Enter starting number: ");
//        int start = input.nextInt();                //Take range from user

//        System.out.print("Enter ending number: ");
//        int end = input.nextInt();                 //Take range from user
//
//        for(int i = start; i <= end; i++) {  //The program checks every number between start and end.
//
//            int num = i;
//            int sum = 0;
//
//            while(num > 0) {
//                int digit = num % 10;    // % 10 gets the last digit. Example : 153 % 10 = 3
//                sum = sum + (digit * digit * digit);  //Add cube of digits, ex: 1³ + 5³ + 3³
//                num = num / 10;   //Remove last digit, ex: 153 / 10 = 15 -> This helps move to the next digit
//            }
//
//            if(sum == i) {       //If the sum of cubes equals the original number → Armstrong number.
//                System.out.println(i);
//            }
//        }

    }

}
