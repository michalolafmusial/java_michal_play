package com.infoshareacademy.warsaw.java.command;

class TypesPrinter implements Command {
    @Override
    public void execute() {
        String[] input = {
                "Java oferuje wsparcie dla następujących typów prostych: ",
                "\t- całkowitoliczbowe (byte, short, int, long); każda liczba całkowita, podana w kodzie, jest domyślnie traktowana jak int. "
                        + "Używając 'L' na końcu, traktujemy liczbę jako long. Większe liczby możemy przedzielać znakiem '_'.",
                "\t- zmiennoprzecinkowe (float, double); domyślnie np. 1.1 będzie traktowane jako double",
                "\t- true/false - boolean", "\t- pojedynczy znak - char", "",
                "Nawiasy kwadratowe przy nazwie typu, oznaczają tablicę.",
                "Zamiast 10 intów, możemy użyć 10-elementowej tablicy: int[] anArray = new int[10];" };

        for (String line : input) {
            System.out.println(line);
        }
    }
}
