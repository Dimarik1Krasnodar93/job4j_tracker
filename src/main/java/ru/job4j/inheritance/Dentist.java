package ru.job4j.inheritance;

import java.util.Date;

public class Dentist extends Doctor {
    private int yearDentist;

    public Dentist(String name, String surname, String education, Date birthday, int yearLastMedicalEducation, int yearDentist) {
        super(name, surname, education, birthday, yearLastMedicalEducation);
        this.yearDentist = yearDentist;
    }

    public void getDentistYear() {
        System.out.println("Year: " + yearDentist);
    }
}
