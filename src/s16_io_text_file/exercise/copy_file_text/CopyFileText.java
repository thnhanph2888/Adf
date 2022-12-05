package excercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {

    public static void main(String args[]) throws IOException {
        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        do {
            try {
                System.out.println("Nhap duong dan file source: ");
                String filePathSource = sc.nextLine();
                File file = new File(filePathSource);
                System.out.println(file);
                fileReader = new FileReader(file);
                break;
            }  catch (FileNotFoundException e) {
                System.out.println("File khong ton tai");
            }
        } while (true);

        try {
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        }
        finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(list);


        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        System.out.println("Nhap vao duong dan file target: ");
        String fileNameTarget = sc.nextLine();
        try {
            File file1 = new File(fileNameTarget);
            fileWriter = new FileWriter(file1);
            bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("tap tin dich da ton tai");
            for (String str : list) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
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
        }
    }

}
