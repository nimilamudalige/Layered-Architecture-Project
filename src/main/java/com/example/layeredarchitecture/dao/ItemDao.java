package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDao {
    ArrayList<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException;

    void deleteItem(String code) throws SQLException, ClassNotFoundException;

    void saveItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    boolean existItem(String code) throws SQLException, ClassNotFoundException;

    ResultSet generateNewId() throws SQLException, ClassNotFoundException;

    ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;

}
