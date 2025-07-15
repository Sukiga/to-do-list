package com.sukiga.todolist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sukiga.todolist.model.Task;

public class TaskTest {
    

    @Test
    void createTaskTest() {
        Task task = new Task("A timer app with pomodoro method");
        String description = task.getDescription();
        assertFalse(task.isCompleted());

        assertEquals("A timer app with pomodoro method", description);

        task.setCompleted();
        assertTrue(task.isCompleted());
    }

}
