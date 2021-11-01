package ss2_vong_lap.bai_tap;

public class HienThiSntNhoHon100{
    public static void main(String[] args) {

        for (int x = 2; x < 100; x ++){
            if (kiemtrasnt(x)){
                System.out.print(x +", ");
            }
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