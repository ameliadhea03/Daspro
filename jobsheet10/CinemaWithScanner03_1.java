import java.util.Scanner;

public class CinemaWithScanner03_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, column;
        String name, next;
        String[][] audience = new String[4][2];

        while (true) {
                System.out.println("======================================");
                System.out.println("     Welcome to the Cinema");
                System.out.println("======================================");
                System.out.println("- Menu 1 : Input audience data");
                System.out.println("- Menu 2 : Show audience list");
                System.out.println("- Menu 3 : Exit");
                System.out.println("======================================");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                    System.out.print("Enter a name: ");
                    name = sc.nextLine();
                    System.out.print("Enter row number: ");
                    row = sc.nextInt();
                    System.out.print("Enter column number: ");
                    column = sc.nextInt();
                    sc.nextLine();

                    audience [row - 1][column - 1]= name;
                    break;
                
                    case 2:
                    System.out.println("Audience list:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (audience[i][j] != null) {
                                System.out.println("Row " + (i + 1) + ", Column " + (j + 1) + ": " + audience[i][j]);
                            }
                        }
                    }
                    break;

                    case 3:
                        System.out.println("Thank you!");
                        return; // Exit the program
                    default:
                        System.out.println("Invalid menu. Please select the correct menu.");
                }

                System.out.print("Back to menu? (yes/no): ");
                next = sc.nextLine();

                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
    }

        
