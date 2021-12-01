package case_study.Services;

import case_study.models.khach_hang_va_nhan_vien.PersonFurama;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneralMethod extends PersonFurama {
    static Scanner scanner = new Scanner(System.in);

    public String validates() {
        return null;
    }

    public static List<String> readFileCsv(String filePath) {
        List<String> listLine = new ArrayList<>();
        FileReader fileReader = null;
        try {
             fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listLine;
    }

    public static void writFile(Object object, String path) {
        File file = new File(path);
        FileWriter outputfile = null;
        BufferedWriter bufferedWriter = null;
        try {
            outputfile = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(outputfile);
            bufferedWriter.write(object.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
            outputfile.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (outputfile != null) {
                    outputfile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
