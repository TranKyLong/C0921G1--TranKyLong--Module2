package ss0_review.controller;

import ss0_review.data.Candidates;
import ss0_review.data.Experience;
import ss0_review.data.Fresher;
import ss0_review.data.Intership;

import java.io.*;
import java.util.*;

import static ss0_review.controller.ValidateSolution.*;

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

    public static void choiceMenu() {
        System.out.println("CANDIDATE MANAGEMENT SYSTEM\n" +
                "1.\tAdd Experience Candidates\n" +
                "2.\tAdd Fresher Candidates\n" +
                "3.\tAdd Internship Candidates\n" +
                "4.\tSearching\n" +
                "5.\tUpdate\n" +
                "6.\tDelete Candidates\n" +
                "7.\tEdit Candidates\n" +
                "8.\tDisplay all Candidates\n" +
                "9.\tExit\n");

        try {
            System.out.println("Nhập số tương ứng với chức năng");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    creatExperience();
                    break;
                case 2:
                    creatFresher();
                    break;
                case 3:
                    creatIntership();
                    break;
                case 4:
                    findCandidate();

                    break;
                case 5:
                    writeToCSV();
                    System.out.println("Cập nhật thành công");
                    break;
                case 6:
                    deleteCandidates(inputEditID());
                    break;

                case 7:
                    editCandidates(inputEditID());
                    break;
                case 8:
                    displayAll();
                    break;

                case 9:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập lại giá trị đúng");
                    choiceMenu();
                    break;

            }
        } catch (Exception e) {
            System.err.println("Lỗi, mời nhập lại");
            choiceMenu();
        }
    }


    public static void creatCandidate() {
        inputID();
        inputBirth();
        inputPhoneNumber();
        inputMail();
        System.out.println("Nhập tên ");
        firstNameInput = scanner.nextLine();

        System.out.println("Nhập họ ");
        lastNameInput = scanner.nextLine();

        System.out.println("Nhập địa chỉ ");
        addressInput = scanner.nextLine();
    }

    public static void displayAll() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        showAll(new File(EXP_FILE));
        System.out.println("\n==========FRESHER CANDIDATE==============");
        showAll(new File(FRESHER_FILE));
        System.out.println("\n===========INTERN CANDIDATE==============");
        showAll(new File(INTERSHIP_FILE));

    }

    public static void showAll(File file) {
        //parsing a CSV file into Scanner class constructor
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert sc != null;
        sc.useDelimiter(", "); //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.println(sc.nextLine() );  //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner
    }


    public static void findCandidate() {
        displayAll();

        System.out.print("Nhập ký tự có trong tên cần tìm kiếm:  ");
        String searchName = scanner.nextLine();
        inputType();
        int isFound = -1;
        for (Candidates i : candidatesList) {
            if (((i.getFirstName().contains(searchName)) || i.getLastName().contains(searchName)) && inputType().equals(i.getType())) {
                isFound++;
                System.out.println(i.getFirstName() + "" + i.getLastName() + " | " + i.getAddress() + " | " + i.getPhone() + " | " + i.getEmail() + " | " + i.getType());
            }
        }
        if (isFound < 0) {
            System.err.println("không tìm thấy");
        }
        choiceMenu();
    }

    public static List<Candidates> candidatesList = new ArrayList<>();

    static {
        candidatesList.add(new Experience("100", "Eva ", "Aguirre", 1990, "Sao paulo", "940394", "eva@asante.com", 0, 10, "Tester"));
        candidatesList.add(new Experience("101", "Magnus ", "Ferrus ", 1980, "New York", "955055", "magnus@gmail.com", 0, 15, "Mechanic"));
        candidatesList.add(new Fresher("102", "Sicarus ", "Nguyen ", 2000, "Nevada", "958885", "Sicarus@gmail.com", 1, "2018", "Good ", "Havrast"));
    }

    public static int option() {
        int result = 1;
        while (true) {
            try {
                System.out.println("Bạn có muốn tiếp tục?\n" +
                        " [ Y / N] ?");
                String option = scanner.nextLine();
                if ("y".equals(option) || "Y".equals(option)) {
                    result = 1;
                } else if ("n".equals(option) || "N".equals(option)) {
                    result = 0;
                } else {
                    throw new MalformedException();
                }
                break;
            } catch (MalformedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void creatExperience() {
        creatCandidate();
        inputExpInYear();

        System.out.println("Kỹ năng chuyên môn");
        String proSkill = scanner.nextLine();

        candidatesList.add(new Experience(idInput, firstNameInput, lastNameInput, birthInput, addressInput, phoneInput, emailInput, 0, inputExpInYear(), proSkill));

        if (option() == 1) {
            creatExperience();
        } else {
            for (Candidates i : candidatesList) {
                if (i instanceof Experience) {
                    System.out.println(i.getFirstName() + " " + i.getLastName());
                }
            }
            choiceMenu();
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
        candidatesList.add(new Fresher(idInput, firstNameInput, lastNameInput, birthInput, addressInput, phoneInput, emailInput, 1, graduateDate, graduationRank, educate));

        if (option() == 1) {
            creatFresher();
        } else {
            for (Candidates i : candidatesList) {
                if (i instanceof Fresher) {
                    System.out.println(i.getFirstName() + " " + i.getLastName());
                }
            }
            choiceMenu();
        }
    }

    public static void creatIntership() {
        creatCandidate();
        System.out.println("Nhập chuyên ngành");
        String major = scanner.nextLine();

        System.out.println("Nhập học kỳ");
        String hocKy = scanner.nextLine();

        System.out.println("Nhập tên trường đại học");
        String uniName = scanner.nextLine();

        candidatesList.add(new Intership(idInput, firstNameInput, lastNameInput, birthInput, addressInput, phoneInput, emailInput, 2, major, hocKy, uniName));

        if (option() == 1) {
            creatIntership();
        } else {
            for (Candidates i : candidatesList) {
                if (i instanceof Intership) {
                    System.out.println(i.getFirstName() + " " + i.getLastName());
                }
            }
            choiceMenu();
        }
    }

    private static void showAllCandidates() {
        Collections.sort(candidatesList);
        for (Candidates i : candidatesList) {
            System.out.print(i.getId() + COMMA + i.getFirstName() + "" + i.getLastName() + COMMA + i.getBirth() + COMMA + i.getAddress() + COMMA + i.getPhone()
                    + COMMA + i.getEmail() + " ");
            System.out.println(i);
        }
    }

    public static Candidates inputEditID() {
        int found = -1;
        showAllCandidates();
        Candidates x = null;
        System.out.println("Nhập id của ứng viên cần chỉnh sửa");
        String idToEdit = scanner.nextLine();
        for (Candidates i : candidatesList) {
            if (i.getId().equals(idToEdit)) {
                found++;
                x = i;
                break;
            }
        }
        if (found < 0) {
            System.err.println("Không tìm thấy");


            choiceMenu();
        }
        return x;
    }

    public static void deleteCandidates(Candidates candidates) {
        for (Candidates i : candidatesList) {
            if (i.getId().equals(candidates.getId())) {
                candidatesList.remove(i);
                break;
            }
        }
        choiceMenu();
    }

    private static void editCandidates(Candidates candidates) {
        try {
            System.out.println("1. Chỉnh sửa id ");
            System.out.println("2. Chỉnh sửa tên ");
            System.out.println("3. Chỉnh sửa họ ");
            System.out.println("4. Chỉnh sửa năm sinh ");
            System.out.println("5. Chỉnh sửa địa chỉ ");
            System.out.println("6. Chỉnh sửa số điện thoại ");
            System.out.println("7. Chỉnh sửa email ");
            System.out.println("8. Chỉnh sửa số năm kinh nghiệm ");
            System.out.println("9. Chỉnh sửa kỹ năng chuyên môn ");
            System.out.println("10. Chỉnh sửa chuyên ngành ");
            System.out.println("11. Chỉnh sửa tên trường đại học ");
            System.out.println("12. Chỉnh sửa học kỳ ");
            System.out.println("13. Chỉnh sửa xếp hạng học lực ");
            System.out.println("14. Chỉnh sửa năm tốt nghiệp ");
            System.out.println("15. Chỉnh sửa trường đã tốt nghiệp ");
            System.out.println("0. Trở về Mainmenu ");

            System.out.println("CHỌN SỐ TƯƠNG ỨNG CHỨC NĂNG");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0:
                    choiceMenu();
                case 1:
                    candidates.setId(inputID());
                    System.out.println("Chỉnh sửa thành công");
                    editCandidates(candidates);
                    break;
                case 2:
                    System.out.println("Nhập tên mới");
                    candidates.setFirstName(scanner.nextLine());
                    System.out.println("Chỉnh sửa thành công");
                    editCandidates(candidates);
                    break;
                case 3:
                    System.out.println("Nhập họ mới");
                    candidates.setLastName(scanner.nextLine());
                    System.out.println("Chỉnh sửa thành công");
                    editCandidates(candidates);
                    break;
                case 4:
                    candidates.setBirth(inputBirth());
                    System.out.println("Chỉnh sửa thành công");
                    editCandidates(candidates);
                    break;
                case 5:
                    System.out.println("Nhập địa chỉ mới");
                    candidates.setAddress(scanner.nextLine());
                    System.out.println("Chỉnh sửa thành công");
                    editCandidates(candidates);
                    break;
                case 6:
                    candidates.setPhone(inputPhoneNumber());
                    System.out.println("Chỉnh sửa thành công");
                    editCandidates(candidates);
                    break;
                case 7:
                    candidates.setEmail(inputMail());
                    System.out.println("Chỉnh sửa thành công");
                    editCandidates(candidates);
                    break;
                case 8:
                    if (candidates instanceof Experience) {
                        ((Experience) candidates).setExpInYear(inputExpInYear());

                        System.out.println("Chỉnh sửa thành công");
                        editCandidates(candidates);
                    }
                    break;
                case 9:
                    if (candidates instanceof Experience) {
                        System.out.println("Nhập chuyên môn");
                        ((Experience) candidates).setProSkill(scanner.nextLine());
                    }
                    System.out.println("Chỉnh sửa thành công");
                    editCandidates(candidates);
                    break;
                case 10:
                    if (candidates instanceof Intership) {
                        System.out.println("Mời nhập chuyên ngành");
                        ((Intership) candidates).setMajors(scanner.nextLine());
                        System.out.println("Chỉnh sửa thành công");
                        editCandidates(candidates);
                    }
                    break;
                case 11:
                    if (candidates instanceof Intership) {
                        System.out.println("Mời nhập tên trường đại học");
                        ((Intership) candidates).setUniName(scanner.nextLine());
                        System.out.println("Chỉnh sửa thành công");
                        editCandidates(candidates);
                    }
                    break;
                case 12:
                    if (candidates instanceof Intership) {
                        System.out.println("Mời nhập học kỳ");
                        ((Intership) candidates).setSemester(scanner.nextLine());
                        System.out.println("Chỉnh sửa thành công");
                        editCandidates(candidates);
                    }
                    break;
                case 13:
                    if (candidates instanceof Fresher) {
                        System.out.println("Mời nhập học lực");
                        ((Fresher) candidates).setGraduationRank(scanner.nextLine());
                        System.out.println("Chỉnh sửa thành công");
                        editCandidates(candidates);
                    }
                    break;
                case 14:
                    if (candidates instanceof Fresher) {
                        System.out.println("Mời nhập năm tốt nghiệp");
                        ((Fresher) candidates).setGraduationDate(scanner.nextLine());
                        System.out.println("Chỉnh sửa thành công");
                        editCandidates(candidates);
                    }
                    break;
                case 15:

                    if (candidates instanceof Fresher) {
                        System.out.println("Mời nhập tên trường");
                        ((Fresher) candidates).setEducation(scanner.nextLine());
                        System.out.println("Chỉnh sửa thành công");
                        editCandidates(candidates);
                    }
                    break;
                default:
                    System.err.println("Mời nhập lại giá trị đúng");
                    editCandidates(candidates);
                    break;

            }
        } catch (Exception e) {
            System.err.println("Mời chọn đúng thuộc tính mà ứng viên sở hữu");
            editCandidates(candidates);
        }
        choiceMenu();
    }

    static final String COMMA = ",";
    public static final String EXP_FILE = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\ss0_review\\File\\EXPRIENCE_FILE.csv";
    static final String FRESHER_FILE = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\ss0_review\\File\\FRESHER_FILE.csv";
    static final String INTERSHIP_FILE = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\ss0_review\\File\\INTERSHIP_FILE.csv";

    public static void writeToCSV() {
        final String FILEHEADER = "ID,NAME,BIRTHDAY,ADRESS,PHONE,EMAIL,TYPE, ";
        final String INTERSHIP_HEADER = FILEHEADER + "MAJOR,SEMESTER,UNIVERSITY NAME\n";
        final String EXPERIENCE_HEADER = FILEHEADER + "YEARS OF EXPERIENCE,PRO SKILL\n";
        final String FRESHER_HEADER = FILEHEADER + "GRADUATION YEAR,GRADUATION RANKING,GRADUATION SCHOOL'NAME\n";

        FileWriter exp = null;
        FileWriter inter = null;
        FileWriter fresher = null;
        try {
            exp = new FileWriter(EXP_FILE);
            inter = new FileWriter(FRESHER_FILE);
            fresher = new FileWriter(INTERSHIP_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            exp.write(EXPERIENCE_HEADER);
            for (Candidates i : candidatesList) {
                if (i instanceof Experience) {
                    exp.write(i.getId() + COMMA + i.getFirstName() + " " + i.getLastName() + COMMA + i.getBirth() + COMMA + i.getAddress() + COMMA + i.getPhone()
                            + COMMA + i.getEmail() + COMMA + ((Experience) i).getTYPE() + COMMA + ((Experience) i).getExpInYear() + COMMA + ((Experience) i).getProSkill() + "\n");
                }
            }


            inter.write(INTERSHIP_HEADER);
            for (Candidates z : candidatesList) {
                if (z instanceof Intership) {
                    inter.write(z.getId() + COMMA + z.getFirstName() + " " + z.getLastName() + COMMA + z.getBirth() + COMMA + z.getAddress() + COMMA + z.getPhone()
                            + COMMA + z.getEmail() + COMMA + ((Intership) z).getTYPE() + COMMA + ((Intership) z).getMajors() + COMMA + ((Intership) z).getSemester() + COMMA + ((Intership) z).getUniName() + "\n");
                }
            }
            fresher.write(FRESHER_HEADER);
            for (Candidates x : candidatesList) {
                if (x instanceof Fresher) {
                    fresher.write(x.getId() + COMMA + x.getFirstName() + " " + x.getLastName() + COMMA + x.getBirth() + COMMA + x.getAddress() + COMMA + x.getPhone()
                            + COMMA + x.getEmail() + COMMA + (x).getType() + COMMA + ((Fresher) x).getGraduationDate() + COMMA + ((Fresher) x).getGraduationRank() + COMMA + ((Fresher) x).getEducation() + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                exp.close();
                inter.close();
                fresher.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        choiceMenu();
    }
}