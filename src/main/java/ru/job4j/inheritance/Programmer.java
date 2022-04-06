package ru.job4j.inheritance;
import java.util.Date;

public class Programmer extends Engineer {
    private boolean knowJava;

    public Programmer(String name, String surname, String education, Date birthday, int yearEngineerEducation, boolean knowJava)  {
        super(name, surname, education, birthday, yearEngineerEducation);
        this.knowJava = knowJava;
    }

    public void getLanguage() {
        System.out.println("Know Java: " + knowJava);
    }
}
