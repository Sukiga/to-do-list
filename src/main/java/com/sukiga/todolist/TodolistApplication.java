package com.sukiga.todolist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sukiga.todolist.ui.TextUI;


@SpringBootApplication
public class TodolistApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Override
    public void run(String... args) {
		TextUI tui = new TextUI();
		tui.start();
    }

}
