package com.example.pos2.dto;

import java.io.Serializable;

public class OrdersDTO implements Serializable {
    private String order_id;
    private String date;
    private String O_cust_id;
    private Double total;
    private int discount;

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "id='" + order_id + '\'' +
                ",date'" + date + '\''+
                ", customer='" + O_cust_id + '\'' +
                ",total='" + total + '\'' +
                ",discount='" + discount + '\'' +
                '}';
    }

    public OrdersDTO() {
    }

    public OrdersDTO(String order_id, String date, String o_cust_id, Double total, int discount) {
        this.order_id = order_id;
        this.date = date;
        O_cust_id = o_cust_id;
        this.total = total;
        this.discount = discount;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getO_cust_id() {
        return O_cust_id;
    }

    public void setO_cust_id(String o_cust_id) {
        O_cust_id = o_cust_id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
