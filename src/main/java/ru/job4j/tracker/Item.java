package ru.job4j.tracker;
import java.time.*;
import java.time.format.*;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    public  Item() {
        name = "";
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        boolean rsl = false;
        if (obj != null) {
            if (obj == this) {
                rsl = true;
            } else {
                if (id == ((Item) obj).getId()) {
                    rsl = true;
                }
            }
        }
        return rsl;
    }

    @Override
    public int hashCode() {
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

    @Override
    public String toString() {
        return "Item{"
                + "id=" + id + ", name='" + name + '\'' + ", created=" + created.format(FORMATTER)
                + '}';
    }
}