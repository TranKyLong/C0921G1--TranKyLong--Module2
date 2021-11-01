package ss2_vong_lap.bai_tap;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int snt = 2;

        while (count < 20) {
            if (kiemtrasnt(snt)) {
                System.out.print(snt + ", ");
                count++;
            }
            snt++;
        }

    }

    public static boolean kiemtrasnt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//     ---- cú pháp hàm ----          modifier returnType nameOfMethod (Parameter List) {
//                                           method body
//                                    }
//public: bất kỳ một method hay một phương thức nào có từ khoá public đứng trước
// thì nó sẽ được truy cập bất cứ ở đâu. Nghĩa là nếu như bạn đang ở một class khác,
// một package khác,… thì bạn đều có thể gọi đến nó.

//static: cho phép rằng biến hay phương thức chỉ được khởi tạo lúc tải class.
// Chúng ta chỉ cần gọi method chứ không khởi tạo class chứa nó.
// Nếu các bạn bỏ static trong khai báo hàm đi thì các bạn sẽ phải khởi tạo class Main rồi mới gọi hàm được nhé.