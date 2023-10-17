import java.util.Scanner;

public class OnlineReservationSystem {
    private static boolean[] seats = new boolean[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------");
            System.out.println("Select an option:");
            System.out.println("1) View Seats");
            System.out.println("2) Reserve Seat");
            System.out.println("3) Cancel Reservation");
            System.out.println("4) Exit");
            System.out.println("---------------------");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    viewSeats();
                    break;
                case 2:
                    reserveSeat();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void viewSeats() {
        System.out.println("\nAvailable Seats:");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i])
                System.out.print("X ");
            else
                System.out.print((i + 1) + " ");

        }
        System.out.println();
    }

    private static void reserveSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a seat number: ");
        int seatNo = scanner.nextInt();
        if (seatNo < 1 || seatNo > 10)
            System.out.println("Invalid seat number!");
        else if (seats[seatNo - 1])
            System.out.println("Seat already reserved!");
        else
            seats[seatNo - 1] = true;
            System.out.println("Done!");
    }

    private static void cancelReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a seat number: ");
        int seatNo = scanner.nextInt();
        if (seatNo < 1 || seatNo > 10) {
            System.out.println("Invalid seat number!");
        } else if (!seats[seatNo - 1]) {
            System.out.println("Seat not reserved!");
        } else {
            seats[seatNo - 1] = false;
            System.out.println("Reservation canceled!");
        }
    }
}
