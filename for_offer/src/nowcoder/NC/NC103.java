package nowcoder.NC;

import java.util.Arrays;
import java.util.Scanner;

/*
反转字符串

写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
输入："abcd"
返回值："dcba"
 */
public class NC103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = solve(str);
        System.out.println(newStr.toString());
    }

    public static String solve(String str) {
        char[] str1 = new char[str.length()];
        char[] chars = str.toCharArray();
        int j = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            str1[j] = chars[i];
            j++;
        }
        return new String(str1);
    }
}
