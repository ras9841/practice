/*
 *  File: TestQueue.java
 *  Language: Java 8
 */

import java.lang.Integer;

/**
 *  TestQueue carries out a few basic tests on the LinkedQueue class.
 *  Results are printed to standard output.
 *
 *  @author Allen Sanford (ras9841@rit.edu)
 *  @since 08/05/16
 *  @version 1.0
 */
public class TestQueue
{
    public static void main(String[] args)
    {
        System.out.println("Testing Queue...");
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        System.out.print("\nEMPTY QUEUE: "+ (queue.remove() == null)); 
        System.out.println("\tZERO SIZE: "+ (queue.size() == 0)); 
        System.out.println(queue);
        
        for (int i=1; i<11; i++) queue.add(i);
        System.out.println("\nHEAD: "+queue.peek());
        System.out.println(queue);
        System.out.println("\nREMOVED HEAD: "+queue.remove());
        System.out.println(queue);
        System.out.println("\nREMOVED HEAD: "+queue.remove());
        System.out.println(queue);
        System.out.println("\nREMOVED HEAD: "+queue.remove());
        System.out.println(queue);

    }
}
