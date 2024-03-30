import java.util.Arrays;
import java.util.Scanner;

public class sol1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int start =0;
        int end = 0;
        int count = 0;

        Arrays.setAll(arr, i -> scanner.nextInt());
        Arrays.sort(arr);

//        for (int i=0; i<n; i++) {
//            while (count <= 4) {
//                end++;
//            }
//            if (arr[end] - arr[i] > 4) {
//                continue;
//            }
//        }

//        while (start < end) {
////            System.out.println(arr[start] + "start" + start + " " + arr[end] + "end" + end);
//
//
//            if (arr[end] - arr[start] > 4) {
//                end--;
//                count--;
//            }
//            else if (arr[end] - arr[start] == 4){
//                System.out.println(start + " " + end);
//            }
//            else {
//                start++;
//                count++;
//            }
//
//        }
        System.out.println(start + " " + count);
        scanner.close();
    }
}
