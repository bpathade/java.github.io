package com.hello;

public class WrapperInSwitchCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer age=18;
		switch(age)
		{
		case (16):
			System.out.println("You are under 18");
		break;
		case(18):
			System.out.println("You are eliglbe for Vote");
		break;
		case(65):
			System.out.println("You are senior Citzen");
		break;
		default:
			System.out.println("Please give the valid age");
			break;
		}
		

	}

}
