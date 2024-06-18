import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] positions = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print("Enter a position: ");

            input = scanner.nextInt();
            positions[input - 1] = 'X';

            System.out.println(" " + positions[6] + " | " + positions[7] + " | " + positions[8] +  " ");
            System.out.println("---+---+---");
            System.out.println(" " + positions[3] + " | " + positions[4] + " | " + positions[5] +  " ");
            System.out.println("---+---+---");
            System.out.println(" " + positions[0] + " | " + positions[1] + " | " + positions[2] +  " ");
        }
    }
}