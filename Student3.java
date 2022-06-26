package com.hello;

public class Student3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="Meerut,India";
		if(address.endsWith("India")){
			if(address.contains("Meerut")) {
				System.out.println("your city is Meerut");
			}
			else if(address.contains("Noida")) {
				System.out.println("city is Noida");
			}
			else {
				System.out.println(address.split(",")[0]);
				
			}
			
		}
		else {
			System.out.println("your are not liveing in india");
		}
				
		

	}

}
