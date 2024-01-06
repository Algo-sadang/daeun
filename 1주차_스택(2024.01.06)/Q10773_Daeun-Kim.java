/**
 *  [ 효율성 ]
 *  - 메모리: 111356KB
 *  - 시간 : 860ms
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<k; i++){
            int temp = sc.nextInt();
            if (temp==0) {
                list.remove(list.size()-1);
            } else {
                list.add(temp);
            }
        }
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }
}
