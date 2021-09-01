package com.ultramain.um21.basic23;

public class Family {
	public static void main(String arg[]){
	Son myson=new Son();
	Daughter mydau=new Daughter();
	Display dis=new Display();
	dis.displayDetails(myson);
	dis.displayDetails1(mydau);
}
}


class Grandpa
{
public void work()
{
	System.out.println("Grandpa is retired");
}
}
class Dad extends Grandpa
{
public void eat()
{
	System.out.println("Dad is a Vegan");
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
class Daughter extends Son
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
public void displayDetails(Son myson)
{
	myson.eat();
	myson.swim();
	myson.income();
	myson.work();
	System.out.println("----------------------");
}
public void displayDetails1(Daughter mydau)
{
	mydau.eat();
	mydau.sing();
	mydau.income();
	mydau.work();
}
}


