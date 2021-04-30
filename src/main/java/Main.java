import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lesson","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from product");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
            con.close();
        }catch(Exception e){ System.out.println(e);}


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lesson","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from orders");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
            con.close();
        }catch(Exception e){ System.out.println(e);}


    }
}
