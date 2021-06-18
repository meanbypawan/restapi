package com.example.RestApi.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class Getconnection {
  public static Connection getConnection() {
	  Connection con = null;
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  con = DriverManager.getConnection("jdbc:mysql://mysql-35185-0.cloudclusters.net:35202/resapi","admin","Ze4ZdZgD");
	  }
	  catch (Exception e) {
		e.printStackTrace();
	  }
	  return con;
  }
}
