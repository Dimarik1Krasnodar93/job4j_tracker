package ru.job4j.inheritance;

import java.util.Date;

public class Engineer extends Profession {

    int yearEngineerEducation;
    public Engineer (String name, String surname, String education, Date birthday, int yearEngineerEducation) {
        super(name, surname, education, birthday);
        this.yearEngineerEducation = yearEngineerEducation;
    }

    public void getYearEngineerEducation() {
        System.out.println("Engineed education year:" + yearEngineerEducation);
    }
}
