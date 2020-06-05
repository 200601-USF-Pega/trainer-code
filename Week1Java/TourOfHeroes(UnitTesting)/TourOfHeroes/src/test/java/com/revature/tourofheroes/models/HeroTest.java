package com.revature.tourofheroes.models;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HeroTest {
    //this method would run before each test method
    // use this for setting up dummy data you might need
    Hero testHero;
    //Arrange
    @Before
    public void SetDummyData(){
        ArrayList<String> specialMoves = new ArrayList<String>();
        specialMoves.add("Flight");
        testHero= new Hero("Superman", specialMoves, 100, true, "superhero");
    }


    @Test(expected=IllegalArgumentException.class)
    public void healthLevelShouldBePositive(){
        testHero.setHealthLevel(-2);
    }



    @Test
    public void healthLevelShouldBeSet(){
        testHero.setHealthLevel(2);
        assertEquals(2, testHero.getHealthLevel());
    }
    //@Before - before each and every test method
    //@After - runs after each and every test method
    //@BeforeClass annotates public static void - runs before any of the methods are run, run once, usually used
    // for when you create "expensive" data shared amongst test methods like a database connection
    //@AfterClass annotates another public static void- runs after all the tests have completed
    // you use to close up the database connections, (final clean up stuff)
}
