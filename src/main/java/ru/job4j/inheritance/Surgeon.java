package ru.job4j.inheritance;

import java.util.Date;

public class Surgeon extends Doctor{
    private int yearSurgeon;
    public Surgeon (String name, String surname, String education, Date birthday, int YearLastMedicalEducation, int yearSurgeon) {
        super(name, surname, education, birthday, YearLastMedicalEducation);
        this.yearSurgeon = yearSurgeon;
    }

    public void getYearSurgion() {
        System.out.println("Year: " + yearSurgeon);
    }
}
