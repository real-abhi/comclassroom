import java.sql.SQLOutput;
import java.util.Scanner;

public class switch_statements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit!");
//        }


//        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");       //here in this format each line contains break automatically, we don't need to add it manually.
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Enter number from 1-7 only!");
//
//        }

        //Nested Switch-Case example
        int empId = in.nextInt();
        String Department = in.next();

        switch (empId){
            case 1 -> System.out.println("Abhilasha");
            case 2 -> System.out.println("Kunal Kushwaha");
            case 3 -> {
                System.out.println("emp no 3");
                switch (Department) {
                    case "IT" -> System.out.println("IT Departments");
                    case "Management" -> System.out.println("Management Departments");
                    default -> System.out.println("No other departments");
                }
            }
            default -> System.out.println("Enter correct empId");
        }


    }
}
