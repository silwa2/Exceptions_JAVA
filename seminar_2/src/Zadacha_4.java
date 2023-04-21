//4. Разработайте программу, которая выбросит Exception,
//        когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Zadacha_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String inputData = null;
        while (!valid) {
            System.out.print("Введите не пустую строку: \t");
            try {
                inputData = scanner.nextLine();
                if (inputData.length() > 0) {
                    valid = true;
                } else {
                    System.out.println("Неправильный ввод. Введите заного!");
                    valid = false;
                }
            } catch (Exception ex) {
                valid = false;
            }
        }
        System.out.println("Вы ввели: " + inputData);
    }
}