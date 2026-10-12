package src;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Loops in java are also same as loops in C/C++
        //For loop
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        //multivariable for loop
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(i + " " + j);
        }
        // i and j can't be accessed outside the loop until we declare them firstly outside the loop
        //while loop: repeats the same block of code until condition is true
        int k=5;
        while(k>=1){
            System.out.println(k);
            k--;
        }
        //do-while loop
        int l=10;
        do {
            System.out.println(l);
            l--;
        }while (l>=5);
        //tricky
        int x = 10;        //do-while loop
        int l=10;
        do {
            System.out.println(l);
            l--;
        }while (l>=5);
        //tricky
        int x = 10;
        do {
            System.out.println(x);
        } while (x < 5);   //will only print 10 because condition is not matching and it has to bee run atleast one time

        // break statement

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        //continue statement

        do {
            System.out.println(x);
        } while (x < 5);   //will only print 10 because condition is not matching and it has to bee run atleast one time

        // break statement

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        //continue statement
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        //nested loop
        for(int i=0; i<10; i++){
            for (int j=0; j<2; j++){
                System.out.println(i+" "+j);
            }
        }
        //For every iteration of i, j will run for two times
        //Labeled break and continue
        outer: for (int i = 1; i <= 3; i++) { // here using outer we labeled this loop as outer and by using break outer
                                             // we can break it at a specific point where we want not the complete nested loop
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outer;
                }
                System.out.println(i + " " + j);
            }
        }
        //Jumps out of outer loop.

        //for each loop:
        int[] arr = {1, 2, 3, 4};
        for (int y : arr) {
            System.out.println(y);
        }
        //with strings for each
        String s = "Java";
        for (char ch : s.toCharArray()) {
            System.out.println(ch);
        }

        String n = "HELLO";
        for (int i = 0; i < n.length(); i++) {
            System.out.println(n.charAt(i));
        }
    }
}
