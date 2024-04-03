
//в первом классе не используйте стримы из библиотеки Stream API

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        TreeSet<Integer> intTree = new TreeSet<Integer>();
        for (int i : intList) {
            if (i % 2 == 0 && i > 0) {
                intTree.add(i);
            }
        }
        System.out.println(intTree);
    }
}