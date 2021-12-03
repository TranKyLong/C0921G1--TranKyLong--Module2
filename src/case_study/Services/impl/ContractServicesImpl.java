package case_study.Services.impl;

import case_study.Services.IContractServices;
import case_study.models.Booking;
import case_study.models.Contract;
import case_study.utils.ReadWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static case_study.Services.impl.BookingServiceImpl.bookingSet;
import static case_study.Services.impl.Validate.isContractExistCode;

public class ContractServicesImpl implements IContractServices {
    static Scanner scanner = new Scanner(System.in);
    static Queue<Booking> bookingQueue = new LinkedList<>(bookingSet);
    static List<Contract> contractList = new ArrayList<>();
    public static final String CONTRATC_FILE = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\contract.csv";

    private static Contract getNewContract() {
        Contract myContract = new Contract();

        System.out.println("Enter contract number");
        myContract.setContractNumber(scanner.nextLine());

        double theCost = Validate.validateCost("Enter advance stake");
        myContract.setAdvanceStake(theCost);

        System.out.println("Enter contract code");
        myContract.setContractCode(scanner.nextLine());

        double totalCost = Validate.validateCost("Enter total price");
        myContract.setTotal(totalCost);
        return myContract;
    }

    @Override
    public void addContract() {
        int count = 0;
        for (Booking booking : bookingQueue) {
            if ("Villa".equals(booking.getServicesType()) || "House".equals(booking.getServicesType())) {
                for (Contract contract : contractList) {
                    if (!booking.getCustommerCode().equals(contract.getCustommerCode())) {
                        count++;
                        Contract myNewContract = getNewContract();
                        myNewContract.setCustommerCode(booking.getCustommerCode());
                        contractList.add(myNewContract);
                        writeToCsv();
                        System.out.println("sucess");
                        break;
                    }
                }
            }
        }
        if (count < 1) {
            System.out.println("No contracts to create");
        }
        displayContract();
    }

    private static void writeToCsv() {
        try {
            new FileWriter(CONTRATC_FILE, false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Contract i : contractList) {
            ReadWrite.writFile(i, CONTRATC_FILE);
        }
    }

    @Override
    public void displayContract() {
        List<String> displayContract = ReadWrite.readFileCsv(CONTRATC_FILE);
        for (String i : displayContract) {
            System.out.println(i);
        }
    }

    @Override
    public void editContract() {
        System.out.println("enter exist contract code to edit ");
        String contractCode = scanner.nextLine();
        Contract editContract = isContractExistCode(contractCode);
        if (editContract != null) {
            editContract = getNewContract();
            System.out.println("enter contract code");
            editContract.setContractCode(scanner.nextLine());
            writeToCsv();
        } else System.err.println("contract does not exist");
    }
}
