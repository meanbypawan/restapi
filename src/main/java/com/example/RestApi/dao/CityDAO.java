package com.example.RestApi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.RestApi.model.City;
import com.example.RestApi.service.Getconnection;

public class CityDAO {
  public static ArrayList<City> getCityList(int stateId){
	  ArrayList<City>al = new ArrayList<>();
	  Connection con = null;
	  try {
		  con = Getconnection.getConnection();
		  String sql = "select * from city where state_id = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setInt(1, stateId);
		  ResultSet rs = ps.executeQuery();
		  while(rs.next()) {
			  int id = rs.getInt(1);
			  String cityName = rs.getString(2);
			  al.add(new City(id,cityName,stateId));
		  }
	  }
	  catch (Exception e) {
		e.printStackTrace();
	  }
	  finally {
		 try {
			 con.close();
		 }
		 catch (Exception e) {
			e.printStackTrace();
		 }
	  }
	  return al;
  }
}
