package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.Ticket;

import java.util.Map;

public class Update implements Command {
    @Override
    public void Execute(String command) {
        String[] args = command.split(",",2);
        if(args.length == 2){
            for (Map.Entry<String, Ticket> t : Main.tickets.getTickets().entrySet()) {
                if(t.getValue().getId().equals(Integer.parseInt(args[1]))){
                    Main.tickets.getTickets().replace(t.getKey(), Main.Set_Fields());
                    System.out.println("успех");
                    break;
                }
            }
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
