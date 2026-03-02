package com.annotation;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
  public class AppCard {

      private Card card;

      // setter injection (runtime change possible)
      public void setCard(Card card) {
          this.card = card;
      }

      public void pay(String cardNo, int amt) {
          if (card.verify(cardNo)) {
              System.out.println("Payment of" + amt + " successful");
          } else {
              System.out.println("Payment failed");
          }
      }
  }
