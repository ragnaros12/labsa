package com.company.Commands;

import com.company.Command;
import com.company.Main;

public class Insert implements Command {
    @Override
    public void Execute(String command) {
        String[] args = command.split(",",2);
        if(args.length == 2){
            Main.tickets.getTickets().put(args[1], Main.Set_Fields());
        }
        else{
            System.out.println("введите ключ");
            Execute(getName() + "," + Main.scanner.nextLine());
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
