package homework_Array;

import java.util.Random;

public class HWArray_page_in_a_book {
    public static void main(String[] args){
        int[] books = new int[100];
        int maxStr = 0;
        Random generatorRand = new Random();
        for (int index = 0; index<books.length; index++){
            books[index] = generatorRand.nextInt(1,100);
            if (maxStr<books[index]){
                maxStr = books[index];
            }
        }
        System.out.println(maxStr);
    }
}
