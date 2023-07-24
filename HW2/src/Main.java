import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



//        1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.

        System.out.println("\n\n Q1 output:");

        System.out.println("please enter two numbers to do some operations...");

        System.out.print("the first number: ");
        int first_number = input.nextInt();

        System.out.print("the second number: ");
        int second_number = input.nextInt();
        input.nextLine();
        System.out.println( first_number + " + " +  second_number + " = " + (first_number + second_number) );
        System.out.println( first_number + " - " +  second_number + " = " + (first_number - second_number) );
        System.out.println( first_number + " X " +  second_number + " = " + (first_number * second_number) );
        System.out.println( first_number + " / " +  second_number + " = " + (first_number / second_number) );
        System.out.println( first_number + " mod " +  second_number + " = " + (first_number % second_number) );




//        2.Write a Java program to convert a given string into lowercase.

        System.out.println("\n\n Q2 output:");


        System.out.println("enter uppercase string to convert to lowercase: ");
        String txt = input.nextLine();

        System.out.println(txt.toLowerCase());



//        3.Write a Java program that takes a string and a number from the user,then prints the character in the given index.

        System.out.println("\n\n Q3 output:");


        System.out.print("enter any string: ");
        String user_string = input.nextLine();

        System.out.print("enter index to get char from the string: ");
        int index = input.nextInt();
        input.nextLine();

        System.out.println("the char is: " + user_string.charAt(index));



//        4.Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. (use if-statement)

        System.out.println("\n\n Q4 output:");


        System.out.println("Determine if the number is even or odd...");
        System.out.print("please enter a number: ");
        int number = input.nextInt();
        input.nextLine();

        if ( number % 2 == 0 ) {
            System.out.println(1 + " means it's even");
        }else System.out.println(0 + " means it's odd");



//        5.Write a program that checks the role of the user

        System.out.println("\n\n Q5 output:");


        System.out.print("please enter your role: ");
        String role = input.nextLine();

        if ( role.equalsIgnoreCase("admin") ) {
            System.out.println("welcome admin");
        } else if ( role.equalsIgnoreCase("superuser") ) {
            System.out.println("welcome superuser");
        }else if ( role.equalsIgnoreCase("user") ) {
            System.out.println("welcome user");
        }else System.out.println("welcome " + role);



//        6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

        System.out.println("\n\n Q6 output:");


        System.out.println("please enter three integers to calculate the sum of two first integers then compare with the third one ... ");

        System.out.print("the first number: ");
        int num1 = input.nextInt();

        System.out.print("the second number: ");
        int num2 = input.nextInt();

        System.out.print("the third number: ");
        int num3 = input.nextInt();

        int sum = num1 + num2;

        if ( sum == num3 ) {
            System.out.println("The result is: " + true);
        }else System.out.println("The result is: " + false);



//        7.Take three numbers from the user and print the greatest number.

        System.out.println("\n\n Q7 output:");


        System.out.println("please enter three numbers to print the greatest one ...");

        System.out.print("the 1st number: ");
        int first_num = input.nextInt();

        System.out.print("the 2nd number: ");
        int sec_num = input.nextInt();

        System.out.print("the 3rd number: ");
        int third_num = input.nextInt();

        if (first_num >= sec_num && first_num >= third_num) {
            System.out.print("the greatest number: " + first_num);
        } else if (sec_num >= first_num && sec_num >= third_num) {
            System.out.print("the greatest number: " + sec_num);
        } else {
            System.out.print("the greatest number: " + third_num);
        }



//        8.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

        System.out.println("\n\n Q8 output:");


        System.out.println("please enter a number between 1 to 7 to know the weekday: ");
        int day_number = input.nextInt();

        switch (day_number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Entry...");
        }



    }
}