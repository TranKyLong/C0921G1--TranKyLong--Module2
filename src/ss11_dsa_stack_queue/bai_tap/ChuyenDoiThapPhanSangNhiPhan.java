package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numberStack = new Stack<Integer>();

        System.out.println("Nhập vào số thập phân: ");
        int num = scanner.nextInt();
        while (num != 0)
        {
            int d = num % 2;
            numberStack.push(d);
            num /= 2;
        }
        System.out.print("\nGiá trị nhị phân là: ");
        while (!(numberStack.isEmpty() ))
        {
            System.out.print(numberStack.pop());
        }
    }
}
