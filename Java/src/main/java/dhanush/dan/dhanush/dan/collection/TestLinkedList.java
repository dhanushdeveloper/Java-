package dhanush.dan.dhanush.dan.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

    //LinkedList implements the collection interface. it uses doulb linked list internally to store the elements. it can store the duplicate elements.
   // it maintains the inseration order and it is not syncronized. in Linked list. manpulation is fast because no shifting is required

    public static void main(String args[]){

        LinkedList<String> list = new LinkedList<String>();
        list.add("Ajay");
        list.add("Manu");
        list.add("dhanus");
        list.add("anu");
        Iterator<String> lis = list.iterator();
        while (lis.hasNext()){
            System.out.println(lis.next());
        }

    }


}
