package case_study.Services.impl;

import case_study.Services.IPromotionServices;
import case_study.models.Booking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import static case_study.Services.impl.BookingServiceImpl.bookingSet;
import static case_study.Services.impl.BookingServiceImpl.scanner;

public class PromotionServicesImpl implements IPromotionServices {
    public static Stack<Booking> promotionStack = new Stack<>();
    public static List<Integer> voucher = new ArrayList<>();

    static {
        promotionStack.addAll(bookingSet);
    }

    @Override
    public void voucherAdder() {
        int value50;
        int value20;
        int value10;
        while (true) {
            try {
                System.out.println("Enter the number of voucher");
                System.out.print("50% :");
                value50 = scanner.nextInt();
                creatVoucherList(value50, 50);
                System.out.print("20% :");
                value20 = scanner.nextInt();
                creatVoucherList(value20, 20);
                System.out.print("10% :");
                value10 = scanner.nextInt();
                creatVoucherList(value10, 10);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number");
            }
        }
    }

    private static void creatVoucherList(int quantity, int promotionValue) {
        for (int i = 0; i < quantity; i++) {
            voucher.add(promotionValue);
        }
        Collections.sort(voucher);
        Collections.reverse(voucher);
    }

    @Override
    public void displayCustommerList() {
        System.out.println("the customers are using the service");
        for (Booking i : bookingSet) {
            System.out.println(i.getCustommerCode());
        }
    }

    @Override
    public void showCustomerGetVoucher() {
        System.out.println("customers are given vouchers");
        for (int i = 0; i < promotionStack.size(); i++) {
            System.out.println("customers with code is: " + promotionStack.get(i).getCustommerCode()
                    + " will receive " + voucher.get(i) + "% voucher, with booking day is: " + promotionStack.get(i).getBookingTime());
        }
    }
}
