package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        System.out.println("mời nhập số muốn đỏi");
        Scanner giaTri = new Scanner(System.in);
        String number = giaTri.nextLine();

        switch (number.length()) {
            case 1:
                switch (number) {
                    case "0":
                        System.out.println("không");
                        break;
                    case "1":
                        System.out.println("một");
                        break;
                    case "2":
                        System.out.println("hai");
                        break;
                    case "3":
                        System.out.println("ba");
                        break;
                    case "4":
                        System.out.println("bốn");
                        break;
                    case "5":
                        System.out.println("năm");
                        break;
                    case "6":
                        System.out.println("sáu");
                        break;
                    case "7":
                        System.out.println("bảy");
                        break;
                    case "8":
                        System.out.println("tám");
                        break;
                    case "9":
                        System.out.println("chín");
                        break;
                }
                break;
            case 2:

                switch (number.charAt(0)) {               //hàm này trả về ký tự trong chuỗi ứng với index trong ngoặc
                    case '1':
                        System.out.println("mười ");
                        break;
                    case '2':
                        System.out.println("hai mươi ");
                        break;
                    case '3':
                        System.out.println("ba mươi ");
                        break;
                    case '4':
                        System.out.println("bốn mươi ");
                        break;
                    case '5':
                        System.out.println("năm mươi ");
                        break;
                    case '6':
                        System.out.println("sáu mươi ");
                        break;
                    case '7':
                        System.out.println("bảy mươi ");
                        break;
                    case '8':
                        System.out.println("tám mươi ");
                        break;
                    case '9':
                        System.out.println("chín mươi ");
                        break;
                }
                switch (number.charAt(1)) {
                    case '1':
                        System.out.println("mốt");
                        break;
                    case '2':
                        System.out.println("hai");
                        break;
                    case '3':
                        System.out.println("ba");
                        break;
                    case '4':
                        System.out.println("bốn");
                        break;
                    case '5':
                        System.out.println("năm");
                        break;
                    case '6':
                        System.out.println("sáu");
                        break;
                    case '7':
                        System.out.println("bảy");
                        break;
                    case '8':
                        System.out.println("tám");
                        break;
                    case '9':
                        System.out.println("chín");
                        break;
                }
                break;
            case 3:
                switch (number.charAt(0)) {

                    case '1':
                        System.out.println("một trăm ");
                        break;
                    case '2':
                        System.out.println("hai trăm ");
                        break;
                    case '3':
                        System.out.println("ba trăm ");
                        break;
                    case '4':
                        System.out.println("bốn trăm ");
                        break;
                    case '5':
                        System.out.println("năm trăm ");
                        break;
                    case '6':
                        System.out.println("sáu trăm ");
                        break;
                    case '7':
                        System.out.println("bảy trăm ");
                        break;
                    case '8':
                        System.out.println("tám trăm ");
                        break;
                    case '9':
                        System.out.println("chín trăm ");
                        break;

                }
                switch (number.charAt(1)) {
                    case '1':
                        System.out.println("mười ");
                        break;
                    case '2':
                        System.out.println("hai mươi ");
                        break;
                    case '3':
                        System.out.println("ba mươi ");
                        break;
                    case '4':
                        System.out.println("bốn mươi ");
                        break;
                    case '5':
                        System.out.println("năm mươi ");
                        break;
                    case '6':
                        System.out.println("sáu mươi ");
                        break;
                    case '7':
                        System.out.println("bảy mươi ");
                        break;
                    case '8':
                        System.out.println("tám mươi ");
                        break;
                    case '9':
                        System.out.println("chín mươi ");
                        break;
                    case '0':
                        if (number.charAt(2) != '0') {
                            System.out.println("lẻ ");
                            break;
                        }
                }
                switch (number.charAt(2)) {
                    case '1':
                        if (number.charAt(1) != '0') {
                            System.out.println("mốt ");
                            break;
                        } else {
                            System.out.println("một  ");
                            break;
                        }
                    case '2':
                        System.out.println("hai  ");
                        break;
                    case '3':
                        System.out.println("ba  ");
                        break;
                    case '4':
                        System.out.println("bốn  ");
                        break;
                    case '5':
                        if (number.charAt(1) != '0') {
                            System.out.println("lăm ");
                            break;
                        } else {
                            System.out.println("năm  ");
                            break;
                        }

                    case '6':
                        System.out.println("sáu  ");
                        break;
                    case '7':
                        System.out.println("bảy  ");
                        break;
                    case '8':
                        System.out.println("tám  ");
                        break;
                    case '9':
                        System.out.println("chín  ");
                        break;
                    case '0':
                        System.out.println(" ");
                        break;
                }
                break;
        }

    }
}


