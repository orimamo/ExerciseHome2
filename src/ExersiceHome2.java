
import java.util.Scanner;

public class ExersiceHome2 {

    //Ex2
    public static void main(String[] args) {
        largeThanEverage();
    }

    public static void largeThanEverage() {
        Scanner scanner = new Scanner(System.in);
        final int ARRAY_SIZE = 10;
        double sum = 0;
        int[] tenNumbers = new int[ARRAY_SIZE];
        System.out.println("Enter ten numbers");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            tenNumbers[i] = scanner.nextInt();
            sum = sum + (tenNumbers[i]);
        }
        double everage = (sum / ARRAY_SIZE);
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (tenNumbers[i] > everage) {
                System.out.print(tenNumbers[i] +",");
            }
        }
    }
}

