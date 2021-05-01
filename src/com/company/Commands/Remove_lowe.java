package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.Ticket;

public class Remove_lowe  implements Command {
    @Override
    public void Execute(String command) {
        String[] args = command.split(",",2);
        if(args.length == 2){
            Ticket ticket = Main.Set_Fields();
            if(Main.tickets.getTickets().get(args[1]) != null) {
                if (Main.tickets.getTickets().get(args[1]).compareTo(ticket) < 0) {
                    Main.tickets.getTickets().replace(args[1], ticket);
                    System.out.println("успех");
                }
                else{
                    System.out.println("неудача");
                }
            }
            else{
                System.out.println("такого нет");
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
