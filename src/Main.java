
public class Main {
    public static void main(String[] args) {
        int limit = 1000;
        int balanceRefill;
        int bonus;
        int currentBalance = 100;

        balanceRefill = 200;
        if (balanceRefill >= limit) {
            bonus = balanceRefill / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = bonus + balanceRefill + currentBalance;
        System.out.println(bonus);
        System.out.println(totalBalance);
    }
}

