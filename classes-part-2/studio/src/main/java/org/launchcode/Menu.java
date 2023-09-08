package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    public ArrayList<org.launchcode.MenuItem> items;

    public Menu() {
       // this.lastUpdated = date;
        //this.items = items;
        //Date date, ArrayList<org.launchcode.MenuItem> items
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<org.launchcode.MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public ArrayList<org.launchcode.MenuItem> getItems() {
        return this.items;
    }

    public void addMenuItem(org.launchcode.MenuItem item) {
        this.items.add(item);
        System.out.println(items);
    }

    public void removeMenuItem(org.launchcode.MenuItem item) {
        this.items.remove(item);
    }

    public boolean checkNew(org.launchcode.MenuItem item) {
        return item.isNew();
    }

    public void printItem(org.launchcode.MenuItem item) {
    }

    public void printMenu() {
    }
}