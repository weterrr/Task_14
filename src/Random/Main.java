package Random;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] array =  new int[15];
        Random random = new Random();
        for (int i =0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
            //System.out.printf(" " + array[i]); Если нужну вывести массив на экран :)
        }
        OptionalInt max = Arrays.stream(array).max();
        System.out.println("Максимальное число: " + max.getAsInt());
        OptionalInt min = Arrays.stream(array).min();
        System.out.println("Минимально число: " + min.getAsInt());
        int result1;
        int result2;
        result1 = Math.abs(max.getAsInt());
        result2 = Math.abs(min.getAsInt());
        if (result1 > result2) {
            System.out.printf("Большее по модулю: " + max.getAsInt());
        }
        else if (result1 < result2) {
            System.out.printf("Большее по модулю: " + min.getAsInt());
        }
        else {
            System.out.printf("Модули чисел равны!");
        }
    }




}
