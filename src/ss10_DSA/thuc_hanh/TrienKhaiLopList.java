package ss10_DSA.thuc_hanh;

import java.util.Arrays;

public class TrienKhaiLopList<I extends Number> {

    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public void MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(Object e) {
        elements[size++] = e;
        if (size == elements.length) {
            ensureCapa();
        }

    }

    public Object get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (Object) elements[i];
    }


}
