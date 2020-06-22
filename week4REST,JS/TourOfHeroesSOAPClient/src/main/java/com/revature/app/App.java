package com.revature.app;

import java.net.URL;
import java.util.ArrayList;

import com.revature.web.Hero;
import com.revature.web.HeroServiceImplService;

public class App {
	
	public static void main(String[] args) {
		
		try {
			HeroServiceImplService heroService = new HeroServiceImplService(new URL("http://localhost:9999/service?wsdl"));
			
			ArrayList<Hero> heroes = (ArrayList<Hero>)heroService.getHeroServiceImplPort().getAllHeroes();
			
			System.out.println("Heroes:");
			for(Hero hero : heroes) {
				System.out.println(hero.getName());
			}
		} catch (Exception e) {
			
		}
	}
}
