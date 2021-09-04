package com.ultramain.um21.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest {
	public static String countrymap1,countrymap2;
	   
	public static String capital1,capital2;
	
	  HashMap<String,String> M1=new HashMap<String,String>();
   
	  HashMap<String,String> as=new HashMap<String,String>();
	  
	   public void storecountrycapital(String countryname,String capital)
  {
    	
    	 if(M1.isEmpty())   
	  {
	    
	  countrymap1=countryname;
	  capital1=capital;	 
       M1.put(countryname, capital);
	    for(Map.Entry<String,String> en:M1.entrySet())
	    	System.out.println(en.getKey() +"   "+   en.getValue());
		  }
	  else
	  {
		    
		  countrymap2=countryname;
		  capital2=capital;
		  M1.put(countryname,capital);
	   for(Map.Entry<String,String> en1:M1.entrySet())
		  {  
		  System.out.println(en1.getKey() +"   "+   en1.getValue());
			  
		  break;
		  }
	  } 
 }

  public void retrievecapital(String countryname)
  {

	System.out.println( M1.get(countryname));
   	  
	}
	 public void retrievecountryname(String capital)
	 {
		 String value=capital;
		 for(Entry<String, String> entry: M1.entrySet()) {

		      if(entry.getValue() == value)
		      {
		       // System.out.println("The key for value " + value + " is " + entry.getKey());
		        break;
		      }
		 }
	  }
  public HashMap<String,String> method()
  {
	  
	  String val=null;
	  String key=null;
		  
		  for(String  t:M1.keySet())
		  {
			   key=t;
			   val=M1.get(key);  
		   
			   as.put(val, key);
		  
		  }
  return as;
  }
	  
public ArrayList<String> method1()
{
	
	Set<String>set=new HashSet<String>(M1.keySet());
	set.addAll(M1.values());		
	ArrayList<String>ar=new ArrayList<String>(set);
	return ar;
	
}
	  public static void main(String []args)
  {
	 
	  MapTest ob=new MapTest();	  
	 
	  ob. storecountrycapital("India", "delhi");
	  ob.storecountrycapital("Japan","Tokyo");
	  ob.retrievecapital(countrymap1);
	  ob.retrievecountryname(capital1);
      HashMap<String,String> m=ob.method();
      
      for(Map.Entry<String,String> t:m.entrySet())
	  {
		    System.out.println(t.getKey()+" "+t.getValue());  
	   }
      ArrayList<String > a=ob.method1(); 
    for(int i=0;i<a.size();i++)
   {
    	 
    	 System.out.println(a.get(i));
     }
  
  }

}
