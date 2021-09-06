package com.ultramain.um21.natural;

public class Mirror {

	public static void main(String[] args) {
		MirrorI mymir=new MirrorI();
		mymir.getImage("EARTH");

	}

}
class MirrorI{
	public String getImage(String str){
		StringBuffer sf=new StringBuffer(str);
		sf.reverse();
		System.out.println("EARTH" + "|" +sf);
		return str;
		
	}
}
