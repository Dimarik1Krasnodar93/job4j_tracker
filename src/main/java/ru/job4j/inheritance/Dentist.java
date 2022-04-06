package ru.job4j.inheritance;

import java.util.Date;

public class Dentist extends Doctor{
    private int yearDentist;
    public Dentist (String name, String surname, String education, Date birthday, int YearLastMedicalEducation, int yearDentist) {
        super(name, surname, education, birthday, YearLastMedicalEducation);
        this.yearDentist = yearDentist;
    }

    public void getDentistYear() {
        System.out.println("Year: " + yearDentist);
    }
}
