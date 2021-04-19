package LinkedList_16;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Jakub Marciniak
 * #16
 */


public class Linky {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Rob");
        list.add("Jakub");
        list.add("Jose");

        //list.remove();

        System.out.println(list);
        System.out.println(list.getFirst());

        LinkedList<Integer> listInteger = new LinkedList<Integer>();

        listInteger.add(62);
        listInteger.add(54);
        listInteger.add(13);

        System.out.println(listInteger);
        System.out.println(listInteger.get(1));
        System.out.println(listInteger.isEmpty());

        Iterator it = listInteger.iterator();
        while (it.hasNext()) {
            if ((int) it.next() == 13) {
                System.out.println("We found 13");
            }
        }
    }

}
