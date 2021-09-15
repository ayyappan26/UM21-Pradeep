package com.ultramain.um21.abstractfactory;

import com.ultramain.um21.idao.FilesystemIdao;
import com.ultramain.um21.idao.Idao;

public class FilesystemFactory extends AbstractFactory {
	
	@Override
	public Idao getDao() {
		// TODO Auto-generated method stub
		return new FilesystemIdao();
	}


	
}
