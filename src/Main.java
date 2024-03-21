public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int salary = 0;
        int month = 0;
        while (salary < 2459000) {
            salary += 15000;
            month += 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + salary + " рублей");
        }
        System.out.println("2 459 000 можно накопить на " + (month + 1) + " месяц");
        //Task 2
        System.out.println("Task 2");
        byte i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 10;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        //Task 3
        System.out.println("Task 3");
        long population = 12000000;
        byte birthRate = 17;
        byte mortality = 8;
        int birthRateYear = 0;
        int mortalityYear = 0;
        while (population > 0) {
            birthRateYear += birthRate;
            mortalityYear += mortality;
            population -= 1000;
        }
        byte year = 1;
        population = 12000000;
        while (year < 11) {
            population = population + birthRateYear - mortalityYear;
            System.out.println("Год " + year + " численность населения составляет "
                    + population);
            year++;
        }
        //Task 4
        System.out.println("Task 4");
        double contribution = 15000;
        int cntMonth = 0;
        long target = 12000000;
        while (contribution < target) {
            contribution *= 1.07;
            cntMonth += 1;
            System.out.println("Месяц " + cntMonth + ", накопления " + (int) contribution);
        }
        //Task 5
        System.out.println("Task 5");
        double contribution1 = 15000;
        int cntMonth1 = 0;
        long target1 = 12000000;
        while (contribution1 < target1) {
            contribution1 *= 1.07;
            cntMonth1 += 1;
            if (cntMonth1 % 6 == 0)
                System.out.println("Месяц " + cntMonth1 + ", накопления "
                        + (int) contribution1);
        }
        //Task 6
        System.out.println("Task 6");
        float interest = 1.07f;
        double contribution2 = 15000;
        byte years = 9;
        byte month1 = 12;
        byte start = 1;
        month1 *= years;
        do{
            contribution2 *= interest;
            if (start % 6 == 0)
                System.out.println("Кол-во месяцев " + start + ", всего накоплений " + (int) contribution2);
            start++;
        } while (start <= month1);
        //Task 7
        System.out.println("Task 7");
        int friday = (int) (1 + Math.random() * 7);
        int day = 32;
        while (friday < day){
            System.out.println("Сегодня пятница, " + friday + "-е число");
            friday += 7;
        }
        //Task 8
        System.out.println("Task 8");
        int yearKometa = 1896;
        byte period2 = 79;
        do{
            System.out.println(yearKometa);
            yearKometa += period2;
        } while (yearKometa < 2124);
    }
}