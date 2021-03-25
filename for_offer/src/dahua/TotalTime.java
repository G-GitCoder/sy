package dahua;

import java.util.Scanner;

public class TotalTime {

    public static void main(String[] args) {
        System.out.println("请输入密码：");
        Scanner sc = new Scanner(System.in);
        String secret = sc.next();
        int sum = totalTimes(secret);
        System.out.println("总共时间：" + sum);
    }

    public static int totalTimes(String str) {

        int sum = 0;
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (i < chars.length - 1) {
                int k1 = indexNum(chars[i]);
                sum += k1;
                if (k1 == indexNum(chars[i + 1])) {
                    sum += 2;
                }
            } else if (i == chars.length - 1) {
                sum += indexNum(chars[i]);
            }
        }

        return sum;
    }

    public static int indexNum(char str) {
        int index = 0;
        char[][] array = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
                {'p', 'q', 'r'}, {'s', 't', 'u'}, {'v', 'w', 'x'}, {'y', 'z'}};

        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                if (str == array[j][k]) {
                    index = (k + 1);
                    break;
                }
            }

            if(index != 0) {
                break;
            }
        }

        return index;
    }
}
