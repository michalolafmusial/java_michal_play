import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CurrencyCollection {

    @SerializedName("baseCurrency")
    @Expose
    private BaseCurrency baseCurrency;
    @SerializedName("currencies")
    @Expose
    private List<Currency> currencies = new ArrayList<Currency>();

    private String jsonFileName = "/currencies.json/";
    private String charsetName = "UTF-8";


    public BaseCurrency getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(BaseCurrency baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public String getJsonFileName() {
        return jsonFileName;
    }

    public void setJsonFileName(String jsonFileName) {
        this.jsonFileName = jsonFileName;
    }

    public String getCharsetName() {
        return charsetName;
    }

    public void setCharsetName(String charsetName) {
        this.charsetName = charsetName;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("baseCurrency", baseCurrency).append("currencies", currencies).toString();
    }

    /**
     * Method to read input JSON file using GSON library and assign all currencies (except Base Currency) to currencies
     * Mapping to Currency class
     *
     * @return currencies - array of all currencies
     */
    public List<Currency> currencyReader() {
        CurrencyCollection first = new CurrencyCollection();
        try (Reader reader = new InputStreamReader(CurrencyCollection.class.getResourceAsStream(first.getJsonFileName()), first.getCharsetName())) {
            Gson gson = new GsonBuilder().create();
            CurrencyCollection p = gson.fromJson(reader, CurrencyCollection.class);
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

    /**
     * Method to read input JSON file using GSON library and assign to Base Currency
     * Mapping to BaseCurrency class
     * currencies other than base currency are excluded
     *
     * @return
     */
    public BaseCurrency BaseCurrencyReader() {
        CurrencyCollection first = new CurrencyCollection();
        try (Reader reader = new InputStreamReader(CurrencyCollection.class.getResourceAsStream(first.getJsonFileName()), first.getCharsetName())) {
            Gson gson = new GsonBuilder().create();
            CurrencyCollection p = gson.fromJson(reader, CurrencyCollection.class);
            // object p contains both currency array and base currency array
            // we use base currency array only here
            baseCurrency = p.getBaseCurrency();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return baseCurrency;
    }

    /**
     * Method to calculete the amount of new currency for base currency and it's amount
     *
     * @param inputQuote     amount of input currency
     * @param sourceCurrency input currency code
     * @param finalCurrency  output currency code
     * @return amout of new currency
     */
    public double calculateCurrencies(double inputQuote, String sourceCurrency, String finalCurrency) {

        return (inputQuote * getValueForCurrencyCode(sourceCurrency)) / (getValueForCurrencyCode(finalCurrency));
    }

    /**
     * Method to get value (e.g. 3.56) for currency code (e.g. PLN, USD)
     * Mrthod first check if input code is BAse Currency, if not, then check all other currencies
     *
     * @param
     * @return currency value
     */

    public double getValueForCurrencyCode(String CurrencyCode) {
        double value = 0;
        // check if it is Base Currency
        if (BaseCurrencyReader().getCode().equals(CurrencyCode)) {
            value = BaseCurrencyReader().getValue();
        } else
        // if not Base Currency
        {
            for (int i = 0; i < currencyReader().size(); i++) {
                if (currencyReader().get(i).getCode().equals(CurrencyCode)) {
                    value = currencyReader().get(i).getValue();
                }
            }
        }

        return value;
    }

    /**
     * Print Base Currency in one line
     * Example format: Base currency | Code: PLN | Value: 1.0 | Name: polski złoty
     */
    public void printBaseCurrency() {
        System.out.println("Base currency | Code: " + BaseCurrencyReader().getCode() + " | Value: " + BaseCurrencyReader().getValue() + " | Name: " + BaseCurrencyReader().getName());
    }

    /**
     * Print all currencies (except Base currency) separately in new lines
     * Example format: Code: USD | Value: 3.6682 | Name dolar amerykański
     */
    public void printCurrencies() {
        for (int i = 0; i < currencyReader().size(); i++) {
            System.out.println("Code: " + currencyReader().get(i).getCode() + " | Value: " + currencyReader().get(i).getValue() + " | Name: " + currencyReader().get(i).getName());
        }
    }

    /**
     * Method to print all currency codes in one line
     * Example format: [PLN, USD, EUR, CHF, GBP, JPY, CZK, UAH]
     */
    public void printAllCurrenciesInOneRow() {
        System.out.print("[" + BaseCurrencyReader().getCode() + ", ");
        for (int i = 0; i < currencyReader().size() - 1; i++) {
            System.out.print(currencyReader().get(i).getCode() + ", ");
        }
        System.out.print(currencyReader().get(currencyReader().size() - 1).getCode() + "]... ");

    }

}