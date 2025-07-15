package com.sukiga.todolist.ui;

import com.sukiga.todolist.model.Task;
import com.sukiga.todolist.model.ToDoList;

import java.util.Scanner;

public class TextUI {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        ToDoList list = new ToDoList();
        boolean open = true;
        while (open) {
            System.out.println("\n<-- To Do List -->\n");
            System.out.println("c --> create a task");
            System.out.println("r --> remove a task");
            System.out.println("v --> view your tasks");
            System.out.println("q --> quit");
            String input = scanner.nextLine();
            if (input.equals("c")) {
                System.out.print("Task: ");
                String des = scanner.nextLine();
                Task task = new Task(des);
                list.addTask(task);
            } else if (input.equals("r")) {
                System.out.println("\n" + list.printTasks());
                System.out.println("\nWhich one do you want to remove?");
                int num = Integer.valueOf(scanner.nextLine());
                list.removeTask(num);
            } else if (input.equals("v")) {
                System.out.println("\n" + list.printTasks());
            } else if (input.equals("q")) {
                System.out.println("QUIT");
                open = false;
                System.exit(0);
            } else {
                System.out.println("That's not an option, try again!");
            }
             
            
        }

        scanner.close();
        
    }
}
