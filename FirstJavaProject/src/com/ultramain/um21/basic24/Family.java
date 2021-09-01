package com.ultramain.um21.basic24;


public class Family {
	public static void main(String arg[]){
		Son myson=new Son();
		Daughter mydaughter=new Daughter();

		Display dis=new Display();
		dis.displayKidsDetails(mydaughter);
		
	}
	}


	class Grandpa
	{
	public void sleep()
	{
		System.out.println("Grandpa is sleeping for 4 hours");
	}
	}
	class Dad extends Grandpa
	{
	public void eat()
	{
		System.out.println("Dad is a Vegeterian");
	}
	public void income()
	{
		System.out.println("Dad running a business");
	}
	}
	class Son extends Dad
	{
	public void swim()
	{
		System.out.println("Son know Swimming");
	}
	public void eat()
	{
		System.out.println("Son like Chicken");
	}
	}
	class Daughter extends Dad
	{
	public void sing()
	{
		System.out.println("Daughter know singing");
	}
	public void eat()
	{
		System.out.println("Daughter like Icecream");
	}
	}
	class Display
	{
	public void displayKidsDetails(Dad mydad)
	{
		if(mydad instanceof Son){
			Son myson=(Son)mydad;
		myson.eat();
		myson.swim();
		myson.income();
		myson.sleep();
		System.out.println("----------------------");
	
		if(mydad instanceof Daughter){
			Daughter mydaughter=(Daughter)mydad;
		mydaughter.eat();
		mydaughter.sing();
		mydaughter.income();
		mydaughter.sleep();
	}
		mydad.eat();
	}
	}
	}
	


