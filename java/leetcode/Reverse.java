package leetcode;

public class Reverse {
    public int solution(int x) {
        long res = 0;
        for(; x != 0 ; x /= 10) {
            res = res * 10 + x % 10;
        }

        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.solution(123));
        System.out.println(reverse.solution(-123));
        System.out.println(reverse.solution(100));
        System.out.println(reverse.solution(1000000003));
    }
}
