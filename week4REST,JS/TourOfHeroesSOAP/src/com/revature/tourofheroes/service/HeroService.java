package com.revature.tourofheroes.service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.revature.tourofheroes.models.Hero;

@WebService
public interface HeroService {
	
	@WebMethod
	public void addHero(Hero hero);
	
	@WebMethod
	public ArrayList<Hero> getAllHeroes();
}
