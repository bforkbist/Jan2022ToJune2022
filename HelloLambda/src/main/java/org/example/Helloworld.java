package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.NonNull;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */

public class Helloworld
{
    static Logger logger = LogManager.getLogger(Helloworld.class);
    public static Connection createConnectionViaUserPwd(
            @NonNull String username, @NonNull String pwd,
            @NonNull String dbEndpoint) {
        Connection connection;
        try {
            connection =
                    DriverManager.getConnection(dbEndpoint,
                            username, pwd);
            logger.info("Connection Established");
            return connection;
        } catch (SQLException e) {
            logger.info("Connection FAILED");
            logger.error(e.getMessage(), e);
        }
        return null;
    }


    public String handler(){

            try {
                Connection con = Helloworld.createConnectionViaUserPwd(
                        "admin", "aditya123", "jdbc:mysql://database-1.czwtygsmv6nd.ap-south-1.rds.amazonaws.com:3306");
            } catch (Exception e) {
                logger.info("INIT connection FAILED");
                logger.error(e.getMessage(), e);
            }


        return "Hello World";
    }

}
