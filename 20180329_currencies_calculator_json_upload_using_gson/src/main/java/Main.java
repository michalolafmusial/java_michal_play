import java.util.Scanner;


public class Main {

    private double inputQuote;
    private String sourceCurrency;
    private String finalCurrency;


    public double getInputQuote() {
        return inputQuote;
    }

    public void setInputQuote(double inputQuote) {
        this.inputQuote = inputQuote;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getFinalCurrency() {
        return finalCurrency;
    }

    public void setFinalCurrency(String finalCurrency) {
        this.finalCurrency = finalCurrency;
    }


    public static void main(String[] args) {

        Main main = new Main();
        main.program();

    }

    public void program() {

        CurrencyCollection currencyCollection = new CurrencyCollection();
        Utility utility = new Utility();
        System.out.println("********** CURRENCIES **********");
        System.out.println("Select one of available options below");
        System.out.println("");
        System.out.println("1. Print all currencies (incl. code, name & value)");
        System.out.println("2. Calculate the amount of source currency to the amount of output currency");
        System.out.println("3. Exit");

        int userChoice = 0;
        Scanner read = new Scanner(System.in);
        userChoice = read.nextInt();


        switch (userChoice) {

            case 1: {
                currencyCollection.printBaseCurrency();
                currencyCollection.printCurrencies();
                System.out.println("");
                if (utility.checkIfContinue()) {
                    program();
                }
            }
            break;

            case 2: {
                System.out.print("Enter input quote in format <number>,<number> (e.g. 136,98)... ");
                Scanner read4 = new Scanner(System.in);
                inputQuote = read4.nextDouble();

                System.out.print("Enter source currency ");
                currencyCollection.printAllCurrenciesInOneRow();

                Scanner read2 = new Scanner(System.in);
                sourceCurrency = read2.nextLine();

                System.out.print("Enter final currency ");
                currencyCollection.printAllCurrenciesInOneRow();
                Scanner read3 = new Scanner(System.in);
                finalCurrency = read3.nextLine();

                System.out.println(inputQuote + " " + sourceCurrency + " = " + currencyCollection.calculateCurrencies(inputQuote, sourceCurrency, finalCurrency) + " " + finalCurrency);

                System.out.println("");
                if (utility.checkIfContinue()) {
                    program();
                }

            }
            case 3: {
                System.exit(0);
            }
            break;
            default: {
                System.out.println("Bad choice - select 1,2 or 3");
            }
        }

    }
}
