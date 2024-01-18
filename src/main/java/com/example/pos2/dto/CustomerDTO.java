package com.example.pos2.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

    private String customer_search_id;
    private String customer_id;
    private String customer_name;
    private String customer_address;
    private Double customer_salary;

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id='" + customer_id + '\'' +
                ", name='" + customer_name + '\'' +
                ",address='" + customer_address + '\'' +
                ",salary='" + customer_salary + '\'' +
                '}';
    }

    public CustomerDTO() {
    }

    public CustomerDTO(String customer_search_id, String customer_id, String customer_name, String customer_address, Double customer_salary) {
        this.customer_search_id = customer_search_id;
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_salary = customer_salary;
    }

    public String getCustomer_search_id() {
        return customer_search_id;
    }

    public void setCustomer_search_id(String customer_search_id) {
        this.customer_search_id = customer_search_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public Double getCustomer_salary() {
        return customer_salary;
    }

    public void setCustomer_salary(Double customer_salary) {
        this.customer_salary = customer_salary;
    }
}
