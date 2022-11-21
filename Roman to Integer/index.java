// java  Roman to Integer example 1:
// Input: "III"
// Output: 3
// java  Roman to Integer example 2:
// Input: "IV"
// Output: 4
// java  Roman to Integer example 3:
// Input: "IX"
// Output: 9
// java  Roman to Integer example 4:
// Input: "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.
// java  Roman to Integer example 5:
// Input: "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("java  Roman to Integer example 1:");
        System.out.println("Input: \"III\"");
        System.out.println("Output: " + romanToInt("III"));
        System.out.println("java  Roman to Integer example 2:");
        System.out.println("Input: \"IV\"");
        System.out.println("Output: " + romanToInt("IV"));
        System.out.println("java  Roman to Integer example 3:");
        System.out.println("Input: \"IX\"");
        System.out.println("Output: " + romanToInt("IX"));
        System.out.println("java  Roman to Integer example 4:");
        System.out.println("Input: \"LVIII\"");
        System.out.println("Output: " + romanToInt("LVIII"));
        System.out.println("Explanation: L = 50, V= 5, III = 3.");
        System.out.println("java  Roman to Integer example 5:");
        System.out.println("Input: \"MCMXCIV\"");
        System.out.println("Output: " + romanToInt("MCMXCIV"));
        System.out.println("Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.");
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
