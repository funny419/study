import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        int num = scanner.nextInt();
        System.out.println("피보나치 수 계산 프로그램을 실행합니다.");

        for (int i=0;i<=num;i++) {
            System.out.printf("%d\t",fiboFunction(i));
        }
        scanner.close();
    }


    public static int fiboFunction(int num) {
        if (num == 0) {
            return 0;
        }
        else if (num == 1) {
            return 1;
        }
        else {
            return fiboFunction(num-1) + fiboFunction(num-2);
        }
    }
}
