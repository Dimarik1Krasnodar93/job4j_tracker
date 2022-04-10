package ru.job4j.tracker;
import java.time.*;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created;

    public  Item() {
        this.created = LocalDateTime.now();
    }

    public Item(String name) {
        this.name = name;
        this.created = LocalDateTime.now();
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
        this.created = LocalDateTime.now();
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}