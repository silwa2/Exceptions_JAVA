package javaErrorException.HomeWork_003;
import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные через ПРОБЕЛ (Ф.И.О, дату рождения - дд.мм.гггг, номер телефона, пол - М/Ж ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели не все данные, пожалуйста, попробуйте еще раз");
            } else System.out.println("Вы ввели лишние данные, пожалуйста, попробуйте еще раз");
        }

    }
}
