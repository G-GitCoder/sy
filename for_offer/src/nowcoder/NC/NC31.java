package nowcoder.NC;

/*
第一个只出现一次的字符

在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 */
public class NC31 {

    public int FirstNotRepeatingChar(String str) {
        char[] arrays = str.toCharArray();
        int local = -1;

        for(int i = 0; i < arrays.length; i++) {
            int flag = 1;
            for(int j = 0; j < arrays.length; j++) {
                if (arrays[i] == arrays[j] && (i != j)) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) {
                local = i;
                break;
            }
        }
        return local;
    }
}
