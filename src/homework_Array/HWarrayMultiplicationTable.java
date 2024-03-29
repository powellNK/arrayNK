package homework_Array;

public class HWarrayMultiplicationTable {
    public static void main(String[] args){
        int[] digits = new int[9];
        for (int index = 0; index< digits.length;index++){
            digits[index] = index+1;
        }


        for (int row = 0; row< digits.length; row++){
            for (int col = 0; col< digits.length;col++ ){
                System.out.print(digits[col] + " + " + (row+1) + " = " + (digits[col] + (row+1) ) + "       ");
            }
            System.out.println("");
        }
    }
}
