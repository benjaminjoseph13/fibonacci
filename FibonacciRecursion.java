import java.util.Scanner;

public class FibonacciRecursion {

    public static void main(String args[]) {

        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci: " + number +" numbers : ");

        for(int i=1; i<=number; i++){
            System.out.print(fibonacci(i) +", ");
        }
    }


    public static int fibonacci(int number){
        if(number <= 2){
            return 1;
        } else {
			return fibonacci(number-1) + fibonacci(number -2);
		}
    }
}

