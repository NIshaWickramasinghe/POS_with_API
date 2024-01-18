package com.example.pos2.db;

import com.example.pos2.dto.ItemDTO;
import jakarta.servlet.http.HttpServlet;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DBProcess extends HttpServlet {

    Connection connection;

    public static final String save_item_data = "INSERT INTO item (item_code,item_name,price,qty) VALUES (?,?,?,?)";

    public void saveItem(List<ItemDTO> itemList, Connection conection) throws SQLException {

        connection = conection;
        var ps = connection.prepareStatement(save_item_data);

//        var itemId = UUID.randomUUID();


        for (ItemDTO item:itemList) {

            ps.setString(1, item.getItem_id());
            ps.setString(2, item.getItem_name());
            ps.setString(3, String.valueOf(item.getItem_price()));
            ps.setString(4, String.valueOf(item.getItem_qty()));

        }
        if (ps.executeUpdate() != 0) {
//            logger.info("Data Saved!");
            System.out.println("item saved");
        }else {
//            logger.error("Failed to save!");
            System.out.println("item not saved");
        }
    }

}
