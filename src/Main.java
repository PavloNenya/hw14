import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter real number: ");
        System.out.printf("number in power of 2 = %.5f",
                input(new Scanner(System.in).nextLine()));

    }

    /**
     * The input function takes a string as an input and returns the square of that number.
     *
     * @param number Store the number inputted by user
     *
     * @return The square of the input number
     *
     */
    public static double input(String number) {
        double doubleNumber = 0;
        try {
            doubleNumber = Double.parseDouble(number);
            if(doubleNumber > Math.sqrt(Double.MAX_VALUE)) {      // square is beyond double values
                throw new NumberIsTooLargeException();
            }
        }
        catch (NumberIsTooLargeException e) {
            System.out.println("Error! Number is too large, result may be incorrect");
        }
        catch (NumberFormatException e){
            System.out.println(("Incorrect input, can not calculate result"));
        }
        finally {
            System.out.println("Your number is: " + doubleNumber);
        }
        return doubleNumber*doubleNumber;
    }

    public static class NumberIsTooLargeException extends Exception {
        NumberIsTooLargeException() {
            super("Number is too large");
        }
        NumberIsTooLargeException(String message) {
            super(message);
        }
    }
}