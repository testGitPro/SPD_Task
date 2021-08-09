public  class Buyer {
    private String fullName;
    private String month;
    private String year;
    private String phone;
    private int cashCosts;
    private int cardCosts;
    private String ActiveFlg;

    public String getActiveFlg() {
        return ActiveFlg;
    }

    public void setActiveFlg(String activeFlg) {
        ActiveFlg = activeFlg;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCashCosts() {
        return cashCosts;
    }

    public void setCashCosts(int cashCosts) {
        this.cashCosts = cashCosts;
    }

    public int getCardCosts() {
        return cardCosts;
    }

    public void setCardCosts(int cardCosts) {
        this.cardCosts = cardCosts;
    }


    public Buyer(String fullName, String month, String year, String phone, int cashCosts, int cardCosts, String ActiveFlg) {
        this.fullName = fullName;
        this.month = month;
        this.year = year;
        this.phone = phone;
        this.cashCosts = cashCosts;
        this.cardCosts = cardCosts;
        this.ActiveFlg = ActiveFlg;
    }


}

