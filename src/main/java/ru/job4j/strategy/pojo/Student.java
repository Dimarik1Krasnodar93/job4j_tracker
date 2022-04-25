package ru.job4j.strategy.pojo;

import java.util.Date;

public class Student {

    private String name;
    private String surname;
    private String patronymic;

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    private Date admissionDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }
}
