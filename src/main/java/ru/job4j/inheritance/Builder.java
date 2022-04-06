package ru.job4j.inheritance;

import java.util.Date;

public class Builder extends Engineer {

    public Builder(String name, String surname, String education, Date birthday, int yearEngineerEducation) {
        super(name, surname, education, birthday, yearEngineerEducation);
    }
}
