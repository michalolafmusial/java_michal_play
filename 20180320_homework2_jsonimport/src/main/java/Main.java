import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        System.out.println("Currency converter");
        ArrayList<Currency> currencyTab = new ArrayList<Currency>();

        Currency waluta1 = new Currency("PLN", "polski zloty", "1.2");
        Currency waluta2 = new Currency("EURO", "euro", "3.5");

        currencyTab.add(waluta1);
        currencyTab.add(waluta2);


        for (int i = 0; i < currencyTab.size(); i++) {
            Currency d = currencyTab.get(i);
            d.printCurrencyDetails(d);
        }
        JsonImport jsonn = new JsonImport();
        jsonn.read_json();
        //Currency d = currencyTab.get(0);
        //waluta1.printCurrencyDetails(waluta1);
        //waluta2.printCurrencyDetails(waluta2);

    }


}


