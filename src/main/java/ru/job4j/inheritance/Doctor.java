package ru.job4j.inheritance;

import java.util.Date;

public class Doctor  extends Profession {

    private int yearLastMedicalEducation;

    public Doctor(String name, String surname, String education, Date birthday, int yearLastMedicalEducation) {
        super(name, surname, education, birthday);
        this.yearLastMedicalEducation = yearLastMedicalEducation;
    }

    public void getMedicalInformation() {
        System.out.println("Закончил мед университет: " + yearLastMedicalEducation);
    }
}
