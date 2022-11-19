package excercise.count_occurrences_of_element;

import java.util.*;

public class CountOccurrencesOfElement {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mọt chuoi: ");
        String string = sc.nextLine();
        String[] strings = string.toLowerCase().split(" ");
        int size = strings.length;
        int value = 0;
        for (int i = 0; i < size; i++) {
            value = 1;
            for (int j = i + 1; j < size; j++) {
                if (strings[i].equals(strings[j])) {
                    value++;
                }
            }
            if (!map.containsKey(strings[i]) && !Objects.equals(strings[i], " ")) {
                map.put(strings[i], value);
            }
        }
        System.out.println(map);
    }
}
