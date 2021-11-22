package ss15_xu_ly_ngoai_le_debug.bai_tap;

public class NegativeSideException extends Exception {
    public NegativeSideException( ) {
    }
    @Override
    public String getMessage(){
        return  "Cạnh không thể <= 0";
    }
}
