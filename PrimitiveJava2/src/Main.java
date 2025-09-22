public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int balance = 100;
        int amound = 1050;
        int bonus = 0;
        int finalBalance;

        if (amound > 1000) {
            bonus = amound / 100;
        }
        finalBalance = balance + amound + bonus;

        System.out.println("Бонусные рубли:" + " " + bonus);
        System.out.println("Итоговый счет:" + " " + finalBalance);


    }
}