package jdbc;

import java.sql.*;

public class InsertDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc?characterEncoding=Latin1","root","password");
            Statement statement = connection.createStatement();

            String insert = "insert into employee(id,name,address) values(6,'Govind','Banglore')";
            String update = "update employee set id=6 where id=5";
            String delete = "delete from employee where id=6";

           int i = statement.executeUpdate(insert);
            System.out.println("Row Updated=>"+i);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
