package ss0_review.controller;

import ss0_review.data.Candidates;

import java.util.Scanner;

import static ss0_review.controller.CandidateController.*;

public class ValidateSolution {
    static Scanner scanner = new Scanner(System.in);

    static String inputID() {
        while (true) {
            try { /// validate id
                System.out.println("Nhập id ");
                idInput = scanner.nextLine();
                for (Candidates i : candidatesList) {
                    if (i.getId().equals(idInput)) {
                        throw new MalformedException();
                    }
                }
                break;
            } catch (Exception e) {
                System.err.println("ID đã tồn tại");
            }
        }
        return idInput;
    }

    static Integer inputBirth() {
        while (true) {
            try {
                System.out.println("Nhập năm sinh ");
                birthInput = Integer.parseInt(scanner.nextLine());
                if (String.valueOf(birthInput).length() != 4) {
                    throw new MalformedException();
                }
                break;
            } catch (Exception e) {
                System.err.println("Không phải năm sinh");
            }
        }
        return birthInput;
    }

    static String inputPhoneNumber() {
        while (true) {
            try {
                System.out.println("Nhập số điện thoại (ít nhất 10 số) ");
                phoneInput = scanner.nextLine();
                if (phoneInput.length() < 10) {
                    throw new MalformedException();
                }
                Integer.parseInt(phoneInput);
                break;
            } catch (Exception e) {
                System.err.println("Lỗi, mời nhập lại số điện thoại theo format");
            }

        }
        return phoneInput;
    }
    static int demKyTu(String str) {
        int result = 0;
        String[] myChar = str.split("");
        for (String i : myChar) {
            if ("@".equals(i)) {
                result++;
            }
        }
        return result;
    }

    static String inputMail() {
        while (true) {
            try {
                System.out.println("Nhập email (theo format <account name>@<domain>. ) ");
                emailInput = scanner.nextLine();
                if (demKyTu(emailInput) != 1 || emailInput.indexOf('.') == -1) {
                    throw new MalformedException();
                }
                break;
            } catch (MalformedException e) {
                System.err.println("Vui lòng nhập đúng format");
            }
        }
        return emailInput;
    }

    static Integer inputType() {
        while (true) {
            try {
                System.out.println("Nhập số tương ứng với loại ứng viên\n" +
                        "0. Experience\n" +
                        "1. Fresher\n" +
                        "2. Intership");
                typeInput = Integer.parseInt(scanner.nextLine());
                if (typeInput < 0 || typeInput > 2) {
                    throw new MalformedException();
                }
                break;
            } catch (Exception e) {
                System.err.println("Lỗi, mời nhập theo format");
            }
        }
        return typeInput;
    }

    static Integer inputExpInYear() {
        Integer expInYear;
        while (true) {
            try {
                System.out.println("Nhập năm kinh nghiệm (nhập số từ 0 -> 100)");
                expInYear = Integer.parseInt(scanner.nextLine());
                if (expInYear < 0 || expInYear > 100) {
                    throw new MalformedException();
                }
                break;
            } catch (Exception e) {
                System.err.println("lỗi, mời nhập lại");
            }
        }
        return expInYear;
    }
}
