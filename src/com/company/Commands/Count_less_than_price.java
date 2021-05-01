package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.Ticket;

public class Count_less_than_price  implements Command {
    @Override
    public void Execute(String command) {
        String[] strings = command.split("," , 2);// разделяем аргумент, и имя команды по запятой. Максимум таких разделений может быть 2
        if(strings.length == 2){
            try {
                int count = 0;
                int price = Integer.parseInt(strings[1].trim());// trim нужен чтобы убрать пробелы сначала и с конца
                for (Ticket ticket : Main.tickets.getTickets().values()){
                    if(ticket.getPrice() < price ){
                        count++;
                    }
                }
                System.out.println("количество " + count);
            }
            catch (NumberFormatException e){
                System.out.println("неправильно введено число");
            }
        }
        else{
            System.out.println("введите price");
            Execute(getName() + "," + Main.scanner.nextLine());
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();// используем getSimpleName потому что он возвращает просто имя класса, без имени пакета
    }
}
