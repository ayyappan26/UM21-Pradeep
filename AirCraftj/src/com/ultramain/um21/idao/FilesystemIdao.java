package com.ultramain.um21.idao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.ultramain.um21.dto.AircraftDto;

public class FilesystemIdao  implements Idao{


	public void registerAircraft(AircraftDto dto) {
		
		
	}


	public void registerSector(AircraftDto dto) {

		
	}


	public HashMap<String, ArrayList<AircraftDto>> viewSectorDetailsByAircraft() {
		return null;
		
		
	}



	@Override
	public HashMap<String, ArrayList<AircraftDto>> viewSector() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void viewAircraft() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	

}
