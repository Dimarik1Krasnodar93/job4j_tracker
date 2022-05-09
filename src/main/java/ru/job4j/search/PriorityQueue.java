package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        int taskPriority = task.getPriority();
        int i = 0;
        for (Task element : tasks) {
            i++;
            int priority = element.getPriority();
            if (priority < taskPriority) {
                index = i;
                taskPriority = priority;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}