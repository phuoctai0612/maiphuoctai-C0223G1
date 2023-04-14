package ss10_vsa_danh_sach.bai_tap.bai_1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    public void add(int index, E e) {
        int count = 1;
        int count1 = 2;
        if (index >= elements.length) {
            ensureCapa();
        }
        if (index < elements.length) {
            if (index > 0) {
                for (int i = 0; i < elements.length - index; i++) {
                    elements[elements.length - count] = elements[elements.length - count1];
                    count++;
                    count1++;
                }
            }
            elements[index] = e;
        }
        size++;

    }

    // phương thức add của em nếu giá trị trùng nhau sẽ bị lỗi
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void remove(E e) {
        for (int i = 0; i < size; i++) {
            if (e == elements[i]) {
                for (int j = i; j < size; j++) {
                    elements[j] = elements[j + 1];
                }
            }
        }
        size--;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
