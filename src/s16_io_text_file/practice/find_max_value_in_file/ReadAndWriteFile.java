package practice.find_max_value_in_file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {

   static List<Integer> listNum = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao file path");
        String filePath = sc.nextLine();
        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Gia tri lon nhat trong file la: " + findMax());
    }

    public static int findMax(){
        int max = listNum.get(0);
        for (Integer integer : listNum) {
            if (max < integer) {
                max = integer;
            }
        }
        return max;
    }
    public static void readFile(String filePath) throws FileNotFoundException {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = br.readLine()) != null) {
                listNum.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File khong ton tai hoac noi dung co loi!");
        }
    }
}
