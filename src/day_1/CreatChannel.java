package day_1;

import java.util.Scanner;

public class CreatChannel {
    public static void main(String[] args) {
        System.out.println("User is able to create channel");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = scan.nextLine();

        for(int i = 1; i<=10; i++) System.out.println("name = " + name);
        //Lines up here are written from IntelliJ
    }
}
