package case_study.Services.facility;

import case_study.Services.ReadWrite;
import case_study.controller.FuramaController;
import case_study.models.co_so_vat_chat.Facility;
import case_study.models.co_so_vat_chat.House;
import case_study.models.co_so_vat_chat.Room;
import case_study.models.co_so_vat_chat.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FacilityServiceImpl {
    static FuramaController controller = new FuramaController();
    Scanner scanner = new Scanner(System.in);
    public static List<Facility> maintain = new ArrayList<>();
    public static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();


    static {
        facilityMap.put(new House("house1", 112.5, 150.6, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-9234"), 1);
        facilityMap.put(new House("house2", 112.5, 150.6, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-1344"), 4);
        facilityMap.put(new House("house3", 112.5, 250.5, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-1394"), 1);
        facilityMap.put(new Room("name01", 150.5, 110.6, 5, "Theo Ngày", "Cartoon_Network", "SVRO-1274"), 4);
        facilityMap.put(new Room("room", 150.5, 110.6, 5, "Theo Ngày", "Cartoon_Network", "SVRO-1254"), 2);
        facilityMap.put(new Villa("name001", 150.5, 17.6, 5, "Theo Ngày", "Không Sao", 30, 2, "SVVL-1284"), 4);
        facilityMap.put(new Villa("myvilla", 150.5, 170.6, 5, "Theo Ngày", "Không Sao", 20.5, 2, "SVVL-1034"), 5);

        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getValue() == 5) {
                maintain.add(entry.getKey());
            }
        }
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
                ReadWrite.writFile(entry.getKey(), HOUSE_PATH);
            } else if (entry.getKey() instanceof Room) {
                ReadWrite.writFile(entry.getKey(), ROOM_PATH);
            } else {
                ReadWrite.writFile(entry.getKey(), VILLA_PATH);
            }
        }
    }


    public void getMaintenanceList() {
    }

    public static void displayFacility() {
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

    public Facility getNewHouse() {
        House myHouse = null;
        myHouse = (House) GeneralMethodFacility.getFacility(myHouse);
        FacilityValidate.validateInput("Enter house services code", "house");
        System.out.println("Enter the house standard");
        myHouse.setTieuChuanHouse(scanner.nextLine());

        String house_services_code = (FacilityValidate.validateInput("Enter house services code", "house"));
        myHouse.setSerivesCode(house_services_code);
        int floor = (int) (FacilityValidate.validateNumber("Enter number of floors", 1));
        myHouse.setSoTangHouse(floor);
        return myHouse;
    }

    public Facility getNewRoom() {
        Room myRoom = null;
        myRoom = (Room) GeneralMethodFacility.getFacility(myRoom);
        FacilityValidate.validateInput("Enter room services code", "room");
        System.out.println("enter the included free service");
        myRoom.setDichVuMienPhiDiKem(scanner.nextLine());
        String room_serives_code = (FacilityValidate.validateInput("Enter room services code", "room"));
        myRoom.setSerivesCode(room_serives_code);
        return myRoom;
    }

    public Facility getNewVilla() {
        Villa myVilla = null;
        myVilla = (Villa) GeneralMethodFacility.getFacility(myVilla);
        FacilityValidate.validateInput("Enter villa services code", "villa");
        String standar = FacilityValidate.validateInput("Enter the Villa standar", "name");
        myVilla.setTieuChuanVilla(standar);
        double area = FacilityValidate.validateArea("enter the pool area");
        myVilla.setDienTichHoBoi(area);

        int floors = (int) FacilityValidate.validateNumber("enter the number of floor", 1);
        myVilla.setSoTang(floors);

        String villa_serives_code = (FacilityValidate.validateInput("Enter villa services code", "villa"));
        myVilla.setSerivesCode(villa_serives_code);
        return myVilla;
    }


}

