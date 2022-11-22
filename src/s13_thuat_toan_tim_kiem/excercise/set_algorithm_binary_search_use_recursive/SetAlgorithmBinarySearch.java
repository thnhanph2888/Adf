package excercise.set_algorithm_binary_search_use_recursive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SetAlgorithmBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử: ");
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            arrayList.add(Integer.parseInt(sc.nextLine()));
        }
        Collections.sort(arrayList);
        int[] arrayNew = new int[size];
        for (int i = 0; i < size; i++) {
            arrayNew[i] = arrayList.get(i);
        }
        System.out.println("Nhập phần tử muốn tìm kiếm: ");
        int value;
        value = Integer.parseInt(sc.nextLine());
        System.out.println(binarySearch(arrayNew,0,size - 1, value));

    }
     static int mid;
    public static String binarySearch(int[] array, int left, int right, int value) {
        if (right > left) {
            mid = (right - left) / 2;

            if (array[mid] == value) {
                return "Vị trí phần tử cần tìm là: " + mid;
            }
            if (array[mid] < value) {
                return binarySearch(array, left, mid - 1, value);
            } else {
                return binarySearch(array, mid + 1, right, value);
            }
        }
        return "Phần tử bạn tìm không tồn tại";
    }
}
