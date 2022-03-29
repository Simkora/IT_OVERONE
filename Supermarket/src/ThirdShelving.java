import java.sql.*;

public class ThirdShelving {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/supermarket";
    static final String USER = "root";
    static final String PASSWORD = "root";
    public String firstProductThirdShelving() throws ClassNotFoundException, SQLException {
        String productOne = null;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT name_category FROM shelvingThree where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String name_category = resultSet.getString("name_category");
            productOne = name_category;
        }
        return productOne;
    }
    public String secondProductThirdShelving() throws ClassNotFoundException, SQLException {
        String productOne = null;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT name_category FROM shelvingThree where id = 2";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String name_category = resultSet.getString("name_category");
            productOne = name_category;
        }
        return productOne;
    }
    public String thirdProductThirdShelving() throws ClassNotFoundException, SQLException {
        String product = null;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT name_category FROM shelvingThree where id = 3";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String name_category = resultSet.getString("name_category");
            product = name_category;
        }
        return product;
    }

    public int firstProductQuantityThirdShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT quantity FROM shelvingThree where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("quantity");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int secondProductQuantityThirdShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT quantity FROM shelvingThree where id = 2";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("quantity");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int thirdProductQuantityThirdShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT quantity FROM shelvingThree where id = 3";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("quantity");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }

    public int firstProductPriceThirdShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT price FROM shelvingThree where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("price");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int secondProductPriceThirdShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT price FROM shelvingThree where id = 2";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("price");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int thirdProductPriceThirdShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT price FROM shelvingThree where id = 3";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("price");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
}
