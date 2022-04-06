package ru.job4j.inheritance;

import java.util.Date;

public class Doctor  extends Profession {

    private int YearLastMedicalEducation;
    public Doctor (String name, String surname, String education, Date birthday, int YearLastMedicalEducation) {
        super(name, surname, education, birthday);
        this.YearLastMedicalEducation = YearLastMedicalEducation;
    }
}
