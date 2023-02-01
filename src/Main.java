import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        zadacha0();
        zadacha1();
    }
    static void zadacha0() {
        /*
        Пусть дан произвольный список целых чисел, удалить из него четные числа
         */
        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            list1.add(random.nextInt(100));
        }
        System.out.println(list1 + " Начальный список");

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1 + " Список нечётных чисел");
    }
    static void zadacha1() {
        /*
        Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
         */
        List<Integer> list2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            list2.add(random.nextInt(100));
        }
        System.out.println(list2 + " Случайный список");
        int min = Collections.min(list2);
        int max = Collections.max(list2);
        int summ = 0;
        for (int i : list2) {
            summ += i;
        }
        double average = (double) summ / list2.size();

        System.out.println("Максимальное число: " + max +
                "\nМинимальное число: " + min +
                "\nсреднее арифметическое: " + average );
    }
}