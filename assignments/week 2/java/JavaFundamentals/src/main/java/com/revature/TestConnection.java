package com.revature;

import com.revature.util.ConnectionUtil;

import java.sql.Connection;

public class TestConnection {

    public static void main(String[] args) {

        // This will be like us creating a connection in our DAO Layer
        Connection conn = ConnectionUtil.getConnection();

        Connection conn2 = ConnectionUtil.getConnection();

    }
}
