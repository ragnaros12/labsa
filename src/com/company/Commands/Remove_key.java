package com.company.Commands;

import com.company.Command;
import com.company.Main;

public class Remove_key  implements Command {
    @Override
    public void Execute(String command) {
        String[] args = command.split(",",2);
        if(args.length == 2){
            if(Main.tickets.getTickets().remove(args[1], Main.tickets.getTickets().get(args[1]))){
                System.out.println("удаление успешно");
            }
            else{
                System.out.println("удаление не удалось");
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
