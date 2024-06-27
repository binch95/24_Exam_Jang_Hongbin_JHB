package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s = 0;
        int answer = 0;
        int d = 1;
        System.out.printf("%d ",answer);
        for (int i = 1; i <= 9; i++) {
            answer = d + s;
            System.out.printf("%d ",answer);
            d = s;
            s = answer;
        }
    }
}