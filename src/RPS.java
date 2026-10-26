
import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String again = "Y";

        while (again.equalsIgnoreCase("Y")) {

            String a = "";
            String b = "";

            while (!a.equalsIgnoreCase("R") &&
                    !a.equalsIgnoreCase("P") &&
                    !a.equalsIgnoreCase("S")) {

                System.out.println("Player A enter R, P, or S");
                a = kb.nextLine();

                if (!a.equalsIgnoreCase("R") &&
                        !a.equalsIgnoreCase("P") &&
                        !a.equalsIgnoreCase("S")) {
                    System.out.println("That is not a valid move");
                }
            }

            while (!b.equalsIgnoreCase("R") &&
                    !b.equalsIgnoreCase("P") &&
                    !b.equalsIgnoreCase("S")) {

                System.out.println("Player B enter R, P, or S");
                b = kb.nextLine();

                if (!b.equalsIgnoreCase("R") &&
                        !b.equalsIgnoreCase("P") &&
                        !b.equalsIgnoreCase("S")) {
                    System.out.println("That is not a valid move");
                }
            }
            if (a.equalsIgnoreCase(b)) {
                System.out.println("It's a tie!");
            }
            else if (a.equalsIgnoreCase("R") &&
                    b.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player A wins");
            }
            else if (a.equalsIgnoreCase("P") &&
                    b.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player A wins");
            }
            else if (a.equalsIgnoreCase("S") &&
                    b.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper");
                System.out.println("Player A wins");
            }
            else if (b.equalsIgnoreCase("R") &&
                    a.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player B wins");
            }
            else if (b.equalsIgnoreCase("P") &&
                    a.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player B wins");
            }
            else {
                System.out.println("Scissors cuts Paper");
                System.out.println("Player B wins");
            }

            System.out.println("Play again? Y or N");
            again = kb.nextLine();
        }

        System.out.println("Goodbye!");

        kb.close();
    }
}