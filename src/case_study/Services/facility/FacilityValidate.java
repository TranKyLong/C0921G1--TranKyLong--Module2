package case_study.Services.facility;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FacilityValidate {
    static Scanner scanner = new Scanner(System.in);

    /***
     * type == 0 dùng  để xác định giá trị cần validate là tên các loại,
     ngoài ra là mã dịch vụ
     *       1 : House, 2: Room , 3: Villa
     */

    public static String validateInput(String sign, String type) {
        String input;
        boolean match;
        String format = null;
        switch (type) {
            case "name":         //định dạng tên viết hoa
                format = "^([A-Z]([a-z]+)\\t+)+$";
                break;
            case "room":
                format = "^(SV)(RO)[-](\\d){4}$";
                break;
            case "house":
                format = "^(SV)(HO)[-](\\d){4}$";
                break;
            case "villa":
                format = "^(SV)(VL)[-](\\d){4}$";
                break;
        }
        while (true) {
            try {
                System.out.println(sign);
                input = scanner.nextLine();
                assert format != null;
                match = Pattern.compile(format).matcher(input).matches();
                if (!match) {
                    throw new IllegalStateException();
                }
                break;
            } catch (IllegalStateException e) {
                System.err.println("Wrong format!");
            }
        }
        return input;
    }

    public static double validateArea(String sign) {
        double area;
        while (true) {
            try {
                System.out.println(sign);
                area = Double.parseDouble(scanner.nextLine());
                if (area <= 30) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalStateException e) {
                System.err.println("Please enter a number > 30");
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number ");
            } catch (Exception e) {
                System.err.println("Please try angain !");
            }
        }
        return area;
    }

    public static int validatePeople(String sign) {
        int number;
        while (true) {
            try {
                System.out.println(sign);
                number = Integer.parseInt(scanner.nextLine());
                if (number <= 0 || number >= 20) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number ");
            } catch (IllegalArgumentException e) {
                System.err.println("Please enter a number > 30");
            } catch (Exception e) {
                System.err.println("Please try angain !");
            }
        }
        return number;
    }

    public static String validateRentalType() {
        while (true) {
            try {
                System.out.println("choose rental type\n"
                        + "1. By year\n"
                        + "2. By month\n"
                        + "3. By day\n"
                        + "4. By hour\n"
                );
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        return "By Year";
                    case 2:
                        return "By Month";
                    case 3:
                        return "By Day";
                    case 4:
                        return "By Hour";
                    default:
                        throw new IllegalArgumentException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number");
            } catch (IllegalArgumentException e) {
                System.err.println("Wrong number!");
            } catch (Exception e) {
                System.err.println("Please try again!");
            }
        }
    }

    public static double validateNumber(String sign, int type) { //type 1 validate số tầng , 2 cho giá thuê
        switch (type) {
            case 1:
                while (true) {
                    try {
                        System.out.println(sign);
                        int output = Integer.parseInt(scanner.nextLine());
                        if (output < 1) {
                            throw new IllegalArgumentException();
                        }
                        return output;
                    } catch (NumberFormatException e) {
                        System.err.println("Please enter a number");
                    } catch (IllegalArgumentException e) {
                        System.err.println("Wrong number!");
                    }
                }
            case 2:
                while (true) {
                    try {
                        System.out.println(sign);
                        double costOutput = Double.parseDouble(scanner.nextLine());
                        if (costOutput < 1) {
                            throw new IllegalArgumentException();
                        }
                        return costOutput;
                    } catch (NumberFormatException e) {
                        System.err.println("Please enter a correct type of number");

                    } catch (IllegalArgumentException e) {
                        System.err.println("Wrong number!");
                    }
                }
        }
        return 0;
    }

}
