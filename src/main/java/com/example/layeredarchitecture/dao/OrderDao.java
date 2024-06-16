package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderDao {
    String generateNewOrderId() throws SQLException, ClassNotFoundException ;

    boolean existOrder(String orderId) throws SQLException, ClassNotFoundException ;

    boolean saveOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException ;
}
