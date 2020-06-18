package com.revature.tourofheroes.dao;
import java.util.List;
import com.revature.tourofheroes.models.Hero;

public interface IHeroRepo {
    Hero addHero(Hero hero);
    List<Hero> getAllHeros();
}
