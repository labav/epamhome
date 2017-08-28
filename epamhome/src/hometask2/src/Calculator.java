package hometask2.src;

/**
 * Created by Doomsday Device on 28.08.2017.
 */

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {

        int option;
        double arg_1;
        double arg_2;
        double result;
        String[] buffer = new String[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет, я калькулятор.");
        System.out.println("Выберите действие:\n" +
                "1 - сложение\n" +
                "2 - вычитание\n" +
                "3 - умножение\n" +
                "4 - деление\n" +
                "5 - выход");

        option = ReaderController.setOption(scanner);
        if(option == 5){
            System.out.println("Выход из программы");
            System.exit(0);
        }

        System.out.println("Введите первый аргумент:");
        arg_1 = ReaderController.setArgument(scanner);
        System.out.println("Введите второй аргумент:");
        arg_2 = ReaderController.setArgument(scanner);

        CalculusController calculusController = new CalculusController();
        result = calculusController.doTheCalculation(option, arg_1, arg_2);

        buffer = GraphicController.getNumber(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(buffer[i]);
        }
    }
}
