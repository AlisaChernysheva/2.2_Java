# Домашнее задание 2.2 Java
* [ДЗ](https://github.com/netology-code/javaqa-homeworks/tree/master/data)

#### Код для условия пополнения баланса на 1100р:

```java public class Main {
    public static void main(String[] args) {
        int limit = 1000;
        int balanceRefill;
        int bonus;
        int currentBalance = 100;

        balanceRefill = 1100;
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
```


* [Скрин условия пополнения на 1100](https://prnt.sc/1y22kjy)
* [Скрин условия пополнения на 200](https://prnt.sc/1y22tg9)
