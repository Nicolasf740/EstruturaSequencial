package br.com.pluralsight.organizeeed;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite um numero");
Scanner scanner = new Scanner(System.in);
int number;
        number = scanner.nextInt();

        System.out.println("Numero informado foi");
        System.out.println(number);
    }
}
