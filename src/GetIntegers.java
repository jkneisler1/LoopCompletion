import java.util.Scanner;

public class GetIntegers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        System.out.println("Enter a number and then the \"Enter\" key.");
        System.out.println("After ten numbers are entered, the program will show you the total.");

        for (int i = 0; i < 10; i++) {
            num = keyboard.nextInt();
            total += num;
        }

        System.out.println("The total of all 10 numbers is " + total);
    }
}
