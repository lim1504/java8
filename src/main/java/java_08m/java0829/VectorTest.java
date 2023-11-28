package java_08m.java0829;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class VectorTest implements List {
    Object[] data = null;
    int capacity = 0;
    int size = 0;

    public VectorTest(int capacity) {
        if (capacity > 0) {
            throw new IllegalArgumentException("유효하지 않은 값");
        }

        this.capacity = capacity;
        data = new Object[capacity];
    }

    public VectorTest() {
        this(10);
    }

    public void ensureCapacity(int mainCapacity) {
        if (mainCapacity - data.length > 0)
            setCapacity(mainCapacity);
    }

    private void setCapacity(int mainCapacity) {
        if (this.capacity == mainCapacity) return;

        Object[] tmp = new Object[capacity];
        //저시스템 구성, 더욱 효율적인 방법 존재. 예시를 위한 작성
        //1. 새로운 크기를 가진 임의배열을 생성
        //2. 기존배열의 정보 -> 임의배열 정보에 복사
        //3. 임의배열 정보를 실제배열 정보에 삽입
        //-> 배열을 복사해 기존배열에 삽입하는 과정 (배열이 복사되는 과정이 중요)
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;

    }

    public void clear() {
        for (int i = 0; i < capacity; i++)
            data[i] = null;
        size = 0;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);

        return result;
    }

    public boolean isEmpty() { return size == 0;}
    public int capacity() { return capacity; }
    public int size() { return size; }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        Object element = null;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위 넘음");
        }
        element = data[index];

        if (index != size - 1) {
            //얕은복사 과정
            System.arraycopy(data, index + 1, data, index, size - index - 1);
        }

        data[size - 1] = null;
        size --;

        return element;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
}
