package com.workrocks.project.Pages.Settings;

import java.sql.*;

public class SqlServer {

    //private String dbUrl = "jdbc:sqlserver://10.47.100.56";
    private String dbUrl = "jdbc:sqlserver://159.224.194.43";
    private String username = "sa";
    private String password = "R0dth88!";

    private String aspNetUserDatabase = "AspNetUsers";
    private String userProfileDatabase = "UserProfile";
    private String addressDatabase = "Address";
    private String stateDatabase = "State";

    private String userId = "";
    private String userProfileResultData = "";
    private String profileId = "";
    private String userEmail = "";
    private String result = "";

    public static String getStateName = "SELECT CrowdFunding.dbo.State.Name " +
            "FROM CrowdFunding.dbo.State " +
            "INNER JOIN CrowdFunding.dbo.Address ON CrowdFunding.dbo.State.Id = CrowdFunding.dbo.Address.StateId " +
            "INNER JOIN CrowdFunding.dbo.UserProfile ON CrowdFunding.dbo.Address.Id = CrowdFunding.dbo.UserProfile.AddressId " +
            "INNER JOIN CrowdFunding.dbo.AspNetUsers ON CrowdFunding.dbo.UserProfile.UserId = CrowdFunding.dbo.AspNetUsers.Id " +
            "WHERE CrowdFunding.dbo.AspNetUsers.Email = ";

    public static String getFirstName = "SELECT CrowdFunding.dbo.UserProfile.FirstName " +
            "FROM CrowdFunding.dbo.UserProfile " +
            "INNER JOIN CrowdFunding.dbo.AspNetUsers ON CrowdFunding.dbo.UserProfile.UserId = CrowdFunding.dbo.AspNetUsers.Id " +
            "WHERE CrowdFunding.dbo.AspNetUsers.Email = ";

    public static String getLastName = "SELECT CrowdFunding.dbo.UserProfile.LastName " +
            "FROM CrowdFunding.dbo.UserProfile " +
            "INNER JOIN CrowdFunding.dbo.AspNetUsers ON CrowdFunding.dbo.UserProfile.UserId = CrowdFunding.dbo.AspNetUsers.Id " +
            "WHERE CrowdFunding.dbo.AspNetUsers.Email = ";





    public String connectionToDatabase(String request, String email){
        try {
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(request + "'" + email + "'");
            while (rs.next()){
                result = rs.getString(1);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean deleteUserFromDatabase(String email){

        try {
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            Statement stmt = con.createStatement();

            String queryToAspNetUsers = "select * from CrowdFunding.dbo.AspNetUsers where Email = '" + email + "'";
            ResultSet rs = stmt.executeQuery(queryToAspNetUsers);
            while (rs.next()){
                userId = rs.getString(1);
            }

            String queryToUserProfile = "select * from CrowdFunding.dbo.UserProfile where UserId = '" + userId + "'";
            ResultSet rs2 = stmt.executeQuery(queryToUserProfile);
            while (rs2.next()){
                profileId = rs2.getString(1);
            }

            String deleteFromUserNotificationSettings = "delete from CrowdFunding.dbo.UsersNotificationSettings where UserId = '" + profileId + "'";
            stmt.execute(deleteFromUserNotificationSettings);

            String deleteFromUserProfile = "delete from CrowdFunding.dbo.UserProfile where UserId = '" + userId + "'";
            stmt.execute(deleteFromUserProfile);

            String deleteFromAspNetUsers = "delete from CrowdFunding.dbo.AspNetUsers where Email = '" + email + "'";
            stmt.execute(deleteFromAspNetUsers);

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }


}
