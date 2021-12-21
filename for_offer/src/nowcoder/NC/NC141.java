package nowcoder.NC;

import java.util.Scanner;

/*
判断回文

给定一个字符串，请编写一个函数判断该字符串是否回文。如果回文请返回true，否则返回false。
输入：     "absba"         "ranko"        "yamatomaya"        "a"
返回值：    true            false           false              true

 */
public class NC141 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean judge = judge(s);
        System.out.println(judge);
    }

    public static boolean judge (String str) {
        boolean isTrue = true;
        char[] chars = str.toCharArray();
        if(str.length() == 1) {
            isTrue = true;
        } else {
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] != chars[chars.length - i - 1]) {
                    isTrue = false;
                    break;
                }
            }
        }
        return isTrue;
    }
}
