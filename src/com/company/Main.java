package com.company;

public class Main {

    public static void main(String[] args) {

        Balyk balyk = new Balyk();
        System.out.print("Balyktyn parametrleri: ");
        balyk.setName("Shuka");
        balyk.setFrom("AlabukaSay");
        balyk.setSize((byte) 25);
        balyk.setWeight((byte) 15);
        System.out.println(balyk.getName() + ", " + balyk.getFrom() + ", " + balyk.getSize() + ", " + balyk.getWeight() + ".");
        System.out.println("--------------------------------------------------");

        Kuchuk kuchuk = new Kuchuk();
        System.out.print("Kuchuktun parametrleri: ");
        kuchuk.setName("Moynok");
        kuchuk.setFrom("Kg");
        kuchuk.setSize((byte) 75);
        kuchuk.setWeight((byte) 35);
        System.out.println(kuchuk.getName() + ", " + kuchuk.getFrom() + ", " + kuchuk.getSize() + ", " + kuchuk.getWeight() + ".");
        System.out.println("--------------------------------------------------");

        Myshyk myshyk = new Myshyk();
        System.out.print("Myshyktyn parametrleri: ");
        myshyk.setName("Mishka");
        myshyk.setFrom("Home in Alabuka");
        myshyk.setSize((byte) 6);
        myshyk.setWeight((byte) 40);
        System.out.println(myshyk.getName() + ", " + myshyk.getFrom() + ", " + myshyk.getSize() + ", " + myshyk.getWeight() + ".");
        System.out.println("---------------------------------------------------");

        Popugay popugay = new Popugay();
        System.out.print("Popugaydyn parametrleri: ");
        popugay.setName("Vandeyk");
        popugay.setFrom("Austria");
        popugay.setSize((byte) 16);
        popugay.setWeight((byte) 1);
        System.out.println(popugay.getName() + ", " + popugay.getFrom() + ", " + popugay.getSize() + ", " + popugay.getWeight() + ".");






    }
}
