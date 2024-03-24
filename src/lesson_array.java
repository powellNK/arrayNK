public class lesson_array {
    public static void main(String[] args){
        int [] numbers = new int[5]; // массив из 5 элементов. по умолчанию нулевое значение для типа данных
        // int 0
        //String null
        // long 0

        for (int index = 0; index< numbers.length; index++){
            numbers[index] = index*index;
        }
        for (int index = 0; index< numbers.length; index++){
            System.out.println(numbers[index]);
        }


        int [] num = new int[20];
        for (int index = 0; index<num.length; index++){
            num[index] = index+1;
            System.out.println(num[index]);
        }
        System.out.println(num.length);
        for (int index = num.length-1; index>=0; index--){
            System.out.println(num[index]);
        }
        System.out.println(num[num.length-1]);
        System.out.println(num[num.length-2]);
        int element = 4;
        for (int index = 0; index<num.length; index++){
            if (num[index] == element){
                System.out.println(index);
                break;
            }
        }
    }
}
