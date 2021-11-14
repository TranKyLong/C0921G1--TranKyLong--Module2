package ss9_DSA.bai_tap;

public class MyList<L> {

    private final int size = 0;
    private static final int defaultCapacity = 10;

    public MyList() {
        System.out.println("khởi tạo thành công MyList có kcihs thước là " + defaultCapacity);
        Object[] elements = new Object[defaultCapacity];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            System.out.println("khoi tao thanh cong voi kich thuoc " + capacity);
            Object[] elements = new Object[capacity];
        }
        else  {
            System.out.println("kich thuoc da nhap khong hop le");
        }
    }

    void romove(int index) {
    }
}
