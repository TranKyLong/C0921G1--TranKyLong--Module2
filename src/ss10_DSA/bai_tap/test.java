package ss10_DSA.bai_tap;

public class test {
    static class Laptop {
        public int gia;
        public String color;

        public Laptop() {
        }

        public Laptop(int gia, String color) {
            this.gia = gia;
            this.color = color;
        }

        public int getGia() {
            return gia;
        }

        public void setGia(int gia) {
            this.gia = gia;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Laptop{" +
                    "gia=" + gia +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        MyList <Laptop> myArrayList = new MyList<>(15);
    }
}
