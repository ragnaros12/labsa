package com.company.Commands;

import com.company.Command;
import com.company.Main;

public class Help implements Command {
    @Override
    public void Execute(String command) {
        for (Command a: Main.commands) {
            System.out.println("команда: " + a.getName());
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
