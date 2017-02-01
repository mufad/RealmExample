package com.droiddigger.realmexample;

import io.realm.RealmObject;

public class Product extends RealmObject {

  private String name;
  private String price;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
