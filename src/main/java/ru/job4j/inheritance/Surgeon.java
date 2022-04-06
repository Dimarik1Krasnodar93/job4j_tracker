package ru.job4j.inheritance;

import java.util.Date;

public class Surgeon extends Doctor{
    public Surgeon (String name, String surname, String education, Date birthday, int YearLastMedicalEducation) {
        super(name, surname, education, birthday, YearLastMedicalEducation);
    }
}
