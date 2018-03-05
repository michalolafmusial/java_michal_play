package com.infoshareacademy.warsaw.java.command;

class ConditionalStatementsPrinter implements Command {
    @Override
    public void execute() {
        System.out.println("Najbardzeij znaną instrukcją warunkową jest 'if'.\n"
                + "if(warunek) {\n"
                + "\t/*instrukcje*/\n"
                + "}\n\n"
                + "Warunek musi być wyrażeniem, zwracającym wartość logiczną true lub false.\n");
        System.out.println("Złożona forma:\n"
                + "if(warunek) {\n"
                + "\t/*instrukcje*/\n"
                + "} else if(inny_warunek) {\n"
                + "\t/*inne instrukcje*/\n"
                + "} else {\n"
                + "\t/*instrukcje*/\n"
                + "}\n" );
        System.out.println("Jeśli instrukcje mieszczą się w 1 linijce, to możemy pominąć nawiasy klamrowe. Ale tak się nie robi.");
        System.out.println("W Javie dostępna jest też instrukcja 'switch'.");
    }
}
