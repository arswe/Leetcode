// java  Palindrome Number example 1:
/*
* Input: x = 121
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*
*  */
public class Main {

    public static void main(String[] args) {
        // write your code here
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int temp = x;
        while (temp != 0) {
            int pop = temp % 10;
            temp /= 10;
            rev = rev * 10 + pop;
        }
        return rev == x;
    }
}


