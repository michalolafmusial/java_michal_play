import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class old_CurrencyMethods {

    private String jsonFileName = "/currencies.json/";
    private String charsetName = "UTF-8";
    private List<Currency> currencies = new ArrayList<>();
    private BaseCurrency baseCurrency;
    private double inputQuote = 0;
    private String sourceCurrency;
    private String finalCurrency;

    public String getJsonFileName() {
        return jsonFileName;
    }

    public String getCharsetName() {
        return charsetName;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public BaseCurrency getBaseCurrency() {
        return baseCurrency;
    }

    public double getInputQuote() {
        return inputQuote;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public String getFinalCurrency() {
        return finalCurrency;
    }

    public void setJsonFileName(String jsonFileName) {
        this.jsonFileName = jsonFileName;
    }

    public void setCharsetName(String charsetName) {
        this.charsetName = charsetName;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public void setBaseCurrency(BaseCurrency baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public void setInputQuote(double inputQuote) {
        this.inputQuote = inputQuote;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public void setFinalCurrency(String finalCurrency) {
        this.finalCurrency = finalCurrency;
    }

    public void currencyRead() {

        System.out.println("Wybierz co chcesz");
        System.out.println("1. Display Currency values");
        System.out.println("2. Calculate currencies");

        int userChoice = 0;
        Scanner read = new Scanner(System.in);
        userChoice = read.nextInt();


        switch (userChoice) {
            case 1: {
                System.out.println("Base currency | Code: " + BaseCurrencyReader().getCode() + " | Name: " + BaseCurrencyReader().getName() + " | Value: " + BaseCurrencyReader().getValue());
                for (int i = 0; i < currencyReader().size(); i++) {
                    System.out.println("Currency | Code: " + currencyReader().get(i).getCode() + " | Name: " + currencyReader().get(i).getCode() + " | Value " + currencyReader().get(i).getValue());
                }
            }
            break;

            case 2: {
                System.out.print("Enter input quote... ");
                Scanner read4 = new Scanner(System.in);
                inputQuote = read4.nextDouble();

                System.out.print("Enter source currency [");
                for (int i = 0; i < currencyReader().size()-1; i++) {
                    System.out.print(currencyReader().get(i).getCode()+", ");
                }
                System.out.print(currencyReader().get(currencyReader().size()-1).getCode()+"]... ");

                Scanner read2 = new Scanner(System.in);
                sourceCurrency = read2.nextLine();

                System.out.print("Enter final currency [");
                for (int i = 0; i < currencyReader().size()-1; i++) {
                    System.out.print(currencyReader().get(i).getCode()+", ");
                }
                System.out.print(currencyReader().get(currencyReader().size()-1).getCode()+"]... ");
                Scanner read3 = new Scanner(System.in);
                finalCurrency = read3.nextLine();

                System.out.println(inputQuote + " " + sourceCurrency + " = " + calculateCurrencies(inputQuote, sourceCurrency, finalCurrency) + " " + finalCurrency);

            }
            break;
            default: {
                System.out.println("Bad choice");
            }
        }

    }


    // Method to return Currencies array
    public List<Currency> currencyReader() {
        old_CurrencyMethods first = new old_CurrencyMethods();
        try (Reader reader = new InputStreamReader(old_CurrencyMethods.class.getResourceAsStream(first.getJsonFileName()), first.getCharsetName())) {
            Gson gson = new GsonBuilder().create();
            Engine p = gson.fromJson(reader, Engine.class);
            // object p contains both currency array and base currency array
            // we use currency array only here

            currencies = p.getCurrencies();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return currencies;

    }


    // Method to return base currency array
    public BaseCurrency BaseCurrencyReader() {
        old_CurrencyMethods first = new old_CurrencyMethods();
        try (Reader reader = new InputStreamReader(old_CurrencyMethods.class.getResourceAsStream(first.getJsonFileName()), first.getCharsetName())) {
            Gson gson = new GsonBuilder().create();
            Engine p = gson.fromJson(reader, Engine.class);

            baseCurrency = p.getBaseCurrency();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return baseCurrency;

    }

    public double calculateCurrencies(double inputQuote, String sourceCurrency, String finalCurrency) {

        return (inputQuote * getValueForCurrency(sourceCurrency)) / (getValueForCurrency(finalCurrency));
    }

    ;

    // method to return value for input currency
    public double getValueForCurrency(String d) {
        double value = 0;
        // check if it is Base Currency
        if (BaseCurrencyReader().getCode().equals(d)) {
            value = BaseCurrencyReader().getValue();
        } else
        // if not Base Currency
        {
            for (int i = 0; i < currencyReader().size(); i++) {
                if (currencyReader().get(i).getCode().equals(d)) {
                    value = currencyReader().get(i).getValue();
                }
            }
        }

        return value;
    }

    ;


}
