package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.Ticket;

public class Show implements Command {
    @Override
    public void Execute(String command) {
        if(Main.tickets.getTickets().size() != 0) {
            for (Ticket ticket : Main.tickets.getTickets().values()) {
                System.out.println(ticket.toString());
            }
        }
        else{
            System.out.println("ни одного элемента нет");
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
