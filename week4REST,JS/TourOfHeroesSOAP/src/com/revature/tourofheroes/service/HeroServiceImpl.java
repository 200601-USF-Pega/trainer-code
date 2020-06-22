package com.revature.tourofheroes.service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.revature.tourofheroes.dao.HeroRepoDB;
import com.revature.tourofheroes.dao.IHeroRepo;
import com.revature.tourofheroes.models.Hero;

@WebService(endpointInterface = "com.revature.tourofheroes.service.HeroService")
public class HeroServiceImpl implements HeroService {
	
	IHeroRepo heroRepo = new HeroRepoDB();

	@WebMethod
	public void addHero(Hero hero) {
		heroRepo.addHero(hero);
	}
	
	@WebMethod
	public ArrayList<Hero> getAllHeroes() {
		return (ArrayList<Hero>)heroRepo.getAllHeros();
	}
}
