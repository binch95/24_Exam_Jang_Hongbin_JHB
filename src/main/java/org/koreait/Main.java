package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a;
        String s = "";
        for (int i = 1; i <= a; i++) {
            String answer = "" + s;
            for (int j = b; j >= 1; --j) {
                answer += j + " ";
            }
            b = b - 1;
            s = s + " ";
            System.out.println(answer);
        }

    }
}