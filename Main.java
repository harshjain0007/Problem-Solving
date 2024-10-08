package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Factorial Question

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number Which You want to do Factorial ==>");
        int number=scanner.nextInt();
        int result = 1 ;// Storing result

        for(int i=1;i<=number;i++){
            result *=i;
        }
        System.out.println("Factorial == > "+result);
    }
}