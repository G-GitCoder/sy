package nowcoder.NC;

import java.util.Scanner;

/*
最大公约数

如果有一个自然数 a 能被自然数 b 整除，则称 a 为 b 的倍数， b 为 a 的约数。几个自然数公有的约数，叫做这几个自然数的公约数。公约数中最大的一个公约数，称为这几个自然数的最大公约数。
输入 a 和 b , 请返回 a 和 b 的最大公约数。
输入：8,12
返回值：4
 */
public class NC151 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gc = gcd(a, b);
        System.out.println(gc);
    }

    //暴力穷举
    public static int gcd(int a, int b) {
        int min = Math.min(a, b);
        int gc = 1;

        if (a % b == 0) {
            gc = b;
        } else if (b % a == 0) {
            gc = a;
        } else {
            for (int i = min; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    gc = i;
                    break;
                }
            }
        }

        return gc;
    }

    //辗转相除法
    //解法一
    /*public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }*/

    //解法二
    /*public static int gcd(int a, int b) {
        int result = 0;
        while (b != 0) {
            result = a % b;
            a = b;
            b = result;
        }
        return a;
    }*/
}
