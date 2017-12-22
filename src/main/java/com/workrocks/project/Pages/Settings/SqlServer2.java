package com.workrocks.project.Pages.Settings;

import java.sql.*;
import java.util.ArrayList;

public class SqlServer2 {

    private ArrayList<String> testdata = new ArrayList<String>();


    public boolean connection(String email, String searchData, String database, int index){

        String dbUrl = "jdbc:sqlserver://10.47.100.56";
        String username = "sa";
        String password = "R0dth88!";
        String userId = "";

        try {
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            Statement stmt = con.createStatement();

            String queryToAspNetUsers = "select * from CrowdFunding.dbo.AspNetUsers where Email = '" + email + "'";
            ResultSet rs = stmt.executeQuery(queryToAspNetUsers);
            while (rs.next()){
                userId = rs.getString(1);
            }

            String queryToUserProfile = "select * from CrowdFunding.dbo." + database + " where UserId = '" + userId + "'";
            ResultSet rs2 = stmt.executeQuery(queryToUserProfile);

            while (rs2.next()){
                for(int i = 1; i < 10; i++){
                    testdata.add(rs2.getString(i));
                }

            }

            for (int i = 0; i < testdata.size(); i++) {
                System.out.println(testdata.get(i));
            }

            if (searchData.equals(testdata.get(index - 1))) {
                return true;
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    private String dbUrl = "jdbc:sqlserver://10.47.100.56";
    private String username = "sa";
    private String password = "R0dth88!";
    private String result = "";

    public void getSomeDataFromDatabase(){

        try {
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            Statement stmt = con.createStatement();

            String queryToAspNetUsers = "select CrowdFunding.dbo.UserProfile.Phone " +
                    "from CrowdFunding.dbo.UserProfile " +
                    "inner join CrowdFunding.dbo.AspNetUsers " +
                    "on CrowdFunding.dbo.AspNetUsers.Id = CrowdFunding.dbo.UserProfile.UserId";
            ResultSet rs = stmt.executeQuery(queryToAspNetUsers);
            while (rs.next()){
                System.out.println("Phone: " + rs.getString(1));
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
