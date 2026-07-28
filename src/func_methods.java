import java.util.Scanner;

public class func_methods {
    public static void main(String[] args) {
        int ans = sum2(); //function/method calling
        System.out.println("The ans is : " + ans);
    }

    //static methods are used to run in static main function. 
    static int sum2(){          //creating method and then defining it
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;     //ending the method with return statement. It will not accept any other line after return statement.
        // System.out.println("print sum");               //this line won't work because methods end on return only
    }

    static void sum(){                  //it has no return type means void.
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is : " +sum);
}
}
