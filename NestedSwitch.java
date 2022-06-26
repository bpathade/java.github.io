package com.hello;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char branch='E';
		int collegeyear=4;
		switch(collegeyear) {
		case 1:
			System.out.println("Math,English,Science");
			break;
		case 2:
			switch(branch) {
			case 'C':
				System.out.println("Operating System,Java");
				break;
			case 'E':
				System.out.println("Micoroprocessor, Logic swiching theory");
				break;
			case 'M':
				System.out.println("Drawing,Manufacturing");
				break;	
			}break;
		case 3:
			switch(branch) {
			case 'C':
				System.out.println("Computer Organization");
				break;
			case 'E':
				System.out.println("Fundamental of logic Design, Microelectronics");
				break;
			case 'M':
				System.out.println("Internal Combustion Engines, Mechanical Vibration");
				break;
				}break;
		case 4:
			switch(branch) {
			case 'C':
				System.out.println("Data Communication and Network, Multimedia");
				break;
			case 'E':
				System.out.println("Embedded System, Image Processing");
				break;
			case 'M':
				System.out.println("Production Technology");
				break;
			}break;
				

	}
		

}
}
