public class Main {
    public static void main(String[] args) {

        // Задача №1
        int apples = 987345;
        byte cats = 53;
        short climb = 5642;
        long people = 7951764013L;
        float cups = 7.25f;
        double pi = 3.141592653589;
        System.out.println("Значение переменной apples с типом int равно " + apples);
        System.out.println("Значение переменной cats с типом byte равно " + cats);
        System.out.println("Значение переменной climb с типом short равно " + climb);
        System.out.println("Значение переменной people с типом long равно " + people);
        System.out.println("Значение переменной cups с типом float равно" + cups);
        System.out.println("Значение переменной pi с типом double равно " + pi);
        // можно ли прописывать в этой задаче тесктом название и тип переменной, а не делать отдельным кусочком в кавычках? или для читаемости разделить?

        // Задача №2
        float litres = 27.12f;
        long flies = 987678965549L;
        double degrees = 2.786;
        int cookies = 569;
        short money = -159;
        int bugs = 27897;
        byte dogs = 67;

        // Задача №3
        byte pupilsLP = 23;
        byte pupilsAS = 27;
        byte pupilsEA = 30;
        short sheets = 480;
        int allClasses = (pupilsAS + pupilsEA + pupilsLP);
        int sheetsPerPupil = (sheets / allClasses);
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги.");

        // Задача №4
        byte prodPerTwo = 16;
        byte prodPerMinute = (byte) (prodPerTwo / 2);
        int prodPer20 = prodPerMinute * 20;
        int prodPerDay = prodPerMinute * 60 * 24;
        int prodPer3 = prodPerDay * 3;
        int prodPerMonth = prodPerDay * 30;
        System.out.println("За 20 минут машина произвела " + prodPer20 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + prodPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + prodPer3 + " штук бутылок.");
        System.out.println("За месяц машина произвела " + prodPerMonth + " штук бутылок.");

        // Задача №5
        byte allCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        byte cansPerClass = (byte) (whiteCansPerClass + brownCansPerClass);
        byte classes = (byte) (allCans / cansPerClass);
        byte whiteCans = (byte) (classes * whiteCansPerClass);
        byte brownCans = (byte) (classes * brownCansPerClass);
        // идея ругается на класс byte и пишет, что здесь уместнее int, правильно ли принудительно делать byte, если я знаю, что числа маленькие?
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски.");

        // Задача №6
        short bananas = 5 * 80;
        short milk = 210;
        short icecream = 2 * 100;
        short eggs = 4 * 70;
        int breakfastInGrams = bananas + milk + icecream + eggs;
        float breakfastInKilograms = breakfastInGrams / 1000f;
        System.out.println("Вес спортивного завтрака в граммах составит " + breakfastInGrams);
        System.out.println("Вес спортивного завтрака в килограмах составит " + breakfastInKilograms);

        // Задача №7
        int loseWeight = 7000;
        byte daysIf250 = (byte) (loseWeight / 250);
        byte daysIf500 = (byte) (loseWeight / 500);
        byte averageDays = (byte) ((daysIf250 + daysIf500) / 2);
        System.out.println("При потере в день 250 грамм веса для похудения понадобится " + daysIf250 + " дней.");
        System.out.println("При потере в день 500 грамм веса для похудения понадобится " + daysIf500 + " дней.");
        System.out.println("В среднем для похудения понадобится " + averageDays + " день.");

        // Задача №8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristin = 76230;
        float salaryInc = 1.1f;
        int newMashasSalary = (int) (salaryMasha * salaryInc);
        int newDenisSalary = (int) (salaryDenis * salaryInc);
        int newKristinsSalary = (int) (salaryKristin * salaryInc);
        int salaryDiffMasha = (newMashasSalary * 12) % (salaryMasha * 12);
        int salaryDiffDenis = (newDenisSalary * 12) % (salaryDenis * 12);
        int salaryDiffKristin = (newKristinsSalary * 12) % (salaryKristin * 12);
        System.out.println("Маша теперь получает " + newMashasSalary + " рублей. Годовой доход вырос на " + salaryDiffMasha + " рублей.");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. годовой доход вырос на " + salaryDiffDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newKristinsSalary + " рублей. Годовой доход вырос на " + salaryDiffKristin + " рублей.");
    }
}