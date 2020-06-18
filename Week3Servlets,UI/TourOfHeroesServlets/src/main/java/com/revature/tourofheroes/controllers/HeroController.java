package com.revature.tourofheroes.controllers;

import com.revature.tourofheroes.dao.HeroRepoDB;
import com.revature.tourofheroes.dao.IHeroRepo;
import com.revature.tourofheroes.models.Hero;
import com.revature.tourofheroes.service.ConnectionService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

public class HeroController {
    private static IHeroRepo repo = new HeroRepoDB(new ConnectionService());
    public static void getHeroes(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("getting heroes");
        List<Hero> retrievedHeroes= repo.getAllHeros();
        String html = "<html><body>";
        for (Hero hero:
             retrievedHeroes) {
            html += "<p>" + hero + "/<p>";
        }
        html +="</body></html>";
        resp.setContentType("text/html");
        resp.getWriter().write(html);
    }
    public static void addHero(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Adding a hero");
        Hero newHero = new Hero();
        newHero.setName(req.getParameter("name"));
        newHero.setSpecialMove(req.getParameter("specialMoves").split(","));
        newHero.setHealthLevel(Integer.parseInt(req.getParameter("healthLevel")));
        newHero.setAlive(req.getParameter("isAlive")==null?false:true);
        repo.addHero(newHero);

    }
}
