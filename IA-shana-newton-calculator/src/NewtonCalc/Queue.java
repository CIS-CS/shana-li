/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewtonCalc;

import java.util.ArrayList;

/**
 *
 * @author sl3252
 */
public class Queue {
    
    private Universe[] queue;           // the queue is stored in an array
    private int head;                   // pointer to first item in the queue
    private int tail;                   // pointer to the last item in the queue
    private boolean isEmpty;            // True when the queue is empty
    private boolean isFull;             // True when the queue is full
    private final int LENGTH = 10;
    
    public Queue() {
        queue = new Universe[LENGTH];
        head = 0;
        tail = -1;
        isEmpty = true;
        isFull = false;
    }
    
    public Universe[] getArray() {
        return queue;
    }
    
    public int getTail() {
        return tail;
    }
    
    public int getLength() {
        int i = 0;
        
        for (Universe uni : queue) {
            if (uni != null) {
                i += 1;
            }
        }
        
        return i-1;
    }
    
    public boolean getEmptiness() {
        return isEmpty;
    }
    
    public void add(Universe universe) {
        if (isFull) {
            replaceFirst(universe);
        }
        else {
            tail += 1;
            queue[tail] = universe;
            isEmpty = false;
        }
            
        if(tail == -1) {
            isEmpty = true;
        }    

        if (!isEmpty && (tail == LENGTH-1 || tail == head-1)) {
                isFull = true;
            }
        }
    
    public void add(ArrayList<Universe> u) {
        for(Universe uni: u) {
            add(uni);
        }
    }
        
    public void replaceFirst(Universe newUni) {
        queue[head] = newUni;
        
        if(head == LENGTH-1) {
            head = 0;
        }
        else {
            head += 1;
        }
        
        if(tail == LENGTH-1) {
            tail = 0;
        }
        else
        {
            tail += 1;
        }
    }
    
    public Universe dq() {
        Universe uni = queue[head];
        
        if(head == LENGTH-1) {
            head = 0;
        }
        else {
            head += 1;
        }
        
        return uni;
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        
        if (isEmpty) {
                sb.append("You have no previous entries.");
        }
        else {
            if (isFull) {
                if (head == 0) {
                    for (int i = head; i <= tail; i++) {
                        sb.append(queue[i].toStringBuffer());
                    }
                }
                else {
                    for (int i = head; i <= LENGTH-1; i++){
                        sb.append(queue[i].toStringBuffer());
                    }

                    for (int j = 0; j <= tail; j++) {
                        sb.append(queue[j].toStringBuffer());
                    }
                }
            }
            else
            {
                for (int i = head; i <= tail; i++) {
                    sb.append(queue[i].toStringBuffer());
                }
            }
        }
        
        return sb.toString();
    }
}

