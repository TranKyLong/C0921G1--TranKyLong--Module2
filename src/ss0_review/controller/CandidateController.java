package ss0_review.controller;

import ss0_review.controller.TheException.*;
import ss0_review.data.Candidates;
import ss0_review.data.Experience;
import ss0_review.data.Fresher;
import ss0_review.data.Intership;
import ss0_review.view.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateController {
    public static Scanner scanner = new Scanner(System.in);
    public static String idInput;
    public static String firstNameInput;
    public static String lastNameInput;
    public static Integer birthInput;
    public static String addressInput;
    public static String phoneInput;
    public static String emailInput;
    public static Integer typeInput;

//-	0: cho Experience
//-	1: cho Fresher - moi ra truong`
//-	2: cho Intern - thuc tap sinh

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

    public static void creatCandidate() {

        System.out.println("Nhập id ");
        idInput = scanner.nextLine();

        System.out.println("Nhập tên ");
        firstNameInput = scanner.nextLine();

        System.out.println("Nhập họ ");
        lastNameInput = scanner.nextLine();

        while (true) {
            try {
                System.out.println("Nhập năm sinh ");
                birthInput = Integer.parseInt(scanner.nextLine());
                if (String.valueOf(birthInput).length() != 4) {
                    throw new NotABirthException();
                }
                break;
            } catch (Exception | NotABirthException e) {
                System.err.println("Không phải năm sinh, mời nhập lại");
            }
        }
        System.out.println("Nhập địa chỉ ");
        addressInput = scanner.nextLine();

        while (true) {
            try {
                System.out.println("Nhập số điện thoại (ít nhất 10 số) ");
                phoneInput = scanner.nextLine();
                if (phoneInput.length() < 10) {
                    throw new NotAPhoneNumberException();
                }
                Integer.parseInt(phoneInput);
                break;
            } catch (Exception | NotAPhoneNumberException e) {
                System.err.println("Lỗi, mời nhập lại số điện thoại theo format");
            }

        }

        while (true) {
            try {
                System.out.println("Nhập email (theo format <account name>@<domain>. ) ");
                emailInput = scanner.nextLine();
                if (demKyTu(emailInput) != 1 || emailInput.indexOf('.') == -1) {
                    throw new NotAEmailException();
                }
                break;
            } catch (Exception | NotAEmailException e) {
                System.err.println("Vui lòng nhập đúng format");
            }
        }

        while (true) {
            try {
                System.out.println("Nhập số tương ứng với loại ứng viên\n" +
                        "0. Experience\n" +
                        "1. Fresher\n" +
                        "2. Intership");
                typeInput = Integer.parseInt(scanner.nextLine());
                if (typeInput < 0 || typeInput > 2) {
                    throw new NotATypeCandidateException();
                }
                break;
            } catch (Exception | NotATypeCandidateException e) {
                System.err.println("Lỗi, mời nhập theo format");
            }
        }
    }


    public static void searching() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidates i : candidatesList) {
            if (i instanceof Experience) {
                System.out.println(i.getFirstName() + "" + i.getLastName());
            }
        }
        System.out.println("\n");
        System.out.println("==========FRESHER CANDIDATE==============");
        for (Candidates i : candidatesList) {
            if (i instanceof Fresher) {
                System.out.println(i.getFirstName() + "" + i.getLastName());
            }
        }
        System.out.println("\n");
        System.out.println("===========INTERN CANDIDATE==============");
        for (Candidates i : candidatesList) {
            if (i instanceof Intership) {
                System.out.println(i.getFirstName() + "" + i.getLastName());
            }
        }

        System.out.print("Nhập ký tự có trong tên cần tìm kiếm:  ");
        String searchName = scanner.nextLine();
        Integer searchType;
        while (true) {
            try {
                System.out.println("\nNhập số tương ứng với phân loại ứng viên\n0. Experience\n1. Fresher\n2. Intership");
                searchType = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("Nhập lỗi, mời nhập lại");
            }
        }
        int isFound = -1;
        for (Candidates i : candidatesList) {
            if (((i.getFirstName().contains(searchName)) || i.getLastName().contains(searchName)) && searchType.equals(i.getType())) {
                isFound++;
                System.out.println(i.getFirstName() + "" + i.getLastName() + " | " + i.getAddress() + " | " + i.getPhone() + " | " + i.getEmail() + " | " + i.getType());
            }
        }
        if (isFound < 0) {
            System.out.println("không tìm thấy");
        }
    }

    static List<Candidates> candidatesList = new ArrayList<>();

    static {
        candidatesList.add(new Experience("100", "Eva ", "Aguirre", 1990, "Sao paulo", "940394", "eva@asante.com", 0, 10, "Tester"));
        candidatesList.add(new Experience("101", "Magnus ", "Ferrus ", 1980, "New York", "955055", "magnus@gmail.com", 0, 15, "Mechanic"));
        candidatesList.add(new Fresher("102", "Sicarus ", "Nguyen ", 2000, "Nevada", "958885", "Sicarus@gmail.com", 1, "2018", "Good ", "Havrast"));
    }

    // Experience(Integer id, String firstName, String lastName,
    // Integer birth, String address, String phone, String email,
    // Integer type, Integer expInYear, String proSkill)
    //    Fresher(Integer id, String firstName, String lastName, Integer birth, String address, String phone, String email, Integer type, Integer graduationDate, String graduationRank, String education)
    public static void creatExperience() {
        creatCandidate();
        Integer expInYear;
        while (true) {
            try {
                System.out.println("Nhập năm kinh nghiệm (nhập số từ 0 -> 100)");
                expInYear = Integer.parseInt(scanner.nextLine());
                if (expInYear < 0 || expInYear > 100) {
                    throw new ExpInYearException();
                }
                break;
            } catch (Exception | ExpInYearException e) {
                System.err.println("lỗi, mời nhập lại");
            }

        }
        System.out.println("Kỹ năng chuyên môn");
        String proSkill = scanner.nextLine();

        candidatesList.add(new Experience(idInput, firstNameInput, lastNameInput, birthInput, addressInput, phoneInput, emailInput, typeInput, expInYear, proSkill));

        System.out.println("Bạn có muốn tiếp tục?\n" +
                " [ Y / N] ?");
        String option = scanner.nextLine();
        switch (option) {
            case "Y":
            case "y":
                creatExperience();
                break;
            case "N":
            case "n":
                for (Candidates i : candidatesList) {
                    if (i instanceof Experience) {
                        System.out.println(i.getFirstName() + "," + i.getLastName());
                    }
                }
                Menu.showMenu();
                break;
        }


    }

    public static void creatFresher() {
        creatCandidate();
        String graduationRank;
        do {
            System.out.println("Nhập học lực (Excellence, Good, Fair, Poor)");
            graduationRank = scanner.nextLine();
        }
        while (!("Excellence".equals(graduationRank) || "Good".equals(graduationRank) || "Fair".equals(graduationRank) || "Poor".equals(graduationRank)));

        System.out.println("Đã tốt nghiệp trường : ");
        String educate = scanner.nextLine();

        System.out.println("Năm tốt nghiệp ");
        String graduateDate = scanner.nextLine();
        candidatesList.add(new Fresher(idInput, firstNameInput, lastNameInput, birthInput, addressInput, phoneInput, emailInput, typeInput, graduateDate, graduationRank, educate));

        System.out.println("Bạn có muốn tiếp tục?\n" +
                " [ Y / N] ?");
        String option = scanner.nextLine();
        switch (option) {
            case "Y":
            case "y":
                creatFresher();
                break;
            case "N":
            case "n":
                for (Candidates i : candidatesList) {
                    if (i instanceof Fresher) {
                        System.out.println(i.getFirstName() + "," + i.getLastName());
                    }
                }
                Menu.showMenu();
                break;
        }
    }

    public static void creatIntership() {
        creatCandidate();
        System.out.println("Nhập chuyên ngành");
        String major = scanner.nextLine();

        System.out.println("Nhập học kỳ");
        Integer hocKy = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên trường đại học");
        String uniName = scanner.nextLine();

        candidatesList.add(new Intership(idInput, firstNameInput, lastNameInput, birthInput, addressInput, phoneInput, emailInput, typeInput, major, hocKy, uniName));


        System.out.println("Bạn có muốn tiếp tục?\n" +
                " [ Y / N] ?");
        String option = scanner.nextLine();
        switch (option) {
            case "Y":
            case "y":
                creatIntership();
                break;
            case "N":
            case "n":
                for (Candidates i : candidatesList) {
                    if (i instanceof Intership) {
                        System.out.println(i.getFirstName() + "," + i.getLastName());
                    }
                }
                Menu.showMenu();
                break;
        }

    }
}
