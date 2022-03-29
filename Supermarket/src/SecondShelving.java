import java.sql.*;

public class SecondShelving {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/supermarket";
    static final String USER = "root";
    static final String PASSWORD = "root";
    public String firstProductSecondShelving() throws ClassNotFoundException, SQLException {
        String productOne = null;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT name_category FROM shelvigTwo where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String name_category = resultSet.getString("name_category");
            productOne = name_category;
        }
        return productOne;
    }
    public String secondProductSecondShelving() throws ClassNotFoundException, SQLException {
        String productOne = null;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT name_category FROM shelvigTwo where id = 2";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String name_category = resultSet.getString("name_category");
            productOne = name_category;
        }
        return productOne;
    }
    public String thirdProductSecondShelving() throws ClassNotFoundException, SQLException {
        String product = null;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT name_category FROM shelvigTwo where id = 3";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String name_category = resultSet.getString("name_category");
            product = name_category;
        }
        return product;
    }

    public int firstProductQuantitySecondShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT quantity FROM shelvigTwo where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("quantity");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int secondProductQuantitySecondShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT quantity FROM shelvigTwo where id = 2";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("quantity");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int thirdProductQuantitySecondShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT quantity FROM shelvigTwo where id = 3";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("quantity");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }

    public int firstProductPriceSecondShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT price FROM shelvigTwo where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("price");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int secondProductPriceSecondShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT price FROM shelvigTwo where id = 2";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("price");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
    public int thirdProductPriceSecondShelving() throws ClassNotFoundException, SQLException {
        int quantityProductOne = 0;
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        String sql;
        sql = "SELECT price FROM shelvigTwo where id = 3";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int quantity = resultSet.getInt("price");
            quantityProductOne = quantity;
        }
        return quantityProductOne;
    }
}
