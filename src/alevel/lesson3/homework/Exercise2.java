package alevel.lesson3.homework;

public class Exercise2 {

    public static void main(String[] args) {    //"Code name is violated" Не понимаю что нужно исправить

        int minValueOfRandomNumber = 1;
        int maxValueOfRandomNumber = 101;
        double randomValue;
        double averageArithmetic;
        int counterForAverageArithmetic = 0;
        double averageGeometric = 1;
        double averageGeometricRoot = 1;
        long counterForAverageGeometric = 1;
        int arrayWithRandomNumbers[] = new int[400];

        for (int i = 0; i < 400; i++) {
            randomValue = Math.random() * (maxValueOfRandomNumber - minValueOfRandomNumber) + minValueOfRandomNumber;
            arrayWithRandomNumbers[i] = (int) randomValue;
        }

        for (int i = 0; i < 400; i++) {
            counterForAverageArithmetic += arrayWithRandomNumbers[i];
        }

        averageArithmetic = (double) counterForAverageArithmetic / 400;
        System.out.println("Average Arithmetic: " + averageArithmetic);

        for (int i = 0; i < 400; i++) {
            counterForAverageGeometric *= arrayWithRandomNumbers[i];
            if (counterForAverageGeometric >= 21262213) {   // число в скобках - защита от переполнения
                averageGeometricRoot = Math.pow(Math.E, (Math.log(counterForAverageGeometric) / 400));
                averageGeometric *= averageGeometricRoot;
                counterForAverageGeometric = 1;
            }
        }

        averageGeometricRoot = Math.pow(Math.E, (Math.log(counterForAverageGeometric) / 400));
        averageGeometric *= averageGeometricRoot;
        System.out.println("Average Geometric: " + averageGeometric);

    }
}
