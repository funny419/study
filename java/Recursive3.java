public class Recursive3 {
    public static void main(String[] args) {
        int result = 1;
        int num = 1;
        int answer = factorial(result,num);
        System.out.println("ANSWER : " + answer);
    }


    private static int factorial(int result,int num) {
        int rtn = 0;
        if (num >= 6) {
            rtn = result;
            return rtn;
        }

        result = result * num;
        num = num + 1;
        System.out.println("Result : " + result + " / num : " + num);
        rtn = factorial(result,num);
        System.out.println("RTN : " + rtn);
        return rtn;
    }
}
