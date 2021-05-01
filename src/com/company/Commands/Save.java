package com.company.Commands;

import com.company.Command;
import com.company.Converter;
import com.company.Main;

public class Save implements Command {
    @Override
    public void Execute(String command) throws Exception {
        String[] strings = command.split(",", 2);
        if(strings.length == 2){
            Converter.getInstance().write(strings[1]);
        }
        else{
            System.out.println("введите путь");
            Execute(getName() + "," + Main.scanner.nextLine());
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
