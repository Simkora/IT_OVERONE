import java.sql.*;

public class FirstShelving {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/supermarket";
    static final String USER = "root";
    static final String PASSWORD = "root";
    public String firstProductFirstShelving() throws ClassNotFoundException, SQLException {
        String productOne = null;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT name_category FROM shelvigOne where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String name_category = resultSet.getString("name_category");
            productOne = name_category;
        }
        return productOne;
    }
    public String secondProductFirstShelving() throws ClassNotFoundException, SQLException {
        String productOne = null;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT name_category FROM shelvigOne where id = 2";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String name_category = resultSet.getString("name_category");
            productOne = name_category;
        }
        return productOne;
    }
    public String thirdProductFirstShelving() throws ClassNotFoundException, SQLException {
        String productOne = null;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT name_category FROM shelvigOne where id = 3";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String name_category = resultSet.getString("name_category");
            productOne = name_category;
        }
        return productOne;
    }

    public int firstProductQuantityFirstShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT quantity FROM shelvigOne where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("quantity");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int secondProductQuantityFirstShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT quantity FROM shelvigOne where id = 2";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("quantity");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int thirdProductQuantityFirstShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT quantity FROM shelvigOne where id = 3";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("quantity");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }

    public int firstProductPriceFirstShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT price FROM shelvigOne where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("price");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int secondProductPriceFirstShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT price FROM shelvigOne where id = 2";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("price");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int thirdProductPriceFirstShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT price FROM shelvigOne where id = 3";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("price");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
}
