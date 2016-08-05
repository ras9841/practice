/*
 *  File: LinkedQueue.java
 *  Language: Java 8
 */

import java.util.LinkedList;
import java.util.ListIterator;
import java.lang.IllegalStateException;

/**
 *  LinkedQueue is an implementation of a queue that uses an linked list.
 *
 *  @author Allen Sanford (ras9841@rit.edu)
 *  @since 08/05/16
 *  @version 1.0
 */
public class LinkedQueue<T> 
{
    private LinkedList<T> queue;
    private int size;

    public LinkedQueue()
    /**
     *  Creates an empty queue using a linked list.
     */
    {
        this.queue = new LinkedList<T>();
        this.size = 0;
    }

    public boolean add(T val) 
    /**
     *  Inserts the non-null value into the queue.
     *  
     *  @param val - the value to be enqueued
     *  @return true if value successfully added.
     */
    {
        if (val == null) return false; 

        this.queue.add(val);
        this.size++;
        return true;
    }

    public T peek()
    /**
     *  Retrieves the head of the queue without removing the element.
     *
     *  @return null if queue is empty, or the head of the queue
     */
    {
        return this.size > 0 ? this.queue.element() : null;
    }
    
    public T remove()
    /**
     *  Retrieves and removes the head of the queue.
     *
     *  @return null if queue is empty, or head of the queue
     */
    {
        if (this.size > 0) { size--; return this.queue.removeFirst(); } 
        else return null;
    }

    public String toString()
    /**
     * Outlines a string representation of the queue.
     *
     * @return string representing the queue.
     */
    {
        String str = "";
        ListIterator<T> itr = this.queue.listIterator(0);
        while (itr.hasNext())
        {
            str += "("+itr.next()+") <= ";
        }
        str += "X";
        return str;
    }

    public int size()
    /**
     * Retrieves the current size of the queue.
     * 
     * @return size
     */
    {
        return this.size;
    }
}


