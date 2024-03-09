public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println(" Задача 1");
        int[] payment = new int[5];
        payment[0] = 15_000;
        payment[1] = 13_000;
        payment[2] = 14_600;
        payment[3] = 17_300;
        payment[4] = 11_250;
        int sum = 0;
        for (int i = 0; i < payment.length; i++) {
            sum += payment[i];
        }
        System.out.println("Сумма трат за месяц составила - " + sum + " рублей.");


        // Задача 2
        System.out.println(" Задача 2");
        int maxPayment = payment[1];
        int minPayment = payment[0];
        for (int i = 0; i < payment.length; i++) {
            if (payment[i] > maxPayment) {
                maxPayment = payment[i];
            }
        }
        for (int i = 0; i < payment.length; i++) {
            if (payment[i] < minPayment) {
                minPayment = payment[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила - " + minPayment + " рублей. Максимальная сумма трат за неделю составила - " + maxPayment + " рублей");


        // Задача 3
        System.out.println(" Задача 3");
        double midSum = (double) sum / payment.length;
        System.out.println("Средняя сумма трат за месяц составила - " + midSum + "рублей");


        // Задача 4
        System.out.println(" Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i -1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}