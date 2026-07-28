import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your rollno.: ");
//        int rollno = input.nextInt();
//        System.out.println("Your rollno is: " + rollno);

//        String name = input.next();
//        String name = input.nextLine();
//        System.out.println("your text: " + name);

        //Sum
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        int sum = num1+num2;
//        System.out.println("Your Sum = " + sum);

        //Typecasting Example:-
        byte b = 42; //byte stores values till 256 size
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d*s);
        //float + int - double = double
        System.out.println((f*b)+ " " + (i/c) + " " +(d*s));
        System.out.println(result);

        //Another example - Temperature conversion
        System.out.print("Please enter temp in celsius: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);



    }
}
