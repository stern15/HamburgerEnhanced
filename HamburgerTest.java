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
                    System.out.println("\nType of bread roll available: " +
                            "\n\n1. flat --> 1.20" +
                            "\n2. yeast --> 1.35" +
                            "\n3. sweet --> 1.50" +
                            "\n4. corn --> 1.60" +
                            "\n5. brown --> 1.80" +
                            "\n6. deluxe --> 2.00");
                    System.out.println("\nPlease enter the bread roll type: ");
                    int rollType = sc.nextInt();
                    sc.nextLine();

                    if (rollType > 0 && rollType <= 6) {
                        System.out.println("\nBread roll no " + rollType + " successfully added!!");
                        System.out.println("\nType of meat available: " +
                                "\n\n1. steak --> 0.00" +
                                "\n2. grind --> 0.15" +
                                "\n3. patties --> 0.35" +
                                "\n4. chuck --> 0.10" +
                                "\n5. grass-fed --> 0.05" +
                                "\n6. gluten --> 0.90" +
                                "\n7. deluxe --> 1.10");
                        System.out.println("\nPlease enter the meat type: ");
                        int meatType = sc.nextInt();
                        sc.nextLine();

                        if (meatType > 0 && meatType <= 7) {

                            System.out.println("\nMeat type no " + meatType + " successfully added!!");


                            Hamburger hamburger = new Hamburger(rollType, meatType);


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
                                                "\n\n1. Lettuce --> 0.50" +
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
                            System.out.println("Thank you for shopping with us...");
                            System.out.printf("\nYour final bill is $ " + "%.2f", hamburger.getPrice());
                        } else {
                            System.out.println("\nPlease choose between the list above...");
                            break;
                        }
                        menuFlag = false;
                    } else {
                        System.out.println("\nPlease choose between the list above...");
                        break;
                    }
                    break;
                case 2:
                    HealthyHamburger healthyHamburger = new HealthyHamburger();
                    System.out.println("\nA healthy burger has been add with brown bread roll and gluten as meat type...");
                    System.out.println();
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
                                        "\n2. Tofu  --> 1.45" +
                                        "\n3. Lettuce --> 0.50" +
                                        "\n4. Tomato  --> 0.30" +
                                        "\n5. Carrot  --> 0.20" +
                                        "\n6. Sauce   --> 0.70");
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
                                    case 3:
                                        healthyHamburger.addLettuce();
                                        flag1 = false;
                                        System.out.println("Lettuce successfully added!");
                                        break;
                                    case 4:
                                        healthyHamburger.addTomato();
                                        flag1 = false;
                                        System.out.println("Tomato successfully added!");
                                        break;
                                    case 5:
                                        healthyHamburger.addCarrot();
                                        flag1 = false;
                                        System.out.println("Carrot successfully added!");
                                        break;
                                    case 6:
                                        healthyHamburger.addSauce();
                                        flag1 = false;
                                        System.out.println("Sauce successfully added!");
                                        break;
                                    default:
                                        System.out.println("choose between 1, 2, 3, 4, 5 or 6");
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
                    System.out.println("Thank you for shopping with us...");
                    System.out.printf("\nYour final bill is $ " + "%.2f", healthyHamburger.getPrice());
                    menuFlag = false;
                    break;
                case 3:
                    DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
                    System.out.println("\nA deluxe burger has been add with a deluxe bread roll and deluxe as meat type...");
                    System.out.println();
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
                                        "\n2. Drinks  --> 2.50" +
                                        "\n3. Full package --> 4.50");
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
                                    case 3:
                                        deluxeHamburger.addFullPack();
                                        flag2 = false;
                                        System.out.println("Full pack successfully added!");
                                        break;
                                    default:
                                        System.out.println("choose between 1, 2 or 3");
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
                    System.out.println("Thank you for shopping with us...");
                        System.out.printf("\nYour final bill is $ " + "%.2f", deluxeHamburger.getDeluxePrice());
                    menuFlag = false;
                    break;
                default:
                    System.out.println("\nPlease select between 1, 2 or 3 only...");
                    break;
            }
        } while (menuFlag);
    }
}

