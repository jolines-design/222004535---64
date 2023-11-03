public class BreakStatementExp2 {
    public static void main(String[] args) {
        int[] numbers = {12, 15, 3, 7, 9, 22, 10};
        int target = 9;

        for (int number : numbers) {
            if (number == target) {
                System.out.println("Element " + target + " found.");
                break;
            }
        }
    }
}
    

