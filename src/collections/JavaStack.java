package collections;

import java.util.Stack;

public class JavaStack {

    /*
     Stack -> (extends) -> Vector -> (implements) -> List -> (extends) -> Collection
     * Last In First Out - (LIFO)
     */
    public static void main(String[] args) {
        Stack<Integer> stc = new Stack<>();
        stc.push(1);
        stc.push(2);
        stc.push(3);

        stc.pop();

        System.out.println(stc.peek());

        int position = stc.search(1);
        System.out.println("Position of 1 is : "+position);
        
    }

    // push, pop, peek, search, empty
    //These are the methods that the stack implements
}
