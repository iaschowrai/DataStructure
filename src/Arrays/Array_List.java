package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
//         I have allocated the size of arraylist is 5, however i can insert more than the allocated memory size.
        list.add("I");
        list.add("R");
        list.add("S");
        list.add("H");
        list.add("A");
        list.add("D");
//        System.out.print(list);


//        for inserting values in arraylist
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.next());
        }
//        System.out.print(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

    }
}
