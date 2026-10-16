public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40};

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < numbers.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}