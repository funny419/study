public class Fibonacci {
    static int num1 = 0, num2 = 1, num3 = 0;
    static void printFibonacchiNumber(int count) {
        if (count > 1) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            System.out.printf(num3 + " ");
            printFibonacchiNumber(count-1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.printf("0 1 ");
        printFibonacchiNumber(num);
        /**
         * printFibonacchiNumber(5)
         * num3 = 2 + 3
         * num1 = 3
         * num2 = 5
         * 0 1 1 2 3 5
         * printFibonacchiNumber(4)
         * num3 = 1 + 2
         * num1 = 2
         * num2 = 3
         * 0 1 1 2 3
         * printFibonacchiNumber(3)
         * num3 = 1 + 1
         * num1 = 1
         * num2 = 2
         * 0 1 1 2
         * printFibonacchiNumber(2)
         * num3 = 0 + 1
         * num1 = 1
         * num2 = 1
         * 0 1 1
         * printFibonacchiNumber(1)
         */
    }
}
