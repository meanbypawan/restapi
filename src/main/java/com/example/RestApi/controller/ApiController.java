package com.example.RestApi.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.RestApi.dao.CityDAO;
import com.example.RestApi.dao.StateDAO;
import com.example.RestApi.model.City;
import com.example.RestApi.model.State;

@Controller
@RequestMapping("/api")
public class ApiController {
  
  @GetMapping("/state")	
  public ResponseEntity<ArrayList<State>> getStateList(){
	  ArrayList<State>al = StateDAO.getStateList();
	  return new ResponseEntity<ArrayList<State>>(al,HttpStatus.OK);
  }
  @GetMapping("/city/{stateId}")	
   public ResponseEntity<ArrayList<City>> getCityList(@PathVariable("stateId")int stateId){
	  ArrayList<City>al = CityDAO.getCityList(stateId);
	  return new ResponseEntity<ArrayList<City>>(al,HttpStatus.OK);
   }
  
}
