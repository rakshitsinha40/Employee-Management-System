package com.barclays;

import java.sql.*;

public class DataSQL implements Data{

        static Connection con;

        public void getConnection() {



            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/emp","root","Rac");

                System.out.println("Connected to database");

            }
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

            pst.executeUpdate();
            System.out.println("Record Added to database");


        }
        catch(Exception e)
        {
            System.out.println(" Record Already Exist ");
        }
    }

    public boolean check(String Id) throws SQLException {
        getConnection();

        String q="select * from Employee where id=?";
        PreparedStatement pst=con.prepareStatement(q);
        pst.setString(1,Id);


        ResultSet i=pst.executeQuery();

        System.out.println("Checking ");
        if(i.next()) {
            System.out.println("Checking true");
            return true;
        }else {
            System.out.println("Checking false");
            return false;
        }
    }

    public Emp read(String Id) throws SQLException {
        getConnection();
        String q="select * from Employee where id=?";
        PreparedStatement pst=con.prepareStatement(q);
        pst.setString(1,Id);
        ResultSet rs=pst.executeQuery();
        Emp em = null;
        while(rs.next())
            em=new Emp(Id,rs.getString(2),rs.getString(3),rs.getString(4));
        //System.out.println("Emp object created");
        return em;
        }

    public void update(String Id,Emp emp) throws SQLException {
        getConnection();
        String q="update Employee set name=?,address=?,role=? where id=?";
        PreparedStatement pst=con.prepareStatement(q);
        pst.setString(4,Id);
        pst.setString(1,emp.getName());
        pst.setString(2,emp.getAddress());
        pst.setString(3,emp.getRole());

        pst.executeUpdate();
        System.out.println("record updated");

    }

    public void delete(String Id) throws SQLException {

            getConnection();
            String q="delete from Employee where id=?";
            PreparedStatement pst=con.prepareStatement(q);
            pst.setString(1,Id);
            pst.executeUpdate();
            System.out.println("record deleted");

    }

}
