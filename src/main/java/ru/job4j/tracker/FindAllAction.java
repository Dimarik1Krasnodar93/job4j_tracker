package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.List;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find all action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find all action ===");
        List<Item> items = tracker.findAll();
        if (items!= null && items.size() > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Заявки не найдены.");
        }
        return true;
    }
}
