package org.launchcode;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        org.launchcode.MenuItem burger = new org.launchcode.MenuItem(10.0, "burger", "main course", true);
        System.out.println(burger.getPrice());
        Menu ourMenu = new Menu();
        ourMenu.addMenuItem(burger);
        //System.out.println(ourMenu.items);
    }

}