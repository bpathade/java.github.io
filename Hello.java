package com.hello;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
	

		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		for(int i=1;i<=10;i++ )
		{
			System.out.println(i);
		}
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");       
		//reading a number whose table is to be print  
		int num=sc.nextInt();  
		//loop start execution form and execute until the condition i<=10 becomes false  
		for(int i=1; i <= 10; i++)  
		{  
		//prints table of the entered number      
		System.out.println(num+" * "+i+" = "+num*i);  
		}  
		}  
		

	}

