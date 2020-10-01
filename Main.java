package itschool;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = 0;
        for ((a / 2) != c){
            c = c + 1;
            if ((c%2==0)&&(c%3==0)&&(c%5==0)) {
               System.out.println(a);
            }
        }
    }
}
