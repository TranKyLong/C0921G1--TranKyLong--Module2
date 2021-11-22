package ss15_xu_ly_ngoai_le_debug.bai_tap;
public class InappropriateLengthException extends Exception {
    public InappropriateLengthException( ) {
    }
    @Override
    public String getMessage(){
        return ( "Độ dài 1 cạnh không thể lớn hơn tổng 2 cạnh kia");
    }
}
