package com.example.splitwise.commands;

public interface Command {
    public void execute(String input);
    public boolean matches(String input);
}