package main;

import exception.CarlosQueueException;
import views.Console;

public class App {
    public static void main(String[] args)throws CarlosQueueException{

        Console app = new Console();
        app = app.mainMenu(app);
        System.out.println("A aplicação foi finalizada, até mais :)");
    }

}
