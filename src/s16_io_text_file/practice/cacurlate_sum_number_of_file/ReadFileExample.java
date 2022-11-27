package practice.cacurlate_sum_number_of_file;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText(String filePath) throws FileNotFoundException {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e){
            System.out.println("File không tồn tại hặc nội dung có lỗi!");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
