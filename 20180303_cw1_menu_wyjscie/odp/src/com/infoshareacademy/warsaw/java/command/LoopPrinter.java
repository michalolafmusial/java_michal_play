package com.infoshareacademy.warsaw.java.command;

class LoopPrinter implements Command {
    @Override
    public void execute() {
        System.out.println(
                "Pętle w Javie mogą mieć etykiety i możliwe jest sterowanie nimi za pomocą słów kluczowych 'break' oraz 'continue'. "
                        + "Nie robi się jednak takich rzeczy. 'break' jeszcze przejdzie, ale resztę należy raczej odpuścić...\n"
                        + "\t1. for(inicjalizacja; warunek_zakończenia; zmiana_licznika) { /*instrukcje*/ } - najpopularniejsze rozwiązanie\n"
                        + "\t2. for(obiekt : kolekcja_obiektów) { /*instrukcje*/ } - wariacja, tzw. foreach; używany gdy chcemy przejść po wszystkich elementach z kolekcji\n"
                        + "\t3. while(warunek) { /*instrukcje*/ } - instrukcje wykonywane dopóki warunek nie jest osiągnięty; dążenie np. do jakiegoś stanu\n"
                        + "\t4. do { /*instrukcje*/ } while(warunek); - pętla, która zawsze wykona się przynajmniej raz");
    }
}
