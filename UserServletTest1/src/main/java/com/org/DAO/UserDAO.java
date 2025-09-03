package com.org.DAO;

import java.sql.Connection;

public class UserDAO {

    public void login(String userId, String password) {
        boolean result=false;
        String sql="SELECT * FROM users WHERE id = ? AND password = ?";
    }
}
