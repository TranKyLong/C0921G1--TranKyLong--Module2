package case_study.Services.impl;

import case_study.Services.IFacilityServices;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.ReadWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FacilityServiceImpl implements IFacilityServices {
    Scanner scanner = new Scanner(System.in);
    public static List<Facility> maintain = new ArrayList<>();
    public static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    public static final String HOUSE_PATH = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\house.csv";
    public static final String ROOM_PATH = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\room.csv";
    public static final String VILLA_PATH = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\villa.csv";
    public static final String MAINTAIN = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\maintain.csv";

    static {
        facilityMap.put(new House("house1", 112.5, 150.6, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-9234"), 1);
        facilityMap.put(new House("house2", 112.5, 150.6, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-1344"), 4);
        facilityMap.put(new House("house3", 112.5, 250.5, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-1394"), 1);
        facilityMap.put(new Room("name01", 150.5, 110.6, 5, "Theo Ngày", "Cartoon_Network", "SVRO-1274"), 4);
        facilityMap.put(new Room("room", 150.5, 110.6, 5, "Theo Ngày", "Cartoon_Network", "SVRO-1254"), 2);
        facilityMap.put(new Villa("name001", 150.5, 17.6, 5, "Theo Ngày", "Không Sao", 30, 2, "SVVL-1284"), 4);
        facilityMap.put(new Villa("myvilla", 150.5, 170.6, 5, "Theo Ngày", "Không Sao", 20.5, 2, "SVVL-1034"), 5);

        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getValue() >= 5) {
                maintain.add(entry.getKey());
            }
        }
        try {
            new FileWriter(MAINTAIN, false).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Facility i : maintain) {
            ReadWrite.writFile(i, MAINTAIN);
        }
    }
@Override
    public void displayMaintain() {
        for (Facility i : maintain
        ) {
            System.out.println(i.toString());
        }
    }

    private static void writeToCsv() {
        try {
            new FileWriter(HOUSE_PATH, false).close();
            new FileWriter(ROOM_PATH, false).close();
            new FileWriter(VILLA_PATH, false).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getKey() instanceof House) {
                ReadWrite.writFile(entry.getKey(), HOUSE_PATH);
            } else if (entry.getKey() instanceof Room) {
                ReadWrite.writFile(entry.getKey(), ROOM_PATH);
            } else {
                ReadWrite.writFile(entry.getKey(), VILLA_PATH);
            }
        }
    }

    @Override
    public void displayFacility() {
        System.out.println("-=HOUSE SERVICES=-");
        for (String i : ReadWrite.readFileCsv(HOUSE_PATH)) {
            System.out.println(i.replace(",", "\t \t"));
        }
        System.out.println("\n-=ROOM SERVICES=-");
        for (String i : ReadWrite.readFileCsv(ROOM_PATH)) {
            System.out.println(i.replace(",", "\t \t"));
        }
        System.out.println("\n-=VILLA SERVICES=-");
        for (String i : ReadWrite.readFileCsv(VILLA_PATH)) {
            System.out.println(i.replace(",", "\t \t"));
        }
    }

    @Override
    public void getNewHouse() {
        House myHouse = null;
        myHouse = (House) GeneralMethodFacility.getFacility(myHouse);
        Validate.FacilityValidate.validateInput("Enter house services code", "house");
        System.out.println("Enter the house standard");
        myHouse.setTieuChuanHouse(scanner.nextLine());

        String house_services_code = (Validate.FacilityValidate.validateInput("Enter house services code", "house"));
        myHouse.setSerivesCode(house_services_code);
        int floor = (int) (Validate.FacilityValidate.validateNumber("Enter number of floors", 1));
        myHouse.setSoTangHouse(floor);

        facilityMap.put(myHouse, 0);
        writeToCsv();
        System.out.println("SUCESS");
    }

    @Override
    public void getNewRoom() {
        Room myRoom = null;
        myRoom = (Room) GeneralMethodFacility.getFacility(myRoom);
        Validate.FacilityValidate.validateInput("Enter room services code", "room");
        System.out.println("enter the included free service");
        myRoom.setDichVuMienPhiDiKem(scanner.nextLine());
        String room_serives_code = (Validate.FacilityValidate.validateInput("Enter room services code", "room"));
        myRoom.setSerivesCode(room_serives_code);
        facilityMap.put(myRoom, 0);
        writeToCsv();
        System.out.println("SUCESS");
    }

    @Override
    public void getNewVilla() {
        Villa myVilla = new Villa();
        GeneralMethodFacility.getFacility(myVilla);
        Validate.FacilityValidate.validateInput("Enter villa services code", "villa");

        String standar = Validate.FacilityValidate.validateInput("Enter the Villa standar (follow format: 'Tiêu Chuẩn')", "name");
        myVilla.setTieuChuanVilla(standar);

        double area = Validate.FacilityValidate.validateArea("enter the pool area");
        myVilla.setDienTichHoBoi(area);

        int floors = (int) Validate.FacilityValidate.validateNumber("enter the number of floor", 1);
        myVilla.setSoTang(floors);

        String villa_serives_code = (Validate.FacilityValidate.validateInput("Enter villa services code", "villa"));
        myVilla.setSerivesCode(villa_serives_code);
        facilityMap.put(myVilla, 0);
        writeToCsv();
        System.out.println("SUCESS");

    }


}

