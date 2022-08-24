import java.util.Scanner;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < 100 ; i++) list.add(i);
        System.out.println(list);

        int idx = list.indexOf(64);
        System.out.println(idx);

    }

}
