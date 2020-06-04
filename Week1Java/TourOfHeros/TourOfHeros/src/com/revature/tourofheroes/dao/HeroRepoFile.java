package com.revature.tourofheroes.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.tourofheroes.models.Hero;

public class HeroRepoFile implements IHeroRepo {
	private String filepath= "src/resources/Hero.txt";
	//the synchronized keyword makes sure that only one thread can access this method at a time
	@Override
	public synchronized Hero addHero(Hero hero) {
		// TODO Auto-generated method stub
		List<Hero> currentHeros = this.getAllHeros();
		try {
			ObjectOutputStream objectOutputStream = 
					new ObjectOutputStream(new FileOutputStream(filepath));
			currentHeros.add(hero);
			objectOutputStream.writeObject(currentHeros);
			objectOutputStream.close();
			return hero;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//finish this method
	@Override
	public List<Hero> getAllHeros() {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream inputStream = 
					new ObjectInputStream(new FileInputStream(filepath));
			List<Hero> retrievedHeros = (ArrayList<Hero>) inputStream.readObject();
			inputStream.close();
			return retrievedHeros;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//Just in class Hero class is not found
			e.printStackTrace();
		} 
		
		return new ArrayList<Hero>();
	}

}
