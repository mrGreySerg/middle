package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<Task>();

    public void put(Task task) {
        int index = 0;
        for (Task element : this.tasks) {

        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }

}
