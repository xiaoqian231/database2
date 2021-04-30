import java.sql.*;
import java.util.ArrayList;

public class ProductDAO {
    public ArrayList<Product> getPoducts() throws Exception {

        ArrayList<Product> productsList = new ArrayList<>();

        //String sqlQuerry = "SELECT * FROM products WHERE id='" + id + "'";
        String sqlQuerry = "SELECT * FROM products";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lessonDB", "root", "");
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(sqlQuerry);

        while (rs.next()) {

            Product product = new Product();

            product.setBrand(rs.getString("brand"));
            product.setId(rs.getInt("id"));
            product.setPrice(rs.getDouble("price"));
            product.setName(rs.getString("name"));

            productsList.add(product);
        }
        con.close();

        return productsList;
    }

    public void addNewProduct(String name, double price, String brand) throws Exception {
        //INSERT INTO `products` (`id`, `name`, `price`, `brand`) VALUES (NULL, 'dad', '123', 'asd');
        String sqlQuerry = "INSERT INTO products (id, name, price, brand) VALUES (NULL, '" + name + "', '" + price + "', '" + brand + "')";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lessonDB", "root", "");
        Statement stmt = con.createStatement();

        stmt.execute(sqlQuerry);


    }

    public void addProductPreparedStatement(String name, double price, String brand) throws Exception {

        String sqlQuerry = "INSERT INTO products (id, name, price, brand) VALUES (NULL, ?, ?, ?)";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection myConn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/shop", "root", "");
        ;
        PreparedStatement myStmt = null;

        myStmt = myConn.prepareStatement(sqlQuerry);

        myStmt.setString(1, name);
        myStmt.setDouble(2, price);
        myStmt.setString(3, brand);

        // orders homework
    }
        public void updateOrders (String city, String street, String products, String name) throws Exception {

            String sqlQuerry = "UPDATE orders SET products='1,4' WHERE name='Marcin'";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lesson", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from orders");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
            con.close();
            System.out.println(123);

        }

}
