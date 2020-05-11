package com.brain.lab18.exception;

public class UserBank {
    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo();
        } catch (NumberFormatException n) {
            System.out.println("Введено слишком большое число " + n);
        } catch (AccountException e) {
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают. ");
        } catch (MoneyValueExeption s) {
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000");
        }
    }
}
