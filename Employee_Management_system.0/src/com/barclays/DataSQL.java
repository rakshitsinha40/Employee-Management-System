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
/*
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from Employee");
                while(rs.next())
                    System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+rs.getString(4));
                //con.close();*/
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
            //con.close();

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
        if(i!=null) {
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
        while(rs.next())
            System.out.println("ID :"+rs.getString(1)+" \n"+"Name :"+rs.getString(2)+" \n"+"Address :"+rs.getString(3)+"\n"+"Role :"+rs.getString(4));
        return new Emp(Id,rs.getString(2),rs.getString(3),rs.getString(4));
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
            ResultSet rs=pst.executeQuery();
            System.out.println("record deleted");

    }

}
