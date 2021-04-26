package simulate3;

import java.util.ArrayList;
import java.util.List;

public class S1 {

    public static void main(String[] args) {
        List<Object> list  = new ArrayList<>();
        list.add("dog");
        list.add(5);
        System.out.println(list);

        List<String> pets = new ArrayList<>();
        pets.add(0, "snake");
        pets.add(1, "dog");
        pets.add(0, "horse");
        pets.add(1, "cat");
        System.out.println(pets);
    }
}
