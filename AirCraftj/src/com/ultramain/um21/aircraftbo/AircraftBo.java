package com.ultramain.um21.aircraftbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.ultramain.um21.abstractfactory.AbstractFactory;
import com.ultramain.um21.dataconnect.Dataconnect;
import com.ultramain.um21.dataconnect.Scan;
import com.ultramain.um21.dto.AircraftDto;
import com.ultramain.um21.idao.Idao;

public class AircraftBo {
public void airSystem(){
		
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		do{
		System.out.println("Welcome to Aircraft");
		System.out.println("1.Register Aircraft");
		System.out.println("2.Register Sector");
		System.out.println("3.View sector");
		System.out.println("Enter your Choice : ");
		choice = scan.nextInt();
		}while(choice == 0);
	
		switch(choice) {
		case 1:
			registerAircraft();
			break;
		case 2:
			viewAircraft();
			registerSector();
			break;
		
		case 3:
			viewSector();
			break;
		}
	}
	public void registerAircraft(){
		
		AbstractFactory factory = AbstractFactory.getFactory(1);
		Idao dao = factory.getDao();
		
		AircraftDto dto = getAircraft();
		try{
			dao.registerAircraft(dto);
		}catch(SQLException e){
			System.out.println(e.getMessage());
			
		}
	}

	public void registerSector(){
		
		AbstractFactory factory = AbstractFactory.getFactory(1);
		Idao dao = factory.getDao();
		
		AircraftDto dto = getSectorDetails();
		try{
			dao.registerSector(dto);
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
public void viewAircraft(){
		
		AbstractFactory factory = AbstractFactory.getFactory(1);
		Idao dao = factory.getDao();
		
		try{
			System.out.println("Available aircrafts...");
			dao.viewAircraft();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	
	public void viewSector(){
	
	
		ArrayList<AircraftDto> airList=null;
		HashMap<String,ArrayList<AircraftDto>> airmap=null;
		AbstractFactory factory = AbstractFactory.getFactory(1);
		Idao dao = factory.getDao();
		try{
			airmap= dao.viewSector();
			System.out.println("Enter the Aircraft Code");
			Scanner sc=Scan.getScannerInstance();
			String str=sc.next();
			airList=airmap.get(str);
			if(!airList.isEmpty()){
				for(AircraftDto adto:airList){
					System.out.println("Sector Id :"+adto.getSectorId());
					System.out.println("Aircraft code:"+adto.getAircraftCode());
					System.out.println("From station :"+adto.getFromStation());
					System.out.println("To Station  :"+adto.getToStation());
					//System.out.println("Schedule Date :"+adto.getDate());
					System.out.println("Schedule Time :"+adto.getTime());
					System.out.println("----------------------------------");
				}
			}
			
			
			
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}

		
	private AircraftDto getAircraft(){
		Scanner scan = Scan.getScannerInstance();
		AircraftDto dto  = new AircraftDto();
		System.out.println("Enter Aircraft Code : ");
		dto.setAircraftCode(scan.next());
		System.out.println("Enter Description : ");
		dto.setDescription(scan.next());
		return dto;
	}
	
		private AircraftDto getSectorDetails(){
			AircraftDto dto=new AircraftDto();
			Scanner sc=Scan.getScannerInstance();
			System.out.println("Enter the Sector Id :");
			dto.setSectorId(sc.next());
			System.out.println("Enter the aircraft code :");
			dto.setAircraftCode(sc.next());
			System.out.println("Enter From station :");
			dto.setFromStation(sc.next());
			System.out.println("Enter to Station :");
			dto.setToStation(sc.next());
			//System.out.println("Enter the date :");
			//dto.setScheduleDate(Date.valueOf("26-AUG-21"));
			System.out.println("Enter the time :");
			dto.setTime(sc.nextInt());
			return dto;
		}

	}

		
		
	
	