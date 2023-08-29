package LIst;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add("hell"+i);
        }
        System.out.println("list"+list);

        System.out.println(list.get(1));
    }
}
