import java.util.Scanner;

public class Main {
    public static boolean isUnlucky(int arr[]) {
        if (((arr[0] == 1) && (arr[1] == 3)) || ((arr[arr.length - 2] == 1) && (arr[arr.length - 1] == 3))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5};
        int arr2[] = {2, 1, 3, 4, 5};
        int arr3[] = {1, 1, 1};
        System.out.println(isUnlucky(arr));
        System.out.println(isUnlucky(arr2));
        System.out.println(isUnlucky(arr3));
    }
}