package com.ultramain.um21.abstractfactory;

import com.ultramain.um21.idao.Idao;
import com.ultramain.um21.idao.OracleIdao;

public class OracleFactory extends AbstractFactory{
	

	@Override
	public Idao getDao() {
		// TODO Auto-generated method stub
		return new OracleIdao();
	}

}