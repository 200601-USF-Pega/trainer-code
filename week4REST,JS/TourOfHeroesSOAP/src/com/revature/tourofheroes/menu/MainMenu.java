package com.revature.tourofheroes.menu;

import java.util.Scanner;

import com.revature.tourofheroes.dao.HeroRepoDB;
import com.revature.tourofheroes.service.ConnectionService;

public class MainMenu {
	private Scanner input = new Scanner(System.in);
	private HeroMenu service = new HeroMenu(new HeroRepoDB());
	public void start() {
		String userInput;
		do {
			System.out.println("Welcome to my tour of heroes app");
			System.out.println("What would you like to do?");
			System.out.println("[0] Create a hero?");
			System.out.println("[1] Get all heroes?");
			System.out.println("[2] Exit");
			
			//switch for user input to point them to appropriate places in the code 
			
			userInput = input.nextLine();
			switch (userInput) {
			case "0":
				service.createNewHero();
				break;
			case "1":
				service.getHeros();
				break;
			case "2":
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Invalid input please try again!");
					
			}
		} while(!userInput.equals("2"));
	}
}
