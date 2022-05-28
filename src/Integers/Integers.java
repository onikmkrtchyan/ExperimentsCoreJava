package Integers;

import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {

        Integer a = 1;
        int c = 1;

        int Integer = 24; // output 24
//        Integer int = 24 ; // getting error
//        Integer Integer = 24; // output 24
        System.out.println(Integer);

        Scanner scanner = new Scanner(System.in);
        Integer b = scanner.nextInt();

        System.out.println(a == b);
        System.out.println(a==c);
    }
}
