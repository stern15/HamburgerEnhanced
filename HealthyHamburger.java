package com.challenge;

public class HealthyHamburger extends Hamburger {
    private double saladPrice;
    private double tofuPrice;
    private double healthyPrice;

    public HealthyHamburger() {
        super("brown", "gluten");
        this.saladPrice = 1.30;
        this.tofuPrice = 1.45;
        this.healthyPrice = super.getPrice();
    }

    public double getHealthyPrice() {
        return healthyPrice;
    }

    public double addSalad(){
        return healthyPrice+=saladPrice;

    }
    public double addTofu(){
        return healthyPrice+=tofuPrice;
    }
}
