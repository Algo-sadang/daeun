/**
 *  [ 효율성 ]
 *  - 메모리: 18364KB
 *  - 시간 : 264ms
 */

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Stack<String> stack = new Stack<>();
        label: for (int i=0; i<t; i++) {
            String[] str = sc.nextLine().split("");
            for (int y=0; y<str.length; y++) {
                if(str[y].equals("(")) {
                    stack.push(str[y]);
                } else {
                    if (stack.isEmpty()) {
                        System.out.println("NO");
                        stack.clear();
                        continue label;
                    }
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
