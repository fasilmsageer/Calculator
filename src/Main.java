import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an option : 1, 2, 3, 4 or 5");
        System.out.println(" 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division or 5 to exit");
        operator = input.next().charAt(0);

        System.out.println("Enter first number: ");
        number1 =input.nextDouble();

        System.out.println("Enter second number: ");
        number2 =input.nextDouble();

        switch (operator){

            case '1':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '2':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '3':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '4':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
        }


    }
}