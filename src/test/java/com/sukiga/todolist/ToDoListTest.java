package com.sukiga.todolist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sukiga.todolist.model.Task;
import com.sukiga.todolist.model.ToDoList;

public class ToDoListTest {

    @Test
    void OneListTest() {
        ToDoList list = new ToDoList();
        Task task1 = new Task("Finish Personal Website");
		Task task2 = new Task("Finish Library Management");
		Task task3 = new Task("Finish HomeWithAlien");

		list.addTask(task1);
		list.addTask(task2);
		list.addTask(task3);

		System.out.println(list.printTasks());
        assertEquals(task1, list.get(1));
        assertEquals(task2, list.get(2));
        assertEquals(task3, list.get(3));
        assertNull(list.get(4));
    }
    
}
