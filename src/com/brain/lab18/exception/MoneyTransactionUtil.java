package com.brain.lab18.exception;

import java.util.Objects;
import java.util.Scanner;

public class MoneyTransactionUtil {
    private String card;
    private String card2;
    private long sum;

    static void sendTo() throws AccountException,MoneyValueExeption {
        MoneyTransactionUtil moneyTrans = new MoneyTransactionUtil();
//        moneyTrans.card = "651616565165";
//        moneyTrans.card2 = "43524623462346";
//        moneyTrans.sum = 500;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой номер карты");
        moneyTrans.card = scanner.nextLine();
        System.out.println("Введите номер карты получателя");
        moneyTrans.card2 = scanner.nextLine();
        System.out.println("Введите сумму денег");
        moneyTrans.sum = Integer.parseInt(scanner.next());
        if (Objects.equals(moneyTrans.card, moneyTrans.card2)) {
            throw new AccountException ();

        }
        if ((moneyTrans.sum <= 0) | (moneyTrans.sum > 100000)) {
            throw new MoneyValueExeption();
        }
        else
            System.out.println("С карты: " + moneyTrans.card + " на карту: " + moneyTrans.card2 + " переведено сумму: " + moneyTrans.sum + '$');
    }
}
