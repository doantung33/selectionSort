import java.util.Scanner;

public class SelectionSort {
//    public static  int[]arr = {2,325,646,84,4,5667,235};
    public static void main (String[]args) {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so luong phan tu");
            number = sc.nextInt();
        } while (number < 0);
        int[] arr = new int[number];
        System.out.println("Nhap phan tu : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang ban dau la : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int Min = arr[i];
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (Min > arr[j]) {
                    Min = arr[j];
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                arr[indexMin] = arr[i];
                arr[i] = Min;

            }
        }
        System.out.println("Mang sau khi sap xep la : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

