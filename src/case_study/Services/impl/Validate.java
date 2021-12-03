package case_study.Services.impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.models.Employee;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

import static case_study.Services.impl.CustommerServicesImpl.customerList;
import static case_study.Services.impl.BookingServiceImpl.bookingSet;
import static case_study.Services.impl.ContractServicesImpl.contractList;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    public static LocalDate validateDayTime(String sign) {
        LocalDate day = null;
        while (true) {
            try {
                System.out.println(sign);
                day = LocalDate.parse(scanner.nextLine());

                break;
            } catch (DateTimeException e) {
                System.err.println("wrong date and time format!");
            }
        }
        return day;
    }

    public static String isExistCustommerCode(String sign) {
        String input = null;
        while (true) {
            System.out.println(sign);
            try {
                input = scanner.nextLine();
                for (Customer i : customerList) {
                    if (i.getCustommerCode().equals(input)) {
                        return input;
                    }
                }
                throw new IllegalArgumentException();

            } catch (IllegalArgumentException e) {
                System.err.println(" Invalid customer code ");
            }
        }
    }

    public static String isBookingExistCode(String sign) {
        String input = null;
        while (true) {
            System.out.println(sign);
            try {
                input = scanner.nextLine();
                for (Booking i : bookingSet) {
                    if (i.getCustommerCode().equals(input)) {
                        return input;
                    }
                }
                throw new IllegalArgumentException();

            } catch (IllegalArgumentException e) {
                System.err.println(" Invalid customer code ");
            }
        }
    }

    public static Contract isContractExistCode(String input) {
        for (Contract i : contractList) {
            if (i.getContractCode().equals(input)) {
                return i;
            }
        }
        return null;
    }


    public static double validateCost(String sign) {
        while (true) {
            try {
                System.out.println(sign);
                double output = Double.parseDouble(scanner.nextLine());

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
    }

    public static Customer isCustommerExist(String code) {
        for (Customer i : customerList) {
            if (i.getCustommerCode().equals(code)) {
                return i;
            }
        }
        return null;
    }

    public static class FacilityValidate {
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

    public static class EmployeeValidate {
        public static Employee isEmployeeExist(String code) {
            for (Employee i : EmployeeService.employeeList) {
                if (i.getEmployeeCode().equals(code)) {
                    return i;
                }
            }
            return null;
        }


    }
}

