import java.util.Scanner;

public class InsertionSort {

    static String[] insertionSort(String[] array) {
        String temp = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareToIgnoreCase(array[1 + 1]) > 0) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        String[] str = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("INSERTION SORTING...");
        System.out.println("Enter words to be inserted and sorted");
        for (int i = 0; i < args.length; i++) {
            str[i] = sc.nextLine();
        }
        String[] sort = insertionSort(str);
        for (int i = 0; i < sort.length; i++) {
            System.out.println("sort[i]");
        }
    }
}