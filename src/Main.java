
public class Main {
    public static void main(String[] args) {

        System.out.println("***Task 1***");
        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        int month = 0;
        while (sum < desiredSum) {
            sum = sum + amount;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("***Task 2***");
        int numbr = 0;
        while (numbr < 10) {
            numbr++;
            System.out.print(numbr + " ");
        }
        System.out.println();
        for (; numbr >= 1; numbr--) {
            System.out.print(numbr + " ");
        }
        System.out.println();
        System.out.println("***Task 3***");
        int population = 12_000_000;
        int fertilPerThsnd = 17;
        int mortalPerThsnd = 8;
        int currYear = 2024;
        for (int year = currYear; year < currYear + 10; year++) {
            population += population * fertilPerThsnd / 1000 - population * mortalPerThsnd / 1000;
            System.out.println("Год " + year + ",численность населения составляет " + population);
        }
        System.out.println("***Task 4***");
        double percent = 7D / 100;
        desiredSum = 12_000_000;
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("***Task 5***");
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println("***Task 6***");
        sum = amount;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println("***Task 7***");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");

        }
        System.out.println("***Task 8***");
        int period = 79;
        int startSeeing = 0;
        int start = currYear - 200;
        int end = currYear + 100;
        for (int year = startSeeing; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }


    }
}