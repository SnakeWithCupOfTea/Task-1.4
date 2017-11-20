//Ввести с клавиатуры диапазон значений целых чисел в формате "[a; b]".
// Используя этот диапазон, вывести на экран 10 случайных чисел. Выполнить
// программу без использования массивов.

package Prog;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the range of numbers");
        System.out.println("Enter minimum = ");
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        System.out.println("Enter maximum");
        int max = in.nextInt();
        System.out.println("Range["+min+"; "+max+"]");
        Random rnd = new Random(System.currentTimeMillis());
        for (int i=0; i<10; i++){
            int rnd10 = rnd.nextInt(max-min);
            System.out.println(rnd10);
        }
    }
}
