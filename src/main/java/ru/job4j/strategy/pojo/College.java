package ru.job4j.strategy.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student st = new Student();
        st.setAdmissionDate(new Date());
        st.setName("Петр");
        st.setPatronymic("Александрович");
        st.setSurname("Иванов");
        System.out.println(st.getName() + " " + st.getPatronymic() + " " + st.getSurname() + " поступил "
        + st.getAdmissionDate());
    }
}
