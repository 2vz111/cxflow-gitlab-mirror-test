package com.example;
import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Simulated user-controlled input for testing
        String user = args.length > 0 ? args[0] : "admin' OR '1'='1";
        // Vulnerable SQL concatenation (test signal for SAST)
        String sql = "SELECT * FROM users WHERE username = '" + user + "'";

        // No actual DB used. Just print the query to keep it runnable.
        System.out.println("[TEST] Would execute: " + sql);
    }
