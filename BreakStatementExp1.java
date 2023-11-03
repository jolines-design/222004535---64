                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             public class BreakStatementExp1 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 8, 9, 10};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("First even number found: " + number);
                break;
            }
        }
    }
}
