package com.example.pos2.dto;

import java.io.Serializable;

public class ItemDTO implements Serializable {

    private String item_search_id;
    private String item_id;
    private String item_name;
    private Double item_price;
    private int item_qty;

    @Override
    public String toString() {
        return "ItemDTO{" +
                "id='" + item_id + '\'' +
                ", name='" + item_name + '\'' +
                ",price='" + item_price + '\'' +
                ",qty='" + item_qty + '\'' +
                '}';
    }

    public ItemDTO() {
    }

    public ItemDTO(String item_search_id, String item_id, String item_name, Double item_price, int item_qty) {
        this.item_search_id = item_search_id;
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_price = item_price;
        this.item_qty = item_qty;
    }

    public String getItem_search_id() {
        return item_search_id;
    }

    public void setItem_search_id(String item_search_id) {
        this.item_search_id = item_search_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public Double getItem_price() {
        return item_price;
    }

    public void setItem_price(Double item_price) {
        this.item_price = item_price;
    }

    public int getItem_qty() {
        return item_qty;
    }

    public void setItem_qty(int item_qty) {
        this.item_qty = item_qty;
    }
}
