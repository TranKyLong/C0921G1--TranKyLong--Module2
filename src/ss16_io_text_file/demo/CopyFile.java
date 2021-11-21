package ss16_io_text_file.demo;

import java.io.*;

public class CopyFile {
    public static final String PATH_SOURCE_FILE = "D:\\WORKSPACE\\DEMO_CODEGYM\\module02\\Demo-C0921G1\\src\\b16_io_text_file\\demo.csv";
    public static final String PATH_TARGET_FILE = "D:\\WORKSPACE\\DEMO_CODEGYM\\module02\\Demo-C0921G1\\src\\b16_io_text_file\\target.csv";

    //Bước 1: đọc được nội dung của source file
    public static String readFile(FileReader fileReader) {
        int i = 0;
        String result = "";

        try {
            while ((i = fileReader.read()) != -1){
                System.out.println(i);
                result += (char) i;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    //bước 2: ghi nội dung đã đọc vào target file
    public static void writeFile(FileWriter fileWriter, String result){
        try{
            fileWriter.write(result);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    public static void main(String[] args) {

        String result = "";
        File fileSource = new File(PATH_SOURCE_FILE);
       File fileTarget = new File(PATH_TARGET_FILE);



 try {
            FileReader fileReader = new FileReader(fileSource);
            FileWriter fileWriter = new FileWriter(fileTarget);
            result = readFile(fileReader);
            writeFile(fileWriter, result);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
