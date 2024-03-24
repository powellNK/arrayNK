package homework_Array;

import java.util.Random;
import java.util.Scanner;

public class HWArray_height {
    public static void main(String[] args){
        Random generatorRand = new Random();
        int[] height = new int[25];
        for (int index = 0; index<height.length; index++){
            height[index] = generatorRand.nextInt(150,220);
            System.out.println(height[index]);
        }

        int maxHeight = height[0];
        int minHeight = height[0];
        for (int index = 0; index< height.length; index++){
            if (maxHeight<height[index]){
                maxHeight = height[index];
            }
            if (minHeight>height[index]){
                minHeight = height[index];
            }
        }
        System.out.println("Самый высокий человек ростом (" + maxHeight + "см) выше самого низкого ("+ minHeight + "см) на " + (maxHeight - minHeight) + "см");
    }
}
