package com.pault.advjava.jdbc;

import java.sql.*;

public class JdbcDemoWithPostgres {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost/postgres";
        Connection conn = null;

        int rollno = 3;
        String name = "Billy";
        int age = 49;

        String sql = "insert into student(rollno, name, age) " + "values (" + rollno + ", '" + name + "', " + age + ")";

        System.out.println(sql);

        try {
            conn = DriverManager.getConnection(url,"postgres", "Caitlin1966");
            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1) {
                System.out.println("Inserted Successfully "+sql);
            } else {
                System.out.println("Insert failed "+sql);
            }
        } catch (Exception e) {
            System.out.println("Exception....:"+e);
        } finally {
            conn.close();
        }


    }
}
