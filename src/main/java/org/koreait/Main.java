package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = 1; i <= b; i++) {
            String answer = "";
            for (int j = 1; j <= a; j++) {
                answer += "*";
            }
            System.out.println(answer);
        }

    }
}