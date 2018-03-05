package com.infoshareacademy.warsaw.java.command;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private final Map<String, Command> commands;

    public static CommandFactory init() {
        CommandFactory result = new CommandFactory();

        result.commands.put("exit", () -> System.out.println("Dzięki!"));
        result.commands.put("menu", new MenuPrinter());
        result.commands.put("err", () -> System.out.println("Nieznana komenda! Spróbuj ponownie."));
        result.commands.put("1", () -> System.out.println(
                "Importy pozwalają używać elementów zdefiniowanych w innych plikach. Nie są potrzebne np. gdy wszystko mamy w tym samym pakiecie."));
        result.commands.put("2", new ConditionalStatementsPrinter());
        result.commands.put("3", new LoopPrinter());
        result.commands.put("4", new TypesPrinter());
        result.commands.put("5", new CastingPrinter());

        return result;
    }

    private CommandFactory() {
        commands = new HashMap<>();
    }

    public void execute(String name) {
        // unknown command
        if (!commands.containsKey(name)) {
            name = "err";
        }

        commands.get(name).execute();
    }
}
