package alevel.lesson3.homework;

import java.util.Arrays;

public class Exercise5 {

    public static void main(String[] args) {

        int arrayWithRandomNumbers[] = new int[2000];
        int minValueOfRandomNumber = 1;
        int maxValueOfRandomNumber = 1001;
        double randomValue;

        for (int i = 0; i < 2000; i++) {
            randomValue = Math.random() * (maxValueOfRandomNumber - minValueOfRandomNumber) + minValueOfRandomNumber;
            arrayWithRandomNumbers[i] = (int) randomValue;
        }

        for (int i = 0; i < 2000; i++) {
            if ((arrayWithRandomNumbers[i] % 2) == 0)
                arrayWithRandomNumbers[i] = 0;
        }

        System.out.println(Arrays.toString(arrayWithRandomNumbers));
    }
}
