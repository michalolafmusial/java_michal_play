# Zadanie 3
*Termin:* 14.04.2018

## Analiza danych z pliku

Sposób na przećwiczenie umiejętności wczytywania pliku i analizy danych w nim zawartych.

W nowym projekcie znajduje się plik `activities.csv`. (PS: Zwróćcie uwagę w jaki sposób jest on wczytany)
Zawiera on dane na temat aktywności wykonywanych na komputerze, będziemy korzystać z część z nich.

Do swojego brancha należy zmergować `master` (który zawira tę pracę domową i wstępnie przygotowany projekt)
oraz zaimportować nowy moduł (jako maven), pobrany kod można edytować.

Kryteria akceptacji:

- Zliczenie wszystkich aktywności (Punkt 1 z przykładu)
- Stworzenie prostej statystyki na temat długości zadań (spędzonego czasu) (Punkt 2 z przykładu)
- Znalezienie godzin w których użytkownik wchodził na stronę `facebook.com`
- Znalezienie najbardziej intensywnej godziny (czas przepracowany w tej godzinie)

Oceniane będą:

- Ilość wykonanych zadań
- Podział kodu na obiekty i metody 
- Spróbujcie wykorzystać streams

Przykład działania:

```
1) Activities: 262
2) Statystyka wszystkich aktywności: 
 a) Najkrótsze: 1
 b) Najdłuższe: 300
 c) Srednia na aktywność: 49,91 sekund
 d) Lączny czas pracy: 3 godzin i 37 minut
3) Godziny na facebooku: 0, 18, 19, 20, 21, 22
4) Najbardziej intensywna godzina: 21 (Pracowano 59 min)
```

# Punktacja
Za zadanie można otrzymać 5 punktów.