package ru.mirea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Packer portnova = new Packer("01.04.1990", 0, "Portnova", "8", "1",
                20000, "555-65-56");

        Confectioner krotova = new Confectioner("17.04.1970", 0, "Krotova", "8", "5",
                35000, "693-15-17", "5");

        Glazirovschik tomina = new Glazirovschik("22.05.1979", 0, "Tomina", "8", "3",
                35000, "845-71-00");

        ArrayList master1_responsible_for = new ArrayList();
        master1_responsible_for.add(portnova);
        master1_responsible_for.add(krotova);
        master1_responsible_for.add(tomina);

        Master fedina = new Master("11.05.1965", 0, "Fedina", "8", "3",
                40000, "723-22-33", master1_responsible_for);

        Packer sidorova = new Packer("23.03.1988", 1, "Sidorova", "0", "1",
                20000, "432-98-10");

        Confectioner fokina = new Confectioner("23.05.1975", 2, "Fokina", "0", "1",
                30000, "683-90-11", "4");

        Glazirovschik babkina = new Glazirovschik("15.12.1980", 0, "Babkina", "0", "2",
                35000, "111-22-33");

        ArrayList master2_responsible_for = new ArrayList();
        master2_responsible_for.add(sidorova);
        master2_responsible_for.add(fokina);
        master2_responsible_for.add(babkina);

        Master rudina = new Master("11.06.1969", 0, "Rudina", "0", "2",
                40000, "966-65-71", master2_responsible_for);

        ArrayList technologist_responsible_for = new ArrayList();
        technologist_responsible_for.add(fedina);
        technologist_responsible_for.add(rudina);

        Technologist petrova = new Technologist("22.02.1975", 0, "Petrova", "0", "5",
                50000, "234-22-11", technologist_responsible_for);

        Fitter luckin = new Fitter("06.11.1971", 0, "Lukin", "0", "1",
                30000, "359-00-66", "4");

        Fitter putin = new Fitter("20.10.1967", 0, "Putin", "8", "1",
                40000, "359-00-66", "6");

        Electric zimin = new Electric("16.12.1964", 1, "Zimin", "0", "3",
                30000, "442-95-99", "4");

        ArrayList mechanic_responsible_for = new ArrayList();
        mechanic_responsible_for.add(luckin);
        mechanic_responsible_for.add(putin);
        mechanic_responsible_for.add(zimin);

        Mechanic smirnov = new Mechanic("15.02.1972", 0, "Smirnov", "8", "4",
                50000, "321-21-12", mechanic_responsible_for);

        ArrayList foreman_responsible_for = new ArrayList();
        foreman_responsible_for.add(petrova);
        foreman_responsible_for.add(smirnov);

        Foreman ivanov = new Foreman("01.01.1980", 0, "Ivanov", "0", "10",
                70000, "123-12-23", foreman_responsible_for);

        System.out.println("Иерархия классов:");
        System.out.println("Technical_Service" +
                "\n  |___Mechanic" +
                "\n  |___Fitter" +
                "\n  |___Electric" +
                "\n  |___Foreman");
        System.out.println("Technological_Service" +
                "\n  |___Technologist" +
                "\n  |___Packer" +
                "\n  |___Confectioner" +
                "\n  |___Foreman" +
                "\n  |___Master" +
                "\n  |___Glazirovschik");
        System.out.println("Guide" +
                "\n  |___Mechanic" +
                "\n  |___Technologist" +
                "\n  |___Foreman");

        System.out.println("\nИерархия работников:");
        System.out.println(ivanov.name +
                "\n  |___" + petrova.name +
                "\n  |     |___" + fedina.name +
                "\n  |     |     |___" + portnova.name +
                "\n  |     |     |___" + krotova.name +
                "\n  |     |     |___" + tomina.name +
                "\n  |     |___" + rudina.name +
                "\n  |           |___" + sidorova.name +
                "\n  |           |___" + fokina.name +
                "\n  |           |___" + babkina.name +
                "\n  |___" + smirnov.name +
                "\n        |___" + luckin.name +
                "\n        |___" + putin.name +
                "\n        |___" + zimin.name);

        Request request = new Request();

        System.out.println("\nУ кого зарплата выше 31тыс.:");
        request.requestSalary(ivanov);
        request.requestSalary(petrova);
        request.requestSalary(fedina);
        request.requestSalary(portnova);
        request.requestSalary(krotova);
        request.requestSalary(tomina);
        request.requestSalary(rudina);
        request.requestSalary(sidorova);
        request.requestSalary(fokina);
        request.requestSalary(babkina);

        System.out.println("\nКто опаздывает на работу в технологической службе:");
        request.requestCheck(ivanov);
        request.requestCheck(petrova);
        request.requestCheck(fedina);
        request.requestCheck(portnova);
        request.requestCheck(krotova);
        request.requestCheck(tomina);
        request.requestCheck(rudina);
        request.requestCheck(sidorova);
        request.requestCheck(fokina);
        request.requestCheck(babkina);

        System.out.println("\nКто опаздывает на работу в технической службе:");
        request.requestCheckT(smirnov);
        request.requestCheckT(luckin);
        request.requestCheckT(putin);
        request.requestCheckT(zimin);

        System.out.println("\nКто перерабатывает в технологической службе:");
        request.requestOverdraft(ivanov);
        request.requestOverdraft(petrova);
        request.requestOverdraft(fedina);
        request.requestOverdraft(portnova);
        request.requestOverdraft(krotova);
        request.requestOverdraft(tomina);
        request.requestOverdraft(rudina);
        request.requestOverdraft(sidorova);
        request.requestOverdraft(fokina);
        request.requestOverdraft(babkina);

        System.out.println("\nКто перерабатывает в технической службе:");
        request.requestOverdraftT(smirnov);
        request.requestOverdraftT(luckin);
        request.requestOverdraftT(putin);
        request.requestOverdraftT(zimin);

        System.out.println("\nУ кого день рождения в мае:");
        request.requestBirth(ivanov);
        request.requestBirth(petrova);
        request.requestBirth(fedina);
        request.requestBirth(portnova);
        request.requestBirth(krotova);
        request.requestBirth(tomina);
        request.requestBirth(rudina);
        request.requestBirth(sidorova);
        request.requestBirth(fokina);
        request.requestBirth(babkina);

        request.requestBirthT(smirnov);
        request.requestBirthT(luckin);
        request.requestBirthT(putin);
        request.requestBirthT(zimin);

        System.out.println("\nСписок всех женщин:");
        request.requestGender(ivanov);
        request.requestGender(petrova);
        request.requestGender(fedina);
        request.requestGender(portnova);
        request.requestGender(krotova);
        request.requestGender(tomina);
        request.requestGender(rudina);
        request.requestGender(sidorova);
        request.requestGender(fokina);
        request.requestGender(babkina);

        request.requestGenderT(smirnov);
        request.requestGenderT(luckin);
        request.requestGenderT(putin);
        request.requestGenderT(zimin);
    }
}
