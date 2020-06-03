package com.revature.tourofheroes.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.tourofheroes.dao.IHeroRepo;
import com.revature.tourofheroes.exceptions.InvalidHealthException;
import com.revature.tourofheroes.models.Hero;
//any business logic would go here
public class HeroService {
	ValidationService inputValidation = new ValidationService();
	IHeroRepo repo;
	public HeroService(IHeroRepo repo) {
		this.repo = repo;
	}
	public void createNewHero() {
		boolean success = false;
		//get user input 
			do {
				String name = inputValidation.getValidStringInput("Enter hero name: ");
				
				StringBuilder specialmoves = new StringBuilder(); 
				do {
					String move = inputValidation.getValidStringInput("Enter hero moves (input done to stop):");
					if(move.equalsIgnoreCase("done")) break;
					specialmoves.append(move);
					specialmoves.append(",");
					
				}while(true);
				
				int healthLevel = inputValidation.getValidInt("Enter health level:");
				
				boolean isAlive = inputValidation.getValidBoolean("Alive? (true or false): ");
				
				try {
					Hero newHero = new Hero(name, specialmoves.toString().split(","), healthLevel, isAlive);
					System.out.println("Creating Hero");
					System.out.println(repo.addHero(newHero));
					System.out.println("New Hero Created");
					success = true;
				} catch (InvalidHealthException ex) {
					System.out.println("Invalid health level! Please repeat your input");
				}
				
			} while (!success);
		
		
	}
	public void getHeros() {
		List<Hero> retrievedHeros = repo.getAllHeros();
		for(Hero hero: retrievedHeros) {
			System.out.println(hero);
		}
	}
}
