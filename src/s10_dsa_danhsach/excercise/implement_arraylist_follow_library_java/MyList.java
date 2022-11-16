package excercise.implement_arraylist_follow_library_java;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public void add(int index, E element) {
        if (index >= elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
        } else {
            for (int i = size; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        }
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public void add(E element) {
        if (elements.length == this.size) {
            ensureCapacity(5);
        }
        elements[size] = element;
        size++;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.size + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[elements.length - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    public MyList<E> clone() {
        MyList<E> newList = new MyList<>();
        newList.elements = Arrays.copyOf(elements, size);
        newList.size = this.size;
        return newList;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (this.elements[i] != null) {
                if (this.elements[i].equals(element)) {
                    return i;
                }
            }
        }
        return index;
    }

    public boolean contains(E element) {
        return this.indexOf(element) > 0;
    }

    public void disPlayName() {
        String result = "";
        for (int i = 0; i < elements.length; i++) {
            Student student = (Student) elements[i];
            if (student != null) {
                result += student.getName() + ", ";
            } else {
                result += null + ", ";
            }
        }
        System.out.println(result);
    }
}
