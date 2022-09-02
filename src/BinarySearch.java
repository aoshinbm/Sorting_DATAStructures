import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
        static int binarySearch(String[] arrString, String find)
        {
            //while (hi - lo > 1) {
            //        int mid = (hi + lo) / 2;
            //        if (v[mid] < To_Find) {
            //            lo = mid + 1;
            int low= 0, high = arrString.length - 1;
            while (low <= high) {
                int lo=(high-low)/2;
                int mid = low + lo;

                int res = find.compareTo(arrString[mid]);

                // Check if x is present at mid
                if (res == 0)
                    return mid;
                // If x greater, ignore left half
                if (res > 0)
                    low = mid + 1;
                    // If x is smaller, ignore right half
                else
                    high = mid - 1;
            }

            return -1;
        }

        public static void main(String []args)
        {
            String[] arrayString = new String[10];
            int n,i;
            String find;
            Scanner sc=new Scanner(System.in);
            System.out.println("how many words you want to enter:");
            n= sc.nextInt();
            System.out.println("Enter words :");
            for (i=1; i<=n; i++) {
                arrayString[i]= sc.nextLine();
            }
            System.out.println("Which word you want to find");
            find=sc.nextLine();
            System.out.println("Word = "+find);

            int result = binarySearch(arrayString,find);
            int index = Arrays.binarySearch(arrayString, find);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at " + "index " + result);
        }
    }
