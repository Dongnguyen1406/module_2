package bai_tap.setting_insertion_sort;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("Bắt đầu quá trình sắp xếp chèn: ");
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;

            System.out.print("Bước " + i + ": ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + " ");
            }
            System.out.println();
        }
    }

//    public static void printArray(int[] arr) {
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + " ");
//        }
//        System.out.println();
//    }

}
