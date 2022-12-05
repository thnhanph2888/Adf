package excercise.doc_file_csv;

import java.io.*;
import java.util.Scanner;

public class ReadFileCsv {

    public static void main(String[] args) {
        Country country1 = new Country("1", "VietNam", "002");
        Country country2 = new Country("2", "TrungQuoc", "003");
        Country country3 = new Country("3", "My", "002");
        System.out.println("Nhap vao ten file: ");
        Scanner sc = new Scanner(System.in);
        String pathName = sc.nextLine();

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(pathName);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(country1.getData());
            bufferedWriter.write(country2.getData());
            bufferedWriter.write(country3.getData());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            File file = new File(pathName);
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
