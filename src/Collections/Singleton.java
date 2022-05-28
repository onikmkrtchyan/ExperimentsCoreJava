package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Singleton {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 10, 30, 10));
        list.removeAll(Collections.singletonList(10));
        System.out.println("list = " + list);

    }

}
