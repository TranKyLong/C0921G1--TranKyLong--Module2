package ss15_xu_ly_ngoai_le_debug.bai_tap;
public class InappropriateLengthException extends Throwable {
    public InappropriateLengthException() {
        System.err.println( "Độ dài 1 cạnh không thể lớn hơn tổng 2 cạnh kia");
    }

}
