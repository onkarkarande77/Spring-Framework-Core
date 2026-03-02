package com.annotation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayMain {

    public static void main(String[] args) {

        ApplicationContext ctx =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner sc = new Scanner(System.in);
        System.out.println("select the card type");
        System.out.println("1.MasterCard\n2.VisaCard");
        int ch = sc.nextInt();

        System.out.println("Enter card number:");
        String cardNo = sc.next();

        System.out.println("Enter amount:");
        int amt = sc.nextInt();

        PaymentChoice pc = ctx.getBean(PaymentChoice.class);
        pc.payChoice(ch, cardNo, amt);
    }
}
