package homework_Array;

import java.util.Random;

public class HWArray_YearOfBirthday {
    public static void main(String[] args){
        Random generatorRand = new Random();
        int[] years = new int[30];
        for (int index = 0; index<years.length; index++){
            years[index] = generatorRand.nextInt(1950,2024);
            System.out.println(years[index]);
        }

        int maxYear = years[0];
        int minYear = years[0];
        for (int index = 0; index< years.length; index++){
            if (maxYear<years[index]){
                maxYear = years[index];
            }
            if (minYear>years[index]){
                minYear = years[index];
            }
        }
        System.out.println("Самый взрослый человек (" + maxYear + "г.р.) старше самого молодого ("+ minYear + "г.р.) на " + (maxYear - minYear));
    }
}
