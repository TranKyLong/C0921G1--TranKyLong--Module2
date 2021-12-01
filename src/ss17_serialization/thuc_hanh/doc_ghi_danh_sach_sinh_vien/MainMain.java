package ss17_serialization.thuc_hanh.doc_ghi_danh_sach_sinh_vien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class MainMain {
    public static final String STUDNET_FILE = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\ss17_serialization\\thuc_hanh\\doc_ghi_danh_sach_sinh_vien\\StudentList.dat";
    public static void writeToFile(String path, List<MyStudent> myStudents) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myStudents);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        List<MyStudent> myStudents = new ArrayList<>();
        myStudents.add(new MyStudent(1, "Vũ Kiều Anh", "Hà Nội"));
        myStudents.add(new MyStudent(2, "Nguyễn Minh Quân", "Hà Nội"));
        myStudents.add(new MyStudent(3, "Đặng Huy Hoà", "Đà Nẵng"));
        myStudents.add(new MyStudent(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        myStudents.add(new MyStudent(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        writeToFile(STUDNET_FILE, myStudents);

        List<MyStudent> studentDataFromFile = readDataFromFile("student.txt");
        for (MyStudent student : studentDataFromFile){
            System.out.println(student);
        }
    }

    public static List<MyStudent> readDataFromFile(String path){
        List<MyStudent> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<MyStudent>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
