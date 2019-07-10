package dhanush.dan.dhanush.dan.collection;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {
    //The stack is sub class of vector
    //It implements last in first out data strcuture, ie stack
    //Stack contain all of the methods of vector class and also provides its method like boolean push(), boolean peek(),bollean push(object o)


    public static void main(String []args){
        Stack<String> al = new Stack<String>();
        al.push("Ayush");
        al.push("Garvit");
        al.push("Amit");
        al.push("Garmia");
        al.pop();
        Iterator<String> list = al.iterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }
    }

}
