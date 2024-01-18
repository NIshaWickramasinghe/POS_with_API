package com.example.pos2.db;

import com.example.pos2.dto.CustomerDTO;
import com.example.pos2.dto.ItemDTO;
import jakarta.servlet.http.HttpServlet;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DBProcess extends HttpServlet {

    Connection connection;

    public static final String save_item_data = "INSERT INTO item (item_code,item_name,price,qty) VALUES (?,?,?,?)";
    public static final String save_customer_data = "INSERT INTO customer (customer_code,customer_name,customer_address,salary) VALUES (?,?,?,?)";

    public void saveItem(List<ItemDTO> itemList, Connection conection) throws SQLException {
        System.out.println("Hello");
        connection = conection;
        var ps = connection.prepareStatement(save_item_data);
        System.out.println("Hello2");

//        var itemId = UUID.randomUUID();
        System.out.println("Hello3");
        System.out.println(itemList.size());

        for (ItemDTO item:itemList) {

            ps.setString(1, item.getItem_id());
            ps.setString(2, item.getItem_name());
            ps.setDouble(3, item.getItem_price());
            ps.setInt(4, item.getItem_qty());

            if (ps.executeUpdate() != 0) {
//            logger.info("Data Saved!");
                System.out.println("item saved");
            }else {
//            logger.error("Failed to save!");
                System.out.println("item not saved");
            }
        }

    }

    public void saveCustomer(List<CustomerDTO> customerList, Connection conection) throws SQLException {
//        System.out.println("Hello");
        connection = conection;
        var ps = connection.prepareStatement(save_customer_data);
//        System.out.println("Hello2");

//        var itemId = UUID.randomUUID();
//        System.out.println("Hello3");
        System.out.println(customerList.size());

        for (CustomerDTO customer:customerList) {

            ps.setString(1, customer.getCustomer_id());
            ps.setString(2, customer.getCustomer_name());
            ps.setString(3, customer.getCustomer_address());
            ps.setDouble(4, customer.getCustomer_salary());

            if (ps.executeUpdate() != 0) {
//            logger.info("Data Saved!");
                System.out.println("customer saved");
            }else {
//            logger.error("Failed to save!");
                System.out.println("customer not saved");
            }
        }

    }

}
