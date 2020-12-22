package alevel.lesson3.homework;

public class Exercise4 {

    public static void main(String[] args) {

        int arrayWithRandomNumbers[] = new int[1000];
        int minValueOfRandomNumber = 1;
        int maxValueOfRandomNumber = 1001;
        double randomValue;
        int quantityOfCompositeNumbers = 0;
        int halfOfTheCheckedNumber;

        for (int i = 0; i < 1000; i++) {
            randomValue = Math.random() * (maxValueOfRandomNumber - minValueOfRandomNumber) + minValueOfRandomNumber;
            arrayWithRandomNumbers[i] = (int) randomValue;
        }

        for (int i = 0; i < 1000; i++) {
            if ((arrayWithRandomNumbers[i] != 1) || (arrayWithRandomNumbers[i] != 2)) {
                halfOfTheCheckedNumber = arrayWithRandomNumbers[i] / 2;
                for (int j = 2; j <= halfOfTheCheckedNumber; j++) {
                    if ((arrayWithRandomNumbers[i] % j) == 0) {
                        quantityOfCompositeNumbers++;
                        break;
                    }
                }
            }
        }

        System.out.println("Количество простых чисел: " + quantityOfCompositeNumbers);

    }
}
