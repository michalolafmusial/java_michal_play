class Currency {

    private String currencyCode;
    private String currencyName;
    private String currencyValue;

    public Currency(String currencyCode, String currencyName, String currencyValue) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.currencyValue = currencyValue;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCurrencyValue() {
        return currencyValue;
    }



    public void printCurrencyDetails (Currency cur) {
        System.out.println(cur.getCurrencyCode()+" | "+cur.getCurrencyName()+" | "+cur.getCurrencyValue());
    }


}
