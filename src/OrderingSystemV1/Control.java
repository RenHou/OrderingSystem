package OrderingSystemV1;

import java.sql.*;
import java.util.ArrayList;

public class Control {

    public static ArrayList<Staff> Staffs = new ArrayList<>();
//    public static ArrayList<Food> Foods = new ArrayList<>();
//    public static ArrayList<Order> Orders = new ArrayList<>();
    public static Connection connection;

    public static void main(String[] args) {

        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FoodOrderingManagementSystem;integratedSecurity=true;encrypt=false");
           
                String strInputStaffStatement = "SELECT * FROM Staffs";
                String strInputFoodStatement = "SELECT * FROM Foods";
                String strInputOrderStatement = "SELECT * FROM Orders";
                Statement statement = connection.createStatement();
                ResultSet staffsResultSet = statement.executeQuery(strInputStaffStatement);
//                ResultSet foodsResultSet = statement.executeQuery(strInputFoodStatement);
//                ResultSet ordersResultSet = statement.executeQuery(strInputOrderStatement);
                while (staffsResultSet.next()) {
                    int staffNo = staffsResultSet.getInt(1);
                    String name = staffsResultSet.getString(2);
                    String telNo = staffsResultSet.getString(3);
                    String position = staffsResultSet.getString(4);
                    String username = staffsResultSet.getString(5);
                    String password = staffsResultSet.getString(6);
                    Staff s = new Staff(staffNo,name,telNo,position,username,password);
                    Staffs.add(s);
                }
                Staffs.forEach(s->System.out.println(s));
            connection.close();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
