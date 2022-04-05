package leetcode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }

        int halfReverseX = 0;
        while (x > halfReverseX) {
            halfReverseX = halfReverseX * 10 + x % 10;
            x /= 10;
        }

        return halfReverseX == x || halfReverseX / 10 == x;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(-1));
        System.out.println(palindrome.isPalindrome(0));
        System.out.println(palindrome.isPalindrome(10010));
    }
}
