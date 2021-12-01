package case_study.Services.facility;

import case_study.Services.GeneralMethod;
import case_study.models.co_so_vat_chat.Facility;
import case_study.models.co_so_vat_chat.House;
import case_study.models.co_so_vat_chat.Room;
import case_study.models.co_so_vat_chat.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl {
    Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    public List<?> readFile(String path) {
        return null;
    }

    public static final String HOUSE_PATH = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\house.csv";
    public static final String ROOM_PATH = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\room.csv";
    public static final String VILLA_PATH = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\villa.csv";

    public static void writeToCsv() {
        try {
            new FileWriter(HOUSE_PATH, false).close();
            new FileWriter(ROOM_PATH, false).close();
            new FileWriter(VILLA_PATH, false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getKey() instanceof House) {
                GeneralMethod.writFile(entry.getKey(), HOUSE_PATH);
            } else if (entry.getKey() instanceof Room) {

                GeneralMethod.writFile(entry.getKey(), ROOM_PATH);
            } else {
                GeneralMethod.writFile(entry.getKey(), VILLA_PATH);
            }
        }
    }

    static {
        facilityMap.put(new House("nae001", 12.5, 15.6, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-9234"), 1);
        facilityMap.put(new House("house2", 12.5, 15.6, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-1344"), 1);
        facilityMap.put(new House("house3", 12.5, 25.5, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-1394"), 1);
        facilityMap.put(new Room("name01", 12.5, 11.6, 5, "Theo Ngày", "Cartoon_Network", "SVRO-1274"), 2);
        facilityMap.put(new Room("room", 12.5, 11.6, 5, "Theo Ngày", "Cartoon_Network", "SVRO-1254"), 2);
        facilityMap.put(new Villa("name001", 12.5, 17.6, 5, "Theo Ngày", "Không Sao", 5, 2, "SVVL-1284"), 5);
        facilityMap.put(new Villa("myvilla", 12.5, 17.6, 5, "Theo Ngày", "Không Sao", 20.5, 2, "SVVL-1034"), 5);
    }

    public void getMaintenanceList() {
    }

    public static void displayFacility() {
        System.out.println("-=HOUSE SERVICES=-");
        for (String i : GeneralMethod.readFileCsv(HOUSE_PATH)) {
            System.out.println(i.replace(",", "\t \t"));
        }
        System.out.println("\n-=ROOM SERVICES=-");
        for (String i : GeneralMethod.readFileCsv(ROOM_PATH)) {
            System.out.println(i.replace(",", "\t \t"));
        }
        System.out.println("\n-=VILLA SERVICES=-");
        for (String i : GeneralMethod.readFileCsv(VILLA_PATH)) {
            System.out.println(i.replace(",", "\t \t"));
        }

    }

    public static void main(String[] args) {
        writeToCsv();

        displayFacility();
    }

    public Facility getNewFacility(int num) {
        switch (num) {
            case 1: //for new house
                House myHouse = null;
                myHouse = (House) GeneralMethodFacility.getFacility(myHouse);
                System.out.println("Enter the house standard");
                myHouse.setTieuChuanHouse(scanner.nextLine());

                String house_services_code = (FacilityValidate.validateInput("Enter house services code", 1));
                myHouse.setSerivesCode(house_services_code);
                while (true) {
                    try {
                        System.out.println("enter the number of floors");
                        myHouse.setSoTangHouse(Integer.parseInt(scanner.nextLine()));
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("Please enter a number");
                    }
                }
                return myHouse;
            case 2:
                Room myRoom = null;
                myRoom = (Room) GeneralMethodFacility.getFacility(myRoom);
                System.out.println("enter the included free service");
                myRoom.setDichVuMienPhiDiKem(scanner.nextLine());
                String room_serives_code = (FacilityValidate.validateInput("Enter room services code", 2));
                myRoom.setSerivesCode(room_serives_code);
                return myRoom;
            case 3:
                Villa myVilla = null;
                myVilla = (Villa) GeneralMethodFacility.getFacility(myVilla);
                String standar = FacilityValidate.validateInput("Enter the Villa standar", 0);
                myVilla.setTieuChuanVilla(standar);
                double area = FacilityValidate.validateArea("enter the pool area");
                myVilla.setDienTichHoBoi(area);

                int floors = (int) FacilityValidate.validateNumber("enter the number of floor", 1);
                myVilla.setSoTang(floors);

                String villa_serives_code = (FacilityValidate.validateInput("Enter villa services code", 3));
                myVilla.setSerivesCode(villa_serives_code);
                return myVilla;
        }
        return null;
    }


}

