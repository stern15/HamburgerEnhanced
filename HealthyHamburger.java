package com.challenge;

public class HealthyHamburger extends Hamburger {
    private double saladPrice;
    private double tofuPrice;
    private double healthyPrice;

    public HealthyHamburger() {
        super(5, 6);
        this.saladPrice = 1.30;
        this.tofuPrice = 1.45;
        this.healthyPrice = super.getPrice();
    }



    public double getPrice() {
        return healthyPrice;
    }

    public void addLettuce() {
        healthyPrice += super.getLettucePrice();
    }

    public void addTomato() {
       healthyPrice += super.getTomatoPrice();
    }

    public void addCarrot() {
        healthyPrice += super.getCarrotPrice();
    }

    public void addSauce() {
        healthyPrice += super.getSaucePrice();
    }
    public void addSalad() {
        healthyPrice += saladPrice;

    }

    public void addTofu() {
        healthyPrice += tofuPrice;
    }
}
