package hometask2.src;

/**
 * Created by Doomsday Device on 28.08.2017.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReaderController {
    public static int setOption(Scanner scanner) {
        int option;
        while (true) {
            try {
                option = scanner.nextInt();
                if (option < 1 || option > 5) {
                    scanner.skip(".*");
                    System.out.println("Введите корректное действие.");
                } else {
                    break;
                }
            } catch (InputMismatchException u) {
                scanner.skip(".*");
                System.out.println("Введите корректное действие.");
            }
        }
        return option;
    }


    public static double setArgument(Scanner scanner) {
        double arg;
        while (true) {
            try {
                arg = scanner.nextDouble();
                break;
            } catch (InputMismatchException u) {
                scanner.skip(".*");
                System.out.println("Введите корректное число с запятой.");
            }
        }
        return arg;
    }
}
