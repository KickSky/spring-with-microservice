package com.extremecoder.salesservice.model;

import java.util.List;

public class MyOrder {

    private int id;

    private List<Item> itemList;

    public MyOrder() {

    }

    public MyOrder(int id, List<Item> itemList) {
        this.id = id;
        this.itemList = itemList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
