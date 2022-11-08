package practice;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] nameSinhvien = {"sinhvien1", "sinhvien2","sinhvien3"};
        int size = nameSinhvien.length;
        System.out.println("Nhập tên sinh viên cần tìm kiếm: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < size; i++) {
            if (name.equals(nameSinhvien[i])){
                System.out.println("Vị trí của " + name + " trong danh sách là: " + i);
                isExist = true;
            }
        }
        if (!isExist){
            System.out.println("Không tìm thấy " + name + " trong danh sách!");
        }
    }
}
