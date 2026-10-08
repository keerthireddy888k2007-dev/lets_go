public class MinimumArray {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 45, 18};

        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        System.out.println("Minimum number = " + minimum);
    }
}