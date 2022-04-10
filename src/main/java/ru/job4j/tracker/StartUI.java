package ru.job4j.tracker;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime createdItem = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentFormat = createdItem.format(formatter);
        System.out.println("Дата создания " + currentFormat);
    }
}
