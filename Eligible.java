//Write a program that takes in age as a input and returns if that person is eligible for vote or not.

import java.util.*;

public class Eligible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 18) {
            System.out.println("The person is eligible for voting");
        } else {
            System.out.println("Not eligible");
        }

    }
}