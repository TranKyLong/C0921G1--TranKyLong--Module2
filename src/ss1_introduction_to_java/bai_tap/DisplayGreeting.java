package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //System.in là thư viện nhập từ bàn phím
        System.out.println("enter your name: ");
        String name = sc.nextLine();
        System.out.println("hello " + name);
    }
}
