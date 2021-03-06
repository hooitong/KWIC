import adt.control.AdtControl;
import pipeandfilter.control.MasterControl;

import java.util.Scanner;

public class KWIC {
    private static Scanner sc;

    public static void main(String[] args) {
        while (true) {
            sc = new Scanner(System.in);
            System.out.println("Choose the following architectures:");
            System.out.println("1. Abstract Data Type");
            System.out.println("2. Pipe and Filter");
            System.out.println("3. Exit");

            if (sc.hasNextInt()) {
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        AdtControl.setup();
                        break;
                    case 2:
                        MasterControl.setup();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Option. Please choose again");
                }
            } else {
                System.out.println("Invalid Option. Please choose again");
            }
        }
    }
}
