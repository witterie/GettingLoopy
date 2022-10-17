import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        double C = 0;
        double F = 0;
        boolean done = false;
        String trash = "";

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter temperature in celsius: ");
            if (scanner.hasNextInt()) {
                C = scanner.nextInt();
                scanner.nextLine();
                done = true;
            } else {
                trash = scanner.nextLine();
                System.out.println(trash + "Not a valid input");
            }
        } while (!done);
        F = (C * 9 / 5 + 32);
        System.out.println("The temperature in F is: " + F);
    }
}
