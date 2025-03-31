package collections;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    /*
     Since Queue is an interface, we cannot provide direct implementation
     We can use 
     1. ArrayDeque
     2. LinkedList
     3. PriorityQueue

     All the implement Queue interface

     Interfaces that extend Queue are: 
     1. Deque
     2. BlockingQueue
     3. BlockingDeque
     */
    public static void main(String[] args) {
        //LL Queue
        Queue<Integer> numbers = new LinkedList<>();
        //we need to offer elements to the queue
        numbers.offer(1);
        numbers.offer(2);
        //access top element
        int peekedNumber = numbers.peek();
        System.out.println(peekedNumber);
        //remove element
        int removed = numbers.poll();
        System.out.println(removed);

    }
}
