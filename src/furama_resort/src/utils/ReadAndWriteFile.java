package src.utils;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFile {

    public static void writeToFile(String path, String dataWrite) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(dataWrite);
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String path, ArrayList<String> listDataWrite) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : listDataWrite) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> readToFile(String path) {
        ArrayList<String> listData = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                listData.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listData;
    }
}
