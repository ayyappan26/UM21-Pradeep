package com.ultramain.um21.idao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.ultramain.um21.dto.AircraftDto;

public interface Idao {
	public abstract void registerAircraft(AircraftDto dto) throws SQLException;
	public abstract void registerSector(AircraftDto dto) throws SQLException;
	public abstract void viewAircraft() throws SQLException;
	public HashMap<String, ArrayList<AircraftDto>> viewSector() throws SQLException ;


}
