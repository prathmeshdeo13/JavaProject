package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcUpdate {

    public static void main(String[] args) {

        int id;
        String name;
        String address;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id=>");
        id=scanner.nextInt();
        System.out.println("Enter the name=>");
        name= scanner.next();
        System.out.println("Enter the address=>");
        address= scanner.next();


        try {
            String update ="update employee set name=? where id=?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc?characterEncoding=Latin1","user","password");
            PreparedStatement preparedStatement = connection.prepareCall(update);

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);

            int i = preparedStatement.executeUpdate();
            System.out.println("Row updated=>"+i);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
