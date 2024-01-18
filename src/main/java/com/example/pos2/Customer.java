package com.example.pos2;

import com.example.pos2.db.DBProcess;
import com.example.pos2.dto.CustomerDTO;
import com.example.pos2.dto.ItemDTO;
import com.example.pos2.util.DBConnectionUtil;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customer" , value = "/customer" ,
        initParams = {
                @WebInitParam(name = "user", value = "root"),
                @WebInitParam(name = "pw", value = "1234"),
                @WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/pos"),
                @WebInitParam(name = "class", value = "com.mysql.cj.jdbc.Driver")
        },
        loadOnStartup = 3
)
public class Customer extends HttpServlet {

        Connection connection ;

        {
                try{
                        connection = DBConnectionUtil.getInstance().getConnection();
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                }
        }


        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                if (req.getContentType() == null ||
                        !req.getContentType().toLowerCase().startsWith("application/json")) {
                        resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
                } else {
                        Jsonb jsonb = JsonbBuilder.create();
                        List<CustomerDTO> customerList = jsonb.fromJson(req.getReader(), new ArrayList<CustomerDTO>() {
                        }.getClass().getGenericSuperclass());
                        var dbProcess = new DBProcess();
//                        System.out.println(itemList.get(0));
                        try {
                                dbProcess.saveCustomer(customerList, connection);
                        } catch (SQLException e) {
                                e.printStackTrace();
                                throw new RuntimeException(e);
                        }
                        //itemList.forEach(System.out::println);
                        jsonb.toJson(customerList, resp.getWriter());
                }
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                System.out.println("customer servlet");
        }
}
