package test;

import util.Connector;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;


class ConnectorTest {

    @org.junit.jupiter.api.Test
    void getConnection() throws SQLException {
        Connection connection = Connector.getConnection();
        System.out.println(connection.isReadOnly());
    }
}