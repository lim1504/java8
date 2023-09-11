package java0829;

import java.util.EmptyStackException;
import java.util.Vector;

public class Stack extends Vector {

    public Object push (Object item) {
        addElement(item);
        return item;
    }

    public Object pop() {
        //마지막 요소 가져옴.
        Object obj = peek();
        //마지막 요소 제거 (선입선출)
        removeElementAt(size() - 1);
        return obj;
    }

    public Object peek () {
        int len = size();

        if (len == 0) {
            throw new EmptyStackException();

        }

        return elementAt(len - 1);
    }

    public boolean empty () {
        return size() == 0;
    }

    public int search (Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size() - 1;
        }
        return -1;
    }
}
