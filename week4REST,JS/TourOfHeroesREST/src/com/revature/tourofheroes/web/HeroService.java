package com.revature.tourofheroes.web;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.revature.tourofheroes.dao.HeroRepoDB;
import com.revature.tourofheroes.dao.IHeroRepo;
import com.revature.tourofheroes.models.Hero;

@Path("/service")
public class HeroService {
	
	IHeroRepo heroRepo = new HeroRepoDB();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addHero(Hero hero) {
		heroRepo.addHero(hero);
		return Response.ok().build();
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllHeroes() {
		return Response.ok((ArrayList<Hero>)heroRepo.getAllHeros()).build();
	}
}
