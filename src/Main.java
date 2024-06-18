import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] positions = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        Scanner scanner = new Scanner(System.in);
        int input;
        char turn = 'X';
        int currentTurn = 1;

        while (true) {
            do {
                System.out.print("Enter a position: ");

                input = scanner.nextInt();
            } while (positions[input - 1] == 'X' || positions[input - 1] == 'O');

            positions[input - 1] = turn;

            System.out.println("\n " + positions[6] + " | " + positions[7] + " | " + positions[8] +  " ");
            System.out.println("---+---+---");
            System.out.println(" " + positions[3] + " | " + positions[4] + " | " + positions[5] +  " ");
            System.out.println("---+---+---");
            System.out.println(" " + positions[0] + " | " + positions[1] + " | " + positions[2] +  " \n");

            if (positions[0] == turn && positions[1] == turn && positions[2] == turn
                    || positions[3] == turn && positions[4] == turn && positions[5] == turn
                    || positions[6] == turn && positions[7] == turn && positions[8] == turn
                    || positions[6] == turn && positions[3] == turn && positions[0] == turn
                    || positions[7] == turn && positions[4] == turn && positions[1] == turn
                    || positions[8] == turn && positions[5] == turn && positions[2] == turn
                    || positions[6] == turn && positions[4] == turn && positions[2] == turn
                    || positions[8] == turn && positions[4] == turn && positions[0] == turn) {
                System.out.println(turn + " is the WINNER");
                break;
            }

            if (turn == 'X') {
                turn = 'O';
            }
            else if (turn == 'O') {
                turn = 'X';
            }

            currentTurn++;
            if (currentTurn > 9) {
                System.out.println("DRAW");
                break;
            }
        }
    }
}