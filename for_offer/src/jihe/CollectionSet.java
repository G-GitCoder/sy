package jihe;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("abc");
        set.add("xet");
        set.add("jpo");
        set.add("wo");
        set.add("jpo");
        System.out.println(set);//[abc, xet, jpo, wo]，没有重复的

        Set<String> sortSet = new TreeSet<String>(set);
        System.out.println(sortSet);//[abc, jpo, wo, xet]，默认升序
    }
}
