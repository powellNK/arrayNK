package homework_Array;

import java.util.Random;
import java.util.Scanner;

public class HWArray1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Random generatorRand = new Random();
        System.out.println("Введите количество элементов массива:");
        int countElements = reader.nextInt();
        int[] array = new int[countElements];
        for (int index = 0; index<array.length; index++){
            array[index] = generatorRand.nextInt(1,100);
            System.out.println(array[index]);
        }

        int indexMaxElement = 0;
        int indexMinElement = 0;
        int maxElement = array[indexMaxElement];
        int minElement = array[indexMinElement];
        for (int index = 0; index< array.length; index++){
            if (maxElement<array[index]){
                maxElement = array[index];
                indexMaxElement = index;
            }
            if (minElement>array[index]){
                minElement = array[index];
                indexMinElement = index;
            }
        }
        System.out.println("Максимальный элемент: " + maxElement + " Индекс: " + indexMaxElement);
        System.out.println("Минимальный элемент: " + minElement + " Индекс: " + indexMinElement);
        System.out.println("Максимальный элемент (" + maxElement + ") больше минимального ("+ minElement + ") на " + (maxElement - minElement));
    }
}
