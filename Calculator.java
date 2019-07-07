import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        double num1 = 0;
        double num2 = 0;
        int operator;
        double answer;

        Scanner scanner = new Scanner(System.in); //scanner imported to allow user input

        System.out.println("Enter first operand: ");
        num1 = scanner.nextDouble(); // This allows the user to input whichever double value they would like as the first operand
        System.out.println("Enter second operand: ");
        num2 = scanner.nextDouble(); // This allows the user to input whichever double value they would like as the second operand

        System.out.println("Calculator Menu");// This represents the entire menu, which provides the options of operations the user can perform
        System.out.println("---------------");
        System.out.println("1. Addition"); //
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Which operation do you want to perform?");
        operator = scanner.nextInt();

        if (operator == 1){ // This option will add together both operand values and provide a new value as an answer
            answer = num1 + num2;
            System.out.println("The result of the operation is  " + answer + ". Goodbye!");
        }
        else if (operator == 2){ // This option will subtract both operand values and provide a new value as an answer
            answer = num1 - num2;
            System.out.println("The result of the operation is  " + answer + ". Goodbye!");
        }
        else if (operator == 3){ // This option will multiply both operand values and provide a new value as an answer
            answer = num1 * num2;
            System.out.println("The result of the operation is  " + answer + ". Goodbye!");
        }
        else if (operator == 4){ // This option will divide both operand values and provide a new value as an answer
            answer = num1 / num2;
            System.out.println("The result of the operation is  " + answer + ". Goodbye!");
        }
        else { // This else statement represents what will be outputted when the user chooses an invalid option as an operation
            System.out.println("Error: Invalid selection! Terminating program.");

        }








    }







}
