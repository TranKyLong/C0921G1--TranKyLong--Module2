package zz_not_an_exercise_method_and_console_store;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConsoleKeeper {
    public static void displayMyConsole() {
        System.out.println("In theo format ngay ngắn");
        System.out.println(" System.out.print(String.format(\"%14s %14s %5s %12s %12s %14s\", item, item, item, item, item, item));");

        String regex = "    ok = (Pattern.compile(\"^\\\\d{2}[-]\\\\d{10}$\").matcher(sdt).matches());";



    }
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println( "File không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        displayMyConsole();
    }
}
