package ss11_dsa_stack_queue.bai_tap;
import java.util.Arrays;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {

        System.out.println(" ĐẢO NGƯỢC STACK SỐ NGUYÊN");
        Stack<Integer> numberStack = new Stack<>();
        for (int i = 10; i >= 0; i--) {
            numberStack.push(i);
        }
        System.out.println("trước khi đảo ngược");
        System.out.println(numberStack);

        //đảo ngược stack

        Stack<Integer> newNumberStack = new Stack<>();

        int size = numberStack.size();
        for (int i = 0; i < size; i++) {
            int numberElement = numberStack.pop();
            newNumberStack.push(numberElement);
        }

        for (int i : newNumberStack) {
            numberStack.push(i);
        }

        System.out.println("sau khi đảo ngược");
        System.out.println(numberStack);

        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ");
        System.out.println(" ĐẢO NGƯỢC CHUỖI ");

        String string1 = "Hello World";
        System.out.println("Chuỗi ban đầu: " + string1);

        String[] newString = string1.split("");
        System.out.println( "Chuỗi sau khi tách: "+ Arrays.toString(newString));
        Stack<String> stringStack = new Stack<>();

        for (String i : newString) {
            stringStack.push(i);
        }

        Stack<String> stringTemp = new Stack<>();

        int stringSize = stringStack.size();

        for (int i = 0; i < stringSize; i++) {
            String stringElement = stringStack.pop();
            stringTemp.push(stringElement);
        }

        for (String i : stringTemp) {
            stringStack.push(i);
        }

        System.out.println("Chuỗi sau khi đảo ngược: " + stringStack);
    }
}
