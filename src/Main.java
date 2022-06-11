public class Main {

    public static void main(String[] args) {

        int balance = 100; // баланс телефона
        int refill = 1310; // сумма пополнения счёта
        int bonus = (refill > 1000) ? refill/100 : 0; // бонусные рубли
        int total = balance + refill + bonus;
        System.out.println("Итоговый счёт: " + total);
        System.out.println("Количество бонусных рублей: " + bonus);

    }
}
