package ru.job4j.inheritance;

import java.util.Date;

public class Programmer extends Engineer{
    private boolean knowJava;
    public Programmer (String name, String surname, String education, Date birthday, int YearEngineerEducation, boolean KnowJava)  {
        super(name, surname, education, birthday, YearEngineerEducation);
        this.knowJava = knowJava;
    }
}
