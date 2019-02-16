import java.util.Stack;

public class NewDeque<E> {
    private Stack<E> front;
    private Stack<E> back;

    NewDeque() {
        front = new Stack<>();
        back = new Stack<>();
    }


    /**
     * add to the queue last
     * @param e element
     */
    public void addLast(E e) {
        if (e != null) {
            back.push(e);
        }
    }

    /**
     * add to the queue first
     * @param e element
     */
    public void addFirst(E e) {
        if (e != null) {
            front.push(e);
        }
    }


    /**
     * pop from front, if front is empty and back not empty, pop all the
     * elements from back to front then pop from front, if both empty
     * throw null pointer exception
     * @return  element or null if empty
     */
    public E removeFirst()  {
        if (!front.isEmpty()) {
           return front.pop();
        } else {
            if (!back.isEmpty()) {
                backToFront();
                return front.pop();
            } else {
                return null;
            }
        }
    }


    /**
     * pop from back, if back is empty and front not empty, pop all the
     * elements from front to back then pop from back, if both empty
     * return null
     * @return element or null if empty
     */
    public E removeLast() {
        if (!back.isEmpty()) {
           return back.pop();
        } else {
            if (!front.isEmpty()) {
                frontToBack();
                return back.pop();
            } else {
                return null;
            }
        }
    }

    /**
     * return first element from queue , if front is empty back not empty
     * pop all the elements from back to front then peek from front, if
     * both empty return null
     * @return element or null if empty
     */
    public E first()  {
        if (!front.isEmpty())
            return front.peek();
        else {
            if (!back.isEmpty()) {
                backToFront();
                return front.peek();
            } else {
                return null;
            }
        }
    }

    /**
     * return last element from queue , if back is empty front not empty
     * pop all the elements from front to back then peek from back, if
     * both empty return null
     * @return element or null if empty
     */
    public E last()  {
        if (!back.isEmpty())
            return back.peek();
        else {
            if (!front.isEmpty()) {
                frontToBack();
                return back.peek();
            } else {
                return null;
            }
        }
    }

    /**
     * @return size of the queue
     */
    public int size() {
        return front.size() + back.size();
    }

    /**
     * @return true if queue is empty, false if not
     */
    public boolean isEmpty() {
        return front.isEmpty() && back.isEmpty();
    }

    /**
     * A method that clear the back then pop all the elements from front and push to back
     */
    private void frontToBack() {
        back = new Stack<>();
        while (!front.isEmpty()) {
            back.push(front.pop());
        }
    }

    /**
     * A method that clear the front then pop all the elements from back and push to front
     */
    private void backToFront() {
        front = new Stack<>();
        while (!back.isEmpty()) {
            front.push(back.pop());
        }
    }

    /**
     * A test function for debugging,print all the elements in front
     */
    private void printFront() {

        for (E e : front) {
            System.out.print(" " + e + " ");
        }

    }

    /**
     * A test function for debugging,print all the elements in back
     */
    private void printBack() {

        for (E e : back) {
            System.out.print(" " + e + " ");
        }
    }

    /**
     * A test function for debugging,print all the elements in front and back
     */
    private void print(){
        System.out.println();
        System.out.println("Elements in queue:");
        printFront();
        printBack();
        System.out.println();
    }


    /**
     * tester for Dequeue
     * @param args
     */
    public static void main(String args[]) {
        NewDeque<Integer> dq1 = new NewDeque<>();
        System.out.println("addLast(5)");
        dq1.addLast(5);

        System.out.println("addFirst(3)");
        dq1.addFirst(3);

        System.out.println("addFirst(7)");
        dq1.addFirst(7);

        System.out.print("first() ");
        System.out.println("return: " + dq1.first());

        System.out.print("removeLast() ");
        System.out.println("return: "+dq1.removeLast());

        System.out.print("size() ");
        System.out.println("return: "+dq1.size());

        System.out.print("removeLast() ");
        System.out.println("return: "+dq1.removeLast());

        System.out.print("removeFirst() ");
        System.out.println("return: "+dq1.removeFirst());

        System.out.print("size() ");
        System.out.println("return: "+dq1.size());

        System.out.print("isEmpty()");
        System.out.println("return: "+dq1.isEmpty());

        System.out.print("removeLast() ");
        System.out.println("return: "+dq1.removeLast());

        System.out.print("removeFirst() ");
        System.out.println("return: "+dq1.removeFirst());

        System.out.print("first() ");
        System.out.println("return: " + dq1.first());

        System.out.print("last() ");
        System.out.println("return: " + dq1.last());

        System.out.println("addFirst(7)");
        dq1.addFirst(6);

        System.out.print("last() ");
        System.out.println("return: " + dq1.last());

        System.out.println("addFirst(8)");
        dq1.addFirst(8);

        System.out.print("size() ");
        System.out.println("return: "+dq1.size());

        System.out.print("isEmpty()");
        System.out.println("return: "+dq1.isEmpty());

        System.out.print("last() ");
        System.out.println("return: " + dq1.last());

    }


}
