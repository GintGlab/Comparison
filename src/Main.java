import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Введите первое число: ");

        if (scan.hasNextInt()) {
            num1 = scan.nextInt();
            System.out.println("Введите второе число: ");
            if (scan.hasNextInt()) {
                num2 = scan.nextInt();
                if (num1 > num2) {
                    System.out.println("Число " + num1 + " больше" );
                } else {
                    System.out.println("Число " + num2 + " больше" );
                }
            } else {
                System.out.println("Это не число!");
                scan.close();
            }
        } else {
            System.out.println("Это не число!");
            scan.close();
        }
    }
}