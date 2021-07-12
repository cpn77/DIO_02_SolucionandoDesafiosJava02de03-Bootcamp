package com.cpn77;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        int count=0;

        double s = 0.0;

        n = input.nextInt();

        while(true) {
            if(n > 0 ) {
                s += n;
                count++;
            } else
                break;
            n = input.nextInt();

        }

        System.out.println(String.format("%.2f", s / count));

    }

}
