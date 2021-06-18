package com.example.RestApi.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class Getconnection {
  public static Connection getConnection() {
	  Connection con = null;
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resapi","root","root");
	  }
	  catch (Exception e) {
		e.printStackTrace();
	  }
	  return con;
  }
}
