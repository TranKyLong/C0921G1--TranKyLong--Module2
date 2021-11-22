package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class TextCopier {

    private static String readFile(FileReader fileReader) {
        int i = -1;
        String result = "";
        try {
            System.out.println((
                            "|===============|\n" +
                            "|     OK        |\n" +
                            "|  it worked    | \n" +
                            "|===============| \n" +
                            "(\\__/) || \n" +
                            "(•ㅅ•) || \n" +
                            "/ 　 づ "));
            while ((i = fileReader.read()) != -1) {
                result += (char) i;

            }
            return result;
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

    private static void writeFile(FileWriter fileInput, String line) {
        try {
            fileInput.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static final String SOURCE = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\source";
    static final String TARGET = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\TargetText";

    public static void main(String[] args) {

        File source = new File(SOURCE);
        File target = new File(TARGET);
        String output = "";
        try {
            FileReader prototype = new FileReader(source);
            FileWriter clone = new FileWriter(target);
            output = readFile(prototype);
            writeFile(clone, output);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

