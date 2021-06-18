package com.example.RestApi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.RestApi.model.State;
import com.example.RestApi.service.Getconnection;

public class StateDAO {
   public static ArrayList<State> getStateList(){
	   ArrayList<State>al = new ArrayList<>();
	   Connection con = null;
	   try {
		   con = Getconnection.getConnection();
		   String sql = "select * from state";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()) {
			   int id = rs.getInt(1);
			   String stateName = rs.getString(2);
			   int cid = rs.getInt(3);
			   al.add(new State(id,stateName,cid));
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
