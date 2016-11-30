package com.learn.mockito.db;

//import com.learn.mockito.db.DBConnection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.sql.Connection;
import java.sql.Statement;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by aashu on 27/11/16.
 * Using my mac in Singapore Bedok Court.
 */
public class DBConnectionTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @InjectMocks
    private DBConnection dbConnection;
    @Mock
    private Connection mockConnection;
    @Mock
    private Statement mockStatement;

    @Before
    public void setUp() {
//        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMockDBConnection() throws Exception {
        Mockito.when(mockConnection.createStatement()).thenReturn(mockStatement);
        Mockito.when(mockConnection.createStatement().executeUpdate(Mockito.anyString())).thenReturn(1);
        int value = dbConnection.executeQuery("");
        Assert.assertEquals(value, 1);
//        verify(mockConnection.createStatement().executeUpdate(Mockito.anyString()), Mockito.times(1));
        verify(mockConnection, times(2)).createStatement();
    }
}
