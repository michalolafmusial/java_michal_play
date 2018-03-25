import java.util.ArrayList;
import java.util.List;

class CurrencyArray {

    private ArrayList<Currency> currencyTab;

    public void setCurrencyTab(ArrayList<Currency> currencyTab) {
        this.currencyTab = currencyTab;
    }

    public ArrayList<Currency> getCurrencyTab() {
        return currencyTab;
    }

    public void fillArray (Currency cur) {

        Currency waluta1 = new Currency("PLN", "polski zloty", "1.2");
        Currency waluta2 = new Currency("EURO", "euro", "3.5");


        currencyTab.add(cur);
        currencyTab.add(cur);

    }

}
