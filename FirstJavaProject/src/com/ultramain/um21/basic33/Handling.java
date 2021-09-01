package com.ultramain.um21.basic33;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Handling {
	public static void main(String arg[]) throws IOException{
		new Test().readFromFile();
		new Test().writeFromFile();
	}

}
class Test{
	public void readFromFile(){
		File myfile=new File("E:\\hello.txt");
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader(myfile));
			String str;
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
			
		}catch(FileNotFoundException f){
			System.out.println("file not found exception");
		}catch(IOException e){
			System.out.println("io exception occured");
		}
	}
	public void writeFromFile() throws IOException{
		FileWriter writer=new FileWriter("E:\\write.txt");
		BufferedWriter buffer=new BufferedWriter(writer);
		buffer.write("welcome to this file");
		buffer.close();
			
	}
	}
	
