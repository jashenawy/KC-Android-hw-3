package com.example.myapplication;

import java.io.Serializable;

public class Items implements Serializable {
    private String itemName;
    private int itemImage;
    private String itemInfo;

    public String getIteInfo() {
        return itemInfo;
    }

    public void setIteInfo(String iteInfo) {
        this.itemInfo = iteInfo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public Items(String itemName, int itemImage, String itemInfo) {
        this.itemName = itemName;
        this.itemImage = itemImage;
        this.itemInfo = itemInfo;
    }
}
