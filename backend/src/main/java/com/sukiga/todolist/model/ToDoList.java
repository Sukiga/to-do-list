package com.sukiga.todolist.model;

import java.util.ArrayList;

public class ToDoList {
    ArrayList<Task> list;

    public ToDoList() {
        list = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.list.add(task);
    }

    public void removeTask(int num) {
        if (list.size() >= num) {
            list.remove(num - 1);
        }
    }

    public Task get(int num) {
        if (list.size() >= num) {
            return this.list.get(num - 1);
        }
        return null;
    }

    public String printTasks() {
        String output = "";
        int number = 1;
        for(Task task: list) {
            output += number + ". " + task.getDescription() + "\n";
            number ++;
        }

        return output.trim();
    }
}
