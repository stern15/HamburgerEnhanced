package com.challenge;

public class DeluxeHamburger extends Hamburger {
    private double chipsPrice;
    private double drinksPrice;
    private double deluxePrice;

    public DeluxeHamburger() {
        super(6, 7);
        this.chipsPrice = 2.00;
        this.drinksPrice = 2.50;
        this.deluxePrice = super.getPrice();
    }

    public double getDeluxePrice() {
        return deluxePrice;
    }

    public void addChips() {
        deluxePrice += chipsPrice;
    }

    public void addDrinks() {
        deluxePrice += drinksPrice;
    }

    public void addFullPack() {
        deluxePrice += (drinksPrice + chipsPrice);
    }
}
