package com.revature;

import com.revature.tourofheroes.menus.HeroMenuFactory;
import com.revature.tourofheroes.menus.IMenu;
import com.revature.tourofheroes.models.Hero;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        //System.out.println( "Hello! Please enter your hero type:" );
        //String heroType = input.nextLine();
        //logic here to call your repo to check if log in was succesful
        //some sort of object from reopsitory
        //switch (if type = manager) call this menu
        //
        Hero newHero = new Hero("SuperMan", "superHero");

        HeroMenuFactory menuFactory = new HeroMenuFactory();
        System.out.println(newHero.getHeroType());
        IMenu menu = menuFactory.getMenu(newHero.getHeroType());
        menu.start();
    }
}
