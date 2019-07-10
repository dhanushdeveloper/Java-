package dhanush.dan.dhanush.dan.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TesPriortyQueue {

    //The PriortyQueue class implements the Quesue interface. it holds the elements or objects which are to be processed by their priorties.
    //PriortyQueue doesn't allow null values to be stored in the queue

    public static void main(String args[]){

        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShanakar");
        queue.add("Raj");
        System.out.println("Head :"+queue.element());
        System.out.println("Head :"+ queue.peek());
        System.out.println("iterating the queue elements");
        Iterator<String> ls = queue.iterator();
        while (ls.hasNext()){
            System.out.println(ls.next());
        }

queue.poll();
        System.out.println();
Iterator ls2 = queue.iterator();
while (ls2.hasNext()){
    System.out.println(ls2.next());
}
    }

}
