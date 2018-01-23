package com.challenge;

public class DeluxeHamburger extends Hamburger {
    private double chipsPrice;
    private double drinksPrice;
    private double deluxePrice;

    public DeluxeHamburger() {
        super("deluxe", "deluxe");
        this.chipsPrice = 2.00;
        this.drinksPrice = 2.50;
        this.deluxePrice = super.getPrice();

    }

    public double getDeluxePrice() {
        return deluxePrice;
    }

    public double addChips() {
        return deluxePrice += chipsPrice;
    }

    public double addDrinks() {
        return deluxePrice += drinksPrice;
    }

    public double addFullPack() {
        return deluxePrice += (drinksPrice + chipsPrice);
    }
}
