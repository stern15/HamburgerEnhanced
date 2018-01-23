package com.challenge;

public class Hamburger {
    private String rollType;
    private String meatType;
    private double basePrice;
    private double lettucePrice;
    private double tomatoPrice;
    private double carrotPrice;
    private double saucePrice;

    public Hamburger(String rollType, String meatType) {
        switch (rollType) {
            case "bun":
                this.basePrice = 1.20;
                break;
            case "flat":
                this.basePrice = 1.35;
                break;
            case "yeast":
                this.basePrice = 1.50;
                break;
            case "sweet":
                this.basePrice = 1.60;
                break;
            case "corn":
                this.basePrice = 1.80;
                break;
            case "brown":
                this.basePrice = 1.35;
                break;
            case "deluxe":
                this.basePrice = 2.00;
                break;
            default:
                System.out.println("\n" +
                        "Unknown type of roll bread, Please select among:" +
                        "\n-flat " +
                        "\n-yeast" +
                        "\n-sweet" +
                        "\n-corn"+
                        "\n-brown"+
                        "\n-deluxe");
                break;
        }
        {
            switch (meatType) {
                case "steak":
                    this.basePrice += 0;
                    break;
                case "grind":
                    this.basePrice += 0.15;
                    break;
                case "patties":
                    this.basePrice += 0.35;
                    break;
                case "chuck":
                    this.basePrice += 0.10;
                    break;
                case "grass-fed":
                    this.basePrice += 0.05;
                    break;
                case "gluten":
                    this.basePrice += 0.90;
                    break;
                case "deluxe":
                    this.basePrice += 1.10;
                    break;
                default:
                    System.out.println("\n" +
                            "Unknown type of meat, Please select among:" +
                            "\n-steak" +
                            "\n-grind" +
                            "\n-patties" +
                            "\n-chuck" +
                            "\n-grass-fed"+
                            "\n-gluten"+
                            "\n-deluxe");
                    break;
            }
            this.lettucePrice = 0.50;
            this.tomatoPrice = 0.30;
            this.carrotPrice = 0.20;
            this.saucePrice = 0.70;
        }
    }

    public String getMeatType() {
        return meatType;
    }

    public double getPrice() {
        return basePrice;
    }

    public double addLettuce() {
        return basePrice += lettucePrice;
    }

    public double addTomato() {
        return basePrice += tomatoPrice;
    }

    public double addCarrot() {
        return basePrice += carrotPrice;
    }

    public double addSauce() {
        return basePrice += saucePrice;

    }

}

