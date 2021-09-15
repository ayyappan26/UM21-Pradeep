package com.ultramain.um21.idao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.ultramain.um21.dataconnect.Dataconnect;
import com.ultramain.um21.dto.AircraftDto;



public class OracleIdao implements Idao{
	public void registerAircraft(AircraftDto dto) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Dataconnect.getDbConnection();
		String sql = "INSERT INTO aircrafts VALUES(?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,dto.getAircraftCode() );
		pst.setString(2, dto.getDescription());
		int rowsUpdated = pst.executeUpdate();
		
		System.out.println("Rows Updated : " + rowsUpdated);
}
	public void registerSector(AircraftDto dto) throws SQLException  {
		//ArrayList<String> craftCode=new ArrayList<>();
		Connection con=Dataconnect.getDbConnection();
		String query="INSERT INTO sector VALUES(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, dto.getSectorId());
		pst.setString(2,dto.getAircraftCode());
		pst.setString(3, dto.getFromStation());
		pst.setString(4, dto.getToStation());
		pst.setDate(5, getCurrentDate());
		pst.setInt(6, dto.getTime());
		
		int ru=pst.executeUpdate();
		System.out.println("updated row :"+ru);		
	}
	public void viewAircraft() throws SQLException {
		 
		Connection con = Dataconnect.getDbConnection();
		String sql = "Select * from aircrafts";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery(sql);
		
		String aircraftCode;
		String description;
		
		while(rs.next()){
			aircraftCode = rs.getString(1);
			description = rs.getString(2);
			
			System.out.println(aircraftCode);
			System.out.println(description);
		}
		
	}



public HashMap<String, ArrayList<AircraftDto>> viewSector() throws SQLException {
		
		ArrayList<String> code=new ArrayList<String>();
		HashMap<String,ArrayList<AircraftDto>> aircraftmap=new HashMap<>();
		Connection con=Dataconnect.getDbConnection();
		String sql="SELECT DISTINCT aircraft_code FROM aircrafts";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			code.add(rs.getString(1));
		}
		for(String str:code){
			ArrayList<AircraftDto> newList=getSectorDetails(str);
			aircraftmap.put(str,newList);
			
		}
		return aircraftmap;
		
	}
private ArrayList<AircraftDto> getSectorDetails(String aircode) throws SQLException{
	//AircraftDto dto=new AircraftDto();
	ArrayList<AircraftDto> airlist=new ArrayList<>();
	Connection con=Dataconnect.getDbConnection();
	String query="SELECT sector_id,aircraft_code,from_station,schedule_date,schedule_time,to_station FROM sector WHERE aircraft_code=?";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1, aircode);
	ResultSet rs=pst.executeQuery();
	while(rs.next()){
		AircraftDto adto=new AircraftDto();
		adto.setSectorId(rs.getString(1));
		adto.setAircraftCode(rs.getString(2));
		adto.setFromStation(rs.getString(3));
		adto.setDate(rs.getDate(4));
		adto.setTime(rs.getInt(5));
		adto.setToStation(rs.getString(6));
		airlist.add(adto);
	}
	return airlist;	
}
private static java.sql.Date getCurrentDate() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}
}

