package com.example.demo;

import java.util.Scanner;

public class dowhileloop {
    public static void main(String [] args){

        boolean condition = false;
        Scanner scan = new Scanner(System.in);
        String color;
        do {
            System.out.println("Enter your favorite color");
            color = scan.nextLine();
            if (color.equalsIgnoreCase("blue")) {

                condition = false;
            } else {
                condition = true;
            }

        }while (condition);
            System.out.println("Yup, blue is my favourite color too");

            }
        }
