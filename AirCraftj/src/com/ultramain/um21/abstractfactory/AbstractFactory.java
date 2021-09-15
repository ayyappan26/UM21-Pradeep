package com.ultramain.um21.abstractfactory;

import com.ultramain.um21.idao.Idao;

public abstract class AbstractFactory {
	public abstract Idao getDao();
	   public static AbstractFactory getFactory(int choice){
	   AbstractFactory factory = null;
	   if(choice == 1){
		   factory = new OracleFactory();
	   }else if(choice == 2){
		   factory = new FilesystemFactory();
	   }
	   return factory;
	}

}
