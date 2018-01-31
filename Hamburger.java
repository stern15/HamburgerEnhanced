package com.challenge;

public class Hamburger {
    private int rollType;
    private int meatType;
    private double basePrice;
    private double lettucePrice;
    private double tomatoPrice;
    private double carrotPrice;
    private double saucePrice;

    public Hamburger(int rollType, int meatType) {
        switch (rollType) {
            case 1:
                this.basePrice = 1.20;
                break;
            case 2:
                this.basePrice = 1.35;
                break;
            case 3:
                this.basePrice = 1.50;
                break;
            case 4:
                this.basePrice = 1.60;
                break;
            case 5:
                this.basePrice = 1.80;
                break;
            case 6:
                this.basePrice = 2.00;
                break;
            default:
                System.out.println("\n" +
                        "Unknown type of roll bread, Please select a number among the list above...");
                break;
        }
        {
            switch (meatType) {
                case 1:
                    this.basePrice += 0;
                    break;
                case 2:
                    this.basePrice += 0.15;
                    break;
                case 3:
                    this.basePrice += 0.35;
                    break;
                case 4:
                    this.basePrice += 0.10;
                    break;
                case 5:
                    this.basePrice += 0.05;
                    break;
                case 6:
                    this.basePrice += 0.90;
                    break;
                case 7:
                    this.basePrice += 1.10;
                    break;
                default:
                    System.out.println("\n" +
                            "Unknown type of meat, Please select a number among the list above...");
                    break;
            }
            this.lettucePrice = 0.50;
            this.tomatoPrice = 0.30;
            this.carrotPrice = 0.20;
            this.saucePrice = 0.70;
        }
    }

    public double getPrice() {
        return basePrice;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getSaucePrice() {
        return saucePrice;
    }

    public void addLettuce() {
        basePrice += lettucePrice;
    }

    public void addTomato() {
        basePrice += tomatoPrice;
    }

    public void addCarrot() {
        basePrice += carrotPrice;
    }

    public void addSauce() {
        basePrice += saucePrice;

    }

}

