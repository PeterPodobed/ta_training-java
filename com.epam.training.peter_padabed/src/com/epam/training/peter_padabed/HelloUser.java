package com.epam.training.peter_padabed;

import java.util.Scanner;

public class HelloUser {
    public static void main (String[] args) {
        System.out.println("Введите Ваше имя");
        Scanner name = new Scanner(System.in);
        String string = name.next();
        System.out.println("Привет " + string);
        name.close();
    }

}
