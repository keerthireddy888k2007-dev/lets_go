public class MaximumArray {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 45, 18};

        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("Maximum number = " + maximum);
    }
}