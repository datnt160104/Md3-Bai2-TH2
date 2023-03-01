package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money=1.0;
        int month = 1;
        double interestRate =1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("invertment aroum: ");
        money =input.nextDouble();
        System.out.println("Enter number of month: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percantage");
        interestRate=input.nextDouble();
        double totaLinterest =0;
        for (int i=0;i<month;i++){
            totaLinterest+= money* (interestRate/100)/12*month;
        }
        System.out.println("totalof interest"+totaLinterest);
    }
}
