public class Assessment {

    public static int square(int number) {
        return number * number;
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }


    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    public static double average(int[] numbers) {
        double numberHolder = 0;
        for (double number : numbers) {
            numberHolder = numberHolder + number;
        }
        double calculatedAverage = numberHolder / numbers.length;
        return calculatedAverage;
    }

    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(sum(5, 3));
        System.out.println(sum(3.8, 4.7));
        Assessment average = new Assessment();
        int[] numbers = {6, 8, 9, 17};
        System.out.println(average(numbers));


    }
//        for (int i = 0; i < numbers.length; i++) {
//            numberHolder = numberHolder + numbers.length;
//        }
//        double getAverage = numberHolder / numbers.length;
//                return getAverage;
//    }
}