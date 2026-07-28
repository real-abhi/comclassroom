import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //if condition
//        int a = 10;
//        if(a == 10){
//            System.out.println("Hello World");
//        }

        //While loop -when you don't know how many times loop is going to run use WHILE!
//          int count = 1;
//          while(count!=5){
//              System.out.println(count);
//              count++;
//          }

        //Do-While loop - it runs at-least once before checking conditions
//        int n = 1;
//        do{
//            System.out.println(n);
//            n++;
//        } while(n<=5);

        //For loop - when you know how many loop is going run use FOR!
//        for(int count = 1; count!=5; count++){
//            System.out.println(count);
//        }

        //Ques-Lowercase and Upper case
//        char ch  = sc.next().trim().charAt(0);

//        if(ch >= 'a' && ch <='z'){
//            System.out.println("Lowercase");
//        }else{
//            System.out.println("Uppercase");
//        }

//       //Ques- Find the nth Fibonacci number
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while(count<=n){
//            int temp = b;
//            b = b+a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);

        //Ques- Count the no.of times 5 has come in a number 45535
//        int n = 45535;
//        int count = 0;
//        while(n>0){
//            int rem = n%10;   // remainder - gives last digit of number
//            if(rem == 5){
//                count++;
//            }
//            n = n/10;       //it reduces number by one digit- so here in 1st iteration, num = 4553 -> 455
//        }
//        System.out.println(count);

        int num = 23597;
        int ans = 0;

        while(num>0){
            int rem = num % 10;
            num /= 10;            //num = num/10
            ans = ans*10 + rem;
        }
        System.out.println(ans);





    }
}
