package dhanush.dan.dhanush.dan.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

    //ArrayList class implements the List interface. it uses a dynamic array to store the duplicte element of diffrent data types. The ArraylIst Class mintains the inseration order and non-syncronized .
    //The elements stored in arraylist can be randomly accessed


    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();//creating ArrayList
        list.add("Ravi");
        list.add("vijay");
        list.add("Ajay");

        //Traversing list through iterator

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }


}
