/* © Copyright iFD GmbH 2023 www.ifd-gmbh.com */
package java_pro.array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
       // 1.
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(1);
        System.out.println(list.size());

        //2.
        list.add(1,15);
        list.add(2,20);
        System.out.println(list.toString());

        // 3.
        list.remove(0);
        list.remove(1);
        list.remove(2);
        System.out.println(list.toString());
    }
}
