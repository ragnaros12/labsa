package com.company.Commands;

import com.company.Command;

public class Exit implements Command {
    @Override
    public void Execute(String command) {
        try {
            System.exit(0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
