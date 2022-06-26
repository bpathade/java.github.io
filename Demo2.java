//Creating multiple object of a class and store information in it through reference variable 
package com.hello;
public class Demo2 {
	int id;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 D1=new Demo2();
		Demo2 D2=new Demo2();
		D1.id=100;
		D1.name="Bhagwan Pathade";
		D2.id=200;
		D2.name="Bhagwan Pathade";
		System.out.println(D1.id+" "+D1.name);
		System.out.println(D2.id+" "+D2.name);
	}

}
