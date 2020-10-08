package com.barclays;
import java.sql.*;


public class DataSQL implements Data{

        Connection con;

        public void getConnection() {

            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Employee", "root", "Rac");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from emp");
                while(rs.next())
                    System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+rs.getString(4));
                con.close();
            }//end of try
            catch (Exception e) {
                System.out.println(e);
            }

        }






    public void add(String Id,Emp emp)
    {
        try
        {
            getConnection();

            String q="insert into Employee values(?,?,?,?)";

            PreparedStatement pst=con.prepareStatement(q);

            pst.setString(1,emp.getId());
            pst.setString(2,emp.getName());
            pst.setString(3,emp.getAddress());
            pst.setString(4,emp.getRole());

            System.out.println("Record Added to database");

        }
        catch(Exception e)
        {
            System.out.println(" Record Already Exist ");
        }
    }

    public boolean check(String Id)
    {
        return true;
    }

    public Emp read(String Id)
    {
        return null;
    }

    public void update(String Id,Emp emp)
    {

    }

    public void delete(String Id)
    {

    }

}
