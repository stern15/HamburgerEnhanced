package com.challenge;

import java.util.Scanner;

public class HamburgerTest {


    public static void main(String[] args) {
        boolean menuFlag = true;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("\n\n  *******  MENU  *******\n\nType of Hamburger available:" +
                    "\n\n1. Base Hamburger" +
                    "\n2. Healthy Hamburger" +
                    "\n3. Deluxe Hamburger" +
                    "\n\nEnter your choice: ");

            int hamChoice = sc.nextInt();
            sc.nextLine();
            switch (hamChoice) {
                case 1:
                    System.out.println("Please enter the bread roll type: ");
                    String rollType = sc.nextLine();

                    System.out.println("Please enter the meat type: ");
                    String meatType = sc.nextLine();

                    Hamburger hamburger = new Hamburger(rollType.toLowerCase(), meatType.toLowerCase());


                    if (hamburger.getPrice() != 0.00) {
                        System.out.printf("\nPrice of your base hamburger is $ " + "%.2f", hamburger.getPrice());
                        boolean flag = true;

                        do {

                            System.out.println("\n" + "\nWould you like an addition? [Y/N]:");
                            char yesOrNo = Character.toLowerCase(sc.findInLine(".").charAt(0));
                            sc.nextLine();

                            switch (yesOrNo) {
                                case 'y':
                                    System.out.println();
                                    System.out.println("Choose between these additions" +
                                            "\n1. Lettuce --> 0.50" +
                                            "\n2. Tomato  --> 0.30" +
                                            "\n3. Carrot  --> 0.20" +
                                            "\n4. Sauce   --> 0.70");
                                    System.out.println("\nPlease choose which addition to add : ");
                                    int addChoice = sc.nextInt();
                                    sc.nextLine();
                                    switch (addChoice) {
                                        case 1:
                                            hamburger.addLettuce();
                                            flag = false;
                                            System.out.println("Lettuce successfully added!");
                                            break;
                                        case 2:
                                            hamburger.addTomato();
                                            flag = false;
                                            System.out.println("Tomato successfully added!");
                                            break;
                                        case 3:
                                            hamburger.addCarrot();
                                            flag = false;
                                            System.out.println("Carrot successfully added!");
                                            break;
                                        case 4:
                                            hamburger.addSauce();
                                            flag = false;
                                            System.out.println("Sauce successfully added!");
                                            break;
                                        default:
                                            System.out.println("choose between 1, 2, 3 or 4");
                                            break;
                                    }
                                    break;
                                case 'n':
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("Please choose between \"Y\" or \"N\"");
                                    break;
                            }
                        } while (flag);
                        System.out.println();
                        System.out.println("Thank you to shop with us...");
                        System.out.printf("Your final bill is $ " + "%.2f", hamburger.getPrice());
                    }
                    menuFlag = false;
                    break;
                case 2:
                    HealthyHamburger healthyHamburger = new HealthyHamburger();

                    System.out.printf("\nPrice of your Healthy hamburger is $ " + "%.2f", healthyHamburger.getPrice());
                    boolean flag1 = true;

                    do {
                        System.out.println("\n" + "\nWould you like an addition? [Y/N]:");
                        char yesOrNo = Character.toLowerCase(sc.findInLine(".").charAt(0));
                        sc.nextLine();

                        switch (yesOrNo) {
                            case 'y':
                                System.out.println();
                                System.out.println("Choose between these additions" +
                                        "\n1. Salad --> 1.30" +
                                        "\n2. Tofu  --> 1.45");
                                System.out.println("\nPlease choose which addition to add : ");
                                int addChoice = sc.nextInt();
                                sc.nextLine();
                                switch (addChoice) {
                                    case 1:
                                        healthyHamburger.addSalad();
                                        flag1 = false;
                                        System.out.println("Salad successfully added!");
                                        break;
                                    case 2:
                                        healthyHamburger.addTofu();
                                        flag1 = false;
                                        System.out.println("Tofu successfully added!");
                                        break;
                                    default:
                                        System.out.println("choose between 1 or 2");
                                        break;
                                }
                                break;
                            case 'n':
                                flag1 = false;
                                break;
                            default:
                                System.out.println("Please choose between \"Y\" or \"N\"");
                                break;
                        }
                    } while (flag1);
                    System.out.println();
                    System.out.println("Thank you to shop with us...");
                    if (healthyHamburger.getHealthyPrice() != 0.00) {
                        System.out.printf("\nYour final bill is $ " + "%.2f", healthyHamburger.getHealthyPrice());
                    } else {
                        System.out.printf("\nYour final bill is $ " + "%.2f", healthyHamburger.getPrice());

                    }
                    menuFlag = false;
                    break;
                case 3:
                    DeluxeHamburger deluxeHamburger = new DeluxeHamburger();

                    System.out.printf("\nPrice of your Deluxe hamburger is $ " + "%.2f", deluxeHamburger.getPrice());
                    boolean flag2 = true;

                    do {
                        System.out.println("\n" + "\nWould you like an addition? [Y/N]:");
                        char yesOrNo = Character.toLowerCase(sc.findInLine(".").charAt(0));
                        sc.nextLine();

                        switch (yesOrNo) {
                            case 'y':
                                System.out.println();
                                System.out.println("Choose between these additions" +
                                        "\n1. Chips --> 2.00" +
                                        "\n2. Drinks  --> 2.50");
                                System.out.println("\nPlease choose which addition to add : ");
                                int addChoice = sc.nextInt();
                                sc.nextLine();
                                switch (addChoice) {
                                    case 1:
                                        deluxeHamburger.addChips();
                                        flag2 = false;
                                        System.out.println("Chips successfully added!");
                                        break;
                                    case 2:
                                        deluxeHamburger.addDrinks();
                                        flag2 = false;
                                        System.out.println("Drinks successfully added!");
                                        break;
                                    default:
                                        System.out.println("choose between 1 or 2");
                                        break;
                                }
                                break;
                            case 'n':
                                flag2 = false;
                                break;
                            default:
                                System.out.println("Please choose between \"Y\" or \"N\"");
                                break;
                        }
                    } while (flag2);
                    System.out.println();
                    System.out.println("Thank you to shop with us...");
                    if (deluxeHamburger.getDeluxePrice() != 0.00) {
                        System.out.printf("\nYour final bill is $ " + "%.2f", deluxeHamburger.getDeluxePrice());
                    } else {
                        System.out.printf("\nYour final bill is $ " + "%.2f", deluxeHamburger.getPrice());

                    }
                    menuFlag = false;
                    break;
                default:
                    System.out.println("\nPlease select between 1, 2 or 3 only...");
                    System.out.println();
                    break;
            }

        } while (menuFlag);
    }

}

