import java.util.Random;

public class lesson_array {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // массив из 5 элементов. по умолчанию нулевое значение для типа данных
        // int 0
        //String null
        // long 0

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * index;
        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }


        int[] num = new int[20];
        for (int index = 0; index < num.length; index++) {
            num[index] = index + 1;
            System.out.println(num[index]);
        }
        System.out.println(num.length);
        for (int index = num.length - 1; index >= 0; index--) {
            System.out.println(num[index]);
        }
        System.out.println(num[num.length - 1]);
        System.out.println(num[num.length - 2]);
        int element = 4;
        for (int index = 0; index < num.length; index++) {
            if (num[index] == element) {
                System.out.println(index);
                break;
            }
        }

        int[] newArray = {25, 30, -1, 106, 74, 63, 75};
        int maxNum = newArray[0];
        int minNum = newArray[0];
        for (int index = 0; index < newArray.length; index++) {
            if (maxNum < newArray[index]) {
                maxNum = newArray[index];
            }
            if (minNum > newArray[index]) {
                minNum = newArray[index];
            }
        }
        System.out.println(maxNum);
        System.out.println(minNum);

        int[] books = new int[100];
        Random generatorRand = new Random();
        for (int index = 0; index<books.length; index++){
            books[index] = generatorRand.nextInt(1,100);
        }
        int maxStr = books[0];
        for (int index = 0; index<books.length; index++){
            if (maxStr<books[index]){
                maxStr = books[index];
            }
        }
        System.out.println(maxStr);

    }
}
