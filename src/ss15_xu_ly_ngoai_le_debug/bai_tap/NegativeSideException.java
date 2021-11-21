package ss15_xu_ly_ngoai_le_debug.bai_tap;

public class NegativeSideException extends Throwable {
    public NegativeSideException( ) {
        System.err.println( "Cạnh không thể <=0");
    }

}
