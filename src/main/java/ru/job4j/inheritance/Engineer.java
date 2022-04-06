package ru.job4j.inheritance;

import java.util.Date;

public class Engineer extends Profession {

    int YearEngineerEducation;
    public Engineer (String name, String surname, String education, Date birthday, int YearEngineerEducation) {
        super(name, surname, education, birthday);
        this.YearEngineerEducation = YearEngineerEducation;
    }
}
