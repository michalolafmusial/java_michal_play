//package com.infoshareacademy.warsaw;

// W końcu pakiet java.sql!
// mysql 5.7 tylko

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE = "isa";
    static final String DB_URL = "jdbc:mysql://localhost:3306/" + DATABASE;

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(JDBC_DRIVER);

        // try-with-resources - było: https://infoshareacademy.github.io/jjdzw1-materialy-javase/2/#/50
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT name, price, stock FROM products")) {

                List<Product> products = new ArrayList<>();
                while (rs.next()) {
                    products.add(
                            new Product(
                                    rs.getString("name"),
                                    rs.getBigDecimal("price"),
                                    rs.getInt("stock")
                            ));
                }

                System.out.println("Produkty:\n" + products);
            }
        } catch (SQLException e) {
            System.out.println("Nie udało się połączyć z bazą.");
            e.printStackTrace();
        }
    }

    /**
     * Simple immutable representation of our product from DB.
     */
    private static class Product {
        private String name;
        private BigDecimal price;
        private int stock;

        Product(String name, BigDecimal price, int stock) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        @Override
        public String toString() {
            return stock + "x " + name + " (po " + price + " zł)";
        }
    }
}