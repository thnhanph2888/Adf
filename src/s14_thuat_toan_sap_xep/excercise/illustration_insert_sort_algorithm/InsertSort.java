package excercise.illustration_insert_sort_algorithm;


import java.util.Arrays;

public class InsertSort {
    static int[] list = {6,7,4,2,9,12,1};
    static String[] listIndex = {" "," "," "," "," "," "," "};
    static void insertSort(int[] list) {
        int pos, x;
        boolean isTrue = false;
        for (int i = 1; i < list.length; i++) {
            pos = i;
            x = list[i];
            System.out.println("Chọn " + x + " để so sánh với các phần tử đứng trước nó");
            System.out.println(Arrays.toString(list));
            while (pos > 0 && x < list[pos - 1]) {
                System.out.println("So sánh " + x + " bé hơn " + list[pos - 1]);
                System.out.println("Gắn " + list[pos] + " thành " + list[pos - 1]);
                list[pos] = list[pos - 1];
                System.out.println(Arrays.toString(list));
                listIndex[pos] = " ";
                listIndex[pos - 1] = x + "";
                System.out.println(Arrays.toString(listIndex));
                listIndex[pos - 1] = " ";
                pos--;
                isTrue = true;
            }
            if (!isTrue){
                System.out.println("So sánh " + x + " lớn hơn " + list[pos - 1] + " nên giữ nguyên");
                System.out.println(Arrays.toString(list));
                System.out.println("");
            } else {
                System.out.println("Gắn " + list[pos] + " thành " + x);
                list[pos] = x;
                System.out.println(Arrays.toString(list));
                System.out.println("");
            }
            isTrue = false;
        }
    }

    public static void main(String[] args) {
        insertSort(list);
        System.out.println("Kết quả cuối cùng là: ");
        System.out.println(Arrays.toString(list));
    }
}
