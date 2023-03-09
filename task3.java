/* 3. Напишите метод, который принимает на вход строку (String) и определяет является ли 
    *строка палиндромом (возвращает boolean значение).
*/

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String text = input.next();
        input.close();
        String reverse = "";
        for (int i = 0; i < text.length(); i++) {
            reverse = text.charAt(i) + reverse;
        }
        System.out.println(reverse);
        System.out.println(text.equals(reverse));
    }
}
